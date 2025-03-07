package dev.theiateam.project_theia.block;

import com.mojang.serialization.MapCodec;
import dev.theiateam.project_theia.block.entity.PrimitiveCrusherWorkbenchEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class PrimitiveCrusherWorkbench extends HorizontalDirectionalBlock implements EntityBlock {
    public static final MapCodec<PrimitiveCrusherWorkbench> CODEC = simpleCodec(PrimitiveCrusherWorkbench::new);
    private static final VoxelShape SHAPE = Block.box(0,0,0,16,10,16);

    public PrimitiveCrusherWorkbench(Properties properties){
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

//    @Override
//    public @Nullable MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
//        BlockEntity blockEntity = level.getBlockEntity(pos);
//        if (blockEntity instanceof PrimitiveCrusherWorkbenchEntity) {
//            return new SimpleMenuProvider((id, inventory, player) ->
//                    new PrimitiveCrusherMenu(id, inventory, RenderTooltipEvent.),
//                    Component.translatable("container.primitive_crusher"));
//
//       return null;
//    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
           player.openMenu(state.getMenuProvider(level, pos));
        }
        level.playSound(player, pos, SoundEvents.ANVIL_LAND, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PrimitiveCrusherWorkbenchEntity(pos,state);
    }
}
