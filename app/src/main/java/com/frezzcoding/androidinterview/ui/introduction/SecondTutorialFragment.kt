package com.frezzcoding.androidinterview.ui.introduction

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.frezzcoding.androidinterview.MainActivity
import com.frezzcoding.androidinterview.R
import kotlinx.android.synthetic.main.fragment_second_tutorial.*


class SecondTutorialFragment : Fragment(R.layout.fragment_second_tutorial) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()
    }

    private fun setListeners() {
        btn_intro_complete.setOnClickListener {
            //todo use datashare to cache if intro was completed
            startActivity(Intent(this.context, MainActivity::class.java))
        }
    }

}