package vee.vaaw.effect

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import nuxlox.nuxon.effect.EffectRegistrator
import vee.vaaw.effect.type.AngelicInjectionEffect
import vee.vaaw.effect.type.RageEffect
import vee.vaaw.Vaaw

object PositiveEffects: EffectRegistrator("vaaw") {

    val ANGELIC_INJECTION: StatusEffect = register("angelic_injection", AngelicInjectionEffect)
    val RAGE: StatusEffect = register("rage", RageEffect)

    fun registerEffects() {}

}
