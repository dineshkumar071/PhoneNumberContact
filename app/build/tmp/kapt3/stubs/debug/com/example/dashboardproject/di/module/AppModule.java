package com.example.dashboardproject.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/dashboardproject/di/module/AppModule;", "", "mApplication", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getMApplication", "()Landroid/app/Application;", "provideApplication", "provideDataBaseInstance", "Lcom/example/dashboardproject/database/PNDatabase;", "app_debug"})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application mApplication = null;
    
    public AppModule(@org.jetbrains.annotations.NotNull
    android.app.Application mApplication) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getMApplication() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.database.PNDatabase provideDataBaseInstance() {
        return null;
    }
}