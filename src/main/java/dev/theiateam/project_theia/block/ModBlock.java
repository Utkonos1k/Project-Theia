package dev.theiateam.project_theia.block;

import dev.theiateam.project_theia.item.ModItems;
import dev.theiateam.project_theia.main.ProjectTheia;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class    ModBlock {


    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ProjectTheia.MOD_ID);

//    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock("example_block", .mapColor(MapColor.STONE).destroyTime(-1f));


    //ORES


    public static final  DeferredBlock<Block> STANNITE_ORE = registerBlock("stannite_ore",
            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "stannite_ore")))
                    .sound(SoundType.STONE)
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> DEEPSLATE_STANNITE_ORE = registerBlock("deepslate_stannite_ore",
            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "deepslate_stannite_ore")))
                    .sound(SoundType.STONE)
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .requiresCorrectToolForDrops()

    ));


    //MATERIAL BLOCKS


    public static final  DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "aluminium_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "lead_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(6.0f)
                    .explosionResistance(20.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> NICKEL_BLOCK = registerBlock("nickel_block", 

            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "nickel_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block", 

            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "tungsten_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(10.0f)
                    .explosionResistance(100.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block", 

            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "tin_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .requiresCorrectToolForDrops()

    ));

    public static final  DeferredBlock<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, "chromium_block")))
                    .sound(SoundType.STONE)
                    .destroyTime(20.0f)
                    .explosionResistance(120.0f)
                    .requiresCorrectToolForDrops()

    ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ProjectTheia.MOD_ID, name)))));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
