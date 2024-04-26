package com.example.dashboardproject.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/dashboardproject/di/module/ViewModelModule;", "", "()V", "bindDetailScreenViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/dashboardproject/di/module/ViewModelFactory;", "provideTsDetailScreenViewModel", "Landroidx/lifecycle/ViewModel;", "detailScreenViewModel", "Lcom/example/dashboardproject/ui/detail_screen/PNContactViewModel;", "provideTsImagePostViewModel", "posterViewModel", "Lcom/example/dashboardproject/ui/image_poster/PNRandomViewModel;", "app_debug"})
@kotlin.Suppress(names = {"unused"})
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @ViewModelKey(value = com.example.dashboardproject.ui.image_poster.PNRandomViewModel.class)
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.ViewModel provideTsImagePostViewModel(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.image_poster.PNRandomViewModel posterViewModel);
    
    @dagger.Binds
    @dagger.multibindings.IntoMap
    @ViewModelKey(value = com.example.dashboardproject.ui.detail_screen.PNContactViewModel.class)
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.ViewModel provideTsDetailScreenViewModel(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.detail_screen.PNContactViewModel detailScreenViewModel);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindDetailScreenViewModelFactory(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.di.module.ViewModelFactory factory);
}