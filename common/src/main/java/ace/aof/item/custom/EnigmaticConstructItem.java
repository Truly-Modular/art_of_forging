package ace.aof.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EnigmaticConstructItem extends Item {
    public EnigmaticConstructItem(Item.Settings pProperties) {
        super(pProperties);
    }

    @Override
    public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
        pTooltipComponents.add(Text.translatable("item.enigmatic_construct.tooltip").formatted(Formatting.DARK_PURPLE, Formatting.ITALIC));
    }
}
