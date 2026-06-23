package com.apeacefulcow.cosmetalmod;

import org.slf4j.Logger;

import com.apeacefulcow.cosmetalmod.block.ModBlocks;
import com.apeacefulcow.cosmetalmod.item.ModItems;
import com.apeacefulcow.cosmetalmod.item.ModCreativeModeTabs;
import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// Very important Comment
// The value here should match an entry in the META-INF/mods.toml file
@Mod(CosMetalMod.MOD_ID)
public class CosMetalMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "cosmetalmod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public CosMetalMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.EXAMPLE_BLOCK);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ALUMINUM_INGOT.get());
            event.accept(ModItems.BENDALLOY_INGOT.get());
            event.accept(ModItems.BISMUTH_INGOT.get());
            event.accept(ModItems.BRASS_INGOT.get());
            event.accept(ModItems.BRONZE_INGOT.get());
            event.accept(ModItems.CADMIUM_INGOT.get());
            event.accept(ModItems.CHROMIUM_INGOT.get());
            event.accept(ModItems.COPPER_INGOT.get());
            event.accept(ModItems.DURALUMIN_INGOT.get());
            event.accept(ModItems.ELECTRUM_INGOT.get());
            event.accept(ModItems.GOLD_INGOT.get());
            event.accept(ModItems.IRON_INGOT.get());
            event.accept(ModItems.LEAD_INGOT.get());
            event.accept(ModItems.NICKEL_INGOT.get());
            event.accept(ModItems.NICROSIL_INGOT.get());
            event.accept(ModItems.PEWTER_INGOT.get());
            event.accept(ModItems.SILVER_INGOT.get());
            event.accept(ModItems.STEEL_INGOT.get());
            event.accept(ModItems.TIN_INGOT.get());
            event.accept(ModItems.ZINC_INGOT.get());
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
