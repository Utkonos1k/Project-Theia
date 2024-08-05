package dev.piteam.project_theia.block;

import dev.piteam.project_theia.main.ProjectIndustrialize;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlock {


    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ProjectIndustrialize.MOD_ID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).destroyTime(-1f));

    public static final DeferredBlock<Block> TIN_ORE = BLOCKS.registerSimpleBlock("tin_ore", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> DEEPSLATE_TIN_ORE = BLOCKS.registerSimpleBlock("deepslate_tin_ore", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );



    public static final  DeferredBlock<Block> TIN_BLOCK = BLOCKS.registerSimpleBlock("tin_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );


}
