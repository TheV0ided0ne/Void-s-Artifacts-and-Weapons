package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object IngotItems : ItemRegistrator("vaaw") {

    val VOID_STEEL_INGOT = register("void_steel_ingot", Item(FabricItemSettings()))
    val WRATH_STEEL_INGOT = register("wrath_steel_ingot", Item(FabricItemSettings()))
    val OBLIVIUM_INGOT = register("oblivium_ingot", Item(FabricItemSettings()))
    val IRIDIUM_INGOT = register("iridium_ingot", Item(FabricItemSettings()))
    val OSMIUM_INGOT = register("osmium_ingot", Item(FabricItemSettings()))
    val TUNGSTEN_INGOT = register("tungsten_ingot", Item(FabricItemSettings()))

    fun registerItems() {}

}