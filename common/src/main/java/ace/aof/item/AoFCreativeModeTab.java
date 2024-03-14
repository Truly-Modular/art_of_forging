package ace.aof.item;

import ace.aof.ArtOfForging;
import ace.aof.registry.ItemRegistry;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import smartin.miapi.registries.RegistryInventory;

public class AoFCreativeModeTab {
    static {
        //Registries.ITEM_GROUP.
        RegistryInventory.tab.register(new Identifier(ArtOfForging.MOD_ID, "creative_tab"), () -> CreativeTabRegistry.create((builder) -> {
            builder.displayName(Text.literal("aof_test"));
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
