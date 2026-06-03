package vee.vaaw.effect.type

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory

object WrathEffect : StatusEffect(
    StatusEffectCategory.NEUTRAL,
    0x8B0000
) {

    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean = true
}
