package xyz.iwolfking.woldsvaults.objectives.data.builtin.events;

import com.cursedcauldron.wildbackport.common.registry.WBMobEffects;
import xyz.iwolfking.woldsvaults.objectives.data.EnchantedEventsRegistry;
import xyz.iwolfking.woldsvaults.objectives.data.lib.events.PotionEffectEnchantedEvent;

public class WildBackportEvents {
    public static final PotionEffectEnchantedEvent DARKNESS_EVENT = new PotionEffectEnchantedEvent("Lights Out", "Who turned out the lights!?", "#1a1a00", WBMobEffects.DARKNESS.get(), 600, 200);
    public static void init() {
        EnchantedEventsRegistry.register(DARKNESS_EVENT, 14.0, false, false);
    }
}
