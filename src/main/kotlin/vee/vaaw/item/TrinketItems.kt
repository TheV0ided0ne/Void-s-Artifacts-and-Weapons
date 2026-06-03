package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator

object TrinketItems : ItemRegistrator("vaaw") {

    val SOUL_ARTIFACT = register("soul_artifact", Item(FabricItemSettings().maxCount(1)))

    fun registerItems() {}

}