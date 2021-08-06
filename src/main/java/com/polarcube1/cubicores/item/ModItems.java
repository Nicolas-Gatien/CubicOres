package com.polarcube1.cubicores.item;

import com.polarcube1.cubicores.CubicOres;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CubicOres.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));
    public static final RegistryObject<Item> HEARTHERITE = ITEMS.register("heartherite",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
