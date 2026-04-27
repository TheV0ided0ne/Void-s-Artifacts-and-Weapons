package vee.vaaw.item.type.weapon

import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial

class PoweredOceanScaleItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings)