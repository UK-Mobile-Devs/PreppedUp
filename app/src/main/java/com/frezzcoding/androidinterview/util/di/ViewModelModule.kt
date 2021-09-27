package com.frezzcoding.androidinterview.util.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModule {

    /*@Binds
    @IntoMap
    @ViewModelKey(StateViewModel::class)
    abstract fun bindNewScenarioViewModel(viewModel: StateViewModel): ViewModel
*/

}