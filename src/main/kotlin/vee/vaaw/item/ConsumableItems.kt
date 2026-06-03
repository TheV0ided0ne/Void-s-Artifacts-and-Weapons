package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator
import software.bernie.example.registry.ItemRegistry.registerItem
import vee.vaaw.item.type.consumable.AngelicSyringeItem
import vee.vaaw.item.type.consumable.SingularityAppleItem

object ConsumableItems : ItemRegistrator("vaaw") {

    val ANGELIC_SYRINGE = register(
        "angelic_syringe",
        AngelicSyringeItem(
            FabricItemSettings().maxCount(4)))

    val SINGULARITY_APPLE: Item = register(
        "singularity_apple", Item(
            FabricItemSettings().maxCount(8)
                .food(SingularityAppleItem.SINGULARITY_APPLE)
        )
    )

    fun registerItems() {}

}