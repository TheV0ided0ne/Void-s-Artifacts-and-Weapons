package com.modid.vaaw.util;

import com.modid.vaaw.Vaaw;
import com.modid.vaaw.item.ExampleItems;
import com.modid.vaaw.item.group.VaawItemGroup;

public class ItemHelper {

    public static void initializeItems() {
        Vaaw.LOGGER.info("Initializing Items.");
        ExampleItems.registerItems();
    }

    public static void initializeItemGroups() {
        Vaaw.LOGGER.info("Initializing Item Groups.");
        VaawItemGroup.registerGroup();
    }


}
