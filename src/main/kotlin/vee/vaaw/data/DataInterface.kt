package vee.vaaw.data

import net.minecraft.server.world.ServerWorld
import vee.vaaw.Vaaw
import vee.vaaw.util.TrinketData

/**
 * [DataInterface] is the API for [DataStorage], allowing for easy and, more importantly, safe usage.
 * This class is what should be used in order to add persistent trinket data.
 */
class DataInterface(
    world: ServerWorld
) {
    val dataStorage = DataStorage.get(world)

    /**
     * [createEntry] will create a new [entry] in persistent storage if the given entry doesn't already exist.
     */
    fun createEntry(entry: TrinketData) {
        if (dataStorage.isDataStored(entry)) { Vaaw.logger.error("Tried to create an already existing data-storage entry."); return }

        dataStorage.addStoredData(entry)
    }

    /**
     * [updateEntry] takes the existing [entry] and the desired [newValue] and updates the stored copy.
     */
    fun updateEntry(entry: TrinketData, newValue: Int) {
        if (!dataStorage.isDataStored(entry)) { Vaaw.logger.error("Tried to update an already existing data-storage entry."); return }

        dataStorage.removeStoredData(entry)
        dataStorage.addStoredData(TrinketData(entry.playerUser, entry.trinketType, newValue))
    }

    /**
     * [removeEntry] removes the provided [entry] if it exists.
     */
    fun removeEntry(entry: TrinketData) {
        if (!dataStorage.isDataStored(entry)) { Vaaw.logger.error("Tried to remove an already existing data-storage entry."); return }

        dataStorage.removeStoredData(entry)
    }

    /**
     * [doesEntryExist] checks if the provided [entry] is stored or not.
     */
    fun doesEntryExist(entry: TrinketData): Boolean {
        return dataStorage.isDataStored(entry)
    }

    /**
     * [getAllEntries] returns every single stored entry in a list.
     */
    fun getAllEntries(): List<TrinketData> {
        return dataStorage.getAllStoredData()
    }
}