package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.type.AngelicSyringeItem

object ConsumableItems : ItemRegistrator("vaaw") {

    val ANGELIC_SYRINGE = register("angelic_syringe", AngelicSyringeItem(FabricItemSettings().maxCount(4)))

    fun registerItems() {}

}