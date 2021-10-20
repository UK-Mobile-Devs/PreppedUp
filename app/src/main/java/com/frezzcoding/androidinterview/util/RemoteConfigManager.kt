package com.frezzcoding.androidinterview.util


import com.frezzcoding.androidinterview.R
import com.google.firebase.ktx.BuildConfig
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings

class RemoteConfigManager {

    private val minimumFetchIntervalInSeconds =
        if (BuildConfig.FLAVOR == "dev") // If making a dev build
            10L // 10 seconds
        else
            31200L // 12 hours

    val remoteConfig: FirebaseRemoteConfig by lazy {
        Firebase.remoteConfig.apply {
            setConfigSettingsAsync(
                remoteConfigSettings {
                    minimumFetchIntervalInSeconds = this@RemoteConfigManager.minimumFetchIntervalInSeconds
                }
            )
            setDefaultsAsync(R.xml.remote_config_values)
        }
    }

}