package com.google.samples.apps.iosched.ui.signin;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SignInViewModel_AssistedFactory implements ViewModelAssistedFactory<SignInViewModel> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  @Inject
  SignInViewModel_AssistedFactory(Provider<SignInViewModelDelegate> signInViewModelDelegate) {
    this.signInViewModelDelegate = signInViewModelDelegate;
  }

  @Override
  @NonNull
  public SignInViewModel create(@NonNull SavedStateHandle arg0) {
    return new SignInViewModel(signInViewModelDelegate.get());
  }
}
