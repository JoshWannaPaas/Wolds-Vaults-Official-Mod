package xyz.iwolfking.woldsvaults.lib;

import iskallia.vault.VaultMod;
import iskallia.vault.gear.data.VaultGearData;
import iskallia.vault.init.ModGearAttributes;
import net.minecraft.Util;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public enum ExtendedToolType {
    NONE("none"),
    RAKER("raker"),
    RAVAGER("ravager");
    private final String id;
    private final String description;
    private final ExtendedToolType[] parents;
    private final int packed;

    ExtendedToolType(String id, ExtendedToolType... parents) {
        this.id = id;
        this.description = Util.makeDescriptionId("item", VaultMod.id("tool." + id));
        this.parents = parents;
        this.packed = parents.length == 0 ? 1 << this.ordinal() : Arrays.stream(this.parents).mapToInt((value) -> 1 << value.ordinal()).sum();
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public ExtendedToolType[] getParents() {
        return this.parents;
    }

    public int getPacked() {
        return this.packed;
    }

    public static @Nullable ExtendedToolType of(ItemStack stack) {
        VaultGearData data = VaultGearData.read(stack);
        boolean picking = data.has(ModGearAttributes.PICKING);
        boolean axing = data.has(ModGearAttributes.AXING);
        boolean shoveling = data.has(ModGearAttributes.SHOVELLING);
        boolean reaping = data.has(ModGearAttributes.REAPING);
        boolean hammering = data.has(ModGearAttributes.HAMMERING);
        if(!picking && !axing && !shoveling && !reaping && !hammering) {
            return NONE;
        }
        else if(hammering && reaping && (axing || picking || shoveling)) {
            return RAVAGER;
        }
        else if(hammering && reaping) {
            return RAKER;
        }
        else {
            return null;
        }
    }

    public boolean has(ExtendedToolType type) {
        return this == type || Arrays.stream(this.parents).anyMatch((toolType) -> {
            return toolType == type;
        });
    }
}
