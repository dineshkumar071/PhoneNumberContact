package com.example.dashboardproject.ui.image_poster;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dashboardproject/ui/image_poster/PNRandomViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "mApplication", "Landroid/app/Application;", "apiCalls", "Lcom/example/dashboardproject/Repository/ApiCalls;", "dataBase", "Lcom/example/dashboardproject/database/PNDatabase;", "(Landroid/app/Application;Lcom/example/dashboardproject/Repository/ApiCalls;Lcom/example/dashboardproject/database/PNDatabase;)V", "searchedTrendsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/dashboardproject/Repository/TSResponse;", "Lcom/example/dashboardproject/Repository/Model/Trending;", "getSearchedTrendsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "searchedTrendsLiveData$delegate", "Lkotlin/Lazy;", "trendingLiveData", "getTrendingLiveData", "trendingLiveData$delegate", "app_debug"})
public final class PNRandomViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application mApplication = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.Repository.ApiCalls apiCalls = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.database.PNDatabase dataBase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy trendingLiveData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy searchedTrendsLiveData$delegate = null;
    
    @javax.inject.Inject
    public PNRandomViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.Repository.ApiCalls apiCalls, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.database.PNDatabase dataBase) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.dashboardproject.Repository.TSResponse<com.example.dashboardproject.Repository.Model.Trending>> getTrendingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.dashboardproject.Repository.TSResponse<com.example.dashboardproject.Repository.Model.Trending>> getSearchedTrendsLiveData() {
        return null;
    }
}