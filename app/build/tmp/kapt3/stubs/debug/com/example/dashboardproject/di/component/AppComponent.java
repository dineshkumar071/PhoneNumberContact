package com.example.dashboardproject.di.component;

@javax.inject.Singleton
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.example.dashboardproject.di.module.AppModule.class, com.example.dashboardproject.di.module.ApiModule.class, com.example.dashboardproject.di.module.ViewModelFactoryModule.class, com.example.dashboardproject.di.module.ActivityModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/dashboardproject/di/component/AppComponent;", "", "inject", "", "tsDetailScreenFragment", "Lcom/example/dashboardproject/ui/detail_screen/PNContactFragment;", "tsImagePosterFragment", "Lcom/example/dashboardproject/ui/image_poster/PNRandomFragment;", "app_debug"})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.detail_screen.PNContactFragment tsDetailScreenFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.image_poster.PNRandomFragment tsImagePosterFragment);
}