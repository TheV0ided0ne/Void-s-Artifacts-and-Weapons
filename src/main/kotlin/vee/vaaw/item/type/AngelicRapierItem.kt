package vee.vaaw.item.type

import net.minecraft.entity.LivingEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.entity.effect.StatusEffectInstance
import vee.vaaw.effect.NegativeEffects

class AngelicRapierItem(
    toolMaterial: ToolMaterial,
    attackDamage: Int,
    attackSpeed: Float,
    settings: Settings
) : SwordItem(toolMaterial, attackDamage, attackSpeed, settings) {
    
    override fun postHit(stack: ItemStack, target: LivingEntity, attacker: LivingEntity): Boolean {
        if (!target.world.isClient) {
            // Apply Angelic Deceit: 0.5 hearts damage per second, can be cured with Angelic Injection or liquid
            target.addStatusEffect(StatusEffectInstance(NegativeEffects.ANGELIC_DECEIT, 120, 0, true, false))
        }
        return super.postHit(stack, target, attacker)
    }
}