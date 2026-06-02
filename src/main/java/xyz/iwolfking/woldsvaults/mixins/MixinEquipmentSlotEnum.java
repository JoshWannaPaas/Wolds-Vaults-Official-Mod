package xyz.iwolfking.woldsvaults.mixins;

import net.minecraft.world.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.ArrayList;
import java.util.Arrays;

@Mixin(value = EquipmentSlot.class, remap = false)
public class MixinEquipmentSlotEnum {
    @Shadow
    @Final
    @Mutable @SuppressWarnings("target")
    private static EquipmentSlot[] $VALUES;

    private static final EquipmentSlot SUBWEAPON = enumExpansion$addVariant("SUBWEAPON", EquipmentSlot.Type.HAND, 0, 0, "subweapon");

    @Invoker("<init>")
    public static EquipmentSlot enumExpansion$invokeInit(String internalName, int internalId, EquipmentSlot.Type pType, int pIndex, int pFilterFlag, String pName) {
        throw new AssertionError();
    }

    @Unique
    private static EquipmentSlot enumExpansion$addVariant(String internalName, EquipmentSlot.Type pType, int pIndex, int pFilterFlag, String pName) {
        ArrayList<EquipmentSlot> variants = new ArrayList<EquipmentSlot>(Arrays.asList(MixinEquipmentSlotEnum.$VALUES));
        EquipmentSlot type = enumExpansion$invokeInit(internalName, variants.get(variants.size() - 1).ordinal() + 1, pType, pIndex, pFilterFlag, pName);
        variants.add(type);
        MixinEquipmentSlotEnum.$VALUES = variants.toArray(new EquipmentSlot[0]);
        return type;
    }
}
