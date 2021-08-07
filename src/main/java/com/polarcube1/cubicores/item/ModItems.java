package com.polarcube1.cubicores.item;

import com.polarcube1.cubicores.CubicOres;
import net.minecraft.inventory.EquipmentSlotType;
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
            () -> new SwordItem(ModItemTier.BROOSK, 3, -2.4f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_PICKAXE = ITEMS.register("broosk_pickaxe",
            () -> new PickaxeItem(ModItemTier.BROOSK, 1, -2.8f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_HOE = ITEMS.register("broosk_hoe",
            () -> new HoeItem(ModItemTier.BROOSK, -3, 0f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_SHOVEL = ITEMS.register("broosk_shovel",
            () -> new ShovelItem(ModItemTier.BROOSK, 1.5f, -3f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_AXE = ITEMS.register("broosk_axe",
            () -> new AxeItem(ModItemTier.BROOSK, 5, -3f,
                    new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_BOOTS = ITEMS.register("broosk_boots",
            () -> new ArmorItem(ModArmorMaterial.BROOSK, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_LEGGINGS = ITEMS.register("broosk_leggings",
            () -> new ArmorItem(ModArmorMaterial.BROOSK, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_CHESTPLATE = ITEMS.register("broosk_chestplate",
            () -> new ArmorItem(ModArmorMaterial.BROOSK, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static final RegistryObject<Item> BROOSK_HELMET = ITEMS.register("broosk_helmet",
            () -> new ArmorItem(ModArmorMaterial.BROOSK, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    // Gusper
    public static final RegistryObject<Item> GUSPER_SHARDS = ITEMS.register("gusper_shards",
            () -> new Item(new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
