package com.example.dashboardproject.di.module;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import com.example.dashboardproject.Repository.ApiCalls;
import com.example.dashboardproject.database.PNDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final ViewModelFactoryModule module;

  private final Provider<ApiCalls> apiCallsProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<PNDatabase> databaseValueProvider;

  public ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory(
      ViewModelFactoryModule module,
      Provider<ApiCalls> apiCallsProvider,
      Provider<Application> mApplicationProvider,
      Provider<PNDatabase> databaseValueProvider) {
    this.module = module;
    this.apiCallsProvider = apiCallsProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.databaseValueProvider = databaseValueProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return provideInstance(module, apiCallsProvider, mApplicationProvider, databaseValueProvider);
  }

  public static ViewModelProvider.Factory provideInstance(
      ViewModelFactoryModule module,
      Provider<ApiCalls> apiCallsProvider,
      Provider<Application> mApplicationProvider,
      Provider<PNDatabase> databaseValueProvider) {
    return proxyProvideContactProviderViewModelFactory(
        module, apiCallsProvider.get(), mApplicationProvider.get(), databaseValueProvider.get());
  }

  public static ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory create(
      ViewModelFactoryModule module,
      Provider<ApiCalls> apiCallsProvider,
      Provider<Application> mApplicationProvider,
      Provider<PNDatabase> databaseValueProvider) {
    return new ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory(
        module, apiCallsProvider, mApplicationProvider, databaseValueProvider);
  }

  public static ViewModelProvider.Factory proxyProvideContactProviderViewModelFactory(
      ViewModelFactoryModule instance,
      ApiCalls apiCalls,
      Application mApplication,
      PNDatabase databaseValue) {
    return Preconditions.checkNotNull(
        instance.provideContactProviderViewModelFactory(apiCalls, mApplication, databaseValue),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
