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
        .icon { ItemStack(ArmourItems.VOIDED_CROWN) }
        .displayName(Text.translatable("itemGroup.vaaw_armour"))
        .build()

    fun registerItemGroup() {

        Registry.register(Registries.ITEM_GROUP, GROUP_KEY, ITEM_GROUP)

    }

    fun addItemGroupItems() {

        ItemGroupEvents.modifyEntriesEvent(GROUP_KEY).register { itemGroup ->

            // Voided

            itemGroup.add(ArmourItems.VOIDED_CROWN)
            itemGroup.add(ArmourItems.WORMHOLE_MATRIX)
            itemGroup.add(ArmourItems.SINGULARITY_THIGHGUARDS)
            itemGroup.add(ArmourItems.ANCHOR_BOOTS)

            // Wrathful

            itemGroup.add(ArmourItems.CRIMSON_VISOR)
            itemGroup.add(ArmourItems.FURNACE_CORE)
            itemGroup.add(ArmourItems.HEATED_GREAVES)
            itemGroup.add(ArmourItems.MAGMA_WALKERS)

            // Angelic

            itemGroup.add(ArmourItems.ANGELIC_HALO)
            itemGroup.add(ArmourItems.ANGELIC_CHESTPLATE)
            itemGroup.add(ArmourItems.ANGELIC_LEGGINGS)
            itemGroup.add(ArmourItems.ANGELIC_BOOTS)

            // Sel' Karin

            itemGroup.add(ArmourItems.SELKARIN_NECKLACE)
            itemGroup.add(ArmourItems.SELKARIN_CHESTPLATE)
            itemGroup.add(ArmourItems.SELKARIN_LEGGINGS)
            itemGroup.add(ArmourItems.SELKARIN_BOOTS)

            // Itrioch

            itemGroup.add(ArmourItems.CANOPY_CROWN)
            itemGroup.add(ArmourItems.BARKPLATE)
            itemGroup.add(ArmourItems.ROOTED_GREAVES)
            itemGroup.add(ArmourItems.SPORE_STRIDERS)

            // Oblivium

            itemGroup.add(ArmourItems.ERASURE_GAZE)
            itemGroup.add(ArmourItems.NULLHEART)
            itemGroup.add(ArmourItems.GRAVITON_GUARDS)
            itemGroup.add(ArmourItems.ABYSS_WALKERS)

            // Nixium

            itemGroup.add(ArmourItems.UMBRALUX)
            itemGroup.add(ArmourItems.VESPERSHIELD)
            itemGroup.add(ArmourItems.PENUMBRA)
            itemGroup.add(ArmourItems.TWILIGHT_SOLES)

            // Skyline

            itemGroup.add(ArmourItems.SKYLINE_NECKLACE)
            itemGroup.add(ArmourItems.SKYLINE_CHESTPLATE)
            itemGroup.add(ArmourItems.SKYLINE_LEGGINGS)
            itemGroup.add(ArmourItems.SKYLINE_BOOTS)

        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}