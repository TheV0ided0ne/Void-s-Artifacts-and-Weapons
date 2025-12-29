package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object DevItems : ItemRegistrator("vaaw") {

    val COMMAS_ITEM: Item = register("commas_item", Item(FabricItemSettings()))

    fun registerItems() {}

}