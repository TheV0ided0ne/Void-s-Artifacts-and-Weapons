package vee.vaaw.item.material

import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import vee.vaaw.item.IngotItems

enum class WeaponMaterials(
    private val durability: Int,
    private val miningSpeed: Float,
    private val attackDamage: Float,
    private val miningLevel: Int,
    private val enchantability: Int,
    private val repairIngredient: Ingredient
) : ToolMaterial {

    VOID_STEEL(4000, 9.0f, 5.0f, 4, 35,
        Ingredient.ofItems(IngotItems.VOID_STEEL_INGOT));

    override fun getDurability() = durability
    override fun getMiningSpeedMultiplier() = miningSpeed
    override fun getAttackDamage() = attackDamage
    override fun getMiningLevel() = miningLevel
    override fun getEnchantability() = enchantability
    override fun getRepairIngredient() = repairIngredient
}