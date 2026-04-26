package vee.vaaw.util

import vee.vaaw.network.*

object PacketHelper {

    fun initializePackets() {
        ArmourAbilityPacket.registerServerPacket()
    }

}