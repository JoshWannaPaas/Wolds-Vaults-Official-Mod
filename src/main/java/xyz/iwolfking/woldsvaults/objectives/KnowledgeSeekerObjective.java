package xyz.iwolfking.woldsvaults.objectives;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import iskallia.vault.VaultMod;
import iskallia.vault.client.gui.helper.LightmapHelper;
import iskallia.vault.client.render.IVaultOptions;
import iskallia.vault.core.Version;
import iskallia.vault.core.data.adapter.Adapters;
import iskallia.vault.core.data.key.FieldKey;
import iskallia.vault.core.data.key.SupplierKey;
import iskallia.vault.core.data.key.registry.FieldRegistry;
import iskallia.vault.core.event.CommonEvents;
import iskallia.vault.core.random.JavaRandom;
import iskallia.vault.core.random.RandomSource;
import iskallia.vault.core.vault.Vault;
import iskallia.vault.core.vault.VaultUtils;
import iskallia.vault.core.vault.modifier.registry.VaultModifierRegistry;
import iskallia.vault.core.vault.modifier.spi.VaultModifier;
import iskallia.vault.core.vault.objective.Objective;
import iskallia.vault.core.vault.player.Completion;
import iskallia.vault.core.vault.player.Listener;
import iskallia.vault.core.vault.stat.StatCollector;
import iskallia.vault.core.world.storage.VirtualWorld;
import iskallia.vault.entity.champion.ChampionLogic;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import xyz.iwolfking.woldsvaults.api.helper.GameruleHelper;
import xyz.iwolfking.woldsvaults.blocks.tiles.BrewingAltarTileEntity;
import xyz.iwolfking.woldsvaults.config.AlchemyObjectiveConfig;
import xyz.iwolfking.woldsvaults.events.vaultevents.BrewingAltarBrewEvent;
import xyz.iwolfking.woldsvaults.events.vaultevents.WoldCommonEvents;
import xyz.iwolfking.woldsvaults.events.vaultevents.client.WoldClientEvents;
import xyz.iwolfking.woldsvaults.init.ModConfigs;
import xyz.iwolfking.woldsvaults.init.ModGameRules;
import xyz.iwolfking.woldsvaults.items.alchemy.AlchemyIngredientItem;
import xyz.iwolfking.woldsvaults.items.alchemy.CatalystItem;
import xyz.iwolfking.woldsvaults.objectives.data.alchemy.AlchemyTasks;
import xyz.iwolfking.woldsvaults.util.MessageFunctions;
import xyz.iwolfking.woldsvaults.util.VaultModifierUtils;

import java.util.*;


/**
 *                                                                      ----- KNOWLEDGE SEEKER OBJECTIVE ------
 * Knowledge Seeker is based on the Build-A-Vault and Tenos Trial objectives of VH2.
 * You start off with one room, like a cake, and build the vault by choosing a direction which gives you a type of room along with a random modifier, mob modifiers, and an amount of completion.
 * The room can be a random common, challenge, omega, or a specific room. The modifier usually is adding/subtracting time but can also be a vault modifier like Bonus Chests, and completion can be added or subtracted.
 * To choose a room, you click on the obelisk thing first, which will give you options that pop up at the top of your screen. Then you choose a direction by (not sure which I'm gonna do) clicking on the doors like Paradox, or by clicking on directional blocks next to the Obelisk thing.
 * Your goal is to fill up your completion, and once the bar is filled up, the next room will contain an obelisk which will spawn a single boss (elite/VH2 boss, probably same as brutal bosses).
 * You have a number of obelisks to complete, and will teleport you out upon finishing the last one.
 * Completion can never go negative, so you can stack modifiers/time to give you a better chance once you start filling up completion.
 * Usually, you will get negative time/modifiers along with positive completion, and vice versa. Here's a layout of what I think the pools would be (not finalized ofc):
 * 
 * Random Common Room               Random Challenge                Random Omega
 * Small Time Change                Time Increase                   Time Decrease
 *        or                            or                              or                      ...
 * Normal Modifier                  Positive Modifier               Strong Negative
 * Small Mob Stat Change            Small/No Stat Change            Medium Mob Buff
 * Small Completion Change          Positive Completion             Negative Completion
 * 
 * 
 * In this way, it also is similar to VH3 Divine Architect, but as an actual objective instead of the same, repeatable, daily loot fest.
 * Also, you'll have to keep in mind which direction you're building, as you may have less options because you're building adjacent to other rooms.
 * 
 * Ideas I may or may not implement:
 * - First room is always the same room, being the starting room in VH2 Architects
 * - Voting: In normal architects, all participants of the vault would vote for what they want, and majority would win. It's like a 10 second wait time for the vote to be done. I don't think I wan't to do this because the time spent waiting adds up, but there might be a way to make the idea better.
 * - Build Lock: In normal architects, after building a room, you would have to wait a timer before choosing to build again. This is originally what the +/- time was, but in Tenos Trial, there is no wait timer and time is actually vault time. I'm more a fan of Tenos Trial.
 *               Technically, it's more punishing and prevents infinite vault timer, but it's just so boring not doing anything and trying to build the wait timer down.
 * 
 * 
 * Q: What makes this stand out as an objective?
 * A: Paradoxes being gone and also kind of broken as a daily crystal means this kind of gameplay of choosing rooms along with modifiers doesn't really exist anymore, so this can fill that hole.
 *    Additionally, this adds a variant on the Obelisk type of objective (Brutal Bosses) just like Brazier/Haunted Brazier, etc. I don't think Hunt the Guardians exists anymore.
 * 
 * Q: How would modifying this vault work?
 * A: Catalysts would be self-explanatory. You can, for example, add living catalysts and try to target directions that give Living Chests, rooms that living, or up Item Quantity.
 *    A big problem would be Inscriptions. Ideally, I would allow for inscriptions to spawn in the vault, and you would be able to build towards them in the place they show on the map.
 *    I feel like I have no idea how I'll implement that, so maybe it'll just eat the inscriptions and I'll call that a feature
 * 
 * Q: Couldn't this technically be an infinite vault if you just keep stacking time?
 * A: Sure. Yeah, but time increases will often come with negative modifiers or Mob buffs, so I don't even know if it's worth it.
 * 
 */



