package com.google.samples.apps.iosched.ui.onboarding;

import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompleteActionUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
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
public final class OnboardingViewModel_AssistedFactory_Factory implements Factory<OnboardingViewModel_AssistedFactory> {
  private final Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCaseProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  public OnboardingViewModel_AssistedFactory_Factory(
      Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider) {
    this.onboardingCompleteActionUseCaseProvider = onboardingCompleteActionUseCaseProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
  }

  @Override
  public OnboardingViewModel_AssistedFactory get() {
    return newInstance(onboardingCompleteActionUseCaseProvider, signInViewModelDelegateProvider);
  }

  public static OnboardingViewModel_AssistedFactory_Factory create(
      Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider) {
    return new OnboardingViewModel_AssistedFactory_Factory(onboardingCompleteActionUseCaseProvider, signInViewModelDelegateProvider);
  }

  public static OnboardingViewModel_AssistedFactory newInstance(
      Provider<OnboardingCompleteActionUseCase> onboardingCompleteActionUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate) {
    return new OnboardingViewModel_AssistedFactory(onboardingCompleteActionUseCase, signInViewModelDelegate);
  }
}
