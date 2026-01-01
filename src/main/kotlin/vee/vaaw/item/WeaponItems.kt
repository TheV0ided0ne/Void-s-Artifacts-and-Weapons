package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.material.ToolMaterials
import vee.vaaw.item.type.OblivionScytheItem
import vee.vaaw.item.type.VoidScytheItem

object WeaponItems : ItemRegistrator("vaaw") {

    val VOID_SCYTHE = register("scythe_of_the_void", VoidScytheItem(ToolMaterials.VOID_STEEL,
        8, -3f, FabricItemSettings()))

    val OBLIVION_SCYTHE = register("scythe_of_oblivion", OblivionScytheItem(ToolMaterials.OBLIVION,
        6, -3.2f, FabricItemSettings()))

    fun registerItems() {}

}