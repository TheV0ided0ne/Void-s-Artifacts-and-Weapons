package vee.vaaw

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import vee.vaaw.util.EffectHelper
import vee.vaaw.util.ItemHelper
import software.bernie.geckolib.GeckoLib

object Vaaw : ModInitializer {

    const val MOD_ID = "vaaw"
    val logger: Logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("VAAW is now initializing.")

        GeckoLib.initialize()

        ItemHelper.initializeItems()
        ItemHelper.initializeItemGroups()
        EffectHelper.initializeEffects()
    }

}