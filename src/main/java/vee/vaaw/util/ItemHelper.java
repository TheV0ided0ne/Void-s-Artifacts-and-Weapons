package vee.vaaw.util;

import vee.vaaw.Vaaw;
import vee.vaaw.item.*;
import vee.vaaw.item.group.VaawItemGroup;

public class ItemHelper {

    public static void initializeItems() {
        Vaaw.LOGGER.info("Initializing Items.");

        DevItems.INSTANCE.registerItems();
        WeaponItems.INSTANCE.registerItems();
        IngotItems.INSTANCE.registerItems();
        MaterialItems.INSTANCE.registerItems();
        MiscItems.INSTANCE.registerItems();

    }

    public static void initializeItemGroups() {
        Vaaw.LOGGER.info("Initializing Item Groups.");

        VaawItemGroup.registerGroup();
    }


}
