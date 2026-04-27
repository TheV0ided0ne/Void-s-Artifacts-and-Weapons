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

// The Eye of The Void - Made with the three trinkets below, grants all effects - "The Void appreciates your gratitude..." - Void
// Trinket of Rage - Whenever the player is low on health with only 30% of their health remaining, gain the 'Rage' effect and can apply this to other enemies.
// Trinket of Balance - Whenever the enemy has both Angelic Deceit and Rage, when the user hits an enemy it's a guarunteed critical effect.
// Trinket of Silence - Hold the silence charges whenever killing enemies, hold 3 charges and gain 10% movement speed per charge, lose one charge every 10s but resets the timer whenever you kill an enemy, shown on the right of your hotbar HUD.

class VoidedEyeTrinket(settings: Settings) : TrinketItem(settings) {
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