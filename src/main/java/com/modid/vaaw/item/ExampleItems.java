package com.modid.vaaw.item;

import com.modid.vaaw.util.ItemRegistrator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class ExampleItems extends ItemRegistrator {

    /**
     * Example of how ItemRegistrator's 'register' method can be used through extension of ItemRegistrator.
     */
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new FabricItemSettings()));

    public static void registerItems() {}
}
