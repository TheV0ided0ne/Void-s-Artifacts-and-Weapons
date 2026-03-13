package vee.vaaw.effect.type

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory

object BleedEffect : StatusEffect(
    StatusEffectCategory.HARMFUL,
    0xb50000
) {

    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        if (entity.world.isClient) return

        val damage = 1f + (amplifier * 0.5f)
        entity.damage(entity.damageSources.magic(), damage)
    }

    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean {
        val interval = maxOf(10, 20 - (amplifier * 5))
        return duration % interval == 0
    }

}