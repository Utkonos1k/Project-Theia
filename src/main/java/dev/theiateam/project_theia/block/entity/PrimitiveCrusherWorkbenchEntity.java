package dev.theiateam.project_theia.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static dev.theiateam.project_theia.block.entity.ModBlockEntityTypes.PRIMITIVE_CRUSHER_WORKBENCH_ENTITY;



public class PrimitiveCrusherWorkbenchEntity extends BlockEntity{

    public PrimitiveCrusherWorkbenchEntity(BlockPos pos, BlockState state){
        super(PRIMITIVE_CRUSHER_WORKBENCH_ENTITY.get(), pos, state);
    }


}





