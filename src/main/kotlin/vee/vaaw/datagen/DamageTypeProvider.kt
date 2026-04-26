package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider
import net.minecraft.entity.damage.DamageEffects
import net.minecraft.entity.damage.DamageScaling
import net.minecraft.entity.damage.DamageType
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper
import net.minecraft.util.Identifier
import java.util.concurrent.CompletableFuture

/**
 * This class provides all the damage types used by `vaaw`.
 * In order to make a new damage type, just create the registry key and then add a new entry.
 */

class DamageTypeProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricDynamicRegistryProvider(output, registriesFuture) {

    val voidTouchedDamage: RegistryKey<DamageType> = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier("vaaw", "void_touched"))
    val bleedDamage: RegistryKey<DamageType> = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier("vaaw", "bleed"))

    override fun configure(registries: RegistryWrapper.WrapperLookup, entries: Entries) {
        entries.add(voidTouchedDamage,
            DamageType("void_touched", DamageScaling.NEVER, 0.0f, DamageEffects.FREEZING)
        )

        entries.add(bleedDamage,
            DamageType("bleed", DamageScaling.NEVER, 0.0f, DamageEffects.HURT)
        )
    }

    override fun getName() = "Damage Types"
}