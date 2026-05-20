package xyz.iwolfking.woldsvaults.items;

import iskallia.vault.gear.item.VaultGearItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;

public interface DaggerVaultGearItem extends VaultGearItem {
    default boolean isIntendedForSlot(ItemStack stack, EquipmentSlot slotType) {
        return true;
    }
}
