package vee.vaaw.effect

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import nuxlox.nuxon.effect.EffectRegistrator
import vee.vaaw.effect.type.VoidTouchedEffect
import vee.vaaw.effect.type.WrathEffect
import vee.vaaw.effect.type.AngelicDeceitEffect
import vee.vaaw.Vaaw
import vee.vaaw.effect.type.BleedEffect

object NegativeEffects: EffectRegistrator("vaaw") {

    val VOID_TOUCHED: StatusEffect = register("void_touched", VoidTouchedEffect)
    val WRATH: StatusEffect = register("wrath", WrathEffect)
    val ANGELIC_DECEIT: StatusEffect = register("angelic_deceit", AngelicDeceitEffect)
    val BLEED: StatusEffect = register("bleed", BleedEffect)

    fun registerEffects() {}

}
