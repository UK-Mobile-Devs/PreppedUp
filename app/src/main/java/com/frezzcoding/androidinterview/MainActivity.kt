package com.frezzcoding.androidinterview

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.frezzcoding.androidinterview.functionalities.controllers.main.MainViewModel
import com.frezzcoding.androidinterview.functionalities.controllers.main.MainViewModel.IntroductionState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect


@InternalCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getIntroState()

        //navigate to correct activity
        checkIntroRequired()
    }

    private fun checkIntroRequired() {
        lifecycleScope.launchWhenStarted {
            viewModel.introState.collect {
                when (it) {
                    is IntroductionState.SuccessState -> {
                        if (it.completed) initializeMain() else firstTimeRun()
                    }
                    is IntroductionState.Loading -> {
                        //handle loading
                    }
                    is IntroductionState.Error -> {
                        throw Exception(it.error)
                    }
                }
            }
        }
    }

    private fun initializeMain() {
        setContentView(R.layout.activity_main)
        authenticate()
        registerObserver()
        setupViews()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun authenticate() {

    }

    private fun firstTimeRun() {
        // Function gets called only for first run
        Log.d("Comments", "First time")
        setContentView(R.layout.activity_intro)
        navController = Navigation.findNavController(
            this,
            R.id.nav_host_intro_fragment
        )
    }

    private fun setupViews() {
        //set up navbar & actionbar here
        navController = Navigation.findNavController(
            this,
            R.id.nav_host_fragment
        )
        setupBottomNavMenu(navController)
    }

    private fun registerObserver() {
        //handle authentication here
    }

    private fun setupBottomNavMenu(navController: NavController) {
        bottom_nav?.let {
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = Navigation.findNavController(
            this,
            R.id.nav_host_fragment
        )
        val navigated = NavigationUI.onNavDestinationSelected(item, navController)
        return navigated || super.onOptionsItemSelected(item)
    }

}