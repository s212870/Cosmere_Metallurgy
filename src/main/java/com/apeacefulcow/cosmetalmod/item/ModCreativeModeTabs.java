package com.apeacefulcow.cosmetalmod.item;

import com.apeacefulcow.cosmetalmod.CosMetalMod;
import com.apeacefulcow.cosmetalmod.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CosMetalMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COSMETAL_TAB = TABS.register("cosmetal_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.EXAMPLE_BLOCK.get()))
                    .title(Component.translatable("itemGroup.cosmetalmod.cosmetal_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALUMINUM_INGOT.get());
                        output.accept(ModItems.BENDALLOY_INGOT.get());
                        output.accept(ModItems.BISMUTH_INGOT.get());
                        output.accept(ModItems.BRASS_INGOT.get());
                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.CADMIUM_INGOT.get());
                        output.accept(ModItems.CHROMIUM_INGOT.get());
                        output.accept(ModItems.COPPER_INGOT.get());
                        output.accept(ModItems.DURALUMIN_INGOT.get());
                        output.accept(ModItems.ELECTRUM_INGOT.get());
                        output.accept(ModItems.GOLD_INGOT.get());
                        output.accept(ModItems.IRON_INGOT.get());
                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.NICKEL_INGOT.get());
                        output.accept(ModItems.NICROSIL_INGOT.get());
                        output.accept(ModItems.PEWTER_INGOT.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.ZINC_INGOT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }

}
