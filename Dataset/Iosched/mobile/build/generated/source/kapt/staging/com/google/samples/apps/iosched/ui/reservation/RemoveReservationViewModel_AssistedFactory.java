package com.google.samples.apps.iosched.ui.reservation;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RemoveReservationViewModel_AssistedFactory implements ViewModelAssistedFactory<RemoveReservationViewModel> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCase;

  private final Provider<ReservationActionUseCase> reservationActionUseCase;

  @Inject
  RemoveReservationViewModel_AssistedFactory(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<ReservationActionUseCase> reservationActionUseCase) {
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.loadUserSessionUseCase = loadUserSessionUseCase;
    this.reservationActionUseCase = reservationActionUseCase;
  }

  @Override
  @NonNull
  public RemoveReservationViewModel create(@NonNull SavedStateHandle arg0) {
    return new RemoveReservationViewModel(signInViewModelDelegate.get(),
        loadUserSessionUseCase.get(), reservationActionUseCase.get());
  }
}
