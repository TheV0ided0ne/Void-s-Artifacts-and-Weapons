package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.type.trinket.BlankTrinket
import vee.vaaw.item.type.trinket.ExampleTrinket
import vee.vaaw.item.type.trinket.SoulsTrinket
import vee.vaaw.item.type.trinket.SwiftnessTrinket

object TrinketItems : ItemRegistrator("vaaw") {

    val EXAMPLE_TRINKET = register("example_trinket", ExampleTrinket(FabricItemSettings()))
    val BLANK_TRINKET = register("blank_trinket", BlankTrinket(FabricItemSettings()))
    val SOULS_TRINKET = register("souls_trinket", SoulsTrinket(FabricItemSettings()))
    val SWIFTNESS_TRINKET = register("swiftness_trinket", SwiftnessTrinket(FabricItemSettings()))
    val HEART_OF_THE_SIBLINGS = register("heart_of_the_siblings", SwiftnessTrinket(FabricItemSettings()))
    val BADGE_OF_THE_ANGELIC_GUARD = register("badge_of_the_angelic_guard", SwiftnessTrinket(FabricItemSettings()))
    val SOUL_TIED_RING = register("soul_tied_ring", SwiftnessTrinket(FabricItemSettings()))
    val EYE_OF_THE_VOID = register("eye_of_the_void", SwiftnessTrinket(FabricItemSettings()))
    val RAGE_TRINKET = register("rage_trinket", SwiftnessTrinket(FabricItemSettings()))
    val BALANCE_TRINKET = register("balance_trinket", SwiftnessTrinket(FabricItemSettings()))
    val SILENCE_TRINKET = register("silence_trinket", SwiftnessTrinket(FabricItemSettings()))
    val PEACE_TRINKET = register("peace_trinket", SwiftnessTrinket(FabricItemSettings()))
    val BRAVERY_TRINKET = register("bravery_trinket", SwiftnessTrinket(FabricItemSettings()))
    val WRATH_TRINKET = register("wrath_trinket", SwiftnessTrinket(FabricItemSettings()))
    val DEVOTION_TRINKET = register("devotion_trinket", SwiftnessTrinket(FabricItemSettings()))

    fun registerItems() {}

}