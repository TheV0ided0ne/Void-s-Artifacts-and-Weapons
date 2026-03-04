package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models
import vee.vaaw.item.ConsumableItems
import vee.vaaw.item.DevItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems

class ItemModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {

    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
        // No current blocks.
    }

    /**
     * For items that use the standard handheld appearance, you are able to add them as an entry here in order to
     * automatically generate their file within `assets/vaw/models/item`. The item texture must share the same name
     * as the item ingame.
     *
     * It may be prudent to include functions within this file in the future.
     */

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {

        consumableItems(itemModelGenerator)
        devItems(itemModelGenerator)
        ingotItems(itemModelGenerator)
        materialItems(itemModelGenerator)

    }

    fun consumableItems(modelGen: ItemModelGenerator) {

        modelGen.register(ConsumableItems.ANGELIC_SYRINGE, Models.GENERATED)

    }

    fun devItems(modelGen: ItemModelGenerator) {

        modelGen.register(DevItems.COMMAS_ITEM, Models.GENERATED)

    }

    fun ingotItems(modelGen: ItemModelGenerator) {

        modelGen.register(IngotItems.VOID_STEEL_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.ANGELIC_STEEL, Models.GENERATED)
        modelGen.register(IngotItems.ELPHIUM_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.ITRIOCH_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.OBLIVIUM_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.NIXIUM_INGOT, Models.GENERATED)

    }

    fun materialItems(modelGen: ItemModelGenerator) {

        modelGen.register(MaterialItems.VOID_CRYSTAL, Models.GENERATED)
        modelGen.register(MaterialItems.VOID_THORN, Models.GENERATED)
        modelGen.register(MaterialItems.REINFORCED_STICK, Models.GENERATED)
        modelGen.register(MaterialItems.SELKARIN_SCALE, Models.GENERATED)
        modelGen.register(MaterialItems.ANGEL_HEART, Models.GENERATED)

    }

}