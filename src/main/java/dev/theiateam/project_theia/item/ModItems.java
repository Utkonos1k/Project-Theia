package dev.theiateam.project_theia.item;

import dev.theiateam.project_theia.item.custom.BonkBatItem;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectTheia.MOD_ID);

    //INSTRUMENT


    public static final DeferredItem<Item> BONK_BAT = ITEMS.registerItem("bonk_bat", props -> new BonkBatItem(props.durability(32)));


    //MATERIALS


    public static final DeferredItem<Item> IRON_POWDER = ITEMS.registerItem("iron_powder", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> COPPER_POWDER = ITEMS.registerItem("copper_powder", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> GOLD_POWDER = ITEMS.registerItem("gold_powder", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> DIAMOND_POWDER = ITEMS.registerItem("diamond_powder", props -> new Item(props.stacksTo(64)));


    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.registerItem("aluminium_ingot", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> ALUMINIUM_POWDER = ITEMS.registerItem("aluminium_powder", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.registerItem("lead_ingot", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> LEAD_POWDER = ITEMS.registerItem("lead_powder", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.registerItem("nickel_ingot", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> NICKEL_POWDER = ITEMS.registerItem("nickel_powder", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerItem("tin_ingot", props -> new Item(props.stacksTo(64)));
    public static final DeferredItem<Item> TIN_POWDER = ITEMS.registerItem("tin_powder", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> TUNGSTEN = ITEMS.registerItem("tungsten", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> CHROMIUM = ITEMS.registerItem("chromium", props -> new Item(props.stacksTo(64)));



    //MINERALS


    public static final DeferredItem<Item> STANNITE = ITEMS.registerItem("stannite", props -> new Item(props.stacksTo(64)));

    public static final DeferredItem<Item> STANNITE_POWDER = ITEMS.registerItem("stannite_powder", props -> new Item(props.stacksTo(64)));


}
