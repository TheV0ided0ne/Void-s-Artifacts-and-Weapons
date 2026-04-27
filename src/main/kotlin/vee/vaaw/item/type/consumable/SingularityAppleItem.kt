package vee.vaaw.item.type.consumable

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent

    object SingularityAppleItem {

        val SINGULARITY_APPLE: FoodComponent = FoodComponent.Builder()
            .hunger(20)
            .saturationModifier(20f)
            .statusEffect(StatusEffectInstance(StatusEffects.GLOWING, 200, 1), 1.0f)
            .statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
            .alwaysEdible()
            .build()
    }