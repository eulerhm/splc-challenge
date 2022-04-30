package com.google.samples.apps.iosched.ui;

import com.google.samples.apps.iosched.shared.domain.prefs.OnboardingCompletedUseCase;
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
public final class LaunchViewModel_AssistedFactory_Factory implements Factory<LaunchViewModel_AssistedFactory> {
  private final Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider;

  public LaunchViewModel_AssistedFactory_Factory(
      Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider) {
    this.onboardingCompletedUseCaseProvider = onboardingCompletedUseCaseProvider;
  }

  @Override
  public LaunchViewModel_AssistedFactory get() {
    return newInstance(onboardingCompletedUseCaseProvider);
  }

  public static LaunchViewModel_AssistedFactory_Factory create(
      Provider<OnboardingCompletedUseCase> onboardingCompletedUseCaseProvider) {
    return new LaunchViewModel_AssistedFactory_Factory(onboardingCompletedUseCaseProvider);
  }

  public static LaunchViewModel_AssistedFactory newInstance(
      Provider<OnboardingCompletedUseCase> onboardingCompletedUseCase) {
    return new LaunchViewModel_AssistedFactory(onboardingCompletedUseCase);
  }
}
