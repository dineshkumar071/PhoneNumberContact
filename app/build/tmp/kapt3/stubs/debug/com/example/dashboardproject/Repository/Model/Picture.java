package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R&\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/Picture;", "", "()V", "id", "Lcom/example/dashboardproject/Repository/Model/Id;", "getId$annotations", "getId", "()Lcom/example/dashboardproject/Repository/Model/Id;", "setId", "(Lcom/example/dashboardproject/Repository/Model/Id;)V", "large", "", "getLarge$annotations", "getLarge", "()Ljava/lang/String;", "setLarge", "(Ljava/lang/String;)V", "medium", "getMedium$annotations", "getMedium", "setMedium", "thumbnail", "getThumbnail$annotations", "getThumbnail", "setThumbnail", "app_debug"})
@androidx.room.Entity
public final class Picture {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.Ignore
    @org.jetbrains.annotations.Nullable
    private com.example.dashboardproject.Repository.Model.Id id;
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "large")
    @org.jetbrains.annotations.Nullable
    private java.lang.String large;
    @androidx.room.ColumnInfo(name = "medium")
    @org.jetbrains.annotations.Nullable
    private java.lang.String medium;
    @androidx.room.ColumnInfo(name = "thumbnail")
    @org.jetbrains.annotations.Nullable
    private java.lang.String thumbnail;
    
    public Picture() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.dashboardproject.Repository.Model.Id getId() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "id")
    @java.lang.Deprecated
    public static void getId$annotations() {
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    com.example.dashboardproject.Repository.Model.Id p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLarge() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "large")
    @java.lang.Deprecated
    public static void getLarge$annotations() {
    }
    
    public final void setLarge(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMedium() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "medium")
    @java.lang.Deprecated
    public static void getMedium$annotations() {
    }
    
    public final void setMedium(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThumbnail() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "thumbnail")
    @java.lang.Deprecated
    public static void getThumbnail$annotations() {
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}