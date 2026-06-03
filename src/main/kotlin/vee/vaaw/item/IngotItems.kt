package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object IngotItems : ItemRegistrator("vaaw") {

    val VOID_STEEL = register("void_steel", Item(FabricItemSettings()))
    val WRATH_STEEL = register("wrath_steel", Item(FabricItemSettings()))
    val OBLIVIUM_INGOT = register("oblivium_ingot", Item(FabricItemSettings()))
    val ITRIOCH_INGOT = register("itrioch_ingot", Item(FabricItemSettings()))
    val SKYLINE_INGOT = register("skyline_ingot", Item(FabricItemSettings()))
    val NIXIUM_INGOT = register("nixium_ingot", Item(FabricItemSettings()))

    fun registerItems() {}

}