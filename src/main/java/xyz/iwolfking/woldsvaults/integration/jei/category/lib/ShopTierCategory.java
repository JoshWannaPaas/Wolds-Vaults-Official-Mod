package xyz.iwolfking.woldsvaults.integration.jei.category.lib;

import com.google.common.util.concurrent.AtomicDouble;
import com.mojang.blaze3d.vertex.PoseStack;
import iskallia.vault.VaultMod;
<<<<<<< HEAD
=======
import iskallia.vault.config.ShopPedestalConfig;
import iskallia.vault.util.LootInitialization;
>>>>>>> upstream/master
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
<<<<<<< HEAD
import xyz.iwolfking.woldsvaults.mixins.vaulthunters.accessors.ShopEntryAccessor;
import xyz.iwolfking.woldsvaults.mixins.vaulthunters.accessors.ShopTierAccessor;
=======
import net.minecraft.world.item.crafting.Ingredient;
>>>>>>> upstream/master

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
public class ShopTierCategory implements IRecipeCategory<ShopTierAccessor> {
=======
public class ShopTierCategory implements IRecipeCategory<ShopPedestalConfig.ShopTier> {
>>>>>>> upstream/master
    private static final ResourceLocation TEXTURE = VaultMod.id("textures/gui/jei/loot_info.png");
    private final IDrawable background;
    private final IDrawable icon;
    private final TextComponent title;
<<<<<<< HEAD
    private final RecipeType<ShopTierAccessor> recipeType;


    public ShopTierCategory(IGuiHelper guiHelper, TextComponent title, Item itemForIcon, RecipeType<ShopTierAccessor> recipeType) {
=======
    private final RecipeType<ShopPedestalConfig.ShopTier> recipeType;


    public ShopTierCategory(IGuiHelper guiHelper, TextComponent title, Item itemForIcon, RecipeType<ShopPedestalConfig.ShopTier> recipeType) {
>>>>>>> upstream/master
        this.background = guiHelper.createDrawable(TEXTURE, 0, 0, 162, 108);
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, itemForIcon.getDefaultInstance());
        this.title = title;
        this.recipeType = recipeType;
    }

    @Nonnull
    public Component getTitle() {
        return title;
    }

    @Nonnull
    public IDrawable getBackground() {
        return this.background;
    }

    @Nonnull
    public IDrawable getIcon() {
        return this.icon;
    }

