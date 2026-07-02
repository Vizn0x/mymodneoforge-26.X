package gay.vizn0x.mymodneoforge.datagen;

import gay.vizn0x.mymodneoforge.MyMODNeoForge;
import gay.vizn0x.mymodneoforge.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MyMODNeoForge.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockmodels, ItemModelGenerators itemModels){
        itemModels.generateFlatItem(ModItems.ETHERIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_ETHERIUM.get(), ModelTemplates.FLAT_ITEM);


    }
}
