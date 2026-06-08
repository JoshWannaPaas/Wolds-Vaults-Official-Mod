package xyz.iwolfking.woldsvaults.mixins.vaulthunters.custom.enum_extension;

import iskallia.vault.gear.VaultGearType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import xyz.iwolfking.woldsvaults.init.ModItems;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(value = VaultGearType.class, remap = false)
public class MixinVaultGearType {
    @Shadow
    @Final
    @Mutable
    @SuppressWarnings("target")
    private static VaultGearType[] $VALUES;

    private static final VaultGearType DAGGER_SUB = enumExpansion$addVariant("DAGGER_SUB", EquipmentSlot.valueOf("SUBWEAPON"), ModItems.DAGGER_SUB);

    @Invoker("<init>")
    public static VaultGearType enumExpansion$invokeInit(String internalName, int internalId, EquipmentSlot slot, Item associatedItem) {
        throw new AssertionError();
    }

    @Unique
    private static VaultGearType enumExpansion$addVariant(String internalName, EquipmentSlot slot, Item associatedItem) {
        ArrayList<VaultGearType> variants = new ArrayList<VaultGearType>(Arrays.asList(MixinVaultGearType.$VALUES));
        VaultGearType type = enumExpansion$invokeInit(internalName, variants.get(variants.size() - 1).ordinal() + 1, slot, associatedItem);
        variants.add(type);
       MixinVaultGearType.$VALUES = variants.toArray(new VaultGearType[0]);
        return type;
    }
}