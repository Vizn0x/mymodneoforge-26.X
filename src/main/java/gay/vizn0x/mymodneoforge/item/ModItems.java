package gay.vizn0x.mymodneoforge.item;

import gay.vizn0x.mymodneoforge.MyMODNeoForge;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyMODNeoForge.MOD_ID);

    public static final DeferredItem<Item> ETHERIUM = ITEMS.registerSimpleItem("etherium");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