public class KnowledgeSeekerObjective extends Objective {
    public static final ResourceLocation HUD = VaultMod.id("textures/gui/alchemy/hud.png");

    public static final SupplierKey<Objective> KEY = SupplierKey.of("alchemy", Objective.class).with(Version.v1_31, AlchemyObjective::new);
    private static final FieldRegistry FIELDS = Objective.FIELDS.merge(new FieldRegistry());

    private static final FieldKey<Float> OBJECTIVE_PROBABILITY = FieldKey.of("objective_probability", Float.class).with(Version.v1_2, Adapters.FLOAT, DISK.all()).register(FIELDS);
    private static final FieldKey<Float> PROGRESS = FieldKey.of("progress", Float.class).with(Version.v1_31, Adapters.FLOAT, DISK.all().or(CLIENT.all())).register(FIELDS);
    private static final FieldKey<Float> REQUIRED_PROGRESS = FieldKey.of("required_progress", Float.class).with(Version.v1_31, Adapters.FLOAT, DISK.all().or(CLIENT.all())).register(FIELDS);
    private static final FieldKey<Integer> NUM_OBELISKS = FieldKey.of("num_obelisks", Integer.class);
    
    
    public static final FieldKey<Integer> VAULT_LEVEL = FieldKey.of("vault_level", Integer.class)
            .with(Version.v1_31, Adapters.INT_SEGMENTED_3, DISK.all().or(CLIENT.all()))
            .register(FIELDS); // yeah right why would we need the VAULT LEVEL on a client, thats useless, im not upset


    private KnowledgeSeekerObjectiveConfig.Entry config;

    protected KnowledgeSeekerObjective() {
    }

    protected KnowledgeSeekerObjective(float objectiveProbability, int vaultLevel, float requiredProgress, int numObelisks) {
        this.set(OBJECTIVE_PROBABILITY, objectiveProbability);
        this.set(PROGRESS, 0F);
        this.set(VAULT_LEVEL, vaultLevel);
        this.set(REQUIRED_PROGRESS, requiredProgress);
        this.set(NUM_OBELISKS, numObelisks);
    }

    public static KnowledgeSeekerObjective of(float objectiveProbability, int vaultLevel, float requiredProgress, int numObelisks) {
        return new KnowledgeSeekerObjective(objectiveProbability, vaultLevel, requiredProgress, numObelisks);
    }

    @Override
    public void initClient(Vault vault) {
        config = ModConfigs.KNOWLEDGE_SEEKER_OBJECTIVE.getConfig(this.get(VAULT_LEVEL));


        super.initClient(vault);
    }

    @Override
    public void initServer(VirtualWorld world, Vault vault) {
        config = ModConfigs.KNOWLEDGE_SEEKER_OBJECTIVE.getConfig(this.get(VAULT_LEVEL));

        SeekerTasks.initServer(world, vault, this, config);
        CommonEvents.OBJECTIVE_PIECE_GENERATION.register(this, (data) -> this.ifPresent(OBJECTIVE_PROBABILITY, (probability) -> data.setProbability((double)probability)));
        CommonEvents.ENTITY_DROPS.register(this, (data) -> {handleChampionDeath(data, vault, world);});
        // WoldCommonEvents.BREWING_ALTAR_BREW_EVENT.register(this, (data -> handleBrewEvent(data, vault, world)));


        this.registerObjectiveTemplate(world, vault);
        super.initServer(world, vault);
    }

    @Override
    public void tickServer(VirtualWorld world, Vault vault) {
        if (this.get(PROGRESS) > this.get(REQUIRED_PROGRESS)) {
            super.tickServer(world, vault);
        }

    }

