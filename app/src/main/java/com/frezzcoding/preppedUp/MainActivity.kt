package com.frezzcoding.preppedUp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.preppedUp.R

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