package dev.theiateam.project_theia.block.entity;

import dev.theiateam.project_theia.gui.ModMenu.PrimitiveCrusherMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static dev.theiateam.project_theia.block.entity.ModBlockEntityTypes.PRIMITIVE_CRUSHER_WORKBENCH_ENTITY;

public class PrimitiveCrusherWorkbenchEntity extends BaseContainerBlockEntity {



    protected static final int SLOT_INPUT = 0;
    protected static final int SLOT_OUTPUT1 = 1;
    protected static final int SLOT_OUTPUT2 = 2;
    protected static final int SLOT_OUTPUT3 = 3;
    protected static final int SLOT_OUTPUT4 = 4;
    protected NonNullList<ItemStack> items = NonNullList.withSize(5, ItemStack.EMPTY);

    int crushingProgress;
    int crushingMaxProgress;





    protected final ContainerData dataAccess = new ContainerData() {
        @Override
        public int get(int pIndex) {
            return switch (pIndex) {
                case 0 -> PrimitiveCrusherWorkbenchEntity.this.crushingProgress;
                case 1 -> PrimitiveCrusherWorkbenchEntity.this.crushingMaxProgress;
                default -> 0;
            };
        }

        @Override
        public void set(int pIndex, int pValue) {
            switch (pIndex) {
                case 0 -> PrimitiveCrusherWorkbenchEntity.this.crushingProgress = pValue;
                case 1 -> PrimitiveCrusherWorkbenchEntity.this.crushingMaxProgress = pValue;
            }
        }

        @Override
        public int getCount() {
            return 0;
        }
    };





    @Override
    public int getContainerSize() {
        return 0;
    }

    public boolean canPlaceItem(int pIndex, ItemStack stack) {
        if (pIndex == 0) {
            return true;
        } else
            return false;
    }
    
    public PrimitiveCrusherWorkbenchEntity(BlockPos pos, BlockState state){
        super(PRIMITIVE_CRUSHER_WORKBENCH_ENTITY.get(), pos, state);
    }


    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void invalidateCapabilities() {
        super.invalidateCapabilities();
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.project_theia.primitive_crusher_workbench");
    }

    @Override
    protected Component getDefaultName() {
        return null;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return null;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {

    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return null;
    }


}





