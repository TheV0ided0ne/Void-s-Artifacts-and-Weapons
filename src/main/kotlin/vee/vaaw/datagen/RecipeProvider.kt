package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems
import vee.vaaw.item.WeaponItems
import java.util.function.Consumer

class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {

    override fun generate(consumer: Consumer<RecipeJsonProvider>) {
        materialRecipes(consumer)
        weaponRecipes(consumer)
    }

    fun materialRecipes(consumer: Consumer<RecipeJsonProvider>) {

        // Void Crystal
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MaterialItems.VOID_CRYSTAL, 1)
            .pattern("ACA")
            .pattern("CNC")
            .pattern("ACA")
            .input('A', Items.AMETHYST_BLOCK)
            .input('C', Items.CRYING_OBSIDIAN)
            .input('N', Items.NETHER_STAR)
            .criterion(hasItem(Items.NETHER_STAR), conditionsFromItem(Items.NETHER_STAR))
            .offerTo(consumer)

        // Void Thorn
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MaterialItems.VOID_THORN, 1)
            .pattern(" C ")
            .pattern("CVC")
            .pattern(" C ")
            .input('V', Items.VINE)
            .input('C', MaterialItems.VOID_CRYSTAL)
            .criterion(hasItem(MaterialItems.VOID_CRYSTAL), conditionsFromItem(MaterialItems.VOID_CRYSTAL))
            .offerTo(consumer)

        // Reinforced Stick
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, MaterialItems.REINFORCED_STICK, 1)
            .input(Items.NETHERITE_SCRAP, 2)
            .input(Items.STICK)
            .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
            .offerTo(consumer)
    }

    fun weaponRecipes(consumer: Consumer<RecipeJsonProvider>) {

        // Scythe Of The Void
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WeaponItems.VOID_SCYTHE, 1)
            .pattern("TCC")
            .pattern("CSs")
            .pattern(" S ")
            .input('T', MaterialItems.VOID_THORN)
            .input('C', MaterialItems.VOID_CRYSTAL)
            .input('S', MaterialItems.REINFORCED_STICK)
            .input('s', WeaponItems.OBLIVIUM_SCYTHE)
            .criterion(hasItem(MaterialItems.VOID_THORN), conditionsFromItem(MaterialItems.VOID_THORN))
            .offerTo(consumer)

        // Scythe Of Oblivion

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WeaponItems.OBLIVIUM_SCYTHE, 1)
            .pattern("OOO")
            .pattern("OS ")
            .pattern(" S ")
            .input('O', IngotItems.OBLIVIUM_INGOT)
            .input('S', Items.STICK)
            .criterion(hasItem(IngotItems.OBLIVIUM_INGOT), conditionsFromItem(IngotItems.OBLIVIUM_INGOT))
            .offerTo(consumer)
    }

}