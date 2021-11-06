package com.frezzcoding.androidinterview

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.frezzcoding.androidinterview.ui.main.MainActivity
import com.frezzcoding.androidinterview.util.DataStorePreferences
import org.junit.Before
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class IntroScreenTest {

    lateinit var mockDataStorePreferences: DataStorePreferences

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        mockDataStorePreferences = DataStorePreferences(ApplicationProvider.getApplicationContext())
    }


}