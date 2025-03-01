package dev.theiateam.project_theia.block.entity;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntityTypes {
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ProjectTheia.MOD_ID);

    public static final Supplier<BlockEntityType<PrimitiveCrusherWorkbenchEntity>> PRIMITIVE_CRUSHER_WORKBENCH_ENTITY = BLOCK_ENTITY_TYPES.register(
            "primitive_crusher_entity",
            () -> new BlockEntityType<>(
                    PrimitiveCrusherWorkbenchEntity::new,
                    ModBlock.PRIMITIVE_CRUSHER_WORKBENCH.get()
            )
    );


}
