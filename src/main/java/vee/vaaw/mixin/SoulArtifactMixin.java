package vee.vaaw.mixin;

import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vee.vaaw.effect.type.BleedEffect;
import vee.vaaw.item.TrinketItems;

@Mixin(LivingEntity.class)
public abstract class SoulArtifactMixin {

    @Inject(method = "onDeath", at = @At("HEAD"))
    private void onEntityKilled(LivingEntity entity, DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {

        if (entity.getWorld().isClient()) return;
        if (!cir.getReturnValue()) return;
        if (!(damageSource.getAttacker() instanceof MobEntity)) return;

        if (damageSource.getAttacker() instanceof PlayerEntity player) {

            TrinketsApi.getTrinketComponent(player).ifPresent(component -> {
                component.forEach((slotReference, stack) -> {
                    // code
                });
            });

        }

    }

    private void incrementSoulCount(ItemStack stack) {
        NbtCompound nbt = stack.getOrCreateNbt();

        int soulCount = nbt.getInt("soulCount");
        if (soulCount >= 0 && soulCount <= 3) soulCount += 1;
        nbt.putInt("soulCount", soulCount);
    }
}
