package com.example.dashboardproject.di.module;

import com.example.dashboardproject.service.HttpInterceptors;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient.Builder> {
  private final ApiModule module;

  private final Provider<HttpInterceptors> loggerProvider;

  public ApiModule_ProvideOkHttpClientFactory(
      ApiModule module, Provider<HttpInterceptors> loggerProvider) {
    this.module = module;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public OkHttpClient.Builder get() {
    return provideInstance(module, loggerProvider);
  }

  public static OkHttpClient.Builder provideInstance(
      ApiModule module, Provider<HttpInterceptors> loggerProvider) {
    return proxyProvideOkHttpClient(module, loggerProvider.get());
  }

  public static ApiModule_ProvideOkHttpClientFactory create(
      ApiModule module, Provider<HttpInterceptors> loggerProvider) {
    return new ApiModule_ProvideOkHttpClientFactory(module, loggerProvider);
  }

  public static OkHttpClient.Builder proxyProvideOkHttpClient(
      ApiModule instance, HttpInterceptors logger) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient(logger),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
