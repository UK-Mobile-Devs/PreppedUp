package com.frezzcoding.androidinterview.ui.introduction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.frezzcoding.androidinterview.R
import kotlinx.android.synthetic.main.fragment_first_tutorial.view.*


class FirstTutorialFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_tutorial, container, false)
        view.textview1.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_firstTutorialFragment_to_secondTutorialFragment)}
        return view
    }

}