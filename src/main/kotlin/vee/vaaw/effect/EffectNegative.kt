package vee.vaaw.effect

import vee.vaaw.effect.type.VoidTouchedEffect
import vee.vaaw.util.EffectRegistrator

object EffectNegative : EffectRegistrator() {

    val VOID_TOUCHED = register("void_touched", VoidTouchedEffect)

    fun registerEffects() {}

}