package vee.vaaw.effect

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import vee.vaaw.effect.type.AngelicInjectionEffect
import vee.vaaw.effect.type.RageEffect
import vee.vaaw.Vaaw

object PositiveEffects {

    val ANGELIC_INJECTION: StatusEffect = registerEffect("angelic_injection", AngelicInjectionEffect)
    val RAGE: StatusEffect = registerEffect("rage", RageEffect)

    private fun registerEffect(id: String, effect: StatusEffect): StatusEffect {
        return Registry.register(Registries.STATUS_EFFECT, Identifier(Vaaw.MOD_ID, id), effect)
    }

    fun registerEffects() {}

}
