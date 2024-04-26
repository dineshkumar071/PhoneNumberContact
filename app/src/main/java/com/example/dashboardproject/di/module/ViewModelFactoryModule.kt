package com.example.dashboardproject.di.module

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.example.dashboardproject.Repository.ApiCalls
import com.example.dashboardproject.database.PNDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class ViewModelFactoryModule {

    @Provides
    @Singleton
    fun provideContactProviderViewModelFactory(apiCalls: ApiCalls,mApplication: Application,databaseValue:PNDatabase): ViewModelProvider.Factory{
        return  ViewModelFactory(mApplication,apiCalls,databaseValue)
    }

}