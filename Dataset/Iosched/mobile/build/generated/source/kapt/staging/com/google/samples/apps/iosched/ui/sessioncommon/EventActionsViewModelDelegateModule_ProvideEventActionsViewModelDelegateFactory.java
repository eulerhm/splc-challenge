package com.google.samples.apps.iosched.ui.sessioncommon;

import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory implements Factory<EventActionsViewModelDelegate> {
  private final EventActionsViewModelDelegateModule module;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<CoroutineScope> applicationScopeProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  public EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory(
      EventActionsViewModelDelegateModule module,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<CoroutineScope> applicationScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    this.module = module;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.starEventUseCaseProvider = starEventUseCaseProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.applicationScopeProvider = applicationScopeProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
  }

  @Override
  public EventActionsViewModelDelegate get() {
    return provideEventActionsViewModelDelegate(module, signInViewModelDelegateProvider.get(), starEventUseCaseProvider.get(), snackbarMessageManagerProvider.get(), applicationScopeProvider.get(), mainDispatcherProvider.get());
  }

  public static EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory create(
      EventActionsViewModelDelegateModule module,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<CoroutineScope> applicationScopeProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider) {
    return new EventActionsViewModelDelegateModule_ProvideEventActionsViewModelDelegateFactory(module, signInViewModelDelegateProvider, starEventUseCaseProvider, snackbarMessageManagerProvider, applicationScopeProvider, mainDispatcherProvider);
  }

  public static EventActionsViewModelDelegate provideEventActionsViewModelDelegate(
      EventActionsViewModelDelegateModule instance, SignInViewModelDelegate signInViewModelDelegate,
      StarEventAndNotifyUseCase starEventUseCase, SnackbarMessageManager snackbarMessageManager,
      CoroutineScope applicationScope, CoroutineDispatcher mainDispatcher) {
    return Preconditions.checkNotNull(instance.provideEventActionsViewModelDelegate(signInViewModelDelegate, starEventUseCase, snackbarMessageManager, applicationScope, mainDispatcher), "Cannot return null from a non-@Nullable @Provides method");
  }
}
