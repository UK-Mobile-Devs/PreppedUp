package com.frezzcoding.androidinterview.ui.introduction

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.frezzcoding.androidinterview.R
import kotlinx.android.synthetic.main.fragment_first_tutorial.*


class FirstTutorialFragment : Fragment(R.layout.fragment_first_tutorial) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners(view)
    }

    private fun setListeners(view : View) {
        btn_first_intro_complete.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstTutorialFragment_to_secondTutorialFragment)
        }

    }

}