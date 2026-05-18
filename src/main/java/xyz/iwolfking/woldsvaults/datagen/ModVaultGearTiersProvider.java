package xyz.iwolfking.woldsvaults.datagen;

import iskallia.vault.VaultMod;
import iskallia.vault.config.entry.IntRollRangeEntry;
import iskallia.vault.config.gear.VaultGearTierConfig;
import iskallia.vault.gear.attribute.ability.AbilityFloatValueAttribute;
import iskallia.vault.gear.attribute.ability.AbilityLevelAttribute;
import iskallia.vault.gear.attribute.custom.effect.EffectCloudAttribute;
import iskallia.vault.gear.attribute.talent.TalentLevelAttribute;
import iskallia.vault.init.ModEffects;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import xyz.iwolfking.vhapi.api.datagen.AbstractVaultGearConfigProvider;
import xyz.iwolfking.woldsvaults.WoldsVaults;
import xyz.iwolfking.woldsvaults.init.ModGearAttributes;
import java.util.List;

public class ModVaultGearTiersProvider extends AbstractVaultGearConfigProvider {
    public ModVaultGearTiersProvider(DataGenerator generator) {
        super(generator, WoldsVaults.MOD_ID);
    }

    @Override
    public void registerConfigs() {
        add("unique", builder -> {
            builder.key(VaultMod.id("unique")).add(VaultGearTierConfig.ModifierAffixTagGroup.IMPLICIT, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseDamage", "trident_damage_low", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 15, 10, 8, 14, 0.5);
                            vaultGearModifierTiersBuilder.add(10, 47, 10, 14, 16, 0.5);
                            vaultGearModifierTiersBuilder.add(16, 57, 10, 16, 20, 0.5);
                            vaultGearModifierTiersBuilder.add(25, 63, 10, 20, 30, 0.5);
                            vaultGearModifierTiersBuilder.add(36, 71, 10, 30, 34, 0.5);
                            vaultGearModifierTiersBuilder.add(48, 82, 10, 34, 40, 0.5);
                            vaultGearModifierTiersBuilder.add(58, -1, 10, 40, 45, 0.5);
                            vaultGearModifierTiersBuilder.add(68, -1, 10, 45, 50, 0.5);
                            vaultGearModifierTiersBuilder.add(80, -1, 10, 50, 55, 0.5);
                            vaultGearModifierTiersBuilder.add(90, -1, 10, 55, 65, 0.5);
                            vaultGearModifierTiersBuilder.add(95, -1, 10, 65, 70, 0.5);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 70, 80, 0.5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseDamage", "trident_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 15, 10, 10, 16, 0.5);
                            vaultGearModifierTiersBuilder.add(10, 47, 10, 16, 20, 0.5);
                            vaultGearModifierTiersBuilder.add(16, 57, 10, 20, 24, 0.5);
                            vaultGearModifierTiersBuilder.add(25, 63, 10, 24, 32, 0.5);
                            vaultGearModifierTiersBuilder.add(36, 71, 10, 32, 38, 0.5);
                            vaultGearModifierTiersBuilder.add(48, 82, 10, 38, 44, 0.5);
                            vaultGearModifierTiersBuilder.add(58, -1, 10, 44, 54, 0.5);
                            vaultGearModifierTiersBuilder.add(68, -1, 10, 54, 68, 0.5);
                            vaultGearModifierTiersBuilder.add(80, -1, 10, 68, 74, 0.5);
                            vaultGearModifierTiersBuilder.add(90, -1, 10, 74, 84, 0.5);
                            vaultGearModifierTiersBuilder.add(95, -1, 10, 84, 95, 0.5);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 95, 115, 0.5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.TRIDENT_LOYALTY, "BaseLoyalty", "trident_loyalty_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 40, 10, 1, 2, 1);
                            vaultGearModifierTiersBuilder.add(40, -1, 10, 2, 4, 1);
                            vaultGearModifierTiersBuilder.add(70, -1, 10, 4, 6, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.TRIDENT_LOYALTY, "BaseLoyalty", "trident_loyalty", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 1, 2, 1);
                            vaultGearModifierTiersBuilder.add(40, -1, 10, 2, 3, 1);
                            vaultGearModifierTiersBuilder.add(70, -1, 10, 3, 4, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.TRIDENT_CHANNELING, "BaseChanneling", "trident_channeling", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, true);
                        });
            }).build();
            builder.key(VaultMod.id("unique")).add(VaultGearTierConfig.ModifierAffixTagGroup.PREFIX, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.TALENT_LEVEL, "ModPrimeAmpLevel", "mod_prime_amp_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new TalentLevelAttribute.Config("Prime_Amplification", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new TalentLevelAttribute.Config("Prime_Amplification", 2));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModEmpowerLevel", "mod_empower_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Empower", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Empower", 2));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModNovaLevel", "mod_nova_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Nova", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Nova", 2));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModJavelinLevel", "mod_javelin_base_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Javelin_Base", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Javelin_Base", 2));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModImplodeLevel", "mod_implode_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Implode", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Implode", 2));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.IMPLODING_JAVELIN, "ModImplodingJavelin", "mod_imploding_javelin", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.DRIPPING_LAVA, "ModDrippingLava", "mod_dripping_lava", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_COOLDOWN_PERCENT, "ModJavelinCooldownIncrease", "javelin_cooldown_increase", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.addPercentAbilityCooldown(0, -1, 10, new AbilityFloatValueAttribute.Config("Javelin_Base", 12F, 16F, 0.5F));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_MANACOST_PERCENT, "ModJavelinManaIncrease", "javelin_mana_cost", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.addPercentManaCost(0, -1, 10, new AbilityFloatValueAttribute.Config("Javelin_Base", 1.5F, 3F, 0.01F));
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.HIT_HEARTS, "ModHitHearts", "mod_hit_hearts_fork", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 20, 10, 0.1F, 0.25F, 0.01F);
                            vaultGearModifierTiersBuilder.add(20, 40, 10, 0.2F, 0.35F, 0.01F);
                            vaultGearModifierTiersBuilder.add(40, -1, 10, 0.3F, 0.45F, 0.01F);
                            vaultGearModifierTiersBuilder.add(65, -1, 10, 0.4F, 0.55F, 0.01F);
                            vaultGearModifierTiersBuilder.add(85, -1, 10, 0.5F, 0.75F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_TANK, "ModTankDamage", "mod_tank_damage_fork", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 0.5F, 1F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOUL_QUANTITY_PERCENTILE, "ModSoulQuantity", "mod_soul_quantity_fork", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 0.25F, 0.25F, 0F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.TRIDENT_WINDUP, "ModTridentWindup", "windup_time_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 64, 10, 0.5F, 0.5F, 0F);
                            vaultGearModifierTiersBuilder.add(65, -1, 10, 0.5F, 0.75F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.SECOND_JUDGEMENT, "ModSecondJudgement", "second_judgement_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 0.25F, 0.5F, 0.01F);
                            vaultGearModifierTiersBuilder.add(65, -1, 10, 0.5F, 0.75F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.BURNING_HIT_CHANCE, "ModBurningHit", "mod_burning_hit_lava_chicken", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 40, 10, 0.06F, 0.12F, 0.01F);
                            vaultGearModifierTiersBuilder.add(25, 65, 10, 0.12F, 0.14F, 0.01F);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, 0.14F, 0.16F, 0.01F);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, 0.16F, 0.2F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.CHANNELING_CHANCE, "ModChannelingChance", "channeling_chance_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 0.25F, 0.5F, 0.01F);
                            vaultGearModifierTiersBuilder.add(65, -1, 10, 0.5F, 0.75F, 0.01F);
                            vaultGearModifierTiersBuilder.add(90, -1, 10, 0.75F, 1.0F, 0.01F);
                        });
                //Chroma Brew
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud1", "mod_regen_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Regeneration I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.REGENERATION.getColor(), true, 0.05F, MobEffects.REGENERATION.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Regeneration II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.REGENERATION.getColor(), true, 0.05F, MobEffects.REGENERATION.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Regeneration III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.REGENERATION.getColor(), true, 0.05F, MobEffects.REGENERATION.getRegistryName(), 160, 0);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Regeneration IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.REGENERATION.getColor(), true, 0.05F, MobEffects.REGENERATION.getRegistryName(), 180, 0);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Regeneration V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.REGENERATION.getColor(), true, 0.05F, MobEffects.REGENERATION.getRegistryName(), 200, 0);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud1", "mod_healing_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Healing I", ResourceLocation.withDefaultNamespace("empty"), 80, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Healing II", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Healing III", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Healing IV", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Healing V", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud1", "mod_resistance_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Resistance I", ResourceLocation.withDefaultNamespace("empty"), 80, 4.0f, MobEffects.DAMAGE_RESISTANCE.getColor(), true, 0.05F, MobEffects.DAMAGE_RESISTANCE.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Resistance II", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.DAMAGE_RESISTANCE.getColor(), true, 0.05F, MobEffects.DAMAGE_RESISTANCE.getRegistryName(), 160, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Resistance III", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.DAMAGE_RESISTANCE.getColor(), true, 0.05F, MobEffects.DAMAGE_RESISTANCE.getRegistryName(), 200, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Resistance IV", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.DAMAGE_RESISTANCE.getColor(), true, 0.05F, MobEffects.DAMAGE_RESISTANCE.getRegistryName(), 240, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Resistance V", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.DAMAGE_RESISTANCE.getColor(), true, 0.05F, MobEffects.DAMAGE_RESISTANCE.getRegistryName(), 300, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud2", "mod_wither_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Wither I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.WITHER.getColor(), false, 0.05F, MobEffects.WITHER.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Wither II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.WITHER.getColor(), false, 0.05F, MobEffects.WITHER.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Wither III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.WITHER.getColor(), false, 0.05F, MobEffects.WITHER.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Wither IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.WITHER.getColor(), false, 0.05F, MobEffects.WITHER.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Wither V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.WITHER.getColor(), false, 0.05F, MobEffects.WITHER.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud2", "mod_bleed_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Bleed I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, ModEffects.BLEED.getColor(), false, 0.05F, ModEffects.BLEED.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Bleed II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, ModEffects.BLEED.getColor(), false, 0.05F, ModEffects.BLEED.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Bleed III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, ModEffects.BLEED.getColor(), false, 0.05F, ModEffects.BLEED.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Bleed IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.BLEED.getColor(), false, 0.05F, ModEffects.BLEED.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Bleed V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.BLEED.getColor(), false, 0.05F, ModEffects.BLEED.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud2", "mod_poison_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Poison I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.POISON.getColor(), false, 0.05F, MobEffects.POISON.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Poison II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.POISON.getColor(), false, 0.05F, MobEffects.POISON.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Poison III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.POISON.getColor(), false, 0.05F, MobEffects.POISON.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Poison IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.POISON.getColor(), false, 0.05F, MobEffects.POISON.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Poison V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.POISON.getColor(), false, 0.05F, MobEffects.POISON.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud3", "mod_slowness_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Slowness I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Slowness II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Slowness III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Slowness IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Slowness V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud3", "mod_unluck_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Unluck I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.UNLUCK.getColor(), false, 0.05F, MobEffects.UNLUCK.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Unluck II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.UNLUCK.getColor(), false, 0.05F, MobEffects.UNLUCK.getRegistryName(), 160, 0);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Unluck III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.UNLUCK.getColor(), false, 0.05F, MobEffects.UNLUCK.getRegistryName(), 200, 0);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Unluck IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.UNLUCK.getColor(), false, 0.05F, MobEffects.UNLUCK.getRegistryName(), 240, 0);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Unluck V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.UNLUCK.getColor(), false, 0.05F, MobEffects.UNLUCK.getRegistryName(), 300, 0);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud3", "mod_chilling_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Chilling I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, ModEffects.CHILLED.getColor(), false, 0.05F, ModEffects.CHILLED.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Chilling II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, ModEffects.CHILLED.getColor(), false, 0.05F, ModEffects.CHILLED.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Chilling III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, ModEffects.CHILLED.getColor(), false, 0.05F, ModEffects.CHILLED.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Chilling IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.CHILLED.getColor(), false, 0.05F, ModEffects.CHILLED.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Chilling V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.CHILLED.getColor(), false, 0.05F, ModEffects.CHILLED.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud3", "mod_weakness_cloud_brew", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Weakness I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.WEAKNESS.getColor(), false, 0.05F, MobEffects.WEAKNESS.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Weakness II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.WEAKNESS.getColor(), false, 0.05F, MobEffects.WEAKNESS.getRegistryName(), 160, 0);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, "Weakness III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.WEAKNESS.getColor(), false, 0.05F, MobEffects.WEAKNESS.getRegistryName(), 200, 0);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, "Weakness IV", ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.WEAKNESS.getColor(), false, 0.05F, MobEffects.WEAKNESS.getRegistryName(), 240, 0);
                            vaultGearModifierTiersBuilder.add(75, -1, 10, "Weakness V", ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.WEAKNESS.getColor(), false, 0.05F, MobEffects.WEAKNESS.getRegistryName(), 300, 0);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModPoisonNovaLevel", "mod_poison_nova_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Nova_Dot", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Nova_Dot", 2));
                            vaultGearModifierTiersBuilder.add(50, -1, 10, new AbilityLevelAttribute.Config("Nova_Dot", 3));
                            vaultGearModifierTiersBuilder.add(75, -1, 10, new AbilityLevelAttribute.Config("Nova_Dot", 4));
                        });
            }).build();
            builder.key(VaultMod.id("unique")).add(VaultGearTierConfig.ModifierAffixTagGroup.SUFFIX, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SHOCKING_HIT_CHANCE, "ModShockingHit", "shocking_hit_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, 0.25F, 0.25F, 0F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud", "slowness_cloud_zeus", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Slowness I", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Slowness II", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Slowness III", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.05F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD, "ModEffectCloud", "mod_healing_cloud_fork", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Healing I", ResourceLocation.withDefaultNamespace("empty"), 80, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Healing II", ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(0, -1, 10, "Healing III", ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.HEAL.getColor(), true, 0.05F, MobEffects.HEAL.getRegistryName(), 20, 0);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(ModGearAttributes.INCREASED_EFFECT_CLOUD_CHANCE, "ModEffectCloudChance", "mod_effect_cloud_chance", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, 20, 10, 0.01F, 0.02F, 0.01F);
                            vaultGearModifierTiersBuilder.add(20, 40, 10, 0.02F, 0.03F, 0.01F);
                            vaultGearModifierTiersBuilder.add(40, -1, 10, 0.03F, 0.04F, 0.01F);
                            vaultGearModifierTiersBuilder.add(65, -1, 10, 0.05F, 0.09F, 0.01F);
                            vaultGearModifierTiersBuilder.add(85, -1, 10, 0.09F, 0.12F, 0.01F);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ABILITY_LEVEL, "ModDiffuseLevel", "mod_diffuse_level", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Expunge_Base", 1));
                            vaultGearModifierTiersBuilder.add(0, -1, 10, new AbilityLevelAttribute.Config("Expunge_Base", 2));
                            vaultGearModifierTiersBuilder.add(50, -1, 10, new AbilityLevelAttribute.Config("Expunge_Base", 3));
                            vaultGearModifierTiersBuilder.add(75, -1, 10, new AbilityLevelAttribute.Config("Expunge_Base", 4));
                        });
                vaultGearAttributeGroupBuilder.addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_TRAIL, "ModEffectTrail", "mod_poison_trail", List.of(), vaultGearModifierTiersBuilder -> {
                   vaultGearModifierTiersBuilder.add(0, 65, 10, MobEffects.POISON.getRegistryName(), new IntRollRangeEntry(140, 200, 20));
                   vaultGearModifierTiersBuilder.add(65, -1, 10, MobEffects.POISON.getRegistryName(), new IntRollRangeEntry(200, 240, 20));
                   vaultGearModifierTiersBuilder.add(90, -1, 10, MobEffects.POISON.getRegistryName(), new IntRollRangeEntry(240, 300, 20));
                });
            }).build();
        });

        add("dagger_main", builder -> {
            builder.key(VaultMod.id("dagger_main")).add(VaultGearTierConfig.ModifierAffixTagGroup.BASE_ATTRIBUTES, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY, "BaseDurability", "base_durability",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  40, 10, 1800, 2600, 1);
                            vaultGearModifierTiersBuilder.add(8,  70, 10, 2601, 3600, 1);
                            vaultGearModifierTiersBuilder.add(25, -1, 10, 3601, 4700, 1);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, 4701, 6200, 1);
                            vaultGearModifierTiersBuilder.add(70, -1, 10, 6201, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_soulbound",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 20, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_no_soulbound", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 80, false);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_living",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,2,true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_no_living",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,98,false);
                        });
            });

            builder.key(VaultMod.id("dagger_main")).add(VaultGearTierConfig.ModifierAffixTagGroup.IMPLICIT,        vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseAttackDamage", "base_attack_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   15, 10, 5,  8,  1);
                            vaultGearModifierTiersBuilder.add(10,  47, 10, 9,  12, 1);
                            vaultGearModifierTiersBuilder.add(16,  57, 10, 13, 16, 1);
                            vaultGearModifierTiersBuilder.add(25,  63, 10, 17, 20, 1);
                            vaultGearModifierTiersBuilder.add(36,  71, 10, 21, 24, 1);
                            vaultGearModifierTiersBuilder.add(48,  82, 10, 25, 28, 1);
                            vaultGearModifierTiersBuilder.add(58,  89, 10, 29, 32, 1);
                            vaultGearModifierTiersBuilder.add(64,  -1, 10, 33, 36, 1);
                            vaultGearModifierTiersBuilder.add(72,  -1, 10, 37, 40, 1);
                            vaultGearModifierTiersBuilder.add(83,  -1, 10, 41, 44, 1);
                            vaultGearModifierTiersBuilder.add(90,  -1, 10, 45, 48, 1);
                            vaultGearModifierTiersBuilder.add(95,  -1, 10, 49, 52, 1);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 53, 56, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_SPEED,  "BaseAttackSpeed",  "base_attack_speed",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 10, -2.1,  -2.0, 1);
                            vaultGearModifierTiersBuilder.add(50,-1, 10, -1.99, -1.9, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_RANGE,  "BaseReducedRange", "base_reduced_range", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, -0.50,-0.30,1);
                            vaultGearModifierTiersBuilder.add(50, -1, 10, -0.29,-0.10,1);
                        });
            });

            builder.key(VaultMod.id("dagger_main")).add(VaultGearTierConfig.ModifierAffixTagGroup.PREFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOUL_QUANTITY,    "ModSoulChance",     "mod_soul_chance",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   70, 10, 0.20, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 10, 0.41, 0.80, 1);
                            vaultGearModifierTiersBuilder.add(45,  -1, 10, 0.81, 1.20, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 10, 1.21, 1.60, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.60, 2.20, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 2.20, 3.00, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_CHAMPION,  "ModChampionDamage", "mod_champion_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_DUNGEON,   "ModDungeonDamage",  "mod_dungeon_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_TANK,      "ModTankDamage",     "mod_tank_damage",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_DWELLER,   "ModDwellerDamage",  "mod_dweller_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_ASSASSIN,  "ModAssassinDamage", "mod_assassin_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_HORDE,     "ModHordeDamage",    "mod_horde_damage",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   79, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(62,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.41, 0.50, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LUCKY_HIT_CHANCE, "ModLuckyHit",       "mod_lucky_hit",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(25,  79, 10, 0.03, 0.05, 1);
                            vaultGearModifierTiersBuilder.add(40,  -1, 10, 0.06, 0.08, 1);
                            vaultGearModifierTiersBuilder.add(60,  -1, 10, 0.09, 0.11, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 0.12, 0.15, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.16, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.21, 0.25, 1);
                        });
            });

            builder.key(VaultMod.id("dagger_main")).add(VaultGearTierConfig.ModifierAffixTagGroup.SUFFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY,           "ModDurability",     "mod_durability",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(11,  -1, 10, 500,  900,  1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 10, 901,  1300, 1);
                            vaultGearModifierTiersBuilder.add(46,  -1, 10, 1301, 1700, 1);
                            vaultGearModifierTiersBuilder.add(67,  -1, 10, 1701, 2100, 1);
                            vaultGearModifierTiersBuilder.add(89,  -1, 10, 2101, 2500, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 2501, 3700, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 3701, 5000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE,        "ModAttackEcho",     "mod_attack_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   49, 10, 1,  4,  1);
                            vaultGearModifierTiersBuilder.add(25,  74, 10, 5,  8,  1);
                            vaultGearModifierTiersBuilder.add(50,  -1, 10, 9,  12, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 10, 13, 16, 1);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 17, 20, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 21, 25, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 26, 30, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.ECHOING_CHANCE,       "ModAttackEcho",     "mod_echoing_chance", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(50,   85, 10, 0.05,  0.10,  0.01);
                            vaultGearModifierTiersBuilder.add(60,   -1, 10, 0.11,  0.14,  0.01);
                            vaultGearModifierTiersBuilder.add(70,   -1, 10, 0.15,  0.18,  0.01);
                            vaultGearModifierTiersBuilder.add(90,   -1, 10, 0.19,  0.22,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.23,  0.26,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.27,  0.30,  0.01);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_RANGE,         "ModRangeSpeed",     "mod_attack_range",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 0.10, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(20,  -1, 10, 0.21, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(45,  -1, 10, 0.31, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 10, 0.41, 0.50, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.51, 0.75, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.76, 1.00, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_SPEED_PERCENT, "ModRangeSpeed",     "mod_attack_speed",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 0.05, 0.10, 1);
                            vaultGearModifierTiersBuilder.add(36,  -1, 10, 0.11, 0.15, 1);
                            vaultGearModifierTiersBuilder.add(65,  -1, 10, 0.16, 0.20, 1);
                            vaultGearModifierTiersBuilder.add(96,  -1, 10, 0.21, 0.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.31, 0.35, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedCloud", "mod_bleed_cloud",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Bleed I+",   ResourceLocation.withDefaultNamespace("empty"), 80,  4.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Bleed II+",  ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Bleed III+", ResourceLocation.withDefaultNamespace("empty"), 160, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Bleed IV+",  ResourceLocation.withDefaultNamespace("empty"), 200, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Bleed V+",   ResourceLocation.withDefaultNamespace("empty"), 240, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedCloud", "mod_heal_cloud",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Healing I+",   ResourceLocation.withDefaultNamespace("empty"), 80,  4.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Healing II+",  ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Healing III+", ResourceLocation.withDefaultNamespace("empty"), 160, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Healing IV+",  ResourceLocation.withDefaultNamespace("empty"), 200, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Healing V+",   ResourceLocation.withDefaultNamespace("empty"), 240, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModPoisonCloud",    "mod_poison_cloud",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Poison I+",   ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 3);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Poison II+",  ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 5);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Poison III+", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 7);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Poison IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 9);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Poison V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 12);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModSlownessCloud",  "mod_slowness_cloud", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Slowness I+",   ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Slowness II+",  ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Slowness III+", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Slowness IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Slowness V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModChillCloud",     "mod_chill_cloud",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Chilling I+",   ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Chilling II+",  ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Chilling III+", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Chilling IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Chilling V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 0);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModFearCloud",      "mod_fear_cloud",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Fear I+",   ResourceLocation.withDefaultNamespace("empty"), 120, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Fear II+",  ResourceLocation.withDefaultNamespace("empty"), 160, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Fear III+", ResourceLocation.withDefaultNamespace("empty"), 200, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Fear IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Fear V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                        });
            });
        });

        add("dagger_main_mythic", builder -> {
            builder.key(VaultMod.id("dagger_main_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.BASE_ATTRIBUTES, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY, "BaseDurability", "base_durability",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 6201, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_soulbound",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 50, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_no_soulbound", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 50, false);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.DIVINE,     "BaseDivine",     "base_divine",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1,4,true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.DIVINE,     "BaseDivine",     "base_no_divine",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1,96,false);
                        });
            });

            builder.key(VaultMod.id("dagger_main_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.IMPLICIT, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseAttackDamage", "base_attack_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 60, 75, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_SPEED,  "BaseAttackSpeed",  "base_attack_speed",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 10, -1.95, -1.85, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_RANGE,  "BaseReducedRange", "base_reduced_range", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, -0.15,0,1);
                        });
            });

            builder.key(VaultMod.id("dagger_main_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.PREFIX, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOUL_QUANTITY,    "ModSoulChance",     "mod_soul_chance",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 1.50, 2.00, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 2.01, 3.50, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 3.51, 5.00, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_CHAMPION,  "ModChampionDamage", "mod_champion_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_DUNGEON,   "ModDungeonDamage",  "mod_dungeon_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_TANK,      "ModTankDamage",     "mod_tank_damage",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_DWELLER,   "ModDwellerDamage",  "mod_dweller_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_ASSASSIN,  "ModAssassinDamage", "mod_assassin_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DAMAGE_HORDE,     "ModHordeDamage",    "mod_horde_damage",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.75, 1.25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 1.40, 1.80, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.80, 2.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LUCKY_HIT_CHANCE, "ModLuckyHit",       "mod_lucky_hit",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.15, 0.19, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.20, 0.24, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.25, 0.30, 1);
                        });
            });

            builder.key(VaultMod.id("dagger_main_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.SUFFIX, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY,           "ModDurability",     "mod_durability",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 4200, 5000,  1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 5001, 7400,  1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 7401, 10000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE,        "ModAttackEcho",     "mod_attack_damage",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 20, 25, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 26, 30, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 31, 40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.ECHOING_CHANCE,       "ModAttackEcho",     "mod_echoing_chance", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,  -1, 10, 0.20,  0.26,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.27,  0.33,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.34,  0.40,  0.01);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_RANGE,         "ModRangeSpeed",     "mod_attack_range",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.50, 0.75, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.76, 1.00, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 1.01, 1.25, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_SPEED_PERCENT, "ModRangeSpeed",     "mod_attack_speed",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 0.26, 0.30, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.31, 0.35, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.36, 0.40, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedCloud", "mod_bleed_cloud",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 4, "Bleed IV+",  ResourceLocation.withDefaultNamespace("empty"), 160, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 3);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Bleed V+",   ResourceLocation.withDefaultNamespace("empty"), 200, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 4);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Bleed VI+",  ResourceLocation.withDefaultNamespace("empty"), 240, 5.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedCloud", "mod_heal_cloud",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 4, "Healing IV+",  ResourceLocation.withDefaultNamespace("empty"), 200, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Healing V+",   ResourceLocation.withDefaultNamespace("empty"), 240, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Healing VI+",  ResourceLocation.withDefaultNamespace("empty"), 280, 5.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModPoisonCloud",    "mod_poison_cloud",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 10, "Poison IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 9);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Poison V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 12);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Poison VI+",  ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 12);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModSlownessCloud",  "mod_slowness_cloud", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 10, "Slowness IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Slowness V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 200, 4);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Slowness VI+",  ResourceLocation.withDefaultNamespace("empty"), 360, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 240, 5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModChillCloud",     "mod_chill_cloud",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(100,-1, 10, "Chilling IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Chilling V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Chilling VI+",  ResourceLocation.withDefaultNamespace("empty"), 360, 4.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 140, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModFearCloud",      "mod_fear_cloud",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Fear IV+",  ResourceLocation.withDefaultNamespace("empty"), 240, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Fear V+",   ResourceLocation.withDefaultNamespace("empty"), 300, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Fear VI+",  ResourceLocation.withDefaultNamespace("empty"), 360, 4.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                        });
            });
        });

        add("dagger_sub", builder -> {
            builder.key(VaultMod.id("dagger_sub")).add(VaultGearTierConfig.ModifierAffixTagGroup.BASE_ATTRIBUTES, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY, "BaseDurability", "base_durability",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, 2400, 4800, 1);
                            vaultGearModifierTiersBuilder.add(21, -1, 10, 3600, 5400, 1);
                            vaultGearModifierTiersBuilder.add(60, -1, 10, 4800, 6000, 1);
                            vaultGearModifierTiersBuilder.add(90, -1, 10, 6000, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_soulbound",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 20, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_no_soulbound", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 80, false);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_living",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,2,true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_no_living",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,98,false);
                        });
            });

            builder.key(VaultMod.id("dagger_sub")).add(VaultGearTierConfig.ModifierAffixTagGroup.IMPLICIT,        vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseAttackDamage", "base_attack_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   49, 10, 5,  7,  1);
                            vaultGearModifierTiersBuilder.add(20,  69, 10, 8,  10, 1);
                            vaultGearModifierTiersBuilder.add(40,  89, 10, 11, 13, 1);
                            vaultGearModifierTiersBuilder.add(50,  -1, 10, 14, 16, 1);
                            vaultGearModifierTiersBuilder.add(60,  -1, 10, 17, 19, 1);
                            vaultGearModifierTiersBuilder.add(70,  -1, 10, 20, 22, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 23, 25, 1);
                            vaultGearModifierTiersBuilder.add(90,  -1, 10, 26, 30, 1);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 31, 35, 1);
                        });
            });

            builder.key(VaultMod.id("dagger_sub")).add(VaultGearTierConfig.ModifierAffixTagGroup.PREFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOUL_QUANTITY,        "ModSoulChance",     "mod_soul_chance",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   70, 200, 0.20, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 200, 0.41, 0.80, 1);
                            vaultGearModifierTiersBuilder.add(45,  -1, 200, 0.81, 1.20, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 200, 1.21, 1.60, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 200, 1.60, 2.20, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 200, 2.20, 3.00, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ON_HIT_CHAIN,         "ModChaining",       "mod_chaining",        List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 1, 1, 1);
                            vaultGearModifierTiersBuilder.add(40,  -1, 10, 2, 2, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 3, 3, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 4, 4, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 5, 5, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.ECHOING_CHANCE,       "ModEchoingChance",  "mod_echoing_chance",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(50,   85, 10, 0.05,  0.10,  0.01);
                            vaultGearModifierTiersBuilder.add(60,   -1, 10, 0.11,  0.14,  0.01);
                            vaultGearModifierTiersBuilder.add(70,   -1, 10, 0.15,  0.18,  0.01);
                            vaultGearModifierTiersBuilder.add(90,   -1, 10, 0.19,  0.22,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.23,  0.26,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.27,  0.30,  0.01);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.REAVING_DAMAGE,       "ModReaving",        "mod_reaving",         List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,    70, 10, 0.08,  0.18,  0.01);
                            vaultGearModifierTiersBuilder.add(28,   -1, 10, 0.19,  0.21,  0.01);
                            vaultGearModifierTiersBuilder.add(45,   -1, 10, 0.22,  0.24,  0.01);
                            vaultGearModifierTiersBuilder.add(75,   -1, 10, 0.25,  0.28,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.29,  0.37,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.38,  0.50,  0.01);
                        });
            });

            builder.key(VaultMod.id("dagger_sub")).add(VaultGearTierConfig.ModifierAffixTagGroup.SUFFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY,           "ModDurability",     "mod_durability",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(11,  66, 200, 400,  800,  1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 200, 801,  1600, 1);
                            vaultGearModifierTiersBuilder.add(46,  -1, 200, 1601, 2400, 1);
                            vaultGearModifierTiersBuilder.add(67,  -1, 200, 2401, 3200, 1);
                            vaultGearModifierTiersBuilder.add(89,  -1, 200, 3201, 4000, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 100, 4001, 6000, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 100, 6001, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LUCKY_HIT_CHANCE,     "ModLuckyHit",       "mod_lucky_hit",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 0.05, 0.07, 1);
                            vaultGearModifierTiersBuilder.add(50,  -1, 10, 0.08, 0.11, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 10, 0.12, 0.14, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.15, 0.17, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.18, 0.20, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedStorm", "mod_bleed_storm",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Blood Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Blood Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Blood Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Blood Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Blood Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedStorm", "mod_heal_storm",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Healing Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Healing Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Healing Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Healing Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Healing Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModPoisonStorm",    "mod_poison_storm",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Poison Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 3);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Poison Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 5);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Poison Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 7);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Poison Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 9);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Poison Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 12);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModSlownessStorm",  "mod_slowness_storm", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Slowness Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Slowness Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Slowness Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Slowness Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Slowness Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModChillStorm",     "mod_chill_storm",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Chilling Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 1);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Chilling Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 2);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Chilling Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 3);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Chilling Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 4);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Chilling Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModFearStorm",      "mod_fear_storm",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Fear Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Fear Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Fear Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Fear Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Fear Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                        });
            });
        });

        // Need mythic values still
        add("dagger_sub_mythic", builder -> {
            builder.key(VaultMod.id("dagger_sub_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.BASE_ATTRIBUTES, vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY, "BaseDurability", "base_durability",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, 2400, 4800, 1);
                            vaultGearModifierTiersBuilder.add(21, -1, 10, 3600, 5400, 1);
                            vaultGearModifierTiersBuilder.add(60, -1, 10, 4800, 6000, 1);
                            vaultGearModifierTiersBuilder.add(90, -1, 10, 6000, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_soulbound",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 20, true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOULBOUND,  "BaseSoulbound",  "base_no_soulbound", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0, -1, 80, false);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_living",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,2,true);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LIVING,     "BaseLiving",     "base_no_living",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,-1,98,false);
                        });
            });

            builder.key(VaultMod.id("dagger_sub_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.IMPLICIT,        vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ATTACK_DAMAGE, "BaseAttackDamage", "base_attack_damage", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   49, 10, 5,  7,  1);
                            vaultGearModifierTiersBuilder.add(20,  69, 10, 8,  10, 1);
                            vaultGearModifierTiersBuilder.add(40,  89, 10, 11, 13, 1);
                            vaultGearModifierTiersBuilder.add(50,  -1, 10, 14, 16, 1);
                            vaultGearModifierTiersBuilder.add(60,  -1, 10, 17, 19, 1);
                            vaultGearModifierTiersBuilder.add(70,  -1, 10, 20, 22, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 23, 25, 1);
                            vaultGearModifierTiersBuilder.add(90,  -1, 10, 26, 30, 1);
                            vaultGearModifierTiersBuilder.add(100, -1, 10, 31, 35, 1);
                        });
            });

            builder.key(VaultMod.id("dagger_sub_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.PREFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.SOUL_QUANTITY,        "ModSoulChance",     "mod_soul_chance",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   70, 200, 0.20, 0.40, 1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 200, 0.41, 0.80, 1);
                            vaultGearModifierTiersBuilder.add(45,  -1, 200, 0.81, 1.20, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 200, 1.21, 1.60, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 200, 1.60, 2.20, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 200, 2.20, 3.00, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.ON_HIT_CHAIN,         "ModChaining",       "mod_chaining",        List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 1, 1, 1);
                            vaultGearModifierTiersBuilder.add(40,  -1, 10, 2, 2, 1);
                            vaultGearModifierTiersBuilder.add(80,  -1, 10, 3, 3, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 4, 4, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 5, 5, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.ECHOING_CHANCE,       "ModEchoingChance",  "mod_echoing_chance",  List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(50,   85, 10, 0.05,  0.10,  0.01);
                            vaultGearModifierTiersBuilder.add(60,   -1, 10, 0.11,  0.14,  0.01);
                            vaultGearModifierTiersBuilder.add(70,   -1, 10, 0.15,  0.18,  0.01);
                            vaultGearModifierTiersBuilder.add(90,   -1, 10, 0.19,  0.22,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.23,  0.26,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.27,  0.30,  0.01);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(                    ModGearAttributes.REAVING_DAMAGE,       "ModReaving",        "mod_reaving",         List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,    70, 10, 0.08,  0.18,  0.01);
                            vaultGearModifierTiersBuilder.add(28,   -1, 10, 0.19,  0.21,  0.01);
                            vaultGearModifierTiersBuilder.add(45,   -1, 10, 0.22,  0.24,  0.01);
                            vaultGearModifierTiersBuilder.add(75,   -1, 10, 0.25,  0.28,  0.01);
                            vaultGearModifierTiersBuilder.add(101,  -1, 10, 0.29,  0.37,  0.01);
                            vaultGearModifierTiersBuilder.add(102,  -1, 10, 0.38,  0.50,  0.01);
                        });
            });

            builder.key(VaultMod.id("dagger_sub_mythic")).add(VaultGearTierConfig.ModifierAffixTagGroup.SUFFIX,          vaultGearAttributeGroupBuilder -> {
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.DURABILITY,           "ModDurability",     "mod_durability",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(11,  66, 200, 400,  800,  1);
                            vaultGearModifierTiersBuilder.add(28,  -1, 200, 801,  1600, 1);
                            vaultGearModifierTiersBuilder.add(46,  -1, 200, 1601, 2400, 1);
                            vaultGearModifierTiersBuilder.add(67,  -1, 200, 2401, 3200, 1);
                            vaultGearModifierTiersBuilder.add(89,  -1, 200, 3201, 4000, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 100, 4001, 6000, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 100, 6001, 8000, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.LUCKY_HIT_CHANCE,     "ModLuckyHit",       "mod_lucky_hit",       List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,   -1, 10, 0.05, 0.07, 1);
                            vaultGearModifierTiersBuilder.add(50,  -1, 10, 0.08, 0.11, 1);
                            vaultGearModifierTiersBuilder.add(75,  -1, 10, 0.12, 0.14, 1);
                            vaultGearModifierTiersBuilder.add(101, -1, 10, 0.15, 0.17, 1);
                            vaultGearModifierTiersBuilder.add(102, -1, 10, 0.18, 0.20, 1);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedStorm", "mod_bleed_storm",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Blood Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Blood Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Blood Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Blood Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Blood Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.BLEED.getColor(), false, 0.03F, ModEffects.BLEED.getRegistryName(), 40, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModHealBleedStorm", "mod_heal_storm",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 4, "Healing Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 4, "Healing Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 0);
                            vaultGearModifierTiersBuilder.add(64, -1, 4, "Healing Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(101,-1, 4, "Healing Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 1);
                            vaultGearModifierTiersBuilder.add(102,-1, 4, "Healing Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, MobEffects.HEAL.getColor(), true, 0.03F, MobEffects.HEAL.getRegistryName(), 20, 2);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModPoisonStorm",    "mod_poison_storm",   List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Poison Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 3);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Poison Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 5);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Poison Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 7);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Poison Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 9);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Poison Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, MobEffects.POISON.getColor(), false, 0.075F, MobEffects.POISON.getRegistryName(), 60, 12);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModSlownessStorm",  "mod_slowness_storm", List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Slowness Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Slowness Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 140, 1);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Slowness Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 160, 2);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Slowness Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 180, 3);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Slowness Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 4.0f, MobEffects.MOVEMENT_SLOWDOWN.getColor(), false, 0.075F, MobEffects.MOVEMENT_SLOWDOWN.getRegistryName(), 200, 4);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModChillStorm",     "mod_chill_storm",    List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Chilling Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 1);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Chilling Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 2);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Chilling Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 3);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Chilling Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 4);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Chilling Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.CHILLED.getColor(), false, 0.075F, ModEffects.CHILLED.getRegistryName(), 60, 5);
                        });
                vaultGearAttributeGroupBuilder
                        .addModifier(iskallia.vault.init.ModGearAttributes.EFFECT_CLOUD,         "ModFearStorm",      "mod_fear_storm",     List.of(), vaultGearModifierTiersBuilder -> {
                            vaultGearModifierTiersBuilder.add(0,  -1, 10, "Fear Storm I",   ResourceLocation.withDefaultNamespace("empty"), 5, 24.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(32, -1, 10, "Fear Storm II",  ResourceLocation.withDefaultNamespace("empty"), 5, 28.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(64, -1, 10, "Fear Storm III", ResourceLocation.withDefaultNamespace("empty"), 5, 32.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 60,  0);
                            vaultGearModifierTiersBuilder.add(101,-1, 10, "Fear Storm IV",  ResourceLocation.withDefaultNamespace("empty"), 5, 47.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                            vaultGearModifierTiersBuilder.add(102,-1, 10, "Fear Storm V",   ResourceLocation.withDefaultNamespace("empty"), 5, 94.0f, ModEffects.TAUNT_REPEL_MOB.getColor(), false, 0.075F, ModEffects.TAUNT_REPEL_MOB.getRegistryName(), 120, 0);
                        });
            });
        });

    }
}
