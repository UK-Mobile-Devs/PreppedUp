package com.frezzcoding.androidinterview

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Timber.tag(TAG).d("App onCreate()")
    }

    companion object {
        const val TAG = "TAG"
    }

}