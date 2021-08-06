package com.polarcube1.cubicores.item;

import com.polarcube1.cubicores.CubicOres;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CubicOres.MOD_ID);

    // Broosk
    public static final RegistryObject<Item> BROOSK = ITEMS.register("broosk",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_SWORD = ITEMS.register("broosk_sword",
            () -> new SwordItem(ModItemTier.BROOSK, 2, -2.4f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_PICKAXE = ITEMS.register("broosk_pickaxe",
            () -> new PickaxeItem(ModItemTier.BROOSK, 0, -1f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_HOE = ITEMS.register("broosk_hoe",
            () -> new HoeItem(ModItemTier.BROOSK, 0, 3f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_SHOVEL = ITEMS.register("broosk_shovel",
            () -> new ShovelItem(ModItemTier.BROOSK, 0, 3f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_AXE = ITEMS.register("broosk_axe",
            () -> new AxeItem(ModItemTier.BROOSK, 4, 0f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
