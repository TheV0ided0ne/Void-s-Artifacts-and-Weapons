package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import net.minecraft.item.ArmorItem
import vee.vaaw.util.defaults.ArmourDefaults

object ArmourItems : ItemRegistrator("vaaw") {
    val d = ArmourDefaults()

    // Voided

    val VOIDED_CROWN = register("voided_crown", ArmorItem(d.vSteel, d.helmet, d.settings))
    val WORMHOLE_MATRIX = register("voided_wormhole_matrix", ArmorItem(d.vSteel, d.chestplate, d.settings))
    val SINGULARITY_THIGHGUARDS = register("voided_singularity_thighguards", ArmorItem(d.vSteel, d.leggings, d.settings))
    val ANCHOR_BOOTS = register("voided_anchor_boots", ArmorItem(d.vSteel, d.boot, d.settings))

    // Wrathful

    val CRIMSON_VISOR = register("wrathful_crimson_visor", ArmorItem(d.wSteel, d.helmet, d.settings))
    val FURNACE_CORE = register("wrathful_furnace_core", ArmorItem(d.wSteel, d.chestplate, d.settings))
    val HEATED_GREAVES = register("wrathful_heated_greaves", ArmorItem(d.wSteel, d.leggings, d.settings))
    val MAGMA_WALKERS = register("wrathful_magma_walkers", ArmorItem(d.wSteel, d.boot, d.settings))

    // Angelic

    val ANGELIC_HALO = register("angelic_halo", ArmorItem(d.aSteel, d.helmet, d.settings))
    val ANGELIC_CHESTPLATE = register("angelic_chestplate", ArmorItem(d.aSteel, d.chestplate, d.settings))
    val ANGELIC_LEGGINGS = register("angelic_leggings", ArmorItem(d.aSteel, d.leggings, d.settings))
    val ANGELIC_BOOTS = register("angelic_boots", ArmorItem(d.aSteel, d.boot, d.settings))

    // Sel' Karin

    val SELKARIN_NECKLACE = register("selkarin_necklace", ArmorItem(d.sScale, d.helmet, d.settings))
    val SELKARIN_CHESTPLATE = register("selkarin_chestplate", ArmorItem(d.sScale, d.chestplate, d.settings))
    val SELKARIN_LEGGINGS = register("selkarin_leggings", ArmorItem(d.sScale, d.leggings, d.settings))
    val SELKARIN_BOOTS = register("selkarin_boots", ArmorItem(d.sScale, d.boot, d.settings))

    // Itrioch

    val CANOPY_CROWN = register("itrioch_canopy_crown", ArmorItem(d.iIngot, d.helmet, d.settings))
    val BARKPLATE = register("itrioch_barkplate", ArmorItem(d.iIngot, d.chestplate, d.settings))
    val ROOTED_GREAVES = register("itrioch_rooted_greaves", ArmorItem(d.iIngot, d.leggings, d.settings))
    val SPORE_STRIDERS = register("itrioch_spore_striders", ArmorItem(d.iIngot, d.boot, d.settings))

    // Oblivium

    val ERASURE_GAZE = register("oblivium_erasure_gaze", ArmorItem(d.oIngot, d.helmet, d.settings))
    val NULLHEART = register("oblivium_mullheart", ArmorItem(d.oIngot, d.chestplate, d.settings))
    val GRAVITON_GUARDS = register("oblivium_graviton_guards", ArmorItem(d.oIngot, d.leggings, d.settings))
    val ABYSS_WALKERS = register("oblivium_abyss_walkers", ArmorItem(d.oIngot, d.boot, d.settings))

    // Nixium

    val UMBRALUX = register("nixium_umbralux", ArmorItem(d.nIngot, d.helmet, d.settings))
    val VESPERSHIELD = register("nixium_vespershield", ArmorItem(d.nIngot, d.chestplate, d.settings))
    val PENUMBRA = register("nixium_penumbra", ArmorItem(d.nIngot, d.leggings, d.settings))
    val TWILIGHT_SOLES = register("nixium_twilight_soles", ArmorItem(d.nIngot, d.boot, d.settings))

    // Skyline

    val SKYLINE_NECKLACE = register("skyline_necklace", ArmorItem(d.sIngot, d.helmet, d.settings))
    val SKYLINE_CHESTPLATE = register("skyline_chestplate", ArmorItem(d.sIngot, d.chestplate, d.settings))
    val SKYLINE_LEGGINGS = register("skyline_leggings", ArmorItem(d.sIngot, d.leggings, d.settings))
    val SKYLINE_BOOTS = register("skyline_boots", ArmorItem(d.sIngot, d.boot, d.settings))

    fun registerItems() {}
}