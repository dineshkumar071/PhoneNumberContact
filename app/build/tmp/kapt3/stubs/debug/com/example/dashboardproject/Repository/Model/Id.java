package com.example.dashboardproject.Repository.Model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/example/dashboardproject/Repository/Model/Id;", "", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "", "getName$annotations", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "uid", "getUid$annotations", "getUid", "setUid", "value", "getValue$annotations", "getValue", "setValue", "app_debug"})
@androidx.room.Entity
public final class Id {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "uid")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer uid;
    @androidx.room.ColumnInfo(name = "id")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer id;
    @androidx.room.ColumnInfo(name = "name")
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @androidx.room.ColumnInfo(name = "value")
    @org.jetbrains.annotations.Nullable
    private java.lang.String value;
    
    public Id() {
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
    public final java.lang.Integer getId() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "id")
    @java.lang.Deprecated
    public static void getId$annotations() {
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "name")
    @java.lang.Deprecated
    public static void getName$annotations() {
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return null;
    }
    
    @com.squareup.moshi.Json(name = "value")
    @java.lang.Deprecated
    public static void getValue$annotations() {
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}