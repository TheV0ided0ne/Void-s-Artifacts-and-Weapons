package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.type.trinket.ExampleTrinket

object TrinketItems : ItemRegistrator("vaaw") {

    val EXAMPLE_TRINKET = register("exampletrinket", ExampleTrinket(FabricItemSettings()))

    fun registerItems() {}

}