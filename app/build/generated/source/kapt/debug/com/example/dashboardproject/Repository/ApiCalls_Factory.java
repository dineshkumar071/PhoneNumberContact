package com.example.dashboardproject.Repository;

import com.example.dashboardproject.service.TSClient;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiCalls_Factory implements Factory<ApiCalls> {
  private final Provider<TSClient> clientProvider;

  public ApiCalls_Factory(Provider<TSClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public ApiCalls get() {
    return provideInstance(clientProvider);
  }

  public static ApiCalls provideInstance(Provider<TSClient> clientProvider) {
    return new ApiCalls(clientProvider.get());
  }

  public static ApiCalls_Factory create(Provider<TSClient> clientProvider) {
    return new ApiCalls_Factory(clientProvider);
  }

  public static ApiCalls newApiCalls(TSClient client) {
    return new ApiCalls(client);
  }
}
