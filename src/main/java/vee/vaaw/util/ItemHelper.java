package vee.vaaw.util;

import vee.vaaw.Vaaw;
import vee.vaaw.item.DevItems;
import vee.vaaw.item.MiscItems;
import vee.vaaw.item.WeaponItems;
import vee.vaaw.item.group.VaawItemGroup;

public class ItemHelper {

    public static void initializeItems() {
        Vaaw.LOGGER.info("Initializing Items.");

        DevItems.INSTANCE.registerItems();
        WeaponItems.INSTANCE.registerItems();
        MiscItems.INSTANCE.registerItems();

    }

    public static void initializeItemGroups() {
        Vaaw.LOGGER.info("Initializing Item Groups.");

        VaawItemGroup.registerGroup();
    }


}
