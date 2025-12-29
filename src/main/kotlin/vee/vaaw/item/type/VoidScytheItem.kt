package vee.vaaw.item.type

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import vee.vaaw.effect.NegativeEffects

class VoidScytheItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings) {

    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {

        if (target.world.isClient) return super.postHit(stack, target, attacker)

        target.addStatusEffect(StatusEffectInstance(
            NegativeEffects.VOID_TOUCHED,
            200,
            0
        ))

        return super.postHit(stack, target, attacker)
    }

}