package dev.theiateam.project_theia.ui;

import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.theiateam.project_theia.main.ProjectTheia.MOD_ID;


public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_IND_ITEM_TAB =
            CREATIVE_TABS.register("project_theia_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ItemGroup.project_theia_item_tab"))
                    .icon(() -> ModItems.TIN_INGOT.get().getDefaultInstance())
                    .displayItems((parametrs, output) -> {

                        //template output.accept(ModItem.//ITEM_NAME//.get());

                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.RAW_TIN.get());

                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_IND_BLOCK_TAB =
            CREATIVE_TABS.register("project_theia_block_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ItemGroup.project_theia_block_tab"))
                    .icon(() -> ModBlockItems.TIN_BLOCK.get().getDefaultInstance())
                    .displayItems((parametrs, output) -> {

//                        output.accept(ModBlockItems.//BLOCK_NAME//.get());

                        output.accept(ModBlockItems.TIN_BLOCK.get());
                        output.accept(ModBlockItems.TIN_ORE.get());
                        output.accept(ModBlockItems.DEEPSLATE_TIN_ORE.get());

                    }).build());

}
