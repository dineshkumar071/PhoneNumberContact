package com.example.dashboardproject.di.module;

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
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiCalls> creatorProvider;

  private final Provider<PNDatabase> dataBaseProvider;

  public ViewModelFactory_Factory(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> creatorProvider,
      Provider<PNDatabase> dataBaseProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.creatorProvider = creatorProvider;
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public ViewModelFactory get() {
    return provideInstance(mApplicationProvider, creatorProvider, dataBaseProvider);
  }

  public static ViewModelFactory provideInstance(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> creatorProvider,
      Provider<PNDatabase> dataBaseProvider) {
    return new ViewModelFactory(
        mApplicationProvider.get(), creatorProvider.get(), dataBaseProvider.get());
  }

  public static ViewModelFactory_Factory create(
      Provider<Application> mApplicationProvider,
      Provider<ApiCalls> creatorProvider,
      Provider<PNDatabase> dataBaseProvider) {
    return new ViewModelFactory_Factory(mApplicationProvider, creatorProvider, dataBaseProvider);
  }

  public static ViewModelFactory newViewModelFactory(
      Application mApplication, ApiCalls creator, PNDatabase dataBase) {
    return new ViewModelFactory(mApplication, creator, dataBase);
  }
}
