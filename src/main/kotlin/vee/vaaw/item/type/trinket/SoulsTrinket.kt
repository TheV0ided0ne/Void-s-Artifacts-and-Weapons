package vee.vaaw.item.type.trinket

import com.google.common.collect.Multimap
import dev.emi.trinkets.api.SlotReference
import dev.emi.trinkets.api.TrinketItem
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.attribute.EntityAttribute
import net.minecraft.entity.attribute.EntityAttributeModifier
import net.minecraft.item.ItemStack
import java.util.UUID

// Holds 3 souls, each soul gives 10% more atk damage, you get them by killing any enemy/entity

class SoulsTrinket(settings: Settings) : TrinketItem(settings) {
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