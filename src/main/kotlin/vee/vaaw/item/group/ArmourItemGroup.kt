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
import vee.vaaw.item.ArmourItems

object ArmourItemGroup {

    val GROUP_KEY: RegistryKey<ItemGroup> = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
        Identifier(Vaaw.MOD_ID, "vaaw_armour"))

    val ITEM_GROUP: ItemGroup = FabricItemGroup.builder()
        .icon { ItemStack(ArmourItems.VOID_STEEL_CROWN) }
        .displayName(Text.translatable("itemGroup.vaaw_armour"))
        .build()

    fun registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, ITEM_GROUP)

    }

    fun addItemGroupItems() {

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->
            itemGroup.add(ArmourItems.VOID_STEEL_CROWN)
            itemGroup.add(ArmourItems.VOID_STEEL_CHESTPLATE)
            itemGroup.add(ArmourItems.VOID_STEEL_LEGGINGS)
            itemGroup.add(ArmourItems.VOID_STEEL_BOOTS)

            itemGroup.add(ArmourItems.WRATH_STEEL_DRAGON_HELMET)
            itemGroup.add(ArmourItems.WRATH_STEEL_DRAGON_CHESTPLATE)
            itemGroup.add(ArmourItems.WRATH_STEEL_DRAGON_LEGGINGS)
            itemGroup.add(ArmourItems.WRATH_STEEL_DRAGON_BOOTS)

            itemGroup.add(ArmourItems.ANGELIC_HALO)
            itemGroup.add(ArmourItems.ANGELIC_CHESTPLATE)
            itemGroup.add(ArmourItems.ANGELIC_LEGGINGS)
            itemGroup.add(ArmourItems.ANGELIC_BOOTS)

            itemGroup.add(ArmourItems.SELKARIN_NECKLACE)
            itemGroup.add(ArmourItems.SELKARIN_CHESTPLATE)
            itemGroup.add(ArmourItems.SELKARIN_LEGGINGS)
            itemGroup.add(ArmourItems.SELKARIN_BOOTS)

        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}