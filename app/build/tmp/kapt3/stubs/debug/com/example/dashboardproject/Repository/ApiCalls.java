package com.example.dashboardproject.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/dashboardproject/Repository/ApiCalls;", "", "client", "Lcom/example/dashboardproject/service/TSClient;", "(Lcom/example/dashboardproject/service/TSClient;)V", "getRandomContacts", "Lretrofit2/Call;", "Lcom/example/dashboardproject/Repository/Model/ContactModel;", "page", "", "app_debug"})
public final class ApiCalls {
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.service.TSClient client = null;
    
    @javax.inject.Inject
    public ApiCalls(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.service.TSClient client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Call<com.example.dashboardproject.Repository.Model.ContactModel> getRandomContacts(int page) {
        return null;
    }
}