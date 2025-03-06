package dev.theiateam.project_theia.gui.ModMenu;

import dev.theiateam.project_theia.main.ProjectTheia;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENU_TYPE =
            DeferredRegister.create(Registries.MENU, ProjectTheia.MOD_ID);

    public static final Supplier<MenuType<PrimitiveCrusherMenu>> PRIMITIVE_CRUSHER_MENU = MENU_TYPE.register(
            "primitive_crusher_menu",
            () -> new MenuType<>((containerId, playerInv) -> new PrimitiveCrusherMenu(containerId, playerInv, ContainerLevelAccess.NULL), FeatureFlags.DEFAULT_FLAGS));
}
