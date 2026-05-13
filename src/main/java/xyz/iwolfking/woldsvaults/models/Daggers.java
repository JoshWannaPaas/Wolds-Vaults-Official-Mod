package xyz.iwolfking.woldsvaults.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Daggers {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry<>();

    // Scrappy
    public static final HandHeldModel DAGGER_FLINT;
    public static final HandHeldModel DAGGER_CHIPPED;
    public static final HandHeldModel DAGGER_SOULIUM;

    // Common
    public static final HandHeldModel DAGGER_IRON;
    public static final HandHeldModel DAGGER_GOLD;
    public static final HandHeldModel DAGGER_PASSIVE;
    public static final HandHeldModel DAGGER_FLAWED;

    // Rare
    public static final HandHeldModel DAGGER_DIAMOND;
    public static final HandHeldModel DAGGER_HOSTILE;
    public static final HandHeldModel DAGGER_FLAWLESS;

    // Epic
    public static final HandHeldModel DAGGER_NETHERITE;
    public static final HandHeldModel DAGGER_SACRIFICE;
    public static final HandHeldModel DAGGER_CLAWS;
    public static final HandHeldModel DAGGER_IMPERFECT;

    // Omega
    public static final HandHeldModel DAGGER_CREATIVE;
    public static final HandHeldModel DAGGER_MYSTICAL;
    public static final HandHeldModel DAGGER_PERFECT;

    // Unique
//    public static final HandHeldModel DAGGER_;

    public Daggers() {
    }

    static {
        // Scrappy
        DAGGER_FLINT =       (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/dagger_flint"), "Flint Knife")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_CHIPPED =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/dagger_chipped"), "Chipped Dagger")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_SOULIUM =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/dagger_soulium"), "Inactive Soulium Dagger")  .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Common
        DAGGER_IRON =        (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/dagger_iron"), "Iron Knife")                   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_GOLD =        (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/dagger_gold"), "Gold Knife")                   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_PASSIVE =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/dagger_passive"), "Passive Soulium Dagger")    .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_FLAWED =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/dagger_flawed"), "Flawed Dagger")              .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Rare
        DAGGER_DIAMOND =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/dagger_diamond"), "Diamond Knife")               .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_HOSTILE =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/dagger_hostile"), "Hostile Soulium Dagger")      .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_FLAWLESS =    (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/dagger_flawless"), "Flawless Dagger")            .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Epic
        DAGGER_NETHERITE =   (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/dagger_netherite"), "Netherite Knife")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_SACRIFICE =   (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/dagger_sacrifice"), "Dagger of Sacrifice")       .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_CLAWS =       (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/dagger_claws"), "Claws")                         .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_IMPERFECT =   (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/dagger_imperfect"), "Imperfect Dagger")          .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));


        // Omega
        DAGGER_CREATIVE =    (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/dagger_creative"), "True Soulium Dagger")       .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_MYSTICAL =    (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/dagger_mystical"), "Mystical Dagger")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DAGGER_PERFECT =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/dagger_perfect"), "Perfect Dagger")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        //Unique
    }
}