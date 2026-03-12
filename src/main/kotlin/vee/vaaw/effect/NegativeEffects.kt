package vee.vaaw.effect

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import vee.vaaw.effect.type.VoidTouchedEffect
import vee.vaaw.effect.type.WrathEffect
import vee.vaaw.effect.type.AngelicDeceitEffect
import vee.vaaw.Vaaw

object NegativeEffects {

    val VOID_TOUCHED: StatusEffect = registerEffect("void_touched", VoidTouchedEffect)
    val WRATH: StatusEffect = registerEffect("wrath", WrathEffect)
    val ANGELIC_DECEIT: StatusEffect = registerEffect("angelic_deceit", AngelicDeceitEffect)

    private fun registerEffect(id: String, effect: StatusEffect): StatusEffect {
        return Registry.register(Registries.STATUS_EFFECT, Identifier(Vaaw.MOD_ID, id), effect)
    }

    fun registerEffects() {}

}
