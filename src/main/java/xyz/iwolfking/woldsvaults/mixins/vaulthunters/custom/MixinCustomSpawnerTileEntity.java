package xyz.iwolfking.woldsvaults.mixins.vaulthunters.custom;

import com.llamalad7.mixinextras.sugar.Local;
import iskallia.vault.block.entity.CustomEntitySpawnerTileEntity;
import iskallia.vault.config.CustomEntitySpawnerConfig;
import iskallia.vault.entity.champion.ChampionPromoter;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = CustomEntitySpawnerTileEntity.class)
public class MixinCustomSpawnerTileEntity {


    @Inject(method = "spawnEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V"))
    private static void spawnEntity(Level level, BlockPos blockPos, ServerLevel serverLevel, CustomEntitySpawnerConfig.SpawnerGroup spawnerGroup, CallbackInfo ci, @Local Entity entity, @Local CustomEntitySpawnerConfig.SpawnerEntity spawnerEntity) {
        if(entity != null && spawnerEntity != null && spawnerEntity.nbt != null && spawnerEntity.nbt.contains("champion")) {
            ChampionPromoter.applyChampionAttributes((LivingEntity) entity);
        }
    }
}
