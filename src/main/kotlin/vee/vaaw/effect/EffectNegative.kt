package vee.vaaw.effect

import nuxlox.nuxon.effect.EffectRegistrator
import vee.vaaw.effect.type.VoidTouchedEffect

object EffectNegative : EffectRegistrator("vaaw") {

    val VOID_TOUCHED = register("void_touched", VoidTouchedEffect)

    fun registerEffects() {}

}