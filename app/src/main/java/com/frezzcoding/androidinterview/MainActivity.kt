package com.frezzcoding.androidinterview

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.frezzcoding.androidinterview.util.DataStorePreferences
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var dataStorePreferences: DataStorePreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataStorePreferences = DataStorePreferences(context = this@MainActivity)
        checkIntroRequired()
    }

    private fun checkIntroRequired() {
        //check datastore
        GlobalScope.launch(Dispatchers.Main) {
            dataStorePreferences.getIntroStatus().catch {
                throw Exception("dataStore getIntroStatus error")
            }.collect { introCompleted ->
                if (!introCompleted) {
                    firstTimeRun()
                } else {
                    initializeMain()
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