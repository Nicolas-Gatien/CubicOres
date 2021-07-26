package com.polarcube1.cubicores.util;

import com.polarcube1.cubicores.CubicOres;
//import com.polarcube1.cubicores.block.RubyBlock;
import com.polarcube1.cubicores.item.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CubicOres.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CubicOres.MOD_ID);

    public static void  init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    //public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    // Blocks
    //public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    // Block Items

}
