package com.google.samples.apps.iosched.ui.filters;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory implements Factory<FiltersViewModelDelegate> {
  private final FiltersViewModelDelegateModule module;

  public FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory(
      FiltersViewModelDelegateModule module) {
    this.module = module;
  }

  @Override
  public FiltersViewModelDelegate get() {
    return provideFiltersViewModelDelegate(module);
  }

  public static FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory create(
      FiltersViewModelDelegateModule module) {
    return new FiltersViewModelDelegateModule_ProvideFiltersViewModelDelegateFactory(module);
  }

  public static FiltersViewModelDelegate provideFiltersViewModelDelegate(
      FiltersViewModelDelegateModule instance) {
    return Preconditions.checkNotNull(instance.provideFiltersViewModelDelegate(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
