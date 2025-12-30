package vee.vaaw.util

import vee.vaaw.item.ArmourItems
import vee.vaaw.item.ConsumableItems
import vee.vaaw.item.DevItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems
import vee.vaaw.item.MiscItems
import vee.vaaw.item.WeaponItems
import vee.vaaw.item.group.ArmourItemGroup
import vee.vaaw.item.group.ConsumablesItemGroup
import vee.vaaw.item.group.MaterialsItemGroup
import vee.vaaw.item.group.MiscItemGroup
import vee.vaaw.item.group.WeaponsItemGroup

object ItemHelper {

    fun initializeItems() {
        ArmourItems.registerItems()
        ConsumableItems.registerItems()
        DevItems.registerItems()
        IngotItems.registerItems()
        MaterialItems.registerItems()
        MiscItems.registerItems()
        WeaponItems.registerItems()
    }

    fun initializeItemGroups() {
        ArmourItemGroup.registerGroup()
        ConsumablesItemGroup.registerGroup()
        MaterialsItemGroup.registerGroup()
        MiscItemGroup.registerGroup()
        WeaponsItemGroup.registerGroup()
    }

}