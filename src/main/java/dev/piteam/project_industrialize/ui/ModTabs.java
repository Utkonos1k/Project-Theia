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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PROJECT_IND_TAB =
            CREATIVE_TABS.register("project_industrialize_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("ItemGroup.project_industrialize_item_tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.TIN_INGOT.get().getDefaultInstance())
                    .displayItems((parametrs, output) -> {
                        //template output.accept(Item.get());
                        output.accept(ModBlockItems.TIN_ORE.get());
                        output.accept(ModItems.TIN_INGOT.get());
                    }).build());

}
