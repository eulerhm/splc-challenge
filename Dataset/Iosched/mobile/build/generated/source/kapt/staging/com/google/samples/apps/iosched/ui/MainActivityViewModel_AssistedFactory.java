package com.google.samples.apps.iosched.ui;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.ar.LoadArDebugFlagUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadPinnedSessionsJsonUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainActivityViewModel_AssistedFactory implements ViewModelAssistedFactory<MainActivityViewModel> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<ThemedActivityDelegate> themedActivityDelegate;

  private final Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCase;

  private final Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCase;

  private final Provider<Context> context;

  @Inject
  MainActivityViewModel_AssistedFactory(Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<ThemedActivityDelegate> themedActivityDelegate,
      Provider<LoadPinnedSessionsJsonUseCase> loadPinnedSessionsUseCase,
      Provider<LoadArDebugFlagUseCase> loadArDebugFlagUseCase,
      @ApplicationContext Provider<Context> context) {
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.themedActivityDelegate = themedActivityDelegate;
    this.loadPinnedSessionsUseCase = loadPinnedSessionsUseCase;
    this.loadArDebugFlagUseCase = loadArDebugFlagUseCase;
    this.context = context;
  }

  @Override
  @NonNull
  public MainActivityViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainActivityViewModel(signInViewModelDelegate.get(), themedActivityDelegate.get(),
        loadPinnedSessionsUseCase.get(), loadArDebugFlagUseCase.get(), context.get());
  }
}
