package dev.piteam.project_industrialize.ui;

import dev.piteam.project_industrialize.item.ModBlockItems;
import dev.piteam.project_industrialize.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.piteam.project_industrialize.main.ProjectIndustrialize.MOD_ID;


public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_IND_ITEM_TAB =
            CREATIVE_TABS.register("project_industrialize_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ItemGroup.project_industrialize_item_tab"))
                    .icon(() -> ModItems.TIN_INGOT.get().getDefaultInstance())
                    .displayItems((parametrs, output) -> {

                        //template output.accept(Item.get());

                        output.accept(ModBlockItems.TIN_ORE.get());
                        output.accept(ModItems.TIN_INGOT.get());
                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_IND_BLOCK_TAB =
            CREATIVE_TABS.register("project_industrialize_block_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ItemGroup.project_industrialize_block_tab"))
                    .icon(() -> ModBlockItems.TIN_BLOCK.get().getDefaultInstance())
                    .displayItems((parametrs, output) -> {

                        output.accept(ModBlockItems.TIN_BLOCK.get());

                    }).build());

}
