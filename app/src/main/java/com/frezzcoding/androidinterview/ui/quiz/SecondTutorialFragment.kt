package com.frezzcoding.androidinterview.ui.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.frezzcoding.androidinterview.R
import kotlinx.android.synthetic.main.fragment_first_tutorial.view.*
import kotlinx.android.synthetic.main.fragment_first_tutorial.view.textview1
import kotlinx.android.synthetic.main.fragment_second_tutorial.view.*


class SecondTutorialFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_tutorial, container, false)
        view.textview2.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_secondTutorialFragment_to_homeFragment)}
        return view
    }

}