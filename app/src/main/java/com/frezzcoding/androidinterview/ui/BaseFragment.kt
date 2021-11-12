package com.frezzcoding.androidinterview.ui

import androidx.fragment.app.Fragment

abstract class BaseFragment(layout: Int) : Fragment(layout) {

    abstract fun initView()

}