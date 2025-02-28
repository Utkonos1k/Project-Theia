package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.item.ModItems;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ProjectTheia.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //INSTRUMENTS

        basicItem(ModItems.BONK_BAT.get());

        //MATERIALS

        basicItem(ModItems.IRON_POWDER.get());
        basicItem(ModItems.COPPER_POWDER.get());
        basicItem(ModItems.TIN_POWDER.get());
        basicItem(ModItems.GOLD_POWDER.get());
        basicItem(ModItems.DIAMOND_POWDER.get());

        basicItem(ModItems.ALUMINIUM_INGOT.get());
        basicItem(ModItems.LEAD_INGOT.get());
        basicItem(ModItems.NICKEL_INGOT.get());
        basicItem(ModItems.TUNGSTEN.get());;
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.CHROMIUM.get());




        //MINERALS

        basicItem(ModItems.STANNITE.get());
        basicItem(ModItems.STANNITE_POWDER.get());


        //BLOCKITEMS

        withExistingParent(String.valueOf(ModBlockItems.PRIMITIVE_CRUSHER_WORKBENCH.get()), modLoc("block/primitive_crusher_workbench"));

        //MATERIAL BLOCKS

        withExistingParent(String.valueOf(ModBlockItems.ALUMINIUM_BLOCK.get()), modLoc("block/aluminium_block"));
        withExistingParent(String.valueOf(ModBlockItems.LEAD_BLOCK.get()), modLoc("block/lead_block"));
        withExistingParent(String.valueOf(ModBlockItems.NICKEL_BLOCK.get()), modLoc("block/nickel_block"));
        withExistingParent(String.valueOf(ModBlockItems.TUNGSTEN_BLOCK.get()), modLoc("block/tungsten_block"));
        withExistingParent(String.valueOf(ModBlockItems.TIN_BLOCK.get()), modLoc("block/tin_block"));
        withExistingParent(String.valueOf(ModBlockItems.CHROMIUM_BLOCK.get()), modLoc("block/chromium_block"));

        //ORES

        withExistingParent(String.valueOf(ModBlockItems.STANNITE_ORE.get()), modLoc("block/stannite_ore"));
        withExistingParent(String.valueOf(ModBlockItems.DEEPSLATE_STANNITE_ORE.get()), modLoc("block/deepslate_stannite_ore"));

    }
}
