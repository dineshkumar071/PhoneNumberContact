package com.example.dashboardproject.ui.image_poster;

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
public final class PNRandomViewModel_Factory implements Factory<PNRandomViewModel> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiCalls> apiCallsProvider;

  private final Provider<PNDatabase> dataBaseProvider;

  public PNRandomViewModel_Factory(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallsProvider,
      Provider<PNDatabase> dataBaseProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.apiCallsProvider = apiCallsProvider;
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public PNRandomViewModel get() {
    return provideInstance(mApplicationProvider, apiCallsProvider, dataBaseProvider);
  }

  public static PNRandomViewModel provideInstance(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallsProvider,
      Provider<PNDatabase> dataBaseProvider) {
    return new PNRandomViewModel(
        mApplicationProvider.get(), apiCallsProvider.get(), dataBaseProvider.get());
  }

  public static PNRandomViewModel_Factory create(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> apiCallsProvider,
      Provider<PNDatabase> dataBaseProvider) {
    return new PNRandomViewModel_Factory(mApplicationProvider, apiCallsProvider, dataBaseProvider);
  }

  public static PNRandomViewModel newPNRandomViewModel(
      Application mApplication, ApiCalls apiCalls, PNDatabase dataBase) {
    return new PNRandomViewModel(mApplication, apiCalls, dataBase);
  }
}
