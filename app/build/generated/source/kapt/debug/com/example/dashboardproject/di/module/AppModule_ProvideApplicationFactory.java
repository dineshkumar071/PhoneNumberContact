package com.example.dashboardproject.di.module;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return provideInstance(module);
  }

  public static Application provideInstance(AppModule module) {
    return proxyProvideApplication(module);
  }

  public static AppModule_ProvideApplicationFactory create(AppModule module) {
    return new AppModule_ProvideApplicationFactory(module);
  }

  public static Application proxyProvideApplication(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
