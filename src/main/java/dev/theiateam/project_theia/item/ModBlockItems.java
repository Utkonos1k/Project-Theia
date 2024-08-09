package dev.theiateam.project_theia.item;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectTheia.MOD_ID);

    public static final DeferredItem<BlockItem> TIN_ORE = ITEMS.registerSimpleBlockItem("tin_ore", ModBlock.TIN_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE = ITEMS.registerSimpleBlockItem("deepslate_tin_ore", ModBlock.DEEPSLATE_TIN_ORE);

    public static final DeferredItem<BlockItem> TIN_BLOCK = ITEMS.registerSimpleBlockItem("tin_block", ModBlock.TIN_BLOCK);


}
