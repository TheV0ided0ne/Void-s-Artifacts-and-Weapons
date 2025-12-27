package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import vee.vaaw.util.ItemRegistrator

object DevItems : ItemRegistrator() {

    val COMMAS_ITEM: Item = register("commas_item", Item(FabricItemSettings()))

    fun registerItems() {}

}