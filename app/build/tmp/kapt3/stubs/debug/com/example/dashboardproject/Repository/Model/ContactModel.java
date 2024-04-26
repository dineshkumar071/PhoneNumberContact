package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\u0019\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/ContactModel;", "", "()V", "info", "Lcom/example/dashboardproject/Repository/Model/Info;", "getInfo$annotations", "getInfo", "()Lcom/example/dashboardproject/Repository/Model/Info;", "setInfo", "(Lcom/example/dashboardproject/Repository/Model/Info;)V", "results", "", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "getResults$annotations", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "uid", "", "getUid$annotations", "getUid", "()Ljava/lang/Integer;", "setUid", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
@androidx.room.Entity
public final class ContactModel {
    @androidx.room.ColumnInfo(name = "results")
    @androidx.room.Ignore
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> results;
    @androidx.room.ColumnInfo(name = "info")
    @androidx.room.Ignore
    @org.jetbrains.annotations.Nullable
    private com.example.dashboardproject.Repository.Model.Info info;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "uid")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer uid;
    
    public ContactModel() {
        super();
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
    public final com.example.dashboardproject.Repository.Model.Info getInfo() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "info")
    @java.lang.Deprecated
    public static void getInfo$annotations() {
    }
    
    public final void setInfo(@org.jetbrains.annotations.Nullable
    com.example.dashboardproject.Repository.Model.Info p0) {
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
}