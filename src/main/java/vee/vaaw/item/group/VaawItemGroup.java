package vee.vaaw.item.group;

import vee.vaaw.Vaaw;
import vee.vaaw.item.DevItems;
import vee.vaaw.item.ExampleItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class VaawItemGroup {

    public static final RegistryKey<ItemGroup> VAAW_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), new Identifier(Vaaw.MOD_ID, "vaaw")
    );

    public static final ItemGroup VAAW_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ExampleItems.EXAMPLE_ITEM))
            .displayName(Text.translatable("itemGroup.vaaw"))
            .build();

    public static void registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, VAAW_ITEM_GROUP_KEY, VAAW_ITEM_GROUP);

    }

    public static void addItemGroupItems() {
        ItemGroupEvents.modifyEntriesEvent(VAAW_ITEM_GROUP_KEY).register(itemGroup -> {

            itemGroup.add(ExampleItems.EXAMPLE_ITEM);
            itemGroup.add(DevItems.INSTANCE.getCOMMAS_ITEM());

        });
    }

    public static void registerGroup() {
        registerItemGroup();
        addItemGroupItems();
    }

}
