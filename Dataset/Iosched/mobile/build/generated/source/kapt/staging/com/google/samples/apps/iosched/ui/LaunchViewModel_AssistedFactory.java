package com.google.samples.apps.iosched.ui;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompletedUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class LaunchViewModel_AssistedFactory implements ViewModelAssistedFactory<LaunchViewModel> {
  private final Provider<OnboardingCompletedUseCase> onboardingCompletedUseCase;

  @Inject
  LaunchViewModel_AssistedFactory(Provider<OnboardingCompletedUseCase> onboardingCompletedUseCase) {
    this.onboardingCompletedUseCase = onboardingCompletedUseCase;
  }

  @Override
  @NonNull
  public LaunchViewModel create(@NonNull SavedStateHandle arg0) {
    return new LaunchViewModel(onboardingCompletedUseCase.get());
  }
}
