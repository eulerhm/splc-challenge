package com.google.samples.apps.iosched.ui.sessioncommon;

import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DefaultEventActionsViewModelDelegate_Factory implements Factory<DefaultEventActionsViewModelDelegate> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<CoroutineScope> externalScopeProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  public DefaultEventActionsViewModelDelegate_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.starEventUseCaseProvider = starEventUseCaseProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.externalScopeProvider = externalScopeProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
  }

  @Override
  public DefaultEventActionsViewModelDelegate get() {
    return newInstance(signInViewModelDelegateProvider.get(), starEventUseCaseProvider.get(), snackbarMessageManagerProvider.get(), externalScopeProvider.get(), mainDispatcherProvider.get());
  }

  public static DefaultEventActionsViewModelDelegate_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<CoroutineScope> externalScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    return new DefaultEventActionsViewModelDelegate_Factory(signInViewModelDelegateProvider, starEventUseCaseProvider, snackbarMessageManagerProvider, externalScopeProvider, mainDispatcherProvider);
  }

  public static DefaultEventActionsViewModelDelegate newInstance(
      SignInViewModelDelegate signInViewModelDelegate, StarEventAndNotifyUseCase starEventUseCase,
      SnackbarMessageManager snackbarMessageManager, CoroutineScope externalScope,
      CoroutineDispatcher mainDispatcher) {
    return new DefaultEventActionsViewModelDelegate(signInViewModelDelegate, starEventUseCase, snackbarMessageManager, externalScope, mainDispatcher);
  }
}
