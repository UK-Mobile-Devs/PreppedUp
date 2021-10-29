package com.frezzcoding.androidinterview.util.di

import androidx.lifecycle.ViewModel
import com.frezzcoding.androidinterview.functionalities.controllers.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
@InstallIn(SingletonComponent::class)
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindNewMainViewModel(viewModel: MainViewModel): ViewModel


}