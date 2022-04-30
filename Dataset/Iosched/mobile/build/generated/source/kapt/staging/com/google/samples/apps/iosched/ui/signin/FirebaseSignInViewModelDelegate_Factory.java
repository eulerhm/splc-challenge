package com.google.samples.apps.iosched.ui.signin;

import com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase;
import dagger.internal.Factory;
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
public final class FirebaseSignInViewModelDelegate_Factory implements Factory<FirebaseSignInViewModelDelegate> {
  private final Provider<ObserveUserAuthStateUseCase> observeUserAuthStateUseCaseProvider;

  private final Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  private final Provider<Boolean> isReservationEnabledByRemoteConfigProvider;

  public FirebaseSignInViewModelDelegate_Factory(
      Provider<ObserveUserAuthStateUseCase> observeUserAuthStateUseCaseProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider) {
    this.observeUserAuthStateUseCaseProvider = observeUserAuthStateUseCaseProvider;
    this.notificationsPrefIsShownUseCaseProvider = notificationsPrefIsShownUseCaseProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
    this.mainDispatcherProvider = mainDispatcherProvider;
    this.isReservationEnabledByRemoteConfigProvider = isReservationEnabledByRemoteConfigProvider;
  }

  @Override
  public FirebaseSignInViewModelDelegate get() {
    return newInstance(observeUserAuthStateUseCaseProvider.get(), notificationsPrefIsShownUseCaseProvider.get(), ioDispatcherProvider.get(), mainDispatcherProvider.get(), isReservationEnabledByRemoteConfigProvider.get());
  }

  public static FirebaseSignInViewModelDelegate_Factory create(
      Provider<ObserveUserAuthStateUseCase> observeUserAuthStateUseCaseProvider,
      Provider<NotificationsPrefIsShownUseCase> notificationsPrefIsShownUseCaseProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider,
      Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider) {
    return new FirebaseSignInViewModelDelegate_Factory(observeUserAuthStateUseCaseProvider, notificationsPrefIsShownUseCaseProvider, ioDispatcherProvider, mainDispatcherProvider, isReservationEnabledByRemoteConfigProvider);
  }

  public static FirebaseSignInViewModelDelegate newInstance(
      ObserveUserAuthStateUseCase observeUserAuthStateUseCase,
      NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase,
      CoroutineDispatcher ioDispatcher, CoroutineDispatcher mainDispatcher,
      boolean isReservationEnabledByRemoteConfig) {
    return new FirebaseSignInViewModelDelegate(observeUserAuthStateUseCase, notificationsPrefIsShownUseCase, ioDispatcher, mainDispatcher, isReservationEnabledByRemoteConfig);
  }
}
