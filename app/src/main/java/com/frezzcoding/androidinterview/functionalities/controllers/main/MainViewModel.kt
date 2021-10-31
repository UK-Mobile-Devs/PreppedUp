package com.frezzcoding.androidinterview.functionalities.controllers.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.frezzcoding.androidinterview.functionalities.usecase.main.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainUseCase: MainUseCase
) : ViewModel() {

    private val _introState = MutableStateFlow<IntroductionState>(IntroductionState.Loading)
    val introState: StateFlow<IntroductionState> = _introState

    fun getIntroState() = viewModelScope.launch {
        _introState.value = IntroductionState.Loading
        mainUseCase.getIntroductionCompletedState().catch {
            _introState.value = IntroductionState.Error("Error obtaining introState")
        }.collect { completed ->
            _introState.value = IntroductionState.SuccessState(completed)
        }
    }


    sealed class IntroductionState {
        data class SuccessState(val completed: Boolean) : IntroductionState()
        object Loading : IntroductionState()
        data class Error(val error: String) : IntroductionState()
    }
}