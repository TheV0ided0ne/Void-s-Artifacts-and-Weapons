package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.material.ToolMaterials
import vee.vaaw.item.type.weapon.AngelicRapierItem
import vee.vaaw.item.type.weapon.AngelicSpearItem
import vee.vaaw.item.type.weapon.OblivionScytheItem
import vee.vaaw.item.type.weapon.PoweredOceanScaleItem
import vee.vaaw.item.type.weapon.UnpoweredOceanScaleItem
import vee.vaaw.item.type.weapon.VoidScytheItem

object WeaponItems : ItemRegistrator("vaaw") {

    val VOID_SCYTHE = register("scythe_of_the_void", VoidScytheItem(ToolMaterials.VOID_STEEL,
        8, -3f, FabricItemSettings()))

    val OBLIVIUM_SCYTHE = register("scythe_of_oblivion", OblivionScytheItem(ToolMaterials.OBLIVIUM,
        6, -3.2f, FabricItemSettings()))

    val ANGELIC_RAPIER = register("angelic_rapier", AngelicRapierItem(ToolMaterials.ANGELIC_STEEL,
        6, -1.0f, FabricItemSettings()))

    val POWERED_OCEANSCALE_BLADE = register("powered_oceanscale_blade", PoweredOceanScaleItem(ToolMaterials.SELKARIN_SCALE,
        7, -3.1f, FabricItemSettings()))

    val UNPOWERED_OCEANSCALE_BLADE = register("unpowered_oceanscale_blade", UnpoweredOceanScaleItem(ToolMaterials.SELKARIN_SCALE,
        7, -3.1f, FabricItemSettings()))

    val ANGELIC_SPEAR = register("angelic_spear", AngelicSpearItem(ToolMaterials.ANGELIC_STEEL,
        7, -3.1f, FabricItemSettings()))

    fun registerItems() {}

}