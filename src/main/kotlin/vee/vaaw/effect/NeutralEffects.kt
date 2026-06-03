package vee.vaaw.effect

import net.minecraft.entity.effect.StatusEffect
import nuxlox.nuxon.effect.EffectRegistrator
import vee.vaaw.effect.type.WrathEffect

object NeutralEffects: EffectRegistrator("vaaw") {

    val WRATH: StatusEffect = register("wrath", WrathEffect)

    fun registerEffects() {}

}