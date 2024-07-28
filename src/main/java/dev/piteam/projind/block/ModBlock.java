package dev.piteam.projind.block;

import dev.piteam.projind.ProjectIndustrialize;

import net.minecraft.world.item.Instrument;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlock {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ProjectIndustrialize.MOD_ID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).destroyTime(-1f));

    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.registerSimpleBlock("tin_ore", BlockBehaviour.Properties.of()

            .destroyTime(7.5f)
            .sound(SoundType.STONE)
            .explosionResistance(6.0f)

    );

}
