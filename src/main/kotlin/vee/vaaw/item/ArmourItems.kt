package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import net.minecraft.item.ArmorItem
import vee.vaaw.util.defaults.ArmourDefaults

object ArmourItems : ItemRegistrator("vaaw") {
    val d = ArmourDefaults()

    val VOID_STEEL_CROWN = register("void_steel_crown", ArmorItem(d.vSteel, d.helmet, d.settings))
    val VOID_STEEL_CHESTPLATE = register("void_steel_chestplate", ArmorItem(d.vSteel, d.chestplate, d.settings))
    val VOID_STEEL_LEGGINGS = register("void_steel_leggings", ArmorItem(d.vSteel, d.leggings, d.settings))
    val VOID_STEEL_BOOTS = register("void_steel_boots", ArmorItem(d.vSteel, d.boot, d.settings))

    val WRATH_STEEL_DRAGON_HELMET = register("wrath_steel_dragon_helm", ArmorItem(d.wSteel, d.helmet, d.settings))
    val WRATH_STEEL_DRAGON_CHESTPLATE = register("wrath_steel_dragon_chestplate", ArmorItem(d.wSteel, d.chestplate, d.settings))
    val WRATH_STEEL_DRAGON_LEGGINGS = register("wrath_steel_dragon_leggings", ArmorItem(d.wSteel, d.leggings, d.settings))
    val WRATH_STEEL_DRAGON_BOOTS = register("wrath_steel_dragon_boots", ArmorItem(d.wSteel, d.boot, d.settings))

    val ANGELIC_HALO = register("angelic_halo", ArmorItem(d.aSteel, d.helmet, d.settings))
    val ANGELIC_CHESTPLATE = register("angelic_chestplate", ArmorItem(d.aSteel, d.chestplate, d.settings))
    val ANGELIC_LEGGINGS = register("angelic_leggings", ArmorItem(d.aSteel, d.leggings, d.settings))
    val ANGELIC_BOOTS = register("angelic_boots", ArmorItem(d.aSteel, d.boot, d.settings))

    val SELKARIN_NECKLACE = register("selkarin_necklace", ArmorItem(d.sScale, d.helmet, d.settings))
    val SELKARIN_CHESTPLATE = register("selkarin_chestplate", ArmorItem(d.sScale, d.chestplate, d.settings))
    val SELKARIN_LEGGINGS = register("selkarin_leggings", ArmorItem(d.sScale, d.leggings, d.settings))
    val SELKARIN_BOOTS = register("selkarin_boots", ArmorItem(d.sScale, d.boot, d.settings))

    val ITRIOCH_CROWN = register("itrioch_crown", ArmorItem(d.iIngot, d.helmet, d.settings))
    val ITRIOCH_CLOAK = register("itrioch_cloak", ArmorItem(d.iIngot, d.chestplate, d.settings))
    val ITRIOCH_PANTS = register("itrioch_pants", ArmorItem(d.iIngot, d.leggings, d.settings))
    val ITRIOCH_BOOTS = register("itrioch_boots", ArmorItem(d.iIngot, d.boot, d.settings))

    val OBLIVIUM_MASK = register("oblivium_mask", ArmorItem(d.oIngot, d.helmet, d.settings))
    val OBLIVIUM_CHESTPLATE = register("oblivium_chestplate", ArmorItem(d.oIngot, d.chestplate, d.settings))
    val OBLIVIUM_LEGGINGS = register("oblivium_leggings", ArmorItem(d.oIngot, d.leggings, d.settings))
    val OBLIVIUM_BOOTS = register("oblivium_boots", ArmorItem(d.oIngot, d.boot, d.settings))

    val NIXIUM_UMBRALUX = register("nixium_umbralux", ArmorItem(d.nIngot, d.helmet, d.settings))
    val NIXIUM_VEST = register("nixium_vest", ArmorItem(d.nIngot, d.chestplate, d.settings))
    val NIXIUM_LEGGINGS = register("nixium_leggings", ArmorItem(d.nIngot, d.leggings, d.settings))
    val NIXIUM_BOOTS = register("nixium_boots", ArmorItem(d.nIngot, d.boot, d.settings))

    val SKYLINE_NECKLACE = register("skyline_necklace", ArmorItem(d.sIngot, d.helmet, d.settings))
    val SKYLINE_CHESTPLATE = register("skyline_chestplate", ArmorItem(d.sIngot, d.chestplate, d.settings))
    val SKYLINE_LEGGINGS = register("skyline_leggings", ArmorItem(d.sIngot, d.leggings, d.settings))
    val SKYLINE_BOOTS = register("skyline_boots", ArmorItem(d.sIngot, d.boot, d.settings))

    fun registerItems() {}
}