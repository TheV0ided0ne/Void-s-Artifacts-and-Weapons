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
import vee.vaaw.item.WeaponItems

object WeaponsItemGroup {

    val GROUP_KEY: RegistryKey<ItemGroup> = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
        Identifier(Vaaw.MOD_ID, "vaaw_weapons"))

    val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(WeaponItems.VOID_SCYTHE) }
        .displayName(Text.translatable("itemGroup.vaaw_weapons"))
        .build()

    fun registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, ITEM_GROUP)

    }

    fun addItemGroupItems() {

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->
            itemGroup.add(WeaponItems.VOID_SCYTHE)
        }

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->
            itemGroup.add(WeaponItems.OBLIVION_SCYTHE)
        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}