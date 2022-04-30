package com.google.samples.apps.iosched.ui.sessiondetail;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.users.ReservationActionUseCase;
import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import com.google.samples.apps.iosched.shared.util.NetworkUtils;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
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
public final class SessionDetailViewModel_AssistedFactory_Factory implements Factory<SessionDetailViewModel_AssistedFactory> {
  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider;

  private final Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCaseProvider;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider;

  private final Provider<ReservationActionUseCase> reservationActionUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<TimeProvider> timeProvider;

  private final Provider<NetworkUtils> networkUtilsProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<Boolean> isReservationEnabledByRemoteConfigProvider;

  private final Provider<CoroutineDispatcher> defaultDispatcherProvider;

  public SessionDetailViewModel_AssistedFactory_Factory(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCaseProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<ReservationActionUseCase> reservationActionUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<TimeProvider> timeProvider, Provider<NetworkUtils> networkUtilsProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider,
      Provider<CoroutineDispatcher> defaultDispatcherProvider) {
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.loadUserSessionUseCaseProvider = loadUserSessionUseCaseProvider;
    this.loadRelatedSessionUseCaseProvider = loadRelatedSessionUseCaseProvider;
    this.starEventUseCaseProvider = starEventUseCaseProvider;
    this.reservationActionUseCaseProvider = reservationActionUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.timeProvider = timeProvider;
    this.networkUtilsProvider = networkUtilsProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.isReservationEnabledByRemoteConfigProvider = isReservationEnabledByRemoteConfigProvider;
    this.defaultDispatcherProvider = defaultDispatcherProvider;
  }

  @Override
  public SessionDetailViewModel_AssistedFactory get() {
    return newInstance(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, loadRelatedSessionUseCaseProvider, starEventUseCaseProvider, reservationActionUseCaseProvider, getTimeZoneUseCaseProvider, snackbarMessageManagerProvider, timeProvider, networkUtilsProvider, analyticsHelperProvider, isReservationEnabledByRemoteConfigProvider, defaultDispatcherProvider);
  }

  public static SessionDetailViewModel_AssistedFactory_Factory create(
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCaseProvider,
      Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCaseProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<ReservationActionUseCase> reservationActionUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<TimeProvider> timeProvider, Provider<NetworkUtils> networkUtilsProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<Boolean> isReservationEnabledByRemoteConfigProvider,
      Provider<CoroutineDispatcher> defaultDispatcherProvider) {
    return new SessionDetailViewModel_AssistedFactory_Factory(signInViewModelDelegateProvider, loadUserSessionUseCaseProvider, loadRelatedSessionUseCaseProvider, starEventUseCaseProvider, reservationActionUseCaseProvider, getTimeZoneUseCaseProvider, snackbarMessageManagerProvider, timeProvider, networkUtilsProvider, analyticsHelperProvider, isReservationEnabledByRemoteConfigProvider, defaultDispatcherProvider);
  }

  public static SessionDetailViewModel_AssistedFactory newInstance(
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<LoadUserSessionUseCase> loadUserSessionUseCase,
      Provider<LoadUserSessionsUseCase> loadRelatedSessionUseCase,
      Provider<StarEventAndNotifyUseCase> starEventUseCase,
      Provider<ReservationActionUseCase> reservationActionUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<SnackbarMessageManager> snackbarMessageManager, Provider<TimeProvider> timeProvider,
      Provider<NetworkUtils> networkUtils, Provider<AnalyticsHelper> analyticsHelper,
      Provider<Boolean> isReservationEnabledByRemoteConfig,
      Provider<CoroutineDispatcher> defaultDispatcher) {
    return new SessionDetailViewModel_AssistedFactory(signInViewModelDelegate, loadUserSessionUseCase, loadRelatedSessionUseCase, starEventUseCase, reservationActionUseCase, getTimeZoneUseCase, snackbarMessageManager, timeProvider, networkUtils, analyticsHelper, isReservationEnabledByRemoteConfig, defaultDispatcher);
  }
}
