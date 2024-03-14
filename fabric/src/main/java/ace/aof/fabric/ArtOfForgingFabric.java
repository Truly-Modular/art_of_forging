package ace.aof.fabric;

import ace.aof.ArtOfForging;
import net.fabricmc.api.ModInitializer;

public class ArtOfForgingFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ArtOfForging.init();
    }
}