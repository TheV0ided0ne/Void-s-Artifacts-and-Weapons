package vee.vaaw.item.group

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.text.Text
import net.minecraft.util.Identifier
import vee.vaaw.Vaaw
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems

object MaterialsItemGroup {

    val GROUP_KEY: RegistryKey<ItemGroup> = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
        Identifier(Vaaw.MOD_ID, "vaaw_materials"))

    val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(IngotItems.VOID_STEEL_INGOT) }
        .displayName(Text.translatable("itemGroup.vaaw_materials"))
        .build()

    fun registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, ITEM_GROUP)

    }

    fun addItemGroupItems() {

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->
            // IngotItems
            itemGroup.add(IngotItems.VOID_STEEL_INGOT)
            itemGroup.add(IngotItems.OBLIVION_INGOT)
            itemGroup.add(IngotItems.IRIDIUM_INGOT)
            itemGroup.add(IngotItems.OSMIUM_INGOT)
            itemGroup.add(IngotItems.TUNGSTEN_INGOT)

            // MaterialItems
            itemGroup.add(MaterialItems.VOID_CRYSTAL)
            itemGroup.add(MaterialItems.VOID_THORN)
            itemGroup.add(MaterialItems.REINFORCED_STICK)
        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}