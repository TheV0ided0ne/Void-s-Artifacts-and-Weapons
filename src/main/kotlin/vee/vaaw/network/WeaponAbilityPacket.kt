package vee.vaaw.network

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
import net.minecraft.util.Identifier

object WeaponAbilityPacket {

    val ACTIVATE_WEAPON_ABILITY_PACKET = Identifier("vaaw", "activate_wea_ability")

    fun registerServerPacket() {

        ServerPlayNetworking.registerGlobalReceiver(ACTIVATE_WEAPON_ABILITY_PACKET) {
                server, player, handler, buf, responseSender ->
            server.execute {
                // code
            }
        }

    }
}