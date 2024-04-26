package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR&\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/Name;", "", "()V", "first", "", "getFirst$annotations", "getFirst", "()Ljava/lang/String;", "setFirst", "(Ljava/lang/String;)V", "id", "Lcom/example/dashboardproject/Repository/Model/Id;", "getId$annotations", "getId", "()Lcom/example/dashboardproject/Repository/Model/Id;", "setId", "(Lcom/example/dashboardproject/Repository/Model/Id;)V", "last", "getLast$annotations", "getLast", "setLast", "title", "getTitle$annotations", "getTitle", "setTitle", "uid", "", "getUid", "()I", "setUid", "(I)V", "app_debug"})
@androidx.room.Entity
public final class Name {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.Ignore
    @org.jetbrains.annotations.Nullable
    private com.example.dashboardproject.Repository.Model.Id id;
    @androidx.room.ColumnInfo(name = "title")
    @org.jetbrains.annotations.Nullable
    private java.lang.String title;
    @androidx.room.ColumnInfo(name = "first")
    @org.jetbrains.annotations.Nullable
    private java.lang.String first;
    @androidx.room.ColumnInfo(name = "last")
    @org.jetbrains.annotations.Nullable
    private java.lang.String last;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = " uid")
    private int uid = 0;
    
    public Name() {
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
    public final java.lang.String getTitle() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "title")
    @java.lang.Deprecated
    public static void getTitle$annotations() {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirst() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "first")
    @java.lang.Deprecated
    public static void getFirst$annotations() {
    }
    
    public final void setFirst(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLast() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "last")
    @java.lang.Deprecated
    public static void getLast$annotations() {
    }
    
    public final void setLast(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final void setUid(int p0) {
    }
}