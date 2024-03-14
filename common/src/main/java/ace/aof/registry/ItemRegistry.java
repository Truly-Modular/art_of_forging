package ace.aof.registry;

import ace.aof.ArtOfForging;
import ace.aof.item.custom.AncientItem;
import ace.aof.item.custom.EnigmaticConstructItem;
import ace.aof.item.custom.LifeFiberItem;
import ace.aof.item.custom.SigilOfEdenItem;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import smartin.miapi.item.modular.items.ModularArrow;
import smartin.miapi.registries.RegistryInventory;

public class ItemRegistry {
    public static Item MODULAR_ARTIFACT;
    public static Item CURIOUS_ARTIFACT;
    public static Item RESONANT_ALLOY;
    public static Item FORGED_STEEL_INGOT;
    public static Item VOBRITE_CRYSTAL;
    public static Item VOBRIVIUM_INGOT;
    public static Item ENDSTEEL_INGOT;
    public static Item LIFE_FIBER;
    public static Item FANG_CHARM;
    public static Item SIGIL_OF_EDEN;
    public static Item ENIGMATIC_CONSTRUCT;
    public static Item ANCIENT_AXE;
    public static Item ANCIENT_BLADE;
    public static Item ANCIENT_FLAIL;
    public static Item DEMONIC_AXE;
    public static Item DEMONIC_BLADE;
    public static Item DEMONIC_FLAIL;
    public static Item DEVILS_SOUL_GEM;
    public static Item RENDING_SCISSOR_RED;
    public static Item RENDING_SCISSOR_PURPLE;
    public static Item RENDING_SCISSOR_COMPLETE;
    public static Item NANO_INSECTOID;
    public static Item ENCODED_CANISTER;
    public static Item ESOTERIC_CODEX;
    public static Item MARK_OF_THE_ARCHITECT;
    public static Item SHOCKWAVE_CHAMBER;
    public static Item DRAGON_SOUL;
    public static Item SHARDS_OF_MALICE;
    public static Item POTENT_MIXTURE;
    public static Item HEART_OF_ENDER;
    public static Item EERIE_SHARD;
    public static Item SOUL_EMBER;
    public static Item FRAGMENT_OF_EDEN;

