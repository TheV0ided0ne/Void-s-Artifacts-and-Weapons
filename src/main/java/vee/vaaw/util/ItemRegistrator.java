package vee.vaaw.util;

import vee.vaaw.Vaaw;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistrator {

    public static Item register(String id, Item item) {

        Identifier itemID = new Identifier(Vaaw.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);

    }

}
