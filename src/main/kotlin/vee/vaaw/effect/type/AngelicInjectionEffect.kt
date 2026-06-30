package vee.vaaw.effect.type

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory
import net.minecraft.entity.effect.StatusEffectInstance

object AngelicInjectionEffect : StatusEffect(
    StatusEffectCategory.BENEFICIAL,
    0xdbd7ca
) {

    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        if (entity.world.isClient) return

        entity.statusEffects
            .filter { it.effectType.category == StatusEffectCategory.HARMFUL }
            .forEach { entity.removeStatusEffect(it.effectType) }

        entity.heal(3f)
    }

    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean {
        return duration % 20 == 0
    }

}