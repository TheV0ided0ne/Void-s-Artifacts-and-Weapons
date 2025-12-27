package vee.vaaw;

import vee.vaaw.util.EffectHelper;
import vee.vaaw.util.ItemHelper;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vaaw implements ModInitializer {

    public static final String MOD_ID = "vaaw";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initialising Void's Artifacts and Weapons.");
        ItemHelper.initializeItems();
        ItemHelper.initializeItemGroups();
        EffectHelper.INSTANCE.intialiseEffects();
    }
}
