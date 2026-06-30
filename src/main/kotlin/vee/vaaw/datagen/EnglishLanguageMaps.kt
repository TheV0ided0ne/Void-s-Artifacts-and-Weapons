package vee.vaaw.datagen

import vee.vaaw.datagen.text.MessageText
import vee.vaaw.datagen.text.TooltipText

/**
 * [EnglishLanguageMaps] is where all the data generation binds are actually declared.
 */
object EnglishLanguageMaps {

    val itemGroups = mapOf(
        "itemGroup.vaaw_armour" to "VAAW Armour",
        "itemGroup.vaaw_consumables" to "VAAW Consumables",
        "itemGroup.vaaw_materials" to "VAAW Materials",
        "itemGroup.vaaw_weapons" to "VAAW Weapons",
        "itemGroup.vaaw_misc" to "VAAW Miscellaneous",
        "itemGroup.vaaw.jokes" to "VAAW Joke Items"
    )

    val trinketSlots = mapOf(
        "trinkets.slot.vaaw.trinket_1" to "Artifact Slot 1",
        "trinkets.slot.vaaw.trinket_2" to "Artifact Slot 2",
        "trinkets.slot.vaaw.trinket_3" to "Artifact Slot 3",
    )

    val effects = mapOf(
        "effect.vaaw.void_touched" to "Void Touched",
        "effect.vaaw.angelic_injection" to "Angelic Injection",
        "effect.vaaw.angelic_deceit" to "Angelic Deceit"
    )

    val messages = mapOf(
        "death.attack.void_touched" to MessageText.VoidTouched.DEATH,
        "death.attack.void_touched.player" to MessageText.VoidTouched.DEATH_PLAYER,
        "death.attack.bleed" to MessageText.Bleed.DEATH,
        "death.attack.bleed.player" to MessageText.Bleed.DEATH_PLAYER,
        "death.attack.angelic_deceit" to MessageText.AngelicDeceit.DEATH,
        "death.attack.angelic_deceit.player" to MessageText.AngelicDeceit.DEATH_PLAYER
    )

    val tooltips = mapOf(
        "itemTooltip.vaaw.void_scythe1" to TooltipText.VoidScythe.ONE,
        "itemTooltip.vaaw.void_scythe2" to TooltipText.VoidScythe.TWO,
        "itemTooltip.vaaw.void_scythe3" to TooltipText.VoidScythe.THREE,
        "itemTooltip.vaaw.oblivion_scythe1" to TooltipText.OBLIVION_SCYTHE
    )

    val keybinds = mapOf(
        "key.vaaw.activate_armour_ability" to "Activate Armour Ability",
        "key.vaaw.activate_weapon_ability" to "Activate Weapon Ability"
    )

    val categories = mapOf(
        "category.vaaw.general" to "VAAW Keybinds"
    )

    fun getMaps(): List<Map<String, String>> {
        return listOf(itemGroups, trinketSlots, effects, messages, keybinds, tooltips, categories)
    }

}