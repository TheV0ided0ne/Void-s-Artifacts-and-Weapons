package vee.vaaw.effect

import nuxlox.nuxon.effect.EffectRegistrator
import vee.vaaw.effect.type.AngelicInjectionEffect

object PositiveEffects : EffectRegistrator("vaaw") {

    val ANGELIC_INJECTION = register("angelic_injection", AngelicInjectionEffect)

    fun registerEffects() {}

}