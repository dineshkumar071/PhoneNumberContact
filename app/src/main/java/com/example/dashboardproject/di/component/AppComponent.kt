package com.example.dashboardproject.di.component

import com.example.dashboardproject.di.module.ActivityModule
import com.example.dashboardproject.di.module.ApiModule
import com.example.dashboardproject.di.module.AppModule
import com.example.dashboardproject.di.module.ViewModelFactoryModule
import com.example.dashboardproject.ui.detail_screen.PNContactFragment
import com.example.dashboardproject.ui.image_poster.PNRandomFragment
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidInjectionModule::class,AppModule::class,ApiModule::class,ViewModelFactoryModule::class,ActivityModule::class])
interface AppComponent {

    fun inject(tsDetailScreenFragment: PNContactFragment)

    fun inject(tsImagePosterFragment: PNRandomFragment)
}