package com.frezzcoding.androidinterview

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.frezzcoding.androidinterview.ui.main.SplashscreenActivity
import org.junit.Before
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class SplashScreenTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(SplashscreenActivity::class.java)
    }

    /* TODO
        * check logo visibility
        * check duration of animation
        * check if MainActivity is opened
        * check if Activity transition is faded in
     */

}