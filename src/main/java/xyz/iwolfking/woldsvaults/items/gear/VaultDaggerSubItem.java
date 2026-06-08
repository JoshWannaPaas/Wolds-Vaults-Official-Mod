package xyz.iwolfking.woldsvaults.items.gear;

import iskallia.vault.dynamodel.DynamicModel;
import iskallia.vault.gear.VaultGearClassification;
import iskallia.vault.gear.item.VaultGearItem;
import iskallia.vault.item.gear.VaultSwordItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import xyz.iwolfking.woldsvaults.items.DaggerVaultGearItem;
import xyz.iwolfking.woldsvaults.models.Daggers;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class VaultDaggerSubItem extends VaultSwordItem implements VaultGearItem, DyeableLeatherItem {


    public VaultDaggerSubItem(ResourceLocation id, Properties builder) {
        super(id, builder);
    }


    public Optional<? extends DynamicModel<?>> resolveDynamicModel(ItemStack stack, ResourceLocation key) {
        return Daggers.REGISTRY.get(key);
    }

//    @Nullable
//    public EquipmentSlot getIntendedSlot(ItemStack stack) {
//        return EquipmentSlot.OFFHAND;
//    }
//
//    @NotNull
//    public VaultGearClassification getClassification(ItemStack stack) {
//        return VaultGearClassification.WAND;
//    }

//    @NotNull
//    @Override
//    public VaultGearType getGearType(ItemStack itemStack) {
//        return VaultGearType.valueOf("DAGGER_SUB");
//        return VaultGearType.SWORD;
//    }

}