package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.entity.damage.DamageType
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.DamageTypeTags
import net.minecraft.util.Identifier
import java.util.concurrent.CompletableFuture

class DamageTypeTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
) : FabricTagProvider<DamageType>(
    output, RegistryKeys.DAMAGE_TYPE, registriesFuture
) {

    override fun configure(registryWrapper: RegistryWrapper.WrapperLookup) {
        getOrCreateTagBuilder(DamageTypeTags.BYPASSES_ARMOR).addOptional(Identifier("vaaw", "void_touched"))
    }

    override fun getName() = "Damage Type Tags"

}