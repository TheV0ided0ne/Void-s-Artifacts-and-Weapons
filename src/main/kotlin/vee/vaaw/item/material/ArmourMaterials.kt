package vee.vaaw.item.material

import net.minecraft.item.ArmorItem
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems

enum class ArmourMaterials(
    private val durabilityMultiplier: Int,
    private val protectionAmounts: IntArray,
    private val toughness: Float,
    private val knockbackResistance: Float,
    private val enchantability: Int,
    private val repairIngredient: Ingredient,
    private val equipSound: SoundEvent
): ArmorMaterial {

    VOID_STEEL(37, intArrayOf(5, 7, 9, 5), 3.0f, 0.1f,
        35, Ingredient.ofItems(IngotItems.VOID_STEEL_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE
    ),

    SELKARIN_SCALE(37, intArrayOf(5, 7, 9, 5), 3.0f, 0.1f,
        28, Ingredient.ofItems(MaterialItems.SELKARIN_SCALE), SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE
    ),

    WRATH_STEEL_INGOT(37, intArrayOf(5, 7, 9, 5), 3.0f, 0.1f,
        25, Ingredient.ofItems(IngotItems.WRATH_STEEL_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE
    );

    companion object {
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    }

    override fun getDurability(type: ArmorItem.Type): Int = BASE_DURABILITY[type.equipmentSlot.entitySlotId] * durabilityMultiplier
    override fun getProtection(type: ArmorItem.Type): Int = protectionAmounts[type.equipmentSlot.entitySlotId]
    override fun getToughness(): Float = toughness
    override fun getKnockbackResistance(): Float = knockbackResistance
    override fun getEnchantability(): Int = enchantability
    override fun getRepairIngredient(): Ingredient = repairIngredient
    override fun getEquipSound(): SoundEvent = equipSound
    override fun getName(): String = name.lowercase()
}