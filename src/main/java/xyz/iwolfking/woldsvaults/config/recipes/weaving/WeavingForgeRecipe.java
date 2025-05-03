package xyz.iwolfking.woldsvaults.config.recipes.weaving;

import iskallia.vault.config.recipe.ForgeRecipeType;
import iskallia.vault.container.oversized.OverSizedItemStack;
import iskallia.vault.gear.crafting.recipe.VaultForgeRecipe;
import iskallia.vault.research.StageManager;
import iskallia.vault.world.data.PlayerResearchesData;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import xyz.iwolfking.woldsvaults.items.TargetedModBox;

import java.util.List;

public class WeavingForgeRecipe extends VaultForgeRecipe {

    public WeavingForgeRecipe(ResourceLocation id, ItemStack output, List<ItemStack> inputs) {
        super(ForgeRecipeType.valueOf("WEAVING"), id, output, inputs);
    }

    public WeavingForgeRecipe(Object o, Object o1) {
        super(ForgeRecipeType.valueOf("WEAVING"), (ResourceLocation) o, (ItemStack) o1);
    }

    @Override
    public ItemStack createOutput(List<OverSizedItemStack> consumed, ServerPlayer crafter, int vaultLevel) {
        return super.createOutput(consumed, crafter, vaultLevel);
    }

    @Override
    public void addCraftingDisplayTooltip(ItemStack result, List<Component> out) {

    }

    @Override
    public boolean canCraft(Player player) {
        return true;
    }
}
