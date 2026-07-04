package gay.vizn0x.mymodneoforge.creativemodetab;

import gay.vizn0x.mymodneoforge.MyMODNeoForge;
import gay.vizn0x.mymodneoforge.block.ModBlocks;
import gay.vizn0x.mymodneoforge.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMODNeoForge.MOD_ID);

    public static final Supplier<CreativeModeTab> ETHERIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("etherium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ETHERIUM.get()))
                    .title(Component.translatable("creativetab.mymodneoforge.etherium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ETHERIUM);
                        output.accept(ModItems.RAW_ETHERIUM);
                        output.accept(ModBlocks.ETHERIUM_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
