package vee.vaaw.datagen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import vee.vaaw.item.ArmourItems
import vee.vaaw.item.IngotItems
import vee.vaaw.item.MaterialItems
import vee.vaaw.item.WeaponItems
import java.util.function.Consumer

class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {

    override fun generate(consumer: Consumer<RecipeJsonProvider>) {
        materialRecipes(consumer)
        weaponRecipes(consumer)
        armourRecipes(consumer)
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

        // Oblivium Steel
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, IngotItems.OBLIVIUM_STEEL, 1)
            .input(IngotItems.NIXIUM_INGOT)
            .input(IngotItems.ITRIOCH_INGOT)
            .input(IngotItems.SKYLINE_INGOT)
            .input(MaterialItems.VOID_CRYSTAL)
            .criterion(hasItem(MaterialItems.VOID_CRYSTAL), conditionsFromItem(MaterialItems.VOID_CRYSTAL))
            .offerTo(consumer)

        // Void Thorn
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MaterialItems.VOID_VINE, 1)
            .pattern(" V ")
            .pattern("VCV")
            .pattern(" V ")
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
            .input('T', MaterialItems.VOID_VINE)
            .input('C', MaterialItems.VOID_CRYSTAL)
            .input('S', MaterialItems.REINFORCED_STICK)
            .input('s', WeaponItems.OBLIVIUM_SCYTHE)
            .criterion(hasItem(MaterialItems.VOID_VINE), conditionsFromItem(MaterialItems.VOID_VINE)).offerTo(consumer)

        // Scythe Of Oblivion

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WeaponItems.OBLIVIUM_SCYTHE, 1)
            .pattern("OOO")
            .pattern("OS ")
            .pattern(" S ")
            .input('O', IngotItems.OBLIVIUM_STEEL)
            .input('S', Items.STICK)
            .criterion(hasItem(IngotItems.OBLIVIUM_STEEL), conditionsFromItem(IngotItems.OBLIVIUM_STEEL))
            .offerTo(consumer)

        // Nixium Warhammer

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, WeaponItems.NIXIUM_WARHAMMER, 1)
        .pattern("NNN")
        .pattern("NSN")
        .pattern(" S ")
        .input('S', Items.STICK)
        .input('N', IngotItems.NIXIUM_INGOT)
        .criterion(hasItem(IngotItems.NIXIUM_INGOT), conditionsFromItem(IngotItems.NIXIUM_INGOT))
        .offerTo(consumer)

    }

    fun armourRecipes(consumer: Consumer<RecipeJsonProvider>) {

        // Nixium

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.UMBRALUX, 1)
            .pattern("VVV")
            .pattern("V V")
            .input('V', IngotItems.NIXIUM_INGOT)
            .criterion(hasItem(IngotItems.NIXIUM_INGOT), conditionsFromItem(IngotItems.NIXIUM_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.VESPERSHIELD, 1)
            .pattern("V V")
            .pattern("VVV")
            .pattern("VVV")
            .input('V', IngotItems.NIXIUM_INGOT)
            .criterion(hasItem(IngotItems.NIXIUM_INGOT), conditionsFromItem(IngotItems.NIXIUM_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.PENUMBRA, 1)
            .pattern("VVV")
            .pattern("V V")
            .pattern("V V")
            .input('V', IngotItems.NIXIUM_INGOT)
            .criterion(hasItem(IngotItems.NIXIUM_INGOT), conditionsFromItem(IngotItems.NIXIUM_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.TWILIGHT_SOLES, 1)
            .pattern("V V")
            .pattern("V V")
            .input('V', IngotItems.NIXIUM_INGOT)
            .criterion(hasItem(IngotItems.NIXIUM_INGOT), conditionsFromItem(IngotItems.NIXIUM_INGOT))
            .offerTo(consumer)

        // Voided

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.VOIDED_CROWN, 1)
            .pattern("VVV")
            .pattern("V V")
            .input('V', IngotItems.VOID_STEEL)
            .criterion(hasItem(IngotItems.VOID_STEEL), conditionsFromItem(IngotItems.VOID_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.WORMHOLE_MATRIX, 1)
            .pattern("V V")
            .pattern("VVV")
            .pattern("VVV")
            .input('V', IngotItems.VOID_STEEL)
            .criterion(hasItem(IngotItems.VOID_STEEL), conditionsFromItem(IngotItems.VOID_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SINGULARITY_THIGHGUARDS, 1)
            .pattern("VVV")
            .pattern("V V")
            .pattern("V V")
            .input('V', IngotItems.VOID_STEEL)
            .criterion(hasItem(IngotItems.VOID_STEEL), conditionsFromItem(IngotItems.VOID_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ANCHOR_BOOTS, 1)
            .pattern("V V")
            .pattern("V V")
            .input('V', IngotItems.VOID_STEEL)
            .criterion(hasItem(IngotItems.VOID_STEEL), conditionsFromItem(IngotItems.VOID_STEEL))
            .offerTo(consumer)

            // Wrathful

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.CRIMSON_VISOR, 1)
            .pattern("WWW")
            .pattern("W W")
            .input('W', IngotItems.WRATH_STEEL)
            .criterion(hasItem(IngotItems.WRATH_STEEL), conditionsFromItem(IngotItems.WRATH_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.FURNACE_CORE, 1)
            .pattern("W W")
            .pattern("WWW")
            .pattern("WWW")
            .input('W', IngotItems.WRATH_STEEL)
            .criterion(hasItem(IngotItems.WRATH_STEEL), conditionsFromItem(IngotItems.WRATH_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.HEATED_GREAVES, 1)
            .pattern("WWW")
            .pattern("W W")
            .pattern("W W")
            .input('W', IngotItems.WRATH_STEEL)
            .criterion(hasItem(IngotItems.WRATH_STEEL), conditionsFromItem(IngotItems.WRATH_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.MAGMA_WALKERS, 1)
            .pattern("W W")
            .pattern("W W")
            .input('W', IngotItems.WRATH_STEEL)
            .criterion(hasItem(IngotItems.WRATH_STEEL), conditionsFromItem(IngotItems.WRATH_STEEL))
            .offerTo(consumer)

            // Sel'Karin
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SELKARIN_NECKLACE, 1)
            .pattern("SSS")
            .pattern("S S")
            .input('S', MaterialItems.SELKARIN_SCALE)
            .criterion(hasItem(MaterialItems.SELKARIN_SCALE), conditionsFromItem(MaterialItems.SELKARIN_SCALE))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SELKARIN_CHESTPLATE, 1)
            .pattern("S S")
            .pattern("SSS")
            .pattern("SSS")
            .input('S', MaterialItems.SELKARIN_SCALE)
            .criterion(hasItem(MaterialItems.SELKARIN_SCALE), conditionsFromItem(MaterialItems.SELKARIN_SCALE))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SELKARIN_LEGGINGS, 1)
            .pattern("SSS")
            .pattern("S S")
            .pattern("S S")
            .input('S', MaterialItems.SELKARIN_SCALE)
            .criterion(hasItem(MaterialItems.SELKARIN_SCALE), conditionsFromItem(MaterialItems.SELKARIN_SCALE))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SELKARIN_BOOTS, 1)
            .pattern("S S")
            .pattern("S S")
            .input('S', MaterialItems.SELKARIN_SCALE)
            .criterion(hasItem(MaterialItems.SELKARIN_SCALE), conditionsFromItem(MaterialItems.SELKARIN_SCALE))
            .offerTo(consumer)

            // Itrioch
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.CANOPY_CROWN, 1)
            .pattern("III")
            .pattern("I I")
            .input('I', IngotItems.ITRIOCH_INGOT)
            .criterion(hasItem(IngotItems.ITRIOCH_INGOT), conditionsFromItem(IngotItems.ITRIOCH_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.BARKPLATE, 1)
            .pattern("I I")
            .pattern("III")
            .pattern("III")
            .input('I', IngotItems.ITRIOCH_INGOT)
            .criterion(hasItem(IngotItems.ITRIOCH_INGOT), conditionsFromItem(IngotItems.ITRIOCH_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ROOTED_GREAVES, 1)
            .pattern("III")
            .pattern("I I")
            .pattern("I I")
            .input('I', IngotItems.ITRIOCH_INGOT)
            .criterion(hasItem(IngotItems.ITRIOCH_INGOT), conditionsFromItem(IngotItems.ITRIOCH_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SPORE_STRIDERS, 1)
            .pattern("I I")
            .pattern("I I")
            .input('I', IngotItems.ITRIOCH_INGOT)
            .criterion(hasItem(IngotItems.ITRIOCH_INGOT), conditionsFromItem(IngotItems.ITRIOCH_INGOT))
            .offerTo(consumer)

            // Oblivium

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ERASURE_GAZE, 1)
            .pattern("OOO")
            .pattern("O O")
            .input('O', IngotItems.OBLIVIUM_STEEL)
            .criterion(hasItem(IngotItems.OBLIVIUM_STEEL), conditionsFromItem(IngotItems.OBLIVIUM_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.NULLHEART, 1)
            .pattern("O O")
            .pattern("OOO")
            .pattern("OOO")
            .input('O', IngotItems.OBLIVIUM_STEEL)
            .criterion(hasItem(IngotItems.OBLIVIUM_STEEL), conditionsFromItem(IngotItems.OBLIVIUM_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.GRAVITON_GUARDS, 1)
            .pattern("OOO")
            .pattern("O O")
            .pattern("O O")
            .input('O', IngotItems.OBLIVIUM_STEEL)
            .criterion(hasItem(IngotItems.OBLIVIUM_STEEL), conditionsFromItem(IngotItems.OBLIVIUM_STEEL))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ABYSS_WALKERS, 1)
            .pattern("O O")
            .pattern("O O")
            .input('O', IngotItems.OBLIVIUM_STEEL)
            .criterion(hasItem(IngotItems.OBLIVIUM_STEEL), conditionsFromItem(IngotItems.OBLIVIUM_STEEL))
            .offerTo(consumer)

            // Skyline

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SKYLINE_NECKLACE, 1)
            .pattern("KKK")
            .pattern("K K")
            .input('K', IngotItems.SKYLINE_INGOT)
            .criterion(hasItem(IngotItems.SKYLINE_INGOT), conditionsFromItem(IngotItems.SKYLINE_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SKYLINE_CHESTPLATE, 1)
            .pattern("K K")
            .pattern("KKK")
            .pattern("KKK")
            .input('K', IngotItems.SKYLINE_INGOT)
            .criterion(hasItem(IngotItems.SKYLINE_INGOT), conditionsFromItem(IngotItems.SKYLINE_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SKYLINE_LEGGINGS, 1)
            .pattern("KKK")
            .pattern("K K")
            .pattern("K K")
            .input('K', IngotItems.SKYLINE_INGOT)
            .criterion(hasItem(IngotItems.SKYLINE_INGOT), conditionsFromItem(IngotItems.SKYLINE_INGOT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.SKYLINE_BOOTS, 1)
            .pattern("K K")
            .pattern("K K")
            .input('K', IngotItems.SKYLINE_INGOT)
            .criterion(hasItem(IngotItems.SKYLINE_INGOT), conditionsFromItem(IngotItems.SKYLINE_INGOT))
            .offerTo(consumer)

        // Angelic

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ANGELIC_HALO, 1)
            .pattern("KKK")
            .pattern("K K")
            .input('K', MaterialItems.ANGELIC_REMNANT)
            .criterion(hasItem(MaterialItems.ANGELIC_REMNANT), conditionsFromItem(MaterialItems.ANGELIC_REMNANT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ANGELIC_CHESTPLATE, 1)
            .pattern("K K")
            .pattern("KKK")
            .pattern("KKK")
            .input('K', MaterialItems.ANGELIC_REMNANT)
            .criterion(hasItem(MaterialItems.ANGELIC_REMNANT), conditionsFromItem(MaterialItems.ANGELIC_REMNANT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ANGELIC_LEGGINGS, 1)
            .pattern("KKK")
            .pattern("K K")
            .pattern("K K")
            .input('K', MaterialItems.ANGELIC_REMNANT)
            .criterion(hasItem(MaterialItems.ANGELIC_REMNANT), conditionsFromItem(MaterialItems.ANGELIC_REMNANT))
            .offerTo(consumer)

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ArmourItems.ANGELIC_BOOTS, 1)
            .pattern("K K")
            .pattern("K K")
            .input('K', MaterialItems.ANGELIC_REMNANT)
            .criterion(hasItem(MaterialItems.ANGELIC_REMNANT), conditionsFromItem(MaterialItems.ANGELIC_REMNANT))
            .offerTo(consumer)
        }
}