package vee.vaaw.item.type.trinket

import com.google.common.collect.Multimap
import dev.emi.trinkets.api.SlotAttributes
import dev.emi.trinkets.api.SlotReference
import dev.emi.trinkets.api.TrinketItem
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttribute
import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.item.ItemStack
import java.util.*


    class SwiftnessTrinket(settings: Settings) : TrinketItem(settings) {
        override fun getModifiers(
            stack: ItemStack,
            slot: SlotReference,
            entity: LivingEntity,
            uuid: UUID?
        ): Multimap<EntityAttribute, EntityAttributeModifier> {
            val modifiers = super.getModifiers(stack, slot, entity, uuid)
            // +20% movement speed
            modifiers.put(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                EntityAttributeModifier(
                    uuid,
                    "vaaw:movement_speed",
                    0.2,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL
                )
            )
            return modifiers
        }
}