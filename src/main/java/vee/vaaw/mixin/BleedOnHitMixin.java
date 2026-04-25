package vee.vaaw.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vee.vaaw.effect.type.BleedEffect;

@Mixin(LivingEntity.class)
public abstract class BleedOnHitMixin {

    @Shadow public abstract World getWorld();
    @Shadow public abstract Iterable<ItemStack> getArmorItems();
    @SuppressWarnings("UnusedReturnValue")
    @Shadow public abstract boolean addStatusEffect(StatusEffectInstance effect);

    @Inject(method = "damage", at = @At("TAIL"))
    private void onDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (this.getWorld().isClient()) return;
        if (!cir.getReturnValue()) return;
        if (!(source.getAttacker() instanceof MobEntity)) return;

        boolean isWearingArmor = false;
        for (var stack : this.getArmorItems()) {
            if (stack.getItem() instanceof ArmorItem) {
                isWearingArmor = true;
                break;
            }
        }

        float chance = isWearingArmor ? 0.025f : 0.05f;

        if (this.getWorld().getRandom().nextFloat() < chance) {
            this.addStatusEffect(new StatusEffectInstance(BleedEffect.INSTANCE, 60, 0));
        }
    }
}