    @Override
    public void tickListener(VirtualWorld world, Vault vault, Listener listener) {
        if (listener.getPriority(this) < 0) {
            listener.addObjective(vault, this);
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean render(Vault vault, PoseStack poseStack, Window window, float v, Player player) {
        int midX = window.getGuiScaledWidth() / 2;
        Font font = Minecraft.getInstance().font;
        MultiBufferSource.BufferSource buffer = MultiBufferSource.immediate(Tesselator.getInstance().getBuilder());
        Component txt;

        if (this.get(PROGRESS) >= this.get(REQUIRED_PROGRESS)) {
            if(!this.get(FULLY_OVERSTACKED)) {
                txt = new TextComponent("Brew more ").withStyle(Style.EMPTY.withColor(0xFFFFFF))
                        .append(new TextComponent("Potions ").withStyle(Style.EMPTY.withColor(0xF0E68C)))
                        .append(new TextComponent("for ").withStyle(Style.EMPTY.withColor(0xFFFFFF)))
                        .append(new TextComponent("Crate Quantity").withStyle(Style.EMPTY.withColor(0x38C9C0)))
                        .append(new TextComponent(", or Exit to complete ").withStyle(Style.EMPTY.withColor(0xFFFFFF)))
                        .append(new TextComponent("the Vault").withStyle(Style.EMPTY.withColor(0xF0E68C)))
                        .append(new TextComponent("!").withStyle(Style.EMPTY.withColor(0xFFFFFF)));

                FormattedCharSequence var21 = txt.getVisualOrderText();.
                float var22 = (float)midX - (float)font.width(txt) / 2.0F;
                font.drawInBatch(var21, var22, 9.0F, -1, true, poseStack.last().pose(), buffer, false, 0, LightmapHelper.getPackedFullbrightCoords());
                buffer.endBatch();
            }
            else {
                txt = new TextComponent("The Brew is overflowing! Exit to Complete! ").withStyle(Style.EMPTY.withColor(0xFFFFFF));
                FormattedCharSequence var21 = txt.getVisualOrderText();
                float var22 = (float)midX - (float)font.width(txt) / 2.0F;
                font.drawInBatch(var21, var22, 9.0F, -1, true, poseStack.last().pose(), buffer, false, 0, LightmapHelper.getPackedFullbrightCoords());
                buffer.endBatch();
            }

        } else {
            float current = this.get(PROGRESS);
            float goal = this.get(REQUIRED_PROGRESS);
            txt = new TextComponent(String.format("%.1f%%", current * 100))
                    .append(new TextComponent(" / "))
                    .append(new TextComponent(String.format("%.1f%%", goal * 100)));
            float userScale = ((IVaultOptions)Minecraft.getInstance().options).getObjectiveScale();
            poseStack.pushPose();
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            int previousTexture = RenderSystem.getShaderTexture(0);
            RenderSystem.setShaderTexture(0, HUD);
            float progress = current / goal;
            poseStack.translate((float)midX - 80.0F * userScale, 8.0F * userScale, 0.0F);
            poseStack.scale(userScale, userScale, userScale);
            GuiComponent.blit(poseStack, 0, 0, 0.0F, 0.0F, 200, 26, 200, 100);
            GuiComponent.blit(poseStack, 0, 8, 0.0F, 30.0F, 13 + (int)(130.0F * progress), 10, 200, 100);
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, previousTexture);
            poseStack.popPose();
            poseStack.pushPose();
            float baseScale = 0.6F;
            float totalScale = baseScale * userScale;
            poseStack.scale(totalScale, totalScale, totalScale);
            FormattedCharSequence var10001 = txt.getVisualOrderText();
            float var10002 = (float)midX / totalScale - (float)font.width(txt) / 2.0F;
            font.drawInBatch(var10001, var10002, (float)(9 + 22), -1, true, poseStack.last().pose(), buffer, false, 0, LightmapHelper.getPackedFullbrightCoords());
            buffer.endBatch();
            poseStack.popPose();
        }

        return true;
    }

    @Override
    public boolean isActive(VirtualWorld virtualWorld, Vault vault, Objective objective) {

        if (this.get(PROGRESS) < this.get(REQUIRED_PROGRESS)) {
            return objective == this;
        } else {
            for(Objective child : this.get(CHILDREN)) {
                if (child.isActive(virtualWorld, vault, objective)) {
                    return true;
                }
            }

            return false;
        }
    }

    @Override
    public SupplierKey<Objective> getKey() {
        return KEY;
    }

    @Override
    public FieldRegistry getFields() {
        return FIELDS;
    }

    private void handleChampionDeath(LivingDropsEvent event, Vault vault, VirtualWorld world) {
        if (VaultUtils.getVault(event.getEntity().getLevel()).isEmpty()) return;
        if (!VaultUtils.getVault(event.getEntity().getLevel()).get().equals(vault)) return;

        Entity entity = event.getEntity();
        if (ChampionLogic.isChampion(entity) && !entity.getTags().contains(ChampionLogic.NO_DROPS) && event.getSource().getEntity() instanceof ServerPlayer && entity.level.random.nextFloat() >= 0.5F) {
            event.getDrops().add(new ItemEntity(entity.getLevel(), entity.getX(), entity.getY(), entity.getZ(), CatalystItem.createRandomCatalyst(vault, world.getRandom())));
        }
    }


}
.