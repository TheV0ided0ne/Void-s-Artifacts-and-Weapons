package vee.vaaw.item.material

import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems

enum class ToolMaterials(
    private val durability: Int,
    private val miningSpeed: Float,
    private val attackDamage: Float,
    private val miningLevel: Int,
    private val enchantability: Int,
    private val repairIngredient: Ingredient
) : ToolMaterial {

    VOID_STEEL(4000, 9.0f, 5.0f, 4, 35,
        Ingredient.ofItems(IngotItems.VOID_STEEL)),

    OBLIVIUM(2500, 7.0f, 3.0f, 3, 25,
        Ingredient.ofItems(IngotItems.OBLIVIUM_INGOT)),

    ANGELIC_STEEL(3500, 8.0f, 3.0f, 4, 35,
        Ingredient.ofItems(IngotItems.ANGELIC_STEEL)),

    SELKARIN_SCALE(3750, 8.5f, 4.0f, 4, 35,
        Ingredient.ofItems(MaterialItems.SELKARIN_SCALE)),

    WRATH_STEEL(3750, 8.7f, 4.0f, 4, 15,
        Ingredient.ofItems(IngotItems.WRATH_STEEL));

    override fun getDurability() = durability
    override fun getMiningSpeedMultiplier() = miningSpeed
    override fun getAttackDamage() = attackDamage
    override fun getMiningLevel() = miningLevel
    override fun getEnchantability() = enchantability
    override fun getRepairIngredient() = repairIngredient
}