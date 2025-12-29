package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object MiscItems : ItemRegistrator("vaaw") {

    val VOID_THORNS = register("void_thorns", Item(FabricItemSettings()))

    fun registerItems() {}

}