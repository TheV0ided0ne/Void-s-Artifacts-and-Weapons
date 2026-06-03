package vee.vaaw.item.type.weapon

import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.text.Text
import net.minecraft.world.World
import vee.vaaw.effect.NegativeEffects
import vee.vaaw.effect.NeutralEffects

class WrathGlaiveItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {

        if (target.world.isClient) return super.postHit(stack, target, attacker)

        target.addStatusEffect(StatusEffectInstance(
            NeutralEffects.WRATH,
            120,
            0
        ))

        return super.postHit(stack, target, attacker)
    }

}