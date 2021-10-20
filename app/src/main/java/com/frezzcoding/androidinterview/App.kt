package com.frezzcoding.androidinterview

import android.app.Application
import com.frezzcoding.androidinterview.util.RemoteConfigManager
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    var remoteConfig = RemoteConfigManager()

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.tag(TAG).d("App onCreate()")
        getRemoteConfigValue()
    }


    private fun getRemoteConfigValue() {
        remoteConfig.remoteConfig.fetchAndActivate()
            .addOnSuccessListener { newlyFetched ->
                //get testParameter value from firebase
                val value = Firebase.remoteConfig.getString("testParameter")
                //store or use value from firebase
            }
    }

    companion object {
        const val TAG = "TAG"
    }

}