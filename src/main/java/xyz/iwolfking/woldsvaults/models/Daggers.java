package xyz.iwolfking.woldsvaults.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Daggers {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry<>();

    // Scrappy
    public static final HandHeldModel DAGGER_CHIPPED;
    public static final HandHeldModel BACKSTABBER;
    public static final HandHeldModel BASIC_DAGGER;

    // Common
    public static final HandHeldModel DAGGER_FLAWED;
    public static final HandHeldModel MOON_DAGGER;
    public static final HandHeldModel SHEER_DAGGER;
    public static final HandHeldModel SWIFT_STRIKER;

    // Rare
    public static final HandHeldModel DAGGER_FLAWLESS;
    public static final HandHeldModel CORAL_BLADE;
    public static final HandHeldModel NAMELESS_BLADE;
    public static final HandHeldModel SICKLE;
    public static final HandHeldModel SPIRIT_KNIFE;

    // Epic
    public static final HandHeldModel DAGGER_IMPERFECT;
    public static final HandHeldModel CLAWS;
    public static final HandHeldModel ETERNAL_KNIFE;
    public static final HandHeldModel FROST_KNIFE;

    // Omega
    public static final HandHeldModel DAGGER_PERFECT;
    public static final HandHeldModel NIGHTMARES_BITE;
    public static final HandHeldModel SPONGE_STRIKER;

    // Unique
//    public static final HandHeldModel DAGGER_;

    public Daggers() {
    }

    static {
        // Scrappy
        DAGGER_CHIPPED  =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/dagger_chipped"),"Chipped Dagger")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        BACKSTABBER     =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/backstabber"),   "Backstabber")              .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        BASIC_DAGGER    =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/scrappy/basic_dagger"),  "Basic Dagger")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Common
        DAGGER_FLAWED   =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/dagger_flawed"), "Flawed Dagger")            .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MOON_DAGGER     =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/moon_dagger"),   "Moon Dagger")              .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SHEER_DAGGER    =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/sheer_dagger"),  "Sheer Dagger")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SWIFT_STRIKER   =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/common/swift_striker"), "Swift Striker")            .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Rare
        DAGGER_FLAWLESS =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/dagger_flawless"), "Flawless Dagger")          .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        CORAL_BLADE     =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/coral_blade"),     "Coral Blade")              .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        NAMELESS_BLADE  =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/nameless_blade"),  "Nameless Blade")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SICKLE          =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/sickle"),          "Sickle")                   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SPIRIT_KNIFE    =      (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/rare/spirit_knife"),    "Spirit Knife")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Epic
        DAGGER_IMPERFECT =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/dagger_imperfect"),"Imperfect Dagger")          .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        CLAWS            =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/claws"),           "Claws")                     .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        ETERNAL_KNIFE    =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/eternal_knife"),   "Eternal Knife")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        FROST_KNIFE      =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/epic/frost_knife"),     "Frost Knife")               .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));


        // Omega
        DAGGER_PERFECT   =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/dagger_perfect"), "Perfect Dagger")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        NIGHTMARES_BITE  =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/nightmares_bite"),"Nightmare's Bite")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SPONGE_STRIKER   =     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/dagger/omega/sponge_striker"), "Sponge Striker")             .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        //Unique
    }
}