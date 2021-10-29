package com.frezzcoding.androidinterview.util.di

import android.content.Context
import com.frezzcoding.androidinterview.util.DataStorePreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDataStore(@ApplicationContext appContext : Context) = DataStorePreferences(appContext)

    /*
    @Provides
    @Singleton
    fun provideStateDatabase(@ApplicationContext appContext: Context): StateDatabase {
        //create database here
    }*/


}