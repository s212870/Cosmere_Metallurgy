package com.apeacefulcow.cosmetalmod.item;

import com.apeacefulcow.cosmetalmod.CosMetalMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CosMetalMod.MOD_ID);
            

        public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BENDALLOY_INGOT = ITEMS.register("bendalloy_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DURALUMIN_INGOT = ITEMS.register("duralumin_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOLD_INGOT = ITEMS.register("gold_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRON_INGOT = ITEMS.register("iron_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICROSIL_INGOT = ITEMS.register("nicrosil_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEWTER_INGOT = ITEMS.register("pewter_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
                () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
