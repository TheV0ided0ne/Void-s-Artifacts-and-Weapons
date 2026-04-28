package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator
import software.bernie.example.registry.ItemRegistry.registerItem
import vee.vaaw.item.type.consumable.AngelicSyringeItem
import vee.vaaw.item.type.consumable.SinguAppleItem

object ConsumableItems : ItemRegistrator("vaaw") {

    val ANGELIC_SYRINGE = register("angelic_syringe", AngelicSyringeItem(FabricItemSettings().maxCount(4)))

    val SINGU_APPLE: Item = registerItem("singu_apple", Item(FabricItemSettings().maxCount(4)
            .food(SinguAppleItem.SINGU_APPLE)))

    fun registerItems() {}

}