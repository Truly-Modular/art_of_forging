package ace.aof.forge;

import dev.architectury.platform.forge.EventBuses;
import ace.aof.ArtOfForging;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.Curios;
import top.theillusivec4.curios.api.CuriosApi;

@Mod(ArtOfForging.MOD_ID)
public class ArtOfForgingForge {
    public ArtOfForgingForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ArtOfForging.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ArtOfForging.init();
    }
}