package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries
import java.util.Locale.getDefault

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

    override fun generateTranslations(tBuilder: TranslationBuilder) {
        // Item Group
        tBuilder.add("itemGroup.vaaw", "Void's Artifacts and Weapons")

        // Auto Generates Item Names
        allItems.forEach { item ->
            val itemId = Registries.ITEM.getId(item).path
            val name = uniqueItems[itemId] ?: formatItemName(itemId)

            tBuilder.add(item, name)
        }

    }

}