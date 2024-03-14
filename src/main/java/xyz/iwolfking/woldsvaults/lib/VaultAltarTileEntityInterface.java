package xyz.iwolfking.woldsvaults.lib;

import iskallia.vault.altar.AltarInfusionRecipe;
import net.minecraft.server.level.ServerLevel;

public interface VaultAltarTileEntityInterface {
    void invokeResetAltar(ServerLevel world);
    void invokeUpdateDisplayedIndex(AltarInfusionRecipe recipe);

}
