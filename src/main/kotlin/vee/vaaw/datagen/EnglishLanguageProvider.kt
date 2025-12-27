package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries
import java.util.Locale.getDefault

/**
 * This class is responsible for providing all the translations for the `en_us` language.
 * Whenever you add something with a new translation key, excluding new items/blocks,
 * it should be added in here. This can be done by adding the key under the appropriate function,
 * and then including whatever the key is meant to translate to in the following string. After making
 * any changes to this file, ensure to run the `runDatagen` command with gradle in order to update the
 * `en_us.json` translation file.
 *
 * Please add comments between translation groups within the functions below!
 */

class EnglishLanguageProvider(
    dataOutput: FabricDataOutput
) : FabricLanguageProvider(dataOutput, "en_us") {

    // Add items that you don't want to get auto named here!
    val uniqueItems = mapOf(
        "commas_item" to "Comma's Item"
    )

    val allItems = Registries.ITEM.ids
        .filter { it.namespace == "vaaw" }
        .mapNotNull { Registries.ITEM.get(it) }

    fun formatItemName(item: String): String {
        return item.split("_").joinToString(" ") { it ->
            it.replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() }
        }
    }

    // Here are all the functions for translation addition! Feel free to add more if needed.
    fun tooltips(tBuilder: TranslationBuilder) {}

    fun effects(tBuilder: TranslationBuilder) {
        tBuilder.add("effect.vaaw.void_touched", "Void Touched")
    }

    fun messages(tBuilder: TranslationBuilder) {
        tBuilder.add("death.attack.void_touched", "%1\$s failed to manifest the void")
        tBuilder.add("death.attack.void_touched.player", "%1\$s failed to manifest the void while fighting %2\$s")
    }

    fun misc(tBuilder: TranslationBuilder) {
        tBuilder.add("itemGroup.vaaw", "Void's Artifacts and Weapons")
    }


    // You can add anything miscellaneous here if you want, using the function is recommended.
    override fun generateTranslations(tBuilder: TranslationBuilder) {

        // Auto Generates Item Names
        allItems.forEach { item ->
            val itemId = Registries.ITEM.getId(item).path
            val name = uniqueItems[itemId] ?: formatItemName(itemId)

            tBuilder.add(item, name)
        }

        // Runs all the other translation functions.
        tooltips(tBuilder)
        effects(tBuilder)
        messages(tBuilder)
        misc(tBuilder)

    }

}