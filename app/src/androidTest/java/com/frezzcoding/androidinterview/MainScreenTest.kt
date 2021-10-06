package com.frezzcoding.androidinterview

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

}