package vee.vaaw.util

import net.minecraft.nbt.NbtCompound

data class TrinketData(
    val playerUser: String,
    val trinketType: String,
    val value: Int
) {

    fun toNbt(): NbtCompound {
        val nbt = NbtCompound()
        nbt.putString("playerUser", playerUser)
        nbt.putString("trinketType", trinketType)
        nbt.putInt("value", value)
        return nbt
    }

    companion object {

        fun fromNbt(nbt: NbtCompound): TrinketData {
            return TrinketData(
                playerUser = nbt.getString("playerUser"),
                trinketType = nbt.getString("trinketType"),
                value = nbt.getInt("value")
            )
        }

    }

}
