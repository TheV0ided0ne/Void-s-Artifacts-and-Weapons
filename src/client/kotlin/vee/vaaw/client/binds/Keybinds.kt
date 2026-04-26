package vee.vaaw.client.binds

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.option.KeyBinding
import net.minecraft.client.util.InputUtil
import org.lwjgl.glfw.GLFW

object Keybinds {

    val ACTIVATE_ARMOUR_ABILITY: KeyBinding = KeyBindingHelper.registerKeyBinding(
        KeyBinding(
            "key.vaaw.activate_armour_ability",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_H,
            "category.vaaw.general"
        )
    )

    val ACTIVATE_WEAPON_ABILITY: KeyBinding = KeyBindingHelper.registerKeyBinding(
        KeyBinding(
            "key.vaaw.activate_weapon_ability",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_V,
            "category.vaaw.general"
        )
    )

    fun initializeKeybinds() {}

}