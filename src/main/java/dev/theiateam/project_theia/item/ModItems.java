package dev.theiateam.project_theia.item;

import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectTheia.MOD_ID);


    //MATERIALS


    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> TUNGSTEN = ITEMS.register("tungsten", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> CHROMIUM = ITEMS.register("chromium", () -> new Item(new Item.Properties()
            .stacksTo(64)));


    public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties()
            .stacksTo(64)));
    public static final DeferredItem<Item> COPPER_POWDER = ITEMS.register("copper_powder", () -> new Item(new Item.Properties()
            .stacksTo(64)));
    public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties()
            .stacksTo(64)));
    public static final DeferredItem<Item> DIAMOND_POWDER = ITEMS.register("diamond_powder", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    //MINERALS


    public static final DeferredItem<Item> STANNITE = ITEMS.register("stannite", () -> new Item(new Item.Properties()
            .stacksTo(64)));

    public static final DeferredItem<Item> STANNITE_POWDER = ITEMS.register("stannite_powder", () -> new Item(new Item.Properties()
            .stacksTo(64)));

}
