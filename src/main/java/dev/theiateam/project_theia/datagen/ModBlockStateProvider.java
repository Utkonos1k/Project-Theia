package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectTheia.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(ModBlock.ALUMINIUM_BLOCK.get());
        simpleBlock(ModBlock.LEAD_BLOCK.get());
        simpleBlock(ModBlock.NICKEL_BLOCK.get());
        simpleBlock(ModBlock.TUNGSTEN_BLOCK.get());
        simpleBlock(ModBlock.TIN_BLOCK.get());
        simpleBlock(ModBlock.CHROMIUM_BLOCK.get());
        simpleBlock(ModBlock.STANNITE_ORE.get());
        simpleBlock(ModBlock.DEEPSLATE_STANNITE_ORE.get());

    }
}
