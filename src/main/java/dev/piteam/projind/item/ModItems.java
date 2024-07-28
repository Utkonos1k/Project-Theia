package dev.piteam.projind.item;

import dev.piteam.projind.PI;
import dev.piteam.projind.block.ModBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PI.MOD_ID);
    public static final DeferredItem<Item> SUPER_GUANNO = ITEMS.register("super_guanno", () -> new Item(new Item.Properties()
            .stacksTo(2048)
            .food()));

}
