package com.example.dashboardproject.ui.detail_screen;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PNContactFragment_MembersInjector implements MembersInjector<PNContactFragment> {
  private final Provider<ViewModelProvider.Factory> detailScreenViewModelFactoryProvider;

  public PNContactFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> detailScreenViewModelFactoryProvider) {
    this.detailScreenViewModelFactoryProvider = detailScreenViewModelFactoryProvider;
  }

  public static MembersInjector<PNContactFragment> create(
      Provider<ViewModelProvider.Factory> detailScreenViewModelFactoryProvider) {
    return new PNContactFragment_MembersInjector(detailScreenViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PNContactFragment instance) {
    injectDetailScreenViewModelFactory(instance, detailScreenViewModelFactoryProvider.get());
  }

  public static void injectDetailScreenViewModelFactory(
      PNContactFragment instance, ViewModelProvider.Factory detailScreenViewModelFactory) {
    instance.detailScreenViewModelFactory = detailScreenViewModelFactory;
  }
}
