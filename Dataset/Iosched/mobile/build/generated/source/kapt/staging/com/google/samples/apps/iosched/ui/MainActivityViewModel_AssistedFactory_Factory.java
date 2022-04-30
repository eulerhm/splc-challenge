package com.google.samples.apps.iosched.ui;

import android.content.Context;
import com.google.samples.apps.iosched.shared.domain.ar.LoadArDebugFlagUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadPinnedSessionsJsonUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate;
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
public final class MainActivityViewModel_AssistedFactory_Factory implements Factory<MainActivityViewModel_AssistedFactory> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<ThemedActivityDelegate> themedActivityDelegateProvider;

  private final Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCaseProvider;

  private final Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCaseProvider;

  private final Provider<Context> contextProvider;

  public MainActivityViewModel_AssistedFactory_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider,
      Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCaseProvider,
      Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCaseProvider,
      Provider<Context> contextProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.themedActivityDelegateProvider = themedActivityDelegateProvider;
    this.loadPinnedSessionsUseCaseProvider = loadPinnedSessionsUseCaseProvider;
    this.loadArDebugFlagUseCaseProvider = loadArDebugFlagUseCaseProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public MainActivityViewModel_AssistedFactory get() {
    return newInstance(signInViewModelDelegateProvider, themedActivityDelegateProvider, loadPinnedSessionsUseCaseProvider, loadArDebugFlagUseCaseProvider, contextProvider);
  }

  public static MainActivityViewModel_AssistedFactory_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider,
      Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCaseProvider,
      Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCaseProvider,
      Provider<Context> contextProvider) {
    return new MainActivityViewModel_AssistedFactory_Factory(signInViewModelDelegateProvider, themedActivityDelegateProvider, loadPinnedSessionsUseCaseProvider, loadArDebugFlagUseCaseProvider, contextProvider);
  }

  public static MainActivityViewModel_AssistedFactory newInstance(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<ThemedActivityDelegate> themedActivityDelegate,
      Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCase,
      Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCase, Provider<Context> context) {
    return new MainActivityViewModel_AssistedFactory(signInViewModelDelegate, themedActivityDelegate, loadPinnedSessionsUseCase, loadArDebugFlagUseCase, context);
  }
}
