package vee.vaaw.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vee.vaaw.effect.type.BleedEffect;

@Mixin(LivingEntity.class)
public abstract class BleedOnHitMixin {

    @Inject(method = "damage", at = @At("TAIL"))
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        @SuppressWarnings("all")
        LivingEntity entity = (LivingEntity) (Object) this;

        if (entity.getWorld().isClient()) return;
        if (!cir.getReturnValue()) return;
        if (!(source.getAttacker() instanceof MobEntity)) return;

        boolean isWearingArmor = false;
        for (var stack : entity.getArmorItems()) {
            if (stack.getItem() instanceof ArmorItem) {
                isWearingArmor = true;
                break;
            }
        }

        float chance = isWearingArmor ? 0.025f : 0.05f;

        if (entity.getWorld().getRandom().nextFloat() < chance) {
            entity.addStatusEffect(new StatusEffectInstance(BleedEffect.INSTANCE, 60, 0));
        }
    }
}