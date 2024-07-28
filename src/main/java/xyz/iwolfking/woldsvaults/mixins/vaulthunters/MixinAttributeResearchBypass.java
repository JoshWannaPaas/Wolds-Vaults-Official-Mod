package xyz.iwolfking.woldsvaults.mixins.vaulthunters;

import iskallia.vault.research.ResearchTree;
import iskallia.vault.research.Restrictions;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.iwolfking.woldsvaults.data.ResearchBypassData;

@Mixin(value = ResearchTree.class, remap = false)
public class MixinAttributeResearchBypass {
    @Inject(method = "restrictedBy(Lnet/minecraft/world/item/ItemStack;Liskallia/vault/research/Restrictions$Type;)Ljava/lang/String;", at = @At("HEAD"), cancellable = true)
    public void researchOverride(ItemStack item, Restrictions.Type restrictionType, CallbackInfoReturnable<String> cir) {
        if (ResearchBypassData.getBypassedItems().contains(item.getItem())) {
            cir.setReturnValue(null);
        }
    }
}
