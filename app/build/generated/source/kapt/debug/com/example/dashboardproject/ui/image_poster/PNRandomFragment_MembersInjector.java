package com.example.dashboardproject.ui.image_poster;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PNRandomFragment_MembersInjector implements MembersInjector<PNRandomFragment> {
  private final Provider<ViewModelProvider.Factory> imagePosterViewModelFactoryProvider;

  public PNRandomFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> imagePosterViewModelFactoryProvider) {
    this.imagePosterViewModelFactoryProvider = imagePosterViewModelFactoryProvider;
  }

  public static MembersInjector<PNRandomFragment> create(
      Provider<ViewModelProvider.Factory> imagePosterViewModelFactoryProvider) {
    return new PNRandomFragment_MembersInjector(imagePosterViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PNRandomFragment instance) {
    injectImagePosterViewModelFactory(instance, imagePosterViewModelFactoryProvider.get());
  }

  public static void injectImagePosterViewModelFactory(
      PNRandomFragment instance, ViewModelProvider.Factory imagePosterViewModelFactory) {
    instance.imagePosterViewModelFactory = imagePosterViewModelFactory;
  }
}
