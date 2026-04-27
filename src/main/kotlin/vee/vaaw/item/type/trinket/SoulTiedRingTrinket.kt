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

// The Soul-tied Ring - Made with the three trinkets below, grants all effects - "...Hands. Off. My. Brother." - Florian
// Trinket of Souls - Hold 3 souls that you kill for up to 10s, resets this counter whenever another enemy is killed and when you don't kill for 10s, one dissapears until they all dissapear, 10% damage per soul, shown on the right of the hotbar HUD.
// Trinket of Wrath - When losing a soul, apply the wrath effect
// Trinket of Devotion - When holding 3 souls, grants 15% damage reduction and +10% movement speed.

    class SoulTiedRingTrinket(settings: Settings) : TrinketItem(settings) {
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