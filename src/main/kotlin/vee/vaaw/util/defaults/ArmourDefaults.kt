package vee.vaaw.util.defaults

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.ArmorItem
import vee.vaaw.item.material.ArmourMaterials

data class ArmourDefaults(
    // Materials
    val vSteel: ArmourMaterials = ArmourMaterials.VOID_STEEL,

    // Armour Types
    val helmet: ArmorItem.Type = ArmorItem.Type.HELMET,
    val chestplate: ArmorItem.Type = ArmorItem.Type.CHESTPLATE,
    val leggings: ArmorItem.Type = ArmorItem.Type.LEGGINGS,
    val boot: ArmorItem.Type = ArmorItem.Type.BOOTS,

    // Misc
    val settings: FabricItemSettings = FabricItemSettings().maxCount(1)
)
