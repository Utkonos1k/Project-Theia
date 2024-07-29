package dev.piteam.project_industrialize.item;

import dev.piteam.project_industrialize.block.ModBlock;
import dev.piteam.project_industrialize.main.ProjectIndustrialize;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectIndustrialize.MOD_ID);

    public static final DeferredItem<BlockItem> TIN_ORE = ITEMS.registerSimpleBlockItem("tin_ore", ModBlock.TIN_ORE);

    public static final DeferredItem<BlockItem> TIN_BLOCK = ITEMS.registerSimpleBlockItem("tin_block", ModBlock.TIN_BLOCK);

}
