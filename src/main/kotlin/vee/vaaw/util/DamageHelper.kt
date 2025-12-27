package vee.vaaw.util

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.damage.DamageSource
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier

object DamageHelper {

    fun createDamageSource(entity: LivingEntity, damageTypeId: String): DamageSource {
        val damageType = RegistryKey.of(
            RegistryKeys.DAMAGE_TYPE,
            Identifier("vaaw", damageTypeId)
        )

        return DamageSource(entity.world.registryManager
            .get(RegistryKeys.DAMAGE_TYPE)
            .entryOf(damageType))
    }

}