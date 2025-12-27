package vee.vaaw.util

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import vee.vaaw.Vaaw

open class EffectRegistrator {

    fun register(id: String, effect: StatusEffect): StatusEffect {

        val effectId = Identifier(Vaaw.MOD_ID, id)
        return Registry.register(Registries.STATUS_EFFECT, effectId, effect)

    }

}