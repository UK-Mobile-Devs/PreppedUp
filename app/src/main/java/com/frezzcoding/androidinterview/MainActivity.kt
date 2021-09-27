package com.frezzcoding.androidinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerObserver()

    }

    override fun onResume() {
        super.onResume()
    }

    private fun registerObserver(){

    }

}