package com.frezzcoding.androidinterview.ui.introduction

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.frezzcoding.androidinterview.R
import com.frezzcoding.androidinterview.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_first_tutorial.*


class FirstTutorialFragment : BaseFragment(R.layout.fragment_first_tutorial) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun initView() {
        setListeners()

    }

    private fun setListeners() {
        btn_first_intro_complete.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_firstTutorialFragment_to_secondTutorialFragment)
        }

    }

}