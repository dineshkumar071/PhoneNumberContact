package com.example.dashboardproject.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/dashboardproject/database/ContactDAO;", "", "deleteDataBase", "", "readName", "", "Lcom/example/dashboardproject/Repository/Model/Name;", "readUser", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "saveNames", "names", "saveUser", "user", "saveUsers", "users", "app_debug"})
@androidx.room.Dao
public abstract interface ContactDAO {
    
    /**
     * insert the user details in the database
     */
    @androidx.room.Insert(onConflict = 1)
    public abstract void saveUser(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.Repository.Model.ResultOne user);
    
    /**
     * getting the user details
     */
    @androidx.room.Query(value = "select * from ResultOne")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> readUser();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void saveUsers(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> users);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void saveNames(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.dashboardproject.Repository.Model.Name> names);
    
    @androidx.room.Query(value = "select * from Name")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.dashboardproject.Repository.Model.Name> readName();
    
    /**
     * deleting the database
     */
    @androidx.room.Query(value = "DELETE FROM ResultOne")
    public abstract void deleteDataBase();
}