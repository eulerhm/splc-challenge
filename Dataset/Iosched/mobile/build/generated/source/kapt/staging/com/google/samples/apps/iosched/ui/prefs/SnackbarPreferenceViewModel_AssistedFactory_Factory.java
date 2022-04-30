package com.google.samples.apps.iosched.ui.prefs;

import com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SnackbarPreferenceViewModel_AssistedFactory_Factory implements Factory<SnackbarPreferenceViewModel_AssistedFactory> {
  private final Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCaseProvider;

  public SnackbarPreferenceViewModel_AssistedFactory_Factory(
      Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCaseProvider) {
    this.stopSnackbarActionUseCaseProvider = stopSnackbarActionUseCaseProvider;
  }

  @Override
  public SnackbarPreferenceViewModel_AssistedFactory get() {
    return newInstance(stopSnackbarActionUseCaseProvider);
  }

  public static SnackbarPreferenceViewModel_AssistedFactory_Factory create(
      Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCaseProvider) {
    return new SnackbarPreferenceViewModel_AssistedFactory_Factory(stopSnackbarActionUseCaseProvider);
  }

  public static SnackbarPreferenceViewModel_AssistedFactory newInstance(
      Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCase) {
    return new SnackbarPreferenceViewModel_AssistedFactory(stopSnackbarActionUseCase);
  }
}
