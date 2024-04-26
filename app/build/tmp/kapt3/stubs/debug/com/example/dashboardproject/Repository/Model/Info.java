package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R&\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R&\u0010!\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001c\u00a8\u0006%"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/Info;", "", "()V", "id", "Lcom/example/dashboardproject/Repository/Model/Id;", "getId$annotations", "getId", "()Lcom/example/dashboardproject/Repository/Model/Id;", "setId", "(Lcom/example/dashboardproject/Repository/Model/Id;)V", "page", "", "getPage$annotations", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "results", "getResults$annotations", "getResults", "setResults", "seed", "", "getSeed$annotations", "getSeed", "()Ljava/lang/String;", "setSeed", "(Ljava/lang/String;)V", "uid", "getUid$annotations", "getUid", "setUid", "version", "getVersion$annotations", "getVersion", "setVersion", "app_debug"})
@androidx.room.Entity
public final class Info {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "uid")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer uid;
    @androidx.room.Ignore
    @androidx.room.ColumnInfo(name = "id")
    @org.jetbrains.annotations.Nullable
    private com.example.dashboardproject.Repository.Model.Id id;
    @androidx.room.ColumnInfo(name = "seed")
    @org.jetbrains.annotations.Nullable
    private java.lang.String seed;
    @androidx.room.ColumnInfo(name = "results")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer results;
    @androidx.room.ColumnInfo(name = "page")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer page;
    @androidx.room.ColumnInfo(name = "version")
    @org.jetbrains.annotations.Nullable
    private java.lang.String version;
    
    public Info() {
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
    public final java.lang.String getSeed() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "seed")
    @java.lang.Deprecated
    public static void getSeed$annotations() {
    }
    
    public final void setSeed(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getResults() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "results")
    @java.lang.Deprecated
    public static void getResults$annotations() {
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable
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
    public final java.lang.String getVersion() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "version")
    @java.lang.Deprecated
    public static void getVersion$annotations() {
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}