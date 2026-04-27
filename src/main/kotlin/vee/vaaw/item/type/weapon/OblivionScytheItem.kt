package vee.vaaw.item.type.weapon

import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.LivingEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.text.Text
import net.minecraft.world.World

class OblivionScytheItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {

        return super.postHit(stack, target, attacker)
    }

    override fun appendTooltip(
        stack: ItemStack,
        world: World?,
        tooltip: MutableList<Text>,
        context: TooltipContext
    ) {

        tooltip.add(Text.translatable("itemTooltip.vaaw.oblivion_scythe1"))
        super.appendTooltip(stack, world, tooltip, context)
    }

}