package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models
import vee.vaaw.item.ConsumableItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.JokeItems
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
        jokeItems(itemModelGenerator)

    }

    fun consumableItems(modelGen: ItemModelGenerator) {

        modelGen.register(ConsumableItems.ANGELIC_SYRINGE, Models.GENERATED)
        modelGen.register(ConsumableItems.SINGULARITY_APPLE, Models.GENERATED)

    }

    fun ingotItems(modelGen: ItemModelGenerator) {

        modelGen.register(IngotItems.VOID_STEEL, Models.GENERATED)
        modelGen.register(IngotItems.WRATH_STEEL, Models.GENERATED)
        modelGen.register(IngotItems.SKYLINE_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.ITRIOCH_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.OBLIVIUM_INGOT, Models.GENERATED)
        modelGen.register(IngotItems.NIXIUM_INGOT, Models.GENERATED)

    }

    fun materialItems(modelGen: ItemModelGenerator) {

        modelGen.register(MaterialItems.VOID_CRYSTAL, Models.GENERATED)
        modelGen.register(MaterialItems.VOID_VINE, Models.GENERATED)
        modelGen.register(MaterialItems.ANGELIC_REMNANT, Models.GENERATED)
        modelGen.register(MaterialItems.REINFORCED_STICK, Models.GENERATED)
        modelGen.register(MaterialItems.SELKARIN_SCALE, Models.GENERATED)
        modelGen.register(MaterialItems.ANGEL_HEART, Models.GENERATED)

    }

    fun trinketItems(modelGen: ItemModelGenerator) {

       modelGen.register(TrinketItems.SOUL_ARTIFACT, Models.GENERATED)

    }

    fun jokeItems(modelGen: ItemModelGenerator) {

        modelGen.register(JokeItems.BREAD_ONE, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_TWO, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_THREE, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_FOUR, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_FIVE, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_SIX, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_SEVEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_EIGHT, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_NINE, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_TEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_ELEVEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_TWELVE, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_THIRTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_FOURTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_FIFTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_SIXTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_SEVENTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_EIGHTEEN, Models.GENERATED)
        modelGen.register(JokeItems.BREAD_NINETEEN, Models.GENERATED)
        modelGen.register(JokeItems.LEH_ULTIMATE_BAGUETTE, Models.GENERATED)
    }

}