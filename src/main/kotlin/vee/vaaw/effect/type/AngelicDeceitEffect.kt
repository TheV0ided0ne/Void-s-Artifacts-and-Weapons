package vee.vaaw.effect.type

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectCategory
import net.minecraft.entity.LivingEntity
import net.minecraft.util.math.Vec3d
import net.minecraft.world.World

object AngelicDeceitEffect : StatusEffect(StatusEffectCategory.HARMFUL, 0xFFD700) {
    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean = true
    
    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        super.applyUpdateEffect(entity, amplifier)
        // Deal 0.5 hearts damage every 20 ticks (half the damage of Void Touched)
        if (entity.world.isClient) return
        
        entity.damage(entity.world.damageSources.generic(), 1.0f)
    }
}
