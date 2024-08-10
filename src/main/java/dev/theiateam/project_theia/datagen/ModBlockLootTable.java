package dev.theiateam.project_theia.datagen;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;


import java.util.Set;


public class ModBlockLootTable extends BlockLootSubProvider{


    protected ModBlockLootTable(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock,
                (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(
                        pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlock.BLOCKS.getEntries()
                .stream()
                .map(e -> (Block) e.value())
                .toList();
    }

    @Override
    protected void generate() {
        dropSelf(ModBlock.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlock.LEAD_BLOCK.get());
        dropSelf(ModBlock.NICKEL_BLOCK.get());
        dropSelf(ModBlock.TUNGSTEN_BLOCK.get());
        dropSelf(ModBlock.TIN_BLOCK.get());
        dropSelf(ModBlock.CHROMIUM_BLOCK.get());

        add(ModBlock.TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlock.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlock.DEEPSLATE_TIN_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlock.TIN_ORE.get(), ModItems.RAW_TIN.get()));
    }

}
