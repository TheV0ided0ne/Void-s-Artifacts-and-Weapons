package vee.vaaw.util

import vee.vaaw.item.ArmourItems
import vee.vaaw.item.ConsumableItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.JokeItems
import vee.vaaw.item.MaterialItems
import vee.vaaw.item.TrinketItems
import vee.vaaw.item.WeaponItems
import vee.vaaw.item.group.ArmourItemGroup
import vee.vaaw.item.group.ConsumablesItemGroup
import vee.vaaw.item.group.JokeItemGroup
import vee.vaaw.item.group.MaterialsItemGroup
import vee.vaaw.item.group.TrinketItemGroup
import vee.vaaw.item.group.WeaponsItemGroup

object ItemHelper {

    fun initializeItems() {
        ArmourItems.registerItems()
        ConsumableItems.registerItems()
        IngotItems.registerItems()
        MaterialItems.registerItems()
        TrinketItems.registerItems()
        WeaponItems.registerItems()
        JokeItems.registerItems()
    }

    fun initializeItemGroups() {
        ArmourItemGroup.registerGroup()
        ConsumablesItemGroup.registerGroup()
        MaterialsItemGroup.registerGroup()
        TrinketItemGroup.registerGroup()
        WeaponsItemGroup.registerGroup()
        JokeItemGroup.registerGroup()
    }

}