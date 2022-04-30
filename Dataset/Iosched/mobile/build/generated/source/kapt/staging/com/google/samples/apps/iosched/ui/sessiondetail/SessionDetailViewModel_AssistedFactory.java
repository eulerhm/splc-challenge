package com.google.samples.apps.iosched.ui.sessiondetail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.di.DefaultDispatcher;
import com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import com.google.samples.apps.iosched.shared.util.NetworkUtils;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SessionDetailViewModel_AssistedFactory implements ViewModelAssistedFactory<SessionDetailViewModel> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCase;

  private final Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCase;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCase;

  private final Provider<ReservationActionUseCase> reservationActionUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<SnackbarMessageManager> snackbarMessageManager;

  private final Provider<TimeProvider> timeProvider;

  private final Provider<NetworkUtils> networkUtils;

  private final Provider<AnalyticsHelper> analyticsHelper;

  private final Provider<Boolean> isReservationEnabledByRemoteConfig;

  private final Provider<CoroutineDispatcher> defaultDispatcher;

  @Inject
  SessionDetailViewModel_AssistedFactory(Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCase,
      Provider<StarEventAndNotifyUseCase> starEventUseCase,
      Provider<ReservationActionUseCase> reservationActionUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<SnackbarMessageManager> snackbarMessageManager, Provider<TimeProvider> timeProvider,
      Provider<NetworkUtils> networkUtils, Provider<AnalyticsHelper> analyticsHelper,
      @ReservationEnabledFlag Provider<Boolean> isReservationEnabledByRemoteConfig,
      @DefaultDispatcher Provider<CoroutineDispatcher> defaultDispatcher) {
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.loadUserSessionUseCase = loadUserSessionUseCase;
    this.loadRelatedSessionUseCase = loadRelatedSessionUseCase;
    this.starEventUseCase = starEventUseCase;
    this.reservationActionUseCase = reservationActionUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.snackbarMessageManager = snackbarMessageManager;
    this.timeProvider = timeProvider;
    this.networkUtils = networkUtils;
    this.analyticsHelper = analyticsHelper;
    this.isReservationEnabledByRemoteConfig = isReservationEnabledByRemoteConfig;
    this.defaultDispatcher = defaultDispatcher;
  }

  @Override
  @NonNull
  public SessionDetailViewModel create(@NonNull SavedStateHandle arg0) {
    return new SessionDetailViewModel(signInViewModelDelegate.get(), loadUserSessionUseCase.get(),
        loadRelatedSessionUseCase.get(), starEventUseCase.get(), reservationActionUseCase.get(),
        getTimeZoneUseCase.get(), snackbarMessageManager.get(), timeProvider.get(),
        networkUtils.get(), analyticsHelper.get(), isReservationEnabledByRemoteConfig.get(),
        defaultDispatcher.get());
  }
}
