package com.frezzcoding.androidinterview.util.di

import com.frezzcoding.androidinterview.functionalities.usecase.main.MainUseCase
import com.frezzcoding.androidinterview.functionalities.usecase.main.MainUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMainUseCase(repo: MainUseCaseImpl): MainUseCase


}