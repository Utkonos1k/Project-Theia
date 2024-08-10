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

        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.NICKEL_INGOT.get());
        basicItem(ModItems.TUNGSTEN_INGOT.get());;
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.CHROMIUM.get());
        basicItem(ModItems.RAW_TIN.get());

        withExistingParent(String.valueOf(ModBlockItems.DEEPSLATE_TIN_ORE.get()), modLoc("block/deepslate_tin_ore"));
        withExistingParent(String.valueOf(ModBlockItems.TIN_ORE.get()), modLoc("block/tin_ore"));

        withExistingParent(String.valueOf(ModBlockItems.ALUMINIUM_BLOCK.get()), modLoc("block/aluminium_block"));
        withExistingParent(String.valueOf(ModBlockItems.LEAD_BLOCK.get()), modLoc("block/lead_block"));
        withExistingParent(String.valueOf(ModBlockItems.NICKEL_BLOCK.get()), modLoc("block/nickel_block"));
        withExistingParent(String.valueOf(ModBlockItems.TUNGSTEN_BLOCK.get()), modLoc("block/tungsten_block"));
        withExistingParent(String.valueOf(ModBlockItems.TIN_BLOCK.get()), modLoc("block/tin_block"));
        withExistingParent(String.valueOf(ModBlockItems.CHROMIUM_BLOCK.get()), modLoc("block/chromium_block"));
    }
}
