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

// Trinket of Rage - Whenever the player is low on health with only 30% of their health remaining, gain the 'Rage' effect and can apply this to other enemies.

    class RageTrinket(settings: Settings) : TrinketItem(settings) {
        override fun getModifiers(
            stack: ItemStack?,
            slot: SlotReference?,
            entity: LivingEntity?,
            uuid: UUID?
        ): Multimap<EntityAttribute?, EntityAttributeModifier?> {
            val modifiers = super.getModifiers(stack, slot, entity, uuid)


            return modifiers
        }
}