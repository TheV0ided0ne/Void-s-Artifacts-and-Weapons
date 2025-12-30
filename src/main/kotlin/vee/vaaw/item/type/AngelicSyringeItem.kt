package vee.vaaw.item.type

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World
import vee.vaaw.effect.PositiveEffects

class AngelicSyringeItem(settings: Settings) : Item(settings) {

    override fun use(world: World, user: PlayerEntity, hand: Hand): TypedActionResult<ItemStack> {
        val stack = user.getStackInHand(hand)

        user.addStatusEffect(StatusEffectInstance(
            PositiveEffects.ANGELIC_INJECTION,
            40,
            0
        ))

        stack.decrement(1)
        user.itemCooldownManager.set(this, 100)

        return TypedActionResult.success(stack)
    }

}