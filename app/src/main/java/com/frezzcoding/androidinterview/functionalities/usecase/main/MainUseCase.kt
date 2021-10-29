package com.frezzcoding.androidinterview.functionalities.usecase.main

import kotlinx.coroutines.flow.Flow

interface MainUseCase {

    suspend fun getIntroductionCompletedState() : Flow<Boolean>

}