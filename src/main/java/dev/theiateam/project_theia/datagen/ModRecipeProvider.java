package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModItems;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    protected ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
            super(output, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "My Recipes";
        }
    }


    @Override
    protected void buildRecipes() {


        //BLOCKS


        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.ALUMINIUM_BLOCK.get())
                .requires(ModItems.ALUMINIUM_INGOT, 9)
                .unlockedBy("has_aluminium", has(ModItems.ALUMINIUM_INGOT)).save(this.output);

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.CHROMIUM_BLOCK.get())
                .requires(ModItems.CHROMIUM, 9)
                .unlockedBy("has_chromium", has(ModItems.CHROMIUM)).save(this.output);

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.LEAD_BLOCK.get())
                .requires(ModItems.LEAD_INGOT, 9)
                .unlockedBy("has_lead", has(ModItems.LEAD_INGOT)).save(this.output);

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.NICKEL_BLOCK.get())
                .requires(ModItems.NICKEL_INGOT, 9)
                .unlockedBy("has_nickel", has(ModItems.NICKEL_INGOT)).save(this.output);

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.TIN_BLOCK.get())
                .requires(ModItems.TIN_INGOT, 9)
                .unlockedBy("has_tin", has(ModItems.TIN_INGOT)).save(this.output);

        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlock.TUNGSTEN_BLOCK.get())
                .requires(ModItems.TUNGSTEN, 9)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN)).save(this.output);


        //BLOCK TO INGOT


        shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT.get(), 9)
                .requires(ModBlock.ALUMINIUM_BLOCK)
                .unlockedBy("has_aluminium", has(ModItems.ALUMINIUM_INGOT)).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.CHROMIUM.get(), 9)
                .requires(ModBlock.CHROMIUM_BLOCK)
                .unlockedBy("has_chromium", has(ModItems.CHROMIUM)).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 9)
                .requires(ModBlock.LEAD_BLOCK)
                .unlockedBy("has_lead", has(ModItems.LEAD_INGOT)).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 9)
                .requires(ModBlock.NICKEL_BLOCK)
                .unlockedBy("has_nickel", has(ModItems.NICKEL_INGOT)).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlock.TIN_BLOCK)
                .unlockedBy("has_tin", has(ModItems.TIN_INGOT)).save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.TUNGSTEN.get(), 9)
                .requires(ModBlock.TUNGSTEN_BLOCK)
                .unlockedBy("has_tungsten", has(ModItems.TUNGSTEN)).save(this.output);

    }

}
