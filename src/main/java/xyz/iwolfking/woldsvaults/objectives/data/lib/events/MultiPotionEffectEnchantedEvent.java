package xyz.iwolfking.woldsvaults.objectives.data.lib.events;

import com.google.gson.annotations.Expose;
import iskallia.vault.core.vault.Vault;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import xyz.iwolfking.woldsvaults.objectives.lib.BasicEnchantedEvent;

import java.util.List;

public class MultiPotionEffectEnchantedEvent extends BasicEnchantedEvent {
    @Expose
    private final List<MobEffect> effects;
    @Expose
    private final Integer effectLevel;
    @Expose
    private final Integer effectDuration;
    public MultiPotionEffectEnchantedEvent(String eventName, String eventDescription, String primaryColor, List<MobEffect> effects, Integer duration, Integer level) {
        super(eventName, eventDescription, primaryColor);
        this.effects = effects;
        this.effectDuration = duration;
        this.effectLevel = level;
    }

    @Override
    public void triggerEvent(BlockPos pos, ServerPlayer player, Vault vault) {
        effects.forEach(mobEffect -> {
            player.addEffect(new MobEffectInstance(mobEffect, effectDuration, effectLevel));
        });
        super.triggerEvent(pos, player, vault);
    }
}
