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

            itemGroup.add(ArmourItems.ITRIOCH_CROWN)
            itemGroup.add(ArmourItems.ITRIOCH_CLOAK)
            itemGroup.add(ArmourItems.ITRIOCH_PANTS)
            itemGroup.add(ArmourItems.ITRIOCH_BOOTS)

            itemGroup.add(ArmourItems.OBLIVIUM_MASK)
            itemGroup.add(ArmourItems.OBLIVIUM_CHESTPLATE)
            itemGroup.add(ArmourItems.OBLIVIUM_LEGGINGS)
            itemGroup.add(ArmourItems.OBLIVIUM_BOOTS)

            itemGroup.add(ArmourItems.NIXIUM_UMBRALUX)
            itemGroup.add(ArmourItems.NIXIUM_VEST)
            itemGroup.add(ArmourItems.NIXIUM_LEGGINGS)
            itemGroup.add(ArmourItems.NIXIUM_BOOTS)

            itemGroup.add(ArmourItems.SKYLINE_NECKLACE)
            itemGroup.add(ArmourItems.SKYLINE_CHESTPLATE)
            itemGroup.add(ArmourItems.SKYLINE_LEGGINGS)
            itemGroup.add(ArmourItems.SKYLINE_BOOTS)

            // Vespershield, Penumbra, Twilight Soles - Nixium
            // Erasure Gaze, Nullheart, Graviton Guards, Abyss Walkers - Oblivium
            // Wormhole Matrix, Singularity Thighguards, Anchor Soles - Void Steel
            // Canopy Crown, Barkplate, Rooted Greaves, Spore Striders - Itrioch
            // Crimson Visor, Furnace Core, Heated Greaves, Magma Walkers - Wrath Steel

        }

    }

    fun registerGroup() {
        registerItemGroup()
        addItemGroupItems()
    }

}