package com.example.dashboardproject.di.module;

import com.example.dashboardproject.database.PNDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDataBaseInstanceFactory implements Factory<PNDatabase> {
  private final AppModule module;

  public AppModule_ProvideDataBaseInstanceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PNDatabase get() {
    return provideInstance(module);
  }

  public static PNDatabase provideInstance(AppModule module) {
    return proxyProvideDataBaseInstance(module);
  }

  public static AppModule_ProvideDataBaseInstanceFactory create(AppModule module) {
    return new AppModule_ProvideDataBaseInstanceFactory(module);
  }

  public static PNDatabase proxyProvideDataBaseInstance(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideDataBaseInstance(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
