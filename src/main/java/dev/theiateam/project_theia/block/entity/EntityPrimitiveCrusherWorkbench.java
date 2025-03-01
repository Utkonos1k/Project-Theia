package dev.theiateam.project_theia.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class EntityPrimitiveCrusherWorkbench extends Block implements EntityBlock {
    public EntityPrimitiveCrusherWorkbench(BlockBehaviour.Properties properties){
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PrimitiveCrusherWorkbenchEntity(pos,state);
    }
}
