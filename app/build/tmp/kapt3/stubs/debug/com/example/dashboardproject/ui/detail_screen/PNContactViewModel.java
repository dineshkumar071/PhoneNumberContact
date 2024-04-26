package com.example.dashboardproject.ui.detail_screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/PNContactViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "mApplication", "Landroid/app/Application;", "apiCall", "Lcom/example/dashboardproject/Repository/ApiCalls;", "database", "Lcom/example/dashboardproject/database/PNDatabase;", "(Landroid/app/Application;Lcom/example/dashboardproject/Repository/ApiCalls;Lcom/example/dashboardproject/database/PNDatabase;)V", "contacts", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/dashboardproject/Repository/TSResponse;", "Lcom/example/dashboardproject/Repository/Model/ContactModel;", "getContacts", "()Landroidx/lifecycle/MutableLiveData;", "contacts$delegate", "Lkotlin/Lazy;", "fetchRandomContact", "", "callback", "Lcom/example/dashboardproject/ui/detail_screen/PNContactViewModel$ContactListCallBack;", "getDeviceRandomContact", "page", "", "saveUserNames", "contactModel", "saveUsers", "response", "Lretrofit2/Response;", "ContactListCallBack", "app_debug"})
public final class PNContactViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application mApplication = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.Repository.ApiCalls apiCall = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.database.PNDatabase database = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy contacts$delegate = null;
    
    @javax.inject.Inject
    public PNContactViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application mApplication, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.Repository.ApiCalls apiCall, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.database.PNDatabase database) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.dashboardproject.Repository.TSResponse<com.example.dashboardproject.Repository.Model.ContactModel>> getContacts() {
        return null;
    }
    
    public final void getDeviceRandomContact(int page) {
    }
    
    private final void saveUserNames(com.example.dashboardproject.Repository.Model.ContactModel contactModel) {
    }
    
    private final void saveUsers(retrofit2.Response<com.example.dashboardproject.Repository.Model.ContactModel> response) {
    }
    
    public final void fetchRandomContact(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.detail_screen.PNContactViewModel.ContactListCallBack callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/PNContactViewModel$ContactListCallBack;", "", "getContacts", "", "contactList", "", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "app_debug"})
    public static abstract interface ContactListCallBack {
        
        public abstract void getContacts(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> contactList);
    }
}