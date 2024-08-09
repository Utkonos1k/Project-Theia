package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.item.ModItems;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectTheia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.RAW_TIN.get());

        withExistingParent(String.valueOf(ModBlockItems.DEEPSLATE_TIN_ORE.get()), modLoc("block/deepslate_tin_ore"));
        withExistingParent(String.valueOf(ModBlockItems.TIN_ORE.get()), modLoc("block/tin_ore"));
        withExistingParent(String.valueOf(ModBlockItems.TIN_BLOCK.get()), modLoc("block/tin_block"));
    }
}
