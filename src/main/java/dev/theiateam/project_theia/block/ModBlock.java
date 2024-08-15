package dev.theiateam.project_theia.block;

import dev.theiateam.project_theia.main.ProjectTheia;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlock {


    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ProjectTheia.MOD_ID);

//    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE).destroyTime(-1f));


    //ORES


    public static final  DeferredBlock<Block> STANNITE_ORE = BLOCKS.registerSimpleBlock("stannite_ore", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> DEEPSLATE_STANNITE_ORE = BLOCKS.registerSimpleBlock("deepslate_stannite_ore", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(5.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );


    //MATERIAL BLOCKS


    public static final  DeferredBlock<Block> ALUMINIUM_BLOCK = BLOCKS.registerSimpleBlock("aluminium_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> LEAD_BLOCK = BLOCKS.registerSimpleBlock("lead_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(6.0f)
            .explosionResistance(20.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> NICKEL_BLOCK = BLOCKS.registerSimpleBlock("nickel_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> TUNGSTEN_BLOCK = BLOCKS.registerSimpleBlock("tungsten_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(10.0f)
            .explosionResistance(100.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> TIN_BLOCK = BLOCKS.registerSimpleBlock("tin_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(3.0f)
            .explosionResistance(10.0f)
            .requiresCorrectToolForDrops()

    );

    public static final  DeferredBlock<Block> CHROMIUM_BLOCK = BLOCKS.registerSimpleBlock("chromium_block", BlockBehaviour.Properties.of()

            .sound(SoundType.STONE)
            .destroyTime(20.0f)
            .explosionResistance(120.0f)
            .requiresCorrectToolForDrops()

    );

}
