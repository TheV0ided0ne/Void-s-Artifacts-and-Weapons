package vee.vaaw.item.type

import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial

class UnpoweredOceanScaleItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings)