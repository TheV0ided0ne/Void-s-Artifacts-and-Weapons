package vee.vaaw.data

import net.minecraft.nbt.NbtCompound
import net.minecraft.nbt.NbtElement
import net.minecraft.nbt.NbtList
import net.minecraft.server.world.ServerWorld
import net.minecraft.world.PersistentState
import vee.vaaw.util.TrinketData

/**
 * [DataStorage] is responsible for allowing the saving of trinket data to the server.
 *
 * Do NOT create instances of this class. Instead, use [DataInterface].
 */
class DataStorage : PersistentState() {

    val storedData = mutableListOf<TrinketData>()

    companion object {
        const val DATA_NAME = "vaaw_data_storage"

        /**
         * Fetches the [DataStorage] instance from the server.
         */
        fun get(world: ServerWorld): DataStorage {
            return world.persistentStateManager.getOrCreate(
                ::fromNbt,
                ::DataStorage,
                DATA_NAME,
            )
        }

        /**
         * Loads the saved data into the requested [DataStorage] instance provided to [get].
         */
        fun fromNbt(nbt: NbtCompound): DataStorage {
            val dataStorage = DataStorage()

            if (nbt.contains("vaaw_data", NbtElement.LIST_TYPE.toInt())) {
                val nbtData: NbtList = nbt.getList("vaaw_data", NbtElement.COMPOUND_TYPE.toInt())
                for (i in 0 until nbtData.size) {
                    dataStorage.storedData.add(TrinketData.fromNbt(nbtData.getCompound(i)))
                }
            }

            return dataStorage
        }

    }

    /**
     * Writes the saved [storedData].
     */
    override fun writeNbt(nbt: NbtCompound): NbtCompound {
        val nbtData = NbtList()

        storedData.forEach { data ->
            nbtData.add(data.toNbt())
        }
        nbt.put("vaaw_data", nbtData)

        return nbt
    }

    /**
     * [addStoredData] adds the provided [data] to [storedData] and instructs Minecraft to update the stored NBT.
     */
    fun addStoredData(data: TrinketData) {
        storedData.add(data)
        markDirty()
    }

    /**
     * [removeStoredData] removes the provided [data] from [storedData] and instructs Minecraft to update the stored NBT.
     */
    fun removeStoredData(data: TrinketData) {
        storedData.remove(data)
        markDirty()
    }

    /**
     * [isDataStored] checks if the provided [data] exists within [storedData] and returns true/false.
     */
    fun isDataStored(data: TrinketData): Boolean {
        return storedData.contains(data)
    }

    /**
     * [getAllStoredData] returns [storedData].
     */
    fun getAllStoredData(): List<TrinketData> {
        return storedData
    }
}