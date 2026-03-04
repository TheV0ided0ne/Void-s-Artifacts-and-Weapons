package vee.vaaw.util.defaults

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ArmorItem
import vee.vaaw.item.material.ArmourMaterials

data class ArmourDefaults(
    // Materials
    val vSteel: ArmourMaterials = ArmourMaterials.VOID_STEEL,
    val wSteel: ArmourMaterials = ArmourMaterials.WRATH_STEEL_INGOT,
    val aSteel: ArmourMaterials = ArmourMaterials.ANGELIC_STEEL,
    val sScale: ArmourMaterials = ArmourMaterials.SELKARIN_SCALE,

    // Armour Types
    val helmet: ArmorItem.Type = ArmorItem.Type.HELMET,
    val chestplate: ArmorItem.Type = ArmorItem.Type.CHESTPLATE,
    val leggings: ArmorItem.Type = ArmorItem.Type.LEGGINGS,
    val boot: ArmorItem.Type = ArmorItem.Type.BOOTS,

    // Misc
    val settings: FabricItemSettings = FabricItemSettings().maxCount(1)
)
