package com.example.dashboardproject.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/dashboardproject/common/TSApplication;", "Landroid/app/Application;", "()V", "mAppComponent", "Lcom/example/dashboardproject/di/component/AppComponent;", "getComponent", "onCreate", "", "Companion", "app_debug"})
public final class TSApplication extends android.app.Application {
    private com.example.dashboardproject.di.component.AppComponent mAppComponent;
    @org.jetbrains.annotations.Nullable
    private static com.example.dashboardproject.common.TSApplication instance;
    @org.jetbrains.annotations.NotNull
    public static final com.example.dashboardproject.common.TSApplication.Companion Companion = null;
    
    public TSApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.di.component.AppComponent getComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final com.example.dashboardproject.common.TSApplication getInstance() {
        return null;
    }
    
    public static final void setInstance(@org.jetbrains.annotations.Nullable
    com.example.dashboardproject.common.TSApplication p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/dashboardproject/common/TSApplication$Companion;", "", "()V", "instance", "Lcom/example/dashboardproject/common/TSApplication;", "getInstance$annotations", "getInstance", "()Lcom/example/dashboardproject/common/TSApplication;", "setInstance", "(Lcom/example/dashboardproject/common/TSApplication;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.dashboardproject.common.TSApplication getInstance() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getInstance$annotations() {
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable
        com.example.dashboardproject.common.TSApplication p0) {
        }
    }
}