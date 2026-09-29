package pe.edu.upc.easysneaker.features.auth.infrastructure.local

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

private val Context.sessionDataStore by preferencesDataStore (name = "auth_preferences")

class AuthDataStore @Inject constructor(@ApplicationContext private val context: Context) {

    companion object {
        val TOKEN = stringPreferencesKey("access_token")
    }

    suspend fun saveToken(token: String) {
        context.sessionDataStore.edit { preferences ->
            preferences[TOKEN] = token
        }
    }
}