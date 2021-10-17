package com.frezzcoding.androidinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        authenticate()
        registerObserver()
        setupViews()

        navController = findNavController(R.id.navHostFragment)

    }

    override fun onResume() {
        super.onResume()
    }

    private fun authenticate(){

    }

    private fun setupViews(){
        //set up navbar & actionbar here
    }

    private fun registerObserver(){
        //handle authentication here
    }

}