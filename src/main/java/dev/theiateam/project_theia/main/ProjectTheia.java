package dev.theiateam.project_theia.main;

import dev.theiateam.project_theia.block.ModBlock;
import dev.theiateam.project_theia.block.entity.ModBlockEntityTypes;
import dev.theiateam.project_theia.item.ModBlockItems;
import dev.theiateam.project_theia.item.ModItems;
import dev.theiateam.project_theia.gui.ModTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ProjectTheia.MOD_ID)
public class ProjectTheia
{

    public static final String MOD_ID = "project_theia";

    private static final Logger LOGGER = LogUtils.getLogger();




    public ProjectTheia(IEventBus modEventBus, ModContainer modContainer)
    {

        modEventBus.addListener(this::commonSetup);


        ModBlock.register(modEventBus);

        ModBlockEntityTypes.BLOCK_ENTITY_TYPES.register(modEventBus);

        ModBlockItems.ITEMS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        ModTabs.CREATIVE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }


    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}