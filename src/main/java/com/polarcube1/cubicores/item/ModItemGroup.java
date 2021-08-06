package com.polarcube1.cubicores.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup CUBIC_ORES = new ItemGroup("cubicOresTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
}
