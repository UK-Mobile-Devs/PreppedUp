package com.frezzcoding.androidinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(isIntroRequired()){
            firstTimerun()
        }else {
            setContentView(R.layout.activity_main)
            authenticate()
            registerObserver()
            setupViews()
        }
    }

    private fun isIntroRequired() : Boolean {
        //check datastore

        return true
    }

    override fun onResume() {
        super.onResume()
    }

    private fun authenticate(){

    }

    private fun firstTimerun(){
        // Function gets called only for first run
        Log.d("Comments", "First time")
        setContentView(R.layout.activity_intro)
        navController = Navigation.findNavController(
                this,
                R.id.nav_host_intro_fragment
        )
    }

    private fun setupViews(){
        //set up navbar & actionbar here
        navController = Navigation.findNavController(
            this,
            R.id.nav_host_fragment
        )
        setupBottomNavMenu(navController)
    }

    private fun registerObserver(){
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