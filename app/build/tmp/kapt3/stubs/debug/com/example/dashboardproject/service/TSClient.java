package com.example.dashboardproject.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/dashboardproject/service/TSClient;", "", "getRandomContacts", "Lretrofit2/Call;", "Lcom/example/dashboardproject/Repository/Model/ContactModel;", "result", "", "variant", "", "app_debug"})
public abstract interface TSClient {
    
    @retrofit2.http.GET(value = "api/")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.example.dashboardproject.Repository.Model.ContactModel> getRandomContacts(@retrofit2.http.Query(value = "results")
    int result, @retrofit2.http.Query(value = "inc", encoded = true)
    @org.jetbrains.annotations.NotNull
    java.lang.String variant);
}