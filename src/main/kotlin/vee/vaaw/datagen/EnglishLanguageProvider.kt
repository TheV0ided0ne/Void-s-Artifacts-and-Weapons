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
 * any changes to this file, ensure to run the `runDatagen` command with Gradle in order to update the
 * `en_us.json` translation file.
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

    // You can add anything miscellaneous here if you want, using the function is recommended.
    override fun generateTranslations(tBuilder: TranslationBuilder) {

        // Auto Generates Item Names
        allItems.forEach { item ->
            val itemId = Registries.ITEM.getId(item).path
            val name = uniqueItems[itemId] ?: formatItemName(itemId)

            tBuilder.add(item, name)
        }

        // Runs all the other translation functions.
        itemGroups(tBuilder)
        trinketSlots(tBuilder)
        effects(tBuilder)
        messages(tBuilder)
        tooltips(tBuilder)

    }


    // Here are all the functions for translation addition! Feel free to add more if needed.
    fun itemGroups(tBuilder: TranslationBuilder) {
        tBuilder.add("itemGroup.vaaw_armour", "VAAW Armour")
        tBuilder.add("itemGroup.vaaw_consumables", "VAAW Consumables")
        tBuilder.add("itemGroup.vaaw_materials", "VAAW Materials")
        tBuilder.add("itemGroup.vaaw_misc", "VAAW Miscellaneous")
        tBuilder.add("itemGroup.vaaw_weapons", "VAAW Weapons")
    }

    fun trinketSlots(tBuilder: TranslationBuilder) {
        tBuilder.add("trinkets.slot.vaaw.trinket_1", "Artifact Slot 1")
        tBuilder.add("trinkets.slot.vaaw.trinket_2", "Artifact Slot 2")
        tBuilder.add("trinkets.slot.vaaw.trinket_3", "Artifact Slot 3")
    }

    fun effects(tBuilder: TranslationBuilder) {
        tBuilder.add("effect.vaaw.void_touched", "Void Touched")
        tBuilder.add("effect.vaaw.angelic_injection", "Angelic Injection")
    }

    fun messages(tBuilder: TranslationBuilder) {
        tBuilder.add("death.attack.void_touched", "%1\$s failed to manifest the void")
        tBuilder.add("death.attack.void_touched.player", "%1\$s failed to manifest the void while fighting %2\$s")
    }

    fun tooltips(tBuilder: TranslationBuilder) {
        tBuilder.add("itemTooltip.vaaw.void_scythe1", "§5Forged by The Voided One himself to fulfill a purpose after his Oblivion Scythe shattered in ITM,")
        tBuilder.add("itemTooltip.vaaw.void_scythe2", "§5now §4YOU §5must carry this purpose and defeat all who stand in your way with this legendary weapon!")
        tBuilder.add("itemTooltip.vaaw.oblivion_scythe1", "The start of a legend, use this scythe that 'The Voided One' himself used to shatter all evil in your way!")
    }

}