package vee.vaaw.effect.type

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory
import nuxlox.nuxon.damage.DamageHelper

object VoidTouchedEffect : StatusEffect(
    StatusEffectCategory.HARMFUL,
    0x7d00e3
) {
    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        if (entity.world.isClient) return

        val voidTouchedSource = DamageHelper.createDamageSource(entity, "vaaw", "void_touched")

        entity.damage(voidTouchedSource, 3.0F)
    }

    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean {
        return duration % 40 == 0
    }

}