    @Nonnull
    @Override
<<<<<<< HEAD
    public RecipeType<ShopTierAccessor> getRecipeType() {
=======
    public RecipeType<ShopPedestalConfig.ShopTier> getRecipeType() {
>>>>>>> upstream/master
        return this.recipeType;
    }

    @Nonnull @SuppressWarnings("removal")
    public ResourceLocation getUid() {
        return this.getRecipeType().getUid();
    }

    @Nonnull @SuppressWarnings("removal")
<<<<<<< HEAD
    public Class<? extends ShopTierAccessor> getRecipeClass() {
=======
    public Class<? extends ShopPedestalConfig.ShopTier> getRecipeClass() {
>>>>>>> upstream/master
        return this.getRecipeType().getRecipeClass();
    }

    @Override
    @ParametersAreNonnullByDefault
<<<<<<< HEAD
    public void setRecipe(IRecipeLayoutBuilder builder, ShopTierAccessor recipe, IFocusGroup focuses) {
        AtomicDouble totalWeight = new AtomicDouble();
        List<Map.Entry<ShopEntryAccessor, Double>> entries = new ArrayList<>();

        var tierEntries = recipe.getTradePool().entrySet();
        for (Map.Entry<ShopEntryAccessor, Double> entry : tierEntries) {
            var shopEntry = entry.getKey();
            var weight = entry.getValue();
            totalWeight.addAndGet(weight);
            ItemStack offer = shopEntry.getOffer().copy();
=======
    public void setRecipe(IRecipeLayoutBuilder builder, ShopPedestalConfig.ShopTier recipe, IFocusGroup focuses) {
        AtomicDouble totalWeight = new AtomicDouble();
        List<Map.Entry<ShopPedestalConfig.ShopEntry, Double>> entries = new ArrayList<>();

        var tierEntries = recipe.TRADE_POOL.entrySet();
        for (Map.Entry<ShopPedestalConfig.ShopEntry, Double> entry : tierEntries) {
            var shopEntry = entry.getKey();
            var weight = entry.getValue();
            totalWeight.addAndGet(weight);
            ItemStack offer = shopEntry.OFFER;
>>>>>>> upstream/master

            if (!offer.isEmpty() && weight > 0) {
                entries.add(entry);
            }
        }
        int count = entries.size();

        for(int i = 0; i < count; ++i) {
<<<<<<< HEAD
            Map.Entry<ShopEntryAccessor, Double> entry = entries.get(i);
            ShopEntryAccessor shopEntry = entry.getKey();
            double weight = entry.getValue();
            ItemStack offer = shopEntry.getOffer().copy();
            var currency = shopEntry.getCurrency();
            var minCost = shopEntry.getMinCost();
            var maxCost = shopEntry.getMaxCost();
=======
            Map.Entry<ShopPedestalConfig.ShopEntry, Double> entry = entries.get(i);
            ShopPedestalConfig.ShopEntry shopEntry = entry.getKey();
            double weight = entry.getValue();
            ItemStack offer = shopEntry.OFFER.copy();
            var currency = shopEntry.CURRENCY;
            var minCost = shopEntry.MIN_COST;
            var maxCost = shopEntry.MAX_COST;
>>>>>>> upstream/master
            CompoundTag nbt = offer.getOrCreateTagElement("display");
            ListTag list = nbt.getList("Lore", 8);
            MutableComponent component = new TextComponent("Chance: ");
            double chance = (weight/ totalWeight.get()) * 100;
            component.append(String.format("%.2f", chance));
            component.append("%");
            list.add(StringTag.valueOf(Component.Serializer.toJson(component.withStyle(ChatFormatting.YELLOW))));
            component = new TextComponent("Cost: " + minCost);
            if (minCost != maxCost) {
                component.append(" - " + maxCost);
            }
            list.add(StringTag.valueOf(Component.Serializer.toJson(component.withStyle(ChatFormatting.DARK_PURPLE))));

            nbt.put("Lore", list);
<<<<<<< HEAD
            builder.addSlot(RecipeIngredientRole.OUTPUT, 1 + 18 * (i % 9), 1 + 18 * (i / 9)).addItemStack(offer);
=======

            var initialized = LootInitialization.initializeVaultLoot(offer, 0);
            if (initialized.equals(offer)) { // didn't change - no random data
                builder.addSlot(RecipeIngredientRole.OUTPUT, 1 + 18 * (i % 9), 1 + 18 * (i / 9)).addIngredients(Ingredient.of(initialized));
            } else {
                ItemStack[] variants = new ItemStack[10]; // changed - randomly generate 10 variants to loop through
                variants[0] = initialized;
                for (int n = 1; n < variants.length; n++) {
                    variants[n] = LootInitialization.initializeVaultLoot(offer, 0);
                }
                builder.addSlot(RecipeIngredientRole.OUTPUT, 1 + 18 * (i % 9), 1 + 18 * (i / 9)).addIngredients(Ingredient.of(variants));
            }
>>>>>>> upstream/master
        }

    }

<<<<<<< HEAD
    @Override public void draw(ShopTierAccessor recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        Minecraft.getInstance().font.draw(stack, new TextComponent("Level " + recipe.getMinLevel() + "+"), 0, -12, -16777216);
=======
    @Override public void draw(ShopPedestalConfig.ShopTier recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        Minecraft.getInstance().font.draw(stack, new TextComponent("Level " + recipe.getLevel() + "+"), 0, -12, -16777216);
>>>>>>> upstream/master
    }

}
