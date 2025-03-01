package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
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

//        blockWithItem(ModBlock.PRIMITIVE_CRUSHER_WORKBENCH);

//        simpleBlockWithItem(ModBlock.PRIMITIVE_CRUSHER_WORKBENCH.get(), models().getExistingFile(modLoc("block/primitive_crusher_workbench")));
        horizontalBlock(ModBlock.PRIMITIVE_CRUSHER_WORKBENCH.get(), models().getExistingFile(modLoc("block/primitive_crusher_workbench")));

        simpleBlockItem(ModBlock.PRIMITIVE_CRUSHER_WORKBENCH.get(), models().getExistingFile(modLoc("block/primitive_crusher_workbench")));

    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

//    private void customBlockWithItem(DeferredBlock<?> deferredBlock, BlockModelBuilder modelBuilder){
//        simpleBlockWithItem(deferredBlock.get(), modelBuilder);
//    }
}
