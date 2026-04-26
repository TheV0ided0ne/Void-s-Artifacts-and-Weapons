package vee.vaaw.network

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
import net.minecraft.util.Identifier

object ArmourAbilityPacket {

    val ACTIVATE_ARMOUR_ABILITY_PACKET = Identifier("vaaw", "activate_armour_ability")

    fun registerServerPacket() {

        ServerPlayNetworking.registerGlobalReceiver(ACTIVATE_ARMOUR_ABILITY_PACKET) {
            server, player, handler, buf, responseSender ->
            server.execute {
                // code
            }
        }

    }
}