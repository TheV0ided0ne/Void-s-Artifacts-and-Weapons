package vee.vaaw

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import vee.vaaw.datagen.DamageTypeProvider
import vee.vaaw.datagen.DamageTypeTagProvider
import vee.vaaw.datagen.EnglishLanguageProvider
import vee.vaaw.datagen.ItemModelProvider
import vee.vaaw.datagen.recipe.IngotRecipeProvider
import vee.vaaw.datagen.recipe.MaterialRecipeProvider

object VaawDataGenerator : DataGeneratorEntrypoint {

    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack = fabricDataGenerator.createPack()

        // Provider List
        pack.addProvider(::EnglishLanguageProvider)
        pack.addProvider(::DamageTypeProvider)
        pack.addProvider(::DamageTypeTagProvider)
        pack.addProvider(::ItemModelProvider)
        pack.addProvider(::MaterialRecipeProvider)

    }

}