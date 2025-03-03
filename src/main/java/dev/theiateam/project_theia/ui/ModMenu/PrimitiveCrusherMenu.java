package dev.theiateam.project_theia.ui.ModMenu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;

public class PrimitiveCrusherMenu extends AbstractContainerMenu {
    public PrimitiveCrusherMenu(int containerId, Inventory playerInv) {
        super(PrimitiveCrusherMenu.get(), containerId);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