    public static void init() {
        // Modular Artifact
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "modular_artifact"), ModularArrow::new, i -> MODULAR_ARTIFACT = i);

        new Item.Settings();

        // Curious Artifact
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "curious_artifact"), () -> new Item(new Item.Settings()), i -> CURIOUS_ARTIFACT = i);

        // Resonant Alloy
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "resonant_alloy"), () -> new Item(new Item.Settings().fireproof()), i -> RESONANT_ALLOY = i);

        // Forged Steel Ingot
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "forged_steel_ingot"), () -> new Item(new Item.Settings().fireproof()), i -> FORGED_STEEL_INGOT = i);

        // Vobrite Crystal
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "vobrite_crystal"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()), i -> VOBRITE_CRYSTAL = i);

        // Vobrivium Ingot
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "vobrivium_ingot"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()), i -> VOBRIVIUM_INGOT = i);

        // Endsteel Ingot
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "endsteel_ingot"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()), i -> ENDSTEEL_INGOT = i);

        // Life Fiber
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "life_fiber"), () -> new LifeFiberItem(new Item.Settings().rarity(Rarity.RARE)), i -> LIFE_FIBER = i);

        // Fang Charm
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "fang_charm"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1)), i -> FANG_CHARM = i);

        // Sigil of Eden
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "sigil_of_eden"), () -> new SigilOfEdenItem(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()), i -> SIGIL_OF_EDEN = i);

        // Enigmatic Construct
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "enigmatic_construct"), () -> new EnigmaticConstructItem(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> ENIGMATIC_CONSTRUCT = i);

        // Ancient Axe Head
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "ancient_axe"), () -> new AncientItem(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> ANCIENT_AXE = i);

        // Ancient Blade
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "ancient_blade"), () -> new AncientItem(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> ANCIENT_BLADE = i);

        // Ancient Flail
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "ancient_flail"), () -> new AncientItem(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> ANCIENT_FLAIL = i);

        // Demonic Axe Head
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "demonic_axe"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> DEMONIC_AXE = i);

        // Demonic Blade
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "demonic_blade"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> DEMONIC_BLADE = i);

        // Demonic Flail
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "demonic_flail"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof().maxCount(1)), i -> DEMONIC_FLAIL = i);

        // Devil's Soul Gem
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "devils_soul_gem"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()), i -> DEVILS_SOUL_GEM = i);

        // Rending Scissor Red
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "rending_scissor_red"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()), i -> RENDING_SCISSOR_RED = i);

        // Rending Scissor Purple
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "rending_scissor_purple"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()), i -> RENDING_SCISSOR_PURPLE = i);

        // Rending Scissor Complete
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "rending_scissor_complete"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()), i -> RENDING_SCISSOR_COMPLETE = i);

        // Nano-Insectoid
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "nano_insectoid"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(16)), i -> NANO_INSECTOID = i);

        // Encoded Canister
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "encoded_canister"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(16)), i -> ENCODED_CANISTER = i);

        // Esoteric Codex
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "esoteric_codex"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1)), i -> ESOTERIC_CODEX = i);

        // Mark of The Architect
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "mark_of_the_architect"), () -> new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1)), i -> MARK_OF_THE_ARCHITECT = i);

        // Shockwave Chamber
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "shockwave_chamber"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(16)), i -> SHOCKWAVE_CHAMBER = i);

        // Dragon Soul
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "dragon_soul"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).fireproof()), i -> DRAGON_SOUL = i);

        // Shards of Malice
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "shards_of_malice"), () -> new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof()), i -> SHARDS_OF_MALICE = i);

        // Potent Mixture
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "potent_mixture"), () -> new Item(new Item.Settings().rarity(Rarity.RARE)), i -> POTENT_MIXTURE = i);

        // Heart of Ender
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "heart_of_ender"), () -> new Item(new Item.Settings().rarity(Rarity.RARE)), i -> HEART_OF_ENDER = i);

        // Eerie Shard
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "eerie_shard"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(16)), i -> EERIE_SHARD = i);

        // Soul Ember
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "soul_ember"), () -> new Item(new Item.Settings()), i -> SOUL_EMBER = i);

        // Fragment of Eden
        RegistryInventory.register(RegistryInventory.items, new Identifier(ArtOfForging.MOD_ID, "fragment_of_eden"), () -> new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(16)), i -> FRAGMENT_OF_EDEN = i);

        //Registries.ITEM_GROUP.
        RegistryInventory.tab.register(new Identifier(ArtOfForging.MOD_ID, "creative_tab"), () -> CreativeTabRegistry.create((builder) -> {
            builder.displayName(Text.translatable("itemGroup.art_of_forging_tab"));
            builder.icon(() -> new ItemStack(RegistryInventory.modularItem));
            builder.entries(((displayContext, entries) -> {
                entries.add(ItemRegistry.CURIOUS_ARTIFACT);
                entries.add(ItemRegistry.RESONANT_ALLOY);
                entries.add(ItemRegistry.FORGED_STEEL_INGOT);
                entries.add(ItemRegistry.VOBRITE_CRYSTAL);
                entries.add(ItemRegistry.VOBRIVIUM_INGOT);
                entries.add(ItemRegistry.ENDSTEEL_INGOT);
                entries.add(ItemRegistry.LIFE_FIBER);
                entries.add(ItemRegistry.FANG_CHARM);
                entries.add(ItemRegistry.SIGIL_OF_EDEN);
                entries.add(ItemRegistry.ENIGMATIC_CONSTRUCT);
                entries.add(ItemRegistry.ANCIENT_AXE);
                entries.add(ItemRegistry.ANCIENT_BLADE);
                entries.add(ItemRegistry.ANCIENT_FLAIL);
                entries.add(ItemRegistry.DEMONIC_AXE);
                entries.add(ItemRegistry.DEMONIC_BLADE);
                entries.add(ItemRegistry.DEMONIC_FLAIL);
                entries.add(ItemRegistry.DEVILS_SOUL_GEM);
                entries.add(ItemRegistry.RENDING_SCISSOR_RED);
                entries.add(ItemRegistry.RENDING_SCISSOR_PURPLE);
                entries.add(ItemRegistry.RENDING_SCISSOR_COMPLETE);
                entries.add(ItemRegistry.NANO_INSECTOID);
                entries.add(ItemRegistry.ENCODED_CANISTER);
                entries.add(ItemRegistry.ESOTERIC_CODEX);
                entries.add(ItemRegistry.MARK_OF_THE_ARCHITECT);
                entries.add(ItemRegistry.SHOCKWAVE_CHAMBER);
                entries.add(ItemRegistry.DRAGON_SOUL);
                entries.add(ItemRegistry.SHARDS_OF_MALICE);
                entries.add(ItemRegistry.POTENT_MIXTURE);
                entries.add(ItemRegistry.HEART_OF_ENDER);
                entries.add(ItemRegistry.EERIE_SHARD);
                entries.add(ItemRegistry.SOUL_EMBER);
                entries.add(ItemRegistry.FRAGMENT_OF_EDEN);

            }));
        }));
    }

}