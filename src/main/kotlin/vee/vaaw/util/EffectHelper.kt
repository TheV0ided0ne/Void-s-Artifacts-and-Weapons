package vee.vaaw.util

import vee.vaaw.effect.NegativeEffects
import vee.vaaw.effect.NeutralEffects
import vee.vaaw.effect.PositiveEffects

object EffectHelper {

    fun initializeEffects() {
        PositiveEffects.registerEffects()
        NegativeEffects.registerEffects()
        NeutralEffects.registerEffects()
    }

}