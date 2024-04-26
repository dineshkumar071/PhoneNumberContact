package com.example.dashboardproject.di.component;

import androidx.lifecycle.ViewModelProvider;
import com.example.dashboardproject.Repository.ApiCalls;
import com.example.dashboardproject.di.module.ApiModule;
import com.example.dashboardproject.di.module.ApiModule_ApiCallFactory;
import com.example.dashboardproject.di.module.ApiModule_ProvideGsonFactory;
import com.example.dashboardproject.di.module.ApiModule_ProvideOkHttpClientFactory;
import com.example.dashboardproject.di.module.ApiModule_ProvideRetrofitInstanceFactory;
import com.example.dashboardproject.di.module.AppModule;
import com.example.dashboardproject.di.module.AppModule_ProvideApplicationFactory;
import com.example.dashboardproject.di.module.AppModule_ProvideDataBaseInstanceFactory;
import com.example.dashboardproject.di.module.ViewModelFactoryModule;
import com.example.dashboardproject.di.module.ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory;
import com.example.dashboardproject.service.HttpInterceptors_Factory;
import com.example.dashboardproject.service.TSClient;
import com.example.dashboardproject.ui.detail_screen.PNContactFragment;
import com.example.dashboardproject.ui.detail_screen.PNContactFragment_MembersInjector;
import com.example.dashboardproject.ui.image_poster.PNRandomFragment;
import com.example.dashboardproject.ui.image_poster.PNRandomFragment_MembersInjector;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Gson> provideGsonProvider;

  private Provider<OkHttpClient.Builder> provideOkHttpClientProvider;

  private Provider<TSClient> provideRetrofitInstanceProvider;

  private Provider<ApiCalls> apiCallProvider;

  private AppModule_ProvideApplicationFactory provideApplicationProvider;

  private AppModule_ProvideDataBaseInstanceFactory provideDataBaseInstanceProvider;

  private Provider<ViewModelProvider.Factory> provideContactProviderViewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {

    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideGsonProvider =
        DoubleCheck.provider(ApiModule_ProvideGsonFactory.create(builder.apiModule));
    this.provideOkHttpClientProvider =
        DoubleCheck.provider(
            ApiModule_ProvideOkHttpClientFactory.create(
                builder.apiModule, HttpInterceptors_Factory.create()));
    this.provideRetrofitInstanceProvider =
        DoubleCheck.provider(
            ApiModule_ProvideRetrofitInstanceFactory.create(
                builder.apiModule, provideGsonProvider, provideOkHttpClientProvider));
    this.apiCallProvider =
        DoubleCheck.provider(
            ApiModule_ApiCallFactory.create(builder.apiModule, provideRetrofitInstanceProvider));
    this.provideApplicationProvider = AppModule_ProvideApplicationFactory.create(builder.appModule);
    this.provideDataBaseInstanceProvider =
        AppModule_ProvideDataBaseInstanceFactory.create(builder.appModule);
    this.provideContactProviderViewModelFactoryProvider =
        DoubleCheck.provider(
            ViewModelFactoryModule_ProvideContactProviderViewModelFactoryFactory.create(
                builder.viewModelFactoryModule,
                apiCallProvider,
                provideApplicationProvider,
                provideDataBaseInstanceProvider));
  }

  @Override
  public void inject(PNContactFragment tsDetailScreenFragment) {
    injectPNContactFragment(tsDetailScreenFragment);
  }

  @Override
  public void inject(PNRandomFragment tsImagePosterFragment) {
    injectPNRandomFragment(tsImagePosterFragment);
  }

  @CanIgnoreReturnValue
  private PNContactFragment injectPNContactFragment(PNContactFragment instance) {
    PNContactFragment_MembersInjector.injectDetailScreenViewModelFactory(
        instance, provideContactProviderViewModelFactoryProvider.get());
    return instance;
  }

  @CanIgnoreReturnValue
  private PNRandomFragment injectPNRandomFragment(PNRandomFragment instance) {
    PNRandomFragment_MembersInjector.injectImagePosterViewModelFactory(
        instance, provideContactProviderViewModelFactoryProvider.get());
    return instance;
  }

  public static final class Builder {
    private ViewModelFactoryModule viewModelFactoryModule;

    private ApiModule apiModule;

    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (viewModelFactoryModule == null) {
        this.viewModelFactoryModule = new ViewModelFactoryModule();
      }
      Preconditions.checkBuilderRequirement(apiModule, ApiModule.class);
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder apiModule(ApiModule apiModule) {
      this.apiModule = Preconditions.checkNotNull(apiModule);
      return this;
    }

    public Builder viewModelFactoryModule(ViewModelFactoryModule viewModelFactoryModule) {
      this.viewModelFactoryModule = Preconditions.checkNotNull(viewModelFactoryModule);
      return this;
    }
  }
}
