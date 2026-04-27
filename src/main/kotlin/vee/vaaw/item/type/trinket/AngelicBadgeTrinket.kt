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

// The Badge of The Angelic Guard - Made with the three trinkets below, grants all effects - "The Angels must stay hidden!" - Shiori
// Trinket of Swiftness - Grants the user +20% speed when wearing
// Trinket of Peace - Whenever the player has no hostile mobs around them, they start to regen overtime even without food and they can gain more saturation when eating food!
// Trinket of Bravery - Whenever 3 or more hostile mobs are around the user, the user gains +20% attack rate.

    class AngelicBadgeTrinket(settings: Settings) : TrinketItem(settings) {
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