package com.example.dashboardproject.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/dashboardproject/di/module/ViewModelFactoryModule;", "", "()V", "provideContactProviderViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "apiCalls", "Lcom/example/dashboardproject/Repository/ApiCalls;", "mApplication", "Landroid/app/Application;", "databaseValue", "Lcom/example/dashboardproject/database/PNDatabase;", "app_debug"})
public final class ViewModelFactoryModule {
    
    public ViewModelFactoryModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory provideContactProviderViewModelFactory(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.Repository.ApiCalls apiCalls, @org.jetbrains.annotations.NotNull
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.database.PNDatabase databaseValue) {
        return null;
    }
}