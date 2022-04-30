package com.google.samples.apps.iosched.ui.reservation;

import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase;
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
public final class RemoveReservationViewModel_AssistedFactory_Factory implements Factory<RemoveReservationViewModel_AssistedFactory> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider;

  private final Provider<ReservationActionUseCase> reservationActionUseCaseProvider;

  public RemoveReservationViewModel_AssistedFactory_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<ReservationActionUseCase> reservationActionUseCaseProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.loadUserSessionUseCaseProvider = loadUserSessionUseCaseProvider;
    this.reservationActionUseCaseProvider = reservationActionUseCaseProvider;
  }

  @Override
  public RemoveReservationViewModel_AssistedFactory get() {
    return newInstance(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, reservationActionUseCaseProvider);
  }

  public static RemoveReservationViewModel_AssistedFactory_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<ReservationActionUseCase> reservationActionUseCaseProvider) {
    return new RemoveReservationViewModel_AssistedFactory_Factory(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, reservationActionUseCaseProvider);
  }

  public static RemoveReservationViewModel_AssistedFactory newInstance(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<ReservationActionUseCase> reservationActionUseCase) {
    return new RemoveReservationViewModel_AssistedFactory(signInViewModelDelegate, loadUserSessionUseCase, reservationActionUseCase);
  }
}
