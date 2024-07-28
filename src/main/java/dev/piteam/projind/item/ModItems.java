package dev.piteam.projind.item;

import dev.piteam.projind.ProjectIndustrialize;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.piteam.projind.block.ModBlock.TIN_ORE;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectIndustrialize.MOD_ID);

    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("tin_ore", TIN_ORE);
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)
            .food(new FoodProperties.Builder().nutrition(10).alwaysEdible().saturationModifier(5f).build())));

//    public static final DeferredItem<BlockItem> TIN_ORE_ITEM = ITEMS.registerSimpleBlockItem("tin_ore_item", TIN_ORE);

}
