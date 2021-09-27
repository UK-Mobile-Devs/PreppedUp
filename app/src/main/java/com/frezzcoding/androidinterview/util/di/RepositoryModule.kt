package com.frezzcoding.androidinterview.util.di

import com.frezzcoding.androidinterview.database.StateRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    //@Binds
    //abstract fun bindStateRepo(repo: StateRepositoryImpl): StateRepository


}