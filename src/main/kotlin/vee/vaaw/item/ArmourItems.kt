package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import net.minecraft.item.ArmorItem
import vee.vaaw.util.defaults.ArmourDefaults

object ArmourItems : ItemRegistrator("vaaw") {
    val d = ArmourDefaults()

    val VOID_STEEL_CROWN = register("void_steel_crown", ArmorItem(d.vSteel, d.helmet, d.settings))
    val VOID_STEEL_CHESTPLATE = register("void_steel_chestplate", ArmorItem(d.vSteel, d.chestplate, d.settings))
    val VOID_STEEL_LEGGINGS = register("void_steel_leggings", ArmorItem(d.vSteel, d.leggings, d.settings))
    val VOID_STEEL_BOOTS = register("void_steel_boots", ArmorItem(d.vSteel, d.boot, d.settings))

    fun registerItems() {}
}