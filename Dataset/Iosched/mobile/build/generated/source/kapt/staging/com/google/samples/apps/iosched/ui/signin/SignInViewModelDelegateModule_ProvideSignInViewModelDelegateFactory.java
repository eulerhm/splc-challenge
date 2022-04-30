package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory implements Factory<SignInViewModelDelegate> {
  private final SignInViewModelDelegateModule module;

  private final Provider<ObserveUserAuthStateUseCase> dataSourceProvider;

  private final Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  private final Provider<Boolean> isReservationEnabledByRemoteConfigProvider;

  public SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory(
      SignInViewModelDelegateModule module,
      Provider<ObserveUserAuthStateUseCase> dataSourceProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider) {
    this.module = module;
    this.dataSourceProvider = dataSourceProvider;
    this.notificationsPrefIsShownUseCaseProvider = notificationsPrefIsShownUseCaseProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
    this.isReservationEnabledByRemoteConfigProvider = isReservationEnabledByRemoteConfigProvider;
  }

  @Override
  public SignInViewModelDelegate get() {
    return provideSignInViewModelDelegate(module, dataSourceProvider.get(), notificationsPrefIsShownUseCaseProvider.get(), ioDispatcherProvider.get(), mainDispatcherProvider.get(), isReservationEnabledByRemoteConfigProvider.get());
  }

  public static SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory create(
      SignInViewModelDelegateModule module,
      Provider<ObserveUserAuthStateUseCase> dataSourceProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider) {
    return new SignInViewModelDelegateModule_ProvideSignInViewModelDelegateFactory(module, dataSourceProvider, notificationsPrefIsShownUseCaseProvider, ioDispatcherProvider, mainDispatcherProvider, isReservationEnabledByRemoteConfigProvider);
  }

  public static SignInViewModelDelegate provideSignInViewModelDelegate(
      SignInViewModelDelegateModule instance, ObserveUserAuthStateUseCase dataSource,
      NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase,
      CoroutineDispatcher ioDispatcher, CoroutineDispatcher mainDispatcher,
      boolean isReservationEnabledByRemoteConfig) {
    return Preconditions.checkNotNull(instance.provideSignInViewModelDelegate(dataSource, notificationsPrefIsShownUseCase, ioDispatcher, mainDispatcher, isReservationEnabledByRemoteConfig), "Cannot return null from a non-@Nullable @Provides method");
  }
}
