package vee.vaaw.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import nuxlox.nuxon.item.ItemRegistrator
import vee.vaaw.item.type.consumable.bread.BreadEightItem
import vee.vaaw.item.type.consumable.bread.BreadEighteenItem
import vee.vaaw.item.type.consumable.bread.BreadElevenItem
import vee.vaaw.item.type.consumable.bread.BreadFifteenItem
import vee.vaaw.item.type.consumable.bread.BreadFiveItem
import vee.vaaw.item.type.consumable.bread.BreadItem
import vee.vaaw.item.type.consumable.bread.BreadThreeItem
import vee.vaaw.item.type.consumable.bread.BreadTwoItem
import vee.vaaw.item.type.consumable.bread.BreadFourItem
import vee.vaaw.item.type.consumable.bread.BreadFourteenItem
import vee.vaaw.item.type.consumable.bread.BreadNineItem
import vee.vaaw.item.type.consumable.bread.BreadNineteenItem
import vee.vaaw.item.type.consumable.bread.BreadSevenItem
import vee.vaaw.item.type.consumable.bread.BreadSeventeenItem
import vee.vaaw.item.type.consumable.bread.BreadSixItem
import vee.vaaw.item.type.consumable.bread.BreadSixteenItem
import vee.vaaw.item.type.consumable.bread.BreadTenItem
import vee.vaaw.item.type.consumable.bread.BreadThirteenItem
import vee.vaaw.item.type.consumable.bread.BreadTwelveItem
import vee.vaaw.item.type.consumable.bread.LehUltimateBaguette

object JokeItems: ItemRegistrator("vaaw") {

    val BREAD_ONE: Item = register(
        "bread_one", Item(FabricItemSettings().maxCount(64)
                .food(BreadItem.BREAD_ONE)))

    val BREAD_TWO: Item = register(
        "bread_two", Item(FabricItemSettings().maxCount(64)
                .food(BreadTwoItem.BREAD_TWO)))

    val BREAD_THREE: Item = register(
        "bread_three", Item(FabricItemSettings().maxCount(64)
                .food(BreadThreeItem.BREAD_THREE)))

    val BREAD_FOUR: Item = register(
        "bread_four", Item(FabricItemSettings().maxCount(64)
                .food(BreadFourItem.BREAD_FOUR)))

    val BREAD_FIVE: Item = register(
        "bread_five", Item(FabricItemSettings().maxCount(64)
                .food(BreadFiveItem.BREAD_FIVE)))

    val BREAD_SIX: Item = register(
        "bread_six", Item(FabricItemSettings().maxCount(64)
                .food(BreadSixItem.BREAD_SIX)))

    val BREAD_SEVEN: Item = register(
        "bread_seven", Item(FabricItemSettings().maxCount(64)
                .food(BreadSevenItem.BREAD_SEVEN)))

    val BREAD_EIGHT: Item = register(
        "bread_eight", Item(FabricItemSettings().maxCount(64)
                .food(BreadEightItem.BREAD_EIGHT)))

    val BREAD_NINE: Item = register(
        "bread_nine", Item(FabricItemSettings().maxCount(64)
                .food(BreadNineItem.BREAD_NINE)))

    val BREAD_TEN: Item = register(
        "bread_ten", Item(FabricItemSettings().maxCount(64)
                .food(BreadTenItem.BREAD_TEN)))

    val BREAD_ELEVEN: Item = register(
        "bread_eleven", Item(FabricItemSettings().maxCount(64)
                .food(BreadElevenItem.BREAD_ELEVEN)))

    val BREAD_TWELVE: Item = register(
        "bread_twelve", Item(FabricItemSettings().maxCount(64)
                .food(BreadTwelveItem.BREAD_TWELVE)))

    val BREAD_THIRTEEN: Item = register(
        "bread_thirteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadThirteenItem.BREAD_THIRTEEN)))

    val BREAD_FOURTEEN: Item = register(
        "bread_fourteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadFourteenItem.BREAD_FOURTEEN)))

    val BREAD_FIFTEEN: Item = register(
        "bread_fifteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadFifteenItem.BREAD_FIFTEEN)))

    val BREAD_SIXTEEN: Item = register(
        "bread_sixteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadSixteenItem.BREAD_SIXTEEN)))

    val BREAD_SEVENTEEN: Item = register(
        "bread_seventeen", Item(FabricItemSettings().maxCount(64)
                .food(BreadSeventeenItem.BREAD_SEVENTEEN)))

    val BREAD_EIGHTEEN: Item = register(
        "bread_eighteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadEighteenItem.BREAD_EIGHTEEN)))

    val BREAD_NINETEEN: Item = register(
        "bread_nineteen", Item(FabricItemSettings().maxCount(64)
                .food(BreadNineteenItem.BREAD_NINETEEN)))

    val LEH_ULTIMATE_BAGUETTE: Item = register(
        "leh_ultimate_baguette", Item(FabricItemSettings().maxCount(64)
                .food(LehUltimateBaguette.LEH_ULTIMATE_BAGUETTE)))

    fun registerItems() {}

}