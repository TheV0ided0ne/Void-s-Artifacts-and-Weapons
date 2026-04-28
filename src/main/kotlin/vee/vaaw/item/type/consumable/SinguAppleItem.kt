package vee.vaaw.item.type.consumable

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent

    object SinguAppleItem {

        val SINGU_APPLE: FoodComponent = FoodComponent.Builder()
            .hunger(20)
            .saturationModifier(20f)
            .statusEffect(StatusEffectInstance(StatusEffects.GLOWING, 200, 0), 1.0f)
            .statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
            .statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 3), 1.0f)
            .alwaysEdible()
            .build()
    }