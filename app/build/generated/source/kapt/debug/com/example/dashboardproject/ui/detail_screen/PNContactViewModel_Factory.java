package com.example.dashboardproject.ui.detail_screen;

import android.app.Application;
import com.example.dashboardproject.Repository.ApiCalls;
import com.example.dashboardproject.database.PNDatabase;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PNContactViewModel_Factory implements Factory<PNContactViewModel> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiCalls> apiCallProvider;

  private final Provider<PNDatabase> databaseProvider;

  public PNContactViewModel_Factory(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallProvider,
      Provider<PNDatabase> databaseProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.apiCallProvider = apiCallProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PNContactViewModel get() {
    return provideInstance(mApplicationProvider, apiCallProvider, databaseProvider);
  }

  public static PNContactViewModel provideInstance(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallProvider,
      Provider<PNDatabase> databaseProvider) {
    return new PNContactViewModel(
        mApplicationProvider.get(), apiCallProvider.get(), databaseProvider.get());
  }

  public static PNContactViewModel_Factory create(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallProvider,
      Provider<PNDatabase> databaseProvider) {
    return new PNContactViewModel_Factory(mApplicationProvider, apiCallProvider, databaseProvider);
  }

  public static PNContactViewModel newPNContactViewModel(
      Application mApplication, ApiCalls apiCall, PNDatabase database) {
    return new PNContactViewModel(mApplication, apiCall, database);
  }
}
