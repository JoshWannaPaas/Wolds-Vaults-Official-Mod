package xyz.iwolfking.woldsvaults.mixins.tomsstorage;

import com.simibubi.create.content.logistics.filter.FilterItem;
import com.tom.storagemod.util.FilteredInventoryHandler;
import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import net.joseph.vaultfilters.VaultFilters;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
@Restriction(
        require = {
                @Condition(type = Condition.Type.MOD, value = "tomsstorage")
        }
)
@Mixin(value = FilteredInventoryHandler.class, remap = false)
public class MixinFilteredInventoryHandler {

    @Shadow private Container filter;

    @Inject(method = "isInFilter", at = @At("HEAD"), cancellable = true)
    private void checkVaultFilter(ItemStack checkStack, CallbackInfoReturnable<Boolean> cir) {
        for(int i = 0; i < this.filter.getContainerSize(); ++i) {
            ItemStack is = this.filter.getItem(i);
            if(is.getItem() instanceof FilterItem) {
                if (VaultFilters.checkFilter(checkStack, is, true, null)) {
                    cir.setReturnValue(true);
                }
            }
        }
    }
}
