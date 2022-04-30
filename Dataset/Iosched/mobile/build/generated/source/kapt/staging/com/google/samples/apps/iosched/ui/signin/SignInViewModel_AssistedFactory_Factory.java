package com.google.samples.apps.iosched.ui.signin;

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
public final class SignInViewModel_AssistedFactory_Factory implements Factory<SignInViewModel_AssistedFactory> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  public SignInViewModel_AssistedFactory_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
  }

  @Override
  public SignInViewModel_AssistedFactory get() {
    return newInstance(signInViewModelDelegateProvider);
  }

  public static SignInViewModel_AssistedFactory_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider) {
    return new SignInViewModel_AssistedFactory_Factory(signInViewModelDelegateProvider);
  }

  public static SignInViewModel_AssistedFactory newInstance(
      Provider<SignInViewModelDelegate> signInViewModelDelegate) {
    return new SignInViewModel_AssistedFactory(signInViewModelDelegate);
  }
}
