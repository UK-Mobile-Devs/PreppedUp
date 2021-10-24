package com.frezzcoding.androidinterview.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

class DataStorePreferences(val context: Context) {


    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(
            name = "INTRO_DATASTORE"
        )

        private val INTRO_COMPLETED = booleanPreferencesKey("introCompleted")
    }

    suspend fun saveIntroStatusToDataStore(completed: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[INTRO_COMPLETED] = completed
        }
    }

    suspend fun getIntroStatus() = context.dataStore.data.map {
        it[INTRO_COMPLETED] ?: false
    }

}