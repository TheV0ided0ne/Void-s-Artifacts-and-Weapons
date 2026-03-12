package vee.vaaw.effect.type

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory

object RageEffect : StatusEffect(StatusEffectCategory.BENEFICIAL, 0xFF6B6B) {
    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean = true
}
