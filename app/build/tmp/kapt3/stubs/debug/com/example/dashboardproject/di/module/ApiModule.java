package com.example.dashboardproject.di.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dashboardproject/di/module/ApiModule;", "", "baseUrl", "", "(Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "apiCall", "Lcom/example/dashboardproject/Repository/ApiCalls;", "client", "Lcom/example/dashboardproject/service/TSClient;", "provideGson", "Lcom/google/gson/Gson;", "provideOkHttpClient", "Lokhttp3/OkHttpClient$Builder;", "logger", "Lcom/example/dashboardproject/service/HttpInterceptors;", "provideRetrofitInstance", "gson", "okHttp", "app_debug"})
public final class ApiModule {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String baseUrl = null;
    
    public ApiModule(@org.jetbrains.annotations.NotNull
    java.lang.String baseUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient.Builder provideOkHttpClient(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.service.HttpInterceptors logger) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.service.TSClient provideRetrofitInstance(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient.Builder okHttp) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.Repository.ApiCalls apiCall(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.service.TSClient client) {
        return null;
    }
}