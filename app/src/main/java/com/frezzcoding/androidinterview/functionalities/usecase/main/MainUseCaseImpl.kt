package com.frezzcoding.androidinterview.functionalities.usecase.main

import com.frezzcoding.androidinterview.util.DataStorePreferences
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainUseCaseImpl @Inject constructor(
    var dataStorePreferences: DataStorePreferences
) : MainUseCase {

    override suspend fun getIntroductionCompletedState(): Flow<Boolean> {
        return dataStorePreferences.getIntroStatus()
    }

}