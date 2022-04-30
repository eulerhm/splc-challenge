package com.google.samples.apps.iosched.ui.prefs;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.prefs.StopSnackbarActionUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SnackbarPreferenceViewModel_AssistedFactory implements ViewModelAssistedFactory<SnackbarPreferenceViewModel> {
  private final Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCase;

  @Inject
  SnackbarPreferenceViewModel_AssistedFactory(
      Provider<StopSnackbarActionUseCase> stopSnackbarActionUseCase) {
    this.stopSnackbarActionUseCase = stopSnackbarActionUseCase;
  }

  @Override
  @NonNull
  public SnackbarPreferenceViewModel create(@NonNull SavedStateHandle arg0) {
    return new SnackbarPreferenceViewModel(stopSnackbarActionUseCase.get());
  }
}
