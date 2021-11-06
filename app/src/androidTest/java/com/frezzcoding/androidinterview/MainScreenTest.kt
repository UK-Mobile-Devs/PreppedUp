package com.frezzcoding.androidinterview

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.frezzcoding.androidinterview.ui.main.MainActivity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    /*
        Test whether bottom navigation bar navigates to correct fragments
        Test whether all bottom navigation components are clickable
     */

    @Test
    fun is_quiz_fragment_displayed_by_default() {
        //verify
        onView(withId(R.id.layout_quiz))
            .check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun bottom_navigate_To_Social_Fragment() {
        //nav directorsfragment
        onView(withId(R.id.socialFragment)).perform(click())

        //verify
        onView(withId(R.id.layout_social))
            .check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun bottom_navigate_To_Quiz_Fragment() {
        //nav directorsfragment
        onView(withId(R.id.quizFragment)).perform(click())

        //verify
        onView(withId(R.id.layout_quiz))
            .check(ViewAssertions.matches(isDisplayed()))
    }

    @Test
    fun bottom_navigate_To_Account_Fragment() {
        //nav directorsfragment
        onView(withId(R.id.accountFragment)).perform(click())

        //verify
        onView(withId(R.id.layout_account))
            .check(ViewAssertions.matches(isDisplayed()))
    }
}