package com.google.samples.apps.iosched.ui.onboarding;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class OnboardingViewModel_AssistedFactory implements ViewModelAssistedFactory<OnboardingViewModel> {
  private final Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCase;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  @Inject
  OnboardingViewModel_AssistedFactory(
      Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate) {
    this.onboardingCompleteActionUseCase = onboardingCompleteActionUseCase;
    this.signInViewModelDelegate = signInViewModelDelegate;
  }

  @Override
  @NonNull
  public OnboardingViewModel create(@NonNull SavedStateHandle arg0) {
    return new OnboardingViewModel(onboardingCompleteActionUseCase.get(),
        signInViewModelDelegate.get());
  }
}
