package com.frezzcoding.androidinterview.ui.introduction

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.frezzcoding.androidinterview.MainActivity
import com.frezzcoding.androidinterview.R
import com.frezzcoding.androidinterview.util.DataStorePreferences
import kotlinx.android.synthetic.main.fragment_second_tutorial.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SecondTutorialFragment : Fragment(R.layout.fragment_second_tutorial) {

    private lateinit var dataStorePreferences: DataStorePreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataStorePreferences = DataStorePreferences(context = requireContext())

        setListeners()
    }

    private fun setListeners() {
        btn_intro_complete.setOnClickListener {
            //todo use datashare to cache if intro was completed
            GlobalScope.launch(Dispatchers.IO) {
                dataStorePreferences.saveIntroStatusToDataStore(true)
                startActivity(Intent(requireContext(), MainActivity::class.java))
            }
        }
    }

}