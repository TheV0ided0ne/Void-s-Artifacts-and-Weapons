package vee.vaaw.item

import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Identifier
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import nuxlox.nuxon.item.ItemRegistrator
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item
import java.util.function.Supplier

enum class ModArmorMaterials(
    private val materialName: String,
    private val durabilityMultiplier: Int,
    private val protectionAmounts: IntArray,
    private val enchantability: Int,
    private val equipSound: SoundEvent,
    private val toughness: Float,
    private val knockbackResistance: Float,
    private val repairIngredient: Supplier<Ingredient>
) : ArmorMaterial {

    VOID_STEEL("void_steel", 37, intArrayOf(5, 9, 7, 5), 35,
        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f,
        Supplier { Ingredient.ofItems(IngotItems.VOID_STEEL_INGOT) });

    override fun getDurability(type: ArmorItem.Type): Int = BASE_DURABILITY[type.ordinal] * durabilityMultiplier
    override fun getProtection(type: ArmorItem.Type): Int = protectionAmounts[type.ordinal]
    override fun getEnchantability(): Int = enchantability
    override fun getEquipSound(): SoundEvent = equipSound
    override fun getRepairIngredient(): Ingredient = repairIngredient.get()
    override fun getName(): String = materialName
    override fun getToughness(): Float = toughness
    override fun getKnockbackResistance(): Float = knockbackResistance

    companion object {
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    }
}

object ArmourItems : ItemRegistrator("vaaw") {

    val VOID_STEEL_CROWN = registerArmor("void_steel_crown", ArmorItem.Type.HELMET)
    val VOID_STEEL_CHESTPLATE = registerArmor("void_steel_chestplate", ArmorItem.Type.CHESTPLATE)
    val VOID_STEEL_LEGGINGS = registerArmor("void_steel_leggings", ArmorItem.Type.LEGGINGS)
    val VOID_STEEL_BOOTS = registerArmor("void_steel_boots", ArmorItem.Type.BOOTS)

    private fun registerArmor(name: String, type: ArmorItem.Type): Item {
        return Registry.register(
            Registries.ITEM,
            Identifier("vaaw", name),
            ArmorItem(ModArmorMaterials.VOID_STEEL, type, FabricItemSettings())
        )
    }

    fun registerItems() {
    }
}