package dev.theiateam.project_theia.gui.ModMenu;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.ItemStack;

import static dev.theiateam.project_theia.block.ModBlock.PRIMITIVE_CRUSHER_WORKBENCH;
import static dev.theiateam.project_theia.gui.ModMenu.ModMenuTypes.PRIMITIVE_CRUSHER_MENU;

public class PrimitiveCrusherMenu extends AbstractContainerMenu {
    private ContainerLevelAccess access;

    public PrimitiveCrusherMenu(int containerId, Inventory playerInventory, ContainerLevelAccess aNull) {
        super(PRIMITIVE_CRUSHER_MENU.get(), containerId);
    }

    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("ProjectTheia", "textures/gui/container/crushers/primitive_crusher");

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return AbstractContainerMenu.stillValid(this.access, player, PRIMITIVE_CRUSHER_WORKBENCH.get());
    }
}
