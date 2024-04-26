package com.example.dashboardproject.di.module

import android.app.Application
import com.example.dashboardproject.database.PNDatabase
import dagger.Module
import dagger.Provides

@Module
class AppModule(val mApplication : Application) {

    @Provides
    fun provideApplication():Application = mApplication

    @Provides
    fun provideDataBaseInstance() :PNDatabase = PNDatabase.getInstance(mApplication)
}