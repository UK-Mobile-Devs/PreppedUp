package com.frezzcoding.androidinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        authenticate()
        registerObserver()
        setupViews()
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