package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectTheia.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlock.ALUMINIUM_BLOCK);
        blockWithItem(ModBlock.CHROMIUM_BLOCK);
        blockWithItem(ModBlock.LEAD_BLOCK);
        blockWithItem(ModBlock.TUNGSTEN_BLOCK);
        blockWithItem(ModBlock.TIN_BLOCK);
        blockWithItem(ModBlock.NICKEL_BLOCK);

        blockWithItem(ModBlock.STANNITE_ORE);
        blockWithItem(ModBlock.DEEPSLATE_STANNITE_ORE);
        simpleBlockWithItem(ModBlock.PRIMITIVE_CRUSHER_WORKBENCH, );
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
