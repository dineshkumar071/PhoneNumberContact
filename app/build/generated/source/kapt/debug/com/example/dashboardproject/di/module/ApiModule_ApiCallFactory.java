package com.example.dashboardproject.di.module;

import com.example.dashboardproject.Repository.ApiCalls;
import com.example.dashboardproject.service.TSClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ApiCallFactory implements Factory<ApiCalls> {
  private final ApiModule module;

  private final Provider<TSClient> clientProvider;

  public ApiModule_ApiCallFactory(ApiModule module, Provider<TSClient> clientProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiCalls get() {
    return provideInstance(module, clientProvider);
  }

  public static ApiCalls provideInstance(ApiModule module, Provider<TSClient> clientProvider) {
    return proxyApiCall(module, clientProvider.get());
  }

  public static ApiModule_ApiCallFactory create(
      ApiModule module, Provider<TSClient> clientProvider) {
    return new ApiModule_ApiCallFactory(module, clientProvider);
  }

  public static ApiCalls proxyApiCall(ApiModule instance, TSClient client) {
    return Preconditions.checkNotNull(
        instance.apiCall(client), "Cannot return null from a non-@Nullable @Provides method");
  }
}
