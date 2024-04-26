package com.example.dashboardproject.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dashboardproject/database/PNDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDOA", "Lcom/example/dashboardproject/database/ContactDAO;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.dashboardproject.Repository.Model.ContactModel.class, com.example.dashboardproject.Repository.Model.Id.class, com.example.dashboardproject.Repository.Model.ResultOne.class, com.example.dashboardproject.Repository.Model.Name.class}, version = 1)
public abstract class PNDatabase extends androidx.room.RoomDatabase {
    private static com.example.dashboardproject.database.PNDatabase instance1;
    @org.jetbrains.annotations.NotNull
    public static final com.example.dashboardproject.database.PNDatabase.Companion Companion = null;
    
    public PNDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.dashboardproject.database.ContactDAO userDOA();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/dashboardproject/database/PNDatabase$Companion;", "", "()V", "instance1", "Lcom/example/dashboardproject/database/PNDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.dashboardproject.database.PNDatabase getInstance(@org.jetbrains.annotations.Nullable
        android.content.Context context) {
            return null;
        }
    }
}