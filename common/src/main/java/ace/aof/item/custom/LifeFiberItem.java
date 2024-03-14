package ace.aof.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LifeFiberItem extends Item {
    public LifeFiberItem(Item.Settings pProperties) {
        super(pProperties);
    }

    @Override
    public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
        pTooltipComponents.add(Text.translatable("item.life_fiber.tooltip").formatted(Formatting.GRAY,Formatting.ITALIC));
    }
}
