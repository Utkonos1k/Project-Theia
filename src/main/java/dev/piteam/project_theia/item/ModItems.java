package dev.piteam.project_theia.item;

import dev.piteam.project_theia.main.ProjectIndustrialize;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ProjectIndustrialize.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()
            .stacksTo(64)
            .food(new FoodProperties.Builder().nutrition(10).alwaysEdible().saturationModifier(5f)
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 1000), 7).build())));

}
