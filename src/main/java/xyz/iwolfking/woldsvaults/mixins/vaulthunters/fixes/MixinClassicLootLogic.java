package xyz.iwolfking.woldsvaults.mixins.vaulthunters.fixes;

import iskallia.vault.block.VaultChestBlock;
import iskallia.vault.core.event.common.ChestGenerationEvent;
import iskallia.vault.core.vault.ClassicLootLogic;
import iskallia.vault.core.vault.Vault;
import iskallia.vault.core.vault.stat.VaultChestType;
import iskallia.vault.core.world.storage.VirtualWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ClassicLootLogic.class, remap = false)
public class MixinClassicLootLogic {
    /**
     * @author iwolfking
     * @reason Prevent treasure chests from being trapped
     */
    @Inject(method = "applyTrap", at = @At("HEAD"), cancellable = true)
    protected void applyTrap(VirtualWorld world, Vault vault, ChestGenerationEvent.Data data, CallbackInfoReturnable<Boolean> cir) {
        if (data.getState().getBlock() instanceof VaultChestBlock chestBlock) {
            if (chestBlock.getType().equals(VaultChestType.TREASURE)) {
                cir.setReturnValue(false);
            }
        }
    }

}
