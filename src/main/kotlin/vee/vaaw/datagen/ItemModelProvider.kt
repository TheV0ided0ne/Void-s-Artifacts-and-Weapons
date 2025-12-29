package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models
import vee.vaaw.item.DevItems
import vee.vaaw.item.IngotItems

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

        itemModelGenerator.register(IngotItems.VOID_STEEL_INGOT, Models.GENERATED)
        itemModelGenerator.register(IngotItems.OSMIUM_INGOT, Models.GENERATED)
        itemModelGenerator.register(IngotItems.IRIDIUM_INGOT, Models.GENERATED)
        itemModelGenerator.register(IngotItems.OBLIVION_INGOT, Models.GENERATED)
        itemModelGenerator.register(IngotItems.TUNGSTEN_INGOT, Models.GENERATED)

        itemModelGenerator.register(DevItems.COMMAS_ITEM, Models.GENERATED)

    }

}