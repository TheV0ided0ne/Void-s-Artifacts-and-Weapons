package vee.vaaw.item.group;

import vee.vaaw.Vaaw;
import vee.vaaw.item.DevItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import vee.vaaw.item.IngotItems;
import vee.vaaw.item.MiscItems;
import vee.vaaw.item.WeaponItems;
import vee.vaaw.item.MaterialItems;

public class VaawItemGroup {

    public static final RegistryKey<ItemGroup> VAAW_ITEM_GROUP_KEY = RegistryKey.of(
            Registries.ITEM_GROUP.getKey(), new Identifier(Vaaw.MOD_ID, "vaaw")
    );

    public static final ItemGroup VAAW_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(DevItems.INSTANCE.getCOMMAS_ITEM()))
            .displayName(Text.translatable("itemGroup.vaaw"))
            .build();

    public static void registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, VAAW_ITEM_GROUP_KEY, VAAW_ITEM_GROUP);

    }

    public static void addItemGroupItems() {
        ItemGroupEvents.modifyEntriesEvent(VAAW_ITEM_GROUP_KEY).register(itemGroup -> {

            itemGroup.add(DevItems.INSTANCE.getCOMMAS_ITEM());
            itemGroup.add(WeaponItems.INSTANCE.getVOID_SCYTHE());
            itemGroup.add(IngotItems.INSTANCE.getVOID_STEEL_INGOT());
            itemGroup.add(IngotItems.INSTANCE.getOSMIUM_INGOT());
            itemGroup.add(IngotItems.INSTANCE.getOBLIVION_INGOT());
            itemGroup.add(IngotItems.INSTANCE.getTUNGSTEN_INGOT());
            itemGroup.add(IngotItems.INSTANCE.getIRIDIUM_INGOT());
            itemGroup.add(MaterialItems.INSTANCE.getVOID_THORN());

        });
    }

    public static void registerGroup() {
        registerItemGroup();
        addItemGroupItems();
    }

}
