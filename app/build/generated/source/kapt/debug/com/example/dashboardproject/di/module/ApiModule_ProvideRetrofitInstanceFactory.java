package com.example.dashboardproject.di.module;

import com.example.dashboardproject.service.TSClient;
import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApiModule_ProvideRetrofitInstanceFactory implements Factory<TSClient> {
  private final ApiModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient.Builder> okHttpProvider;

  public ApiModule_ProvideRetrofitInstanceFactory(
      ApiModule module,
      Provider<Gson> gsonProvider,
      Provider<OkHttpClient.Builder> okHttpProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpProvider = okHttpProvider;
  }

  @Override
  public TSClient get() {
    return provideInstance(module, gsonProvider, okHttpProvider);
  }

  public static TSClient provideInstance(
      ApiModule module,
      Provider<Gson> gsonProvider,
      Provider<OkHttpClient.Builder> okHttpProvider) {
    return proxyProvideRetrofitInstance(module, gsonProvider.get(), okHttpProvider.get());
  }

  public static ApiModule_ProvideRetrofitInstanceFactory create(
      ApiModule module,
      Provider<Gson> gsonProvider,
      Provider<OkHttpClient.Builder> okHttpProvider) {
    return new ApiModule_ProvideRetrofitInstanceFactory(module, gsonProvider, okHttpProvider);
  }

  public static TSClient proxyProvideRetrofitInstance(
      ApiModule instance, Gson gson, OkHttpClient.Builder okHttp) {
    return Preconditions.checkNotNull(
        instance.provideRetrofitInstance(gson, okHttp),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
