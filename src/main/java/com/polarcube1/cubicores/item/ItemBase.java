package com.polarcube1.cubicores.item;

import com.polarcube1.cubicores.CubicOres;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().tab(CubicOres.TAB));
    }
}
