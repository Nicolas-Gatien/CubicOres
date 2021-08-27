package com.polarcube1.cubicores.block;

import com.polarcube1.cubicores.CubicOres;
import com.polarcube1.cubicores.item.ModItemGroup;
import com.polarcube1.cubicores.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CubicOres.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .strength(1f)
                    .sound(SoundType.METAL)));
    public static final RegistryObject<OreBlock> GUSPER_ORE = registerBlock("gusper_ore",
            () -> new OreBlock(AbstractBlock.Properties.of(Material.STONE)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .strength(50f)
                    .sound(SoundType.STONE)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
          ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                  new Item.Properties().tab(ModItemGroup.CUBIC_ORES)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
