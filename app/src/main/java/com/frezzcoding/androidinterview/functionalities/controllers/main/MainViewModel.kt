package com.frezzcoding.androidinterview.functionalities.controllers.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frezzcoding.androidinterview.functionalities.usecase.main.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainUseCase: MainUseCase
) : ViewModel() {

    fun getIntroState() {
        viewModelScope.launch {
            var result = mainUseCase.getIntroductionCompletedState()
        }
    }


}