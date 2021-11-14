package com.frezzcoding.androidinterview.ui.introduction

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.frezzcoding.androidinterview.ui.main.MainActivity
import com.frezzcoding.androidinterview.R
import com.frezzcoding.androidinterview.ui.BaseFragment
import com.frezzcoding.androidinterview.util.DataStorePreferences
import kotlinx.android.synthetic.main.fragment_second_tutorial.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SecondTutorialFragment : BaseFragment(R.layout.fragment_second_tutorial) {

    private lateinit var dataStorePreferences: DataStorePreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataStorePreferences = DataStorePreferences(context = requireContext())

        initView()
    }

    override fun initView() {
        setListeners()
    }

    private fun setListeners() {
        btn_intro_complete.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                dataStorePreferences.saveIntroStatusToDataStore(true)
            }
            val i = Intent(requireActivity(), MainActivity::class.java)
            startActivity(i, ActivityOptions.makeSceneTransitionAnimation(requireActivity()).toBundle())
        }
    }

}