package vee.vaaw.effect.type

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory
import net.minecraft.entity.LivingEntity
import net.minecraft.util.Identifier
import net.minecraft.util.math.Vec3d
import net.minecraft.world.World
import nuxlox.nuxon.damage.DamageHelper

object AngelicDeceitEffect : StatusEffect(StatusEffectCategory.HARMFUL, 0xFFD700) {
    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        if (entity.world.isClient) return

        val angelicDeceitSource = DamageHelper.createDamageSource(entity.world, Identifier("vaaw", "angelic_deceit"))
        
        entity.damage(angelicDeceitSource, 1.0f)
    }

    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean {
        return duration % 20 == 0
    }
}
