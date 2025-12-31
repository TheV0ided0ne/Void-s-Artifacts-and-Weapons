package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object MaterialItems : ItemRegistrator("vaaw") {

    val VOID_CRYSTAL = register("void_crystal", Item(FabricItemSettings()))
    val VOID_THORN = register("void_thorn", Item(FabricItemSettings()))
    val REINFORCED_STICK = register("reinforced_stick", Item(FabricItemSettings()))
    val SELKARIN_SCALE = register("selkarin_scale", Item(FabricItemSettings()))

    fun registerItems() {}

}