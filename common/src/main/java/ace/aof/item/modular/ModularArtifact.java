package ace.aof.item.modular;

import com.redpxnda.nucleus.trinket.curiotrinket.CurioTrinket;
import com.redpxnda.nucleus.trinket.curiotrinket.CurioTrinketItem;
import net.minecraft.item.Item;
import smartin.miapi.item.modular.ModularItem;

public class ModularArtifact extends Item implements ModularItem, CurioTrinket {
    public ModularArtifact() {
        super(new Item.Settings().maxCount(1).fireproof());
    }
}
