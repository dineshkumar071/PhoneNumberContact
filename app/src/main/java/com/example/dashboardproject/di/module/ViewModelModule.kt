package com.example.dashboardproject.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dashboardproject.ui.detail_screen.PNContactViewModel
import com.example.dashboardproject.ui.image_poster.PNRandomViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Named
import kotlin.reflect.KClass

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(PNRandomViewModel::class)
    abstract fun provideTsImagePostViewModel(posterViewModel: PNRandomViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PNContactViewModel::class)
    abstract fun provideTsDetailScreenViewModel(detailScreenViewModel: PNContactViewModel):ViewModel

    @Binds
    abstract fun bindDetailScreenViewModelFactory( factory: ViewModelFactory): ViewModelProvider.Factory

}

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)