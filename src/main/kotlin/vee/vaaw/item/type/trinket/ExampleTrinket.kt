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


    class ExampleTrinket(settings: Settings) : TrinketItem(settings) {
        override fun getModifiers(
            stack: ItemStack?,
            slot: SlotReference?,
            entity: LivingEntity?,
            uuid: UUID?
        ): Multimap<EntityAttribute?, EntityAttributeModifier?> {
            val modifiers = super.getModifiers(stack, slot, entity, uuid)
            // +10% movement speed
            modifiers.put(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                EntityAttributeModifier(
                    uuid,
                    "vaaw:movement_speed",
                    0.1,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL
                )
            )
            // If the player has access to ring slots, this will give them an extra one
            SlotAttributes.addSlotModifier(
                modifiers,
                "chest/necklace",
                uuid,
                1.0,
                EntityAttributeModifier.Operation.ADDITION
            )
            return modifiers
        }
}