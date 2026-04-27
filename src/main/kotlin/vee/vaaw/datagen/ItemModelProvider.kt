package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models
import vee.vaaw.item.ConsumableItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems
import vee.vaaw.item.TrinketItems

class ItemModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {

    override fun generateBlockStateModels(blockStateModelGenerator: BlockStateModelGenerator) {
        // No current blocks.
    }

    /**
     * For items that use the standard handheld appearance, you are able to add them as an entry here in order to
     * automatically generate their file within `assets/vaaw/models/item`. The item texture must share the same name
     * as the item ingame.
     *
     * It may be prudent to include functions within this file in the future.
     */

    override fun generateItemModels(itemModelGenerator: ItemModelGenerator) {

        consumableItems(itemModelGenerator)
        ingotItems(itemModelGenerator)
        materialItems(itemModelGenerator)
        trinketItems(itemModelGenerator)

    }

    fun consumableItems(modelGen: ItemModelGenerator) {

        modelGen.register(ConsumableItems.ANGELIC_SYRINGE, Models.GENERATED)

    }

    fun ingotItems(modelGen: ItemModelGenerator) {

        modelGen.register(IngotItems.VOID_STEEL, Models.GENERATED)
        modelGen.register(IngotItems.ANGELIC_STEEL, Models.GENERATED)
        modelGen.register(IngotItems.WRATH_STEEL, Models.GENERATED)
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

    fun trinketItems(modelGen: ItemModelGenerator) {

        modelGen.register(TrinketItems.EXAMPLE_TRINKET, Models.GENERATED)

    }

}