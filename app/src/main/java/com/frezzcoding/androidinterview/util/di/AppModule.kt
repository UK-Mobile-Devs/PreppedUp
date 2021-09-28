package com.frezzcoding.androidinterview.util.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /*
    @Provides
    @Singleton
    fun provideStateDatabase(@ApplicationContext appContext: Context): StateDatabase {
        //create database here
    }*/


}