package vee.vaaw.client

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs
import vee.vaaw.client.binds.Keybinds
import vee.vaaw.network.ArmourAbilityPacket
import vee.vaaw.network.WeaponAbilityPacket


object VaawClient : ClientModInitializer {
    override fun onInitializeClient() {
        Keybinds.initializeKeybinds()
        registerKeybindHandlers()
    }

    private fun registerKeybindHandlers() {
        ClientTickEvents.END_CLIENT_TICK.register { client ->

            while (Keybinds.ACTIVATE_ARMOUR_ABILITY.wasPressed()) {
                ClientPlayNetworking.send(
                    ArmourAbilityPacket.ACTIVATE_ARMOUR_ABILITY_PACKET,
                    PacketByteBufs.create()
                )
            }

            while (Keybinds.ACTIVATE_WEAPON_ABILITY.wasPressed()) {
                ClientPlayNetworking.send(
                    WeaponAbilityPacket.ACTIVATE_WEAPON_ABILITY_PACKET,
                    PacketByteBufs.create()
                )
            }

        }
    }

}
