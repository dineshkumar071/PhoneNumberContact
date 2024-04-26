package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR(\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR(\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/Trending;", "", "()V", "page", "", "getPage$annotations", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "results", "", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "getResults$annotations", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "totalPages", "getTotalPages$annotations", "getTotalPages", "setTotalPages", "totalResults", "getTotalResults$annotations", "getTotalResults", "setTotalResults", "uid", "getUid$annotations", "getUid", "setUid", "app_debug"})
@androidx.room.Entity
public final class Trending {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "uid")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer uid;
    @androidx.room.ColumnInfo(name = "page")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer page;
    @androidx.room.ColumnInfo(name = "results")
    @androidx.room.Ignore
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> results;
    @androidx.room.ColumnInfo(name = "total_pages")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalPages;
    @androidx.room.ColumnInfo(name = "total_results")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer totalResults;
    
    public Trending() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUid() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "uid")
    @java.lang.Deprecated
    public static void getUid$annotations() {
    }
    
    public final void setUid(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "page")
    @java.lang.Deprecated
    public static void getPage$annotations() {
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> getResults() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "results")
    @java.lang.Deprecated
    public static void getResults$annotations() {
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "total_pages")
    @java.lang.Deprecated
    public static void getTotalPages$annotations() {
    }
    
    public final void setTotalPages(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "total_results")
    @java.lang.Deprecated
    public static void getTotalResults$annotations() {
    }
    
    public final void setTotalResults(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
}