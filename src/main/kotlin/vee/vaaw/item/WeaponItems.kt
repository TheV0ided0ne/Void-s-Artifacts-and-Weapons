package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.material.WeaponMaterials
import vee.vaaw.item.type.VoidScytheItem

object WeaponItems : ItemRegistrator("vaaw") {

    val VOID_SCYTHE = register("scythe_of_the_void", VoidScytheItem(WeaponMaterials.VOID_STEEL,
        9, -3f, FabricItemSettings()))

    fun registerItems() {}

}