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
import vee.vaaw.item.TrinketItems

object TrinketItemGroup {

    val GROUP_KEY: RegistryKey<ItemGroup> = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
        Identifier(Vaaw.MOD_ID, "vaaw_trinkets"))

    val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(IngotItems.VOID_STEEL) }
        .displayName(Text.translatable("itemGroup.vaaw_trinkets"))
        .build()

    fun registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, ITEM_GROUP)

    }

    fun addItemGroupItems() {

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->

            itemGroup.add(TrinketItems.EXAMPLE_TRINKET)
            itemGroup.add(TrinketItems.BLANK_TRINKET)
            itemGroup.add(TrinketItems.HEART_OF_THE_SIBLINGS)
            itemGroup.add(TrinketItems.EYE_OF_THE_VOID)
            itemGroup.add(TrinketItems.BADGE_OF_THE_ANGELIC_GUARD)
            itemGroup.add(TrinketItems.SOUL_TIED_RING)
            itemGroup.add(TrinketItems.SOULS_TRINKET)
            itemGroup.add(TrinketItems.RAGE_TRINKET)
            itemGroup.add(TrinketItems.BALANCE_TRINKET)
            itemGroup.add(TrinketItems.SILENCE_TRINKET)
            itemGroup.add(TrinketItems.PEACE_TRINKET)
            itemGroup.add(TrinketItems.BRAVERY_TRINKET)
            itemGroup.add(TrinketItems.WRATH_TRINKET)
            itemGroup.add(TrinketItems.DEVOTION_TRINKET)
            itemGroup.add(TrinketItems.SWIFTNESS_TRINKET)

        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}