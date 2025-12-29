package vee.vaaw.util

import vee.vaaw.effect.NegativeEffects

object EffectHelper {

    fun intialiseEffects() {
        NegativeEffects.registerEffects()
    }

}