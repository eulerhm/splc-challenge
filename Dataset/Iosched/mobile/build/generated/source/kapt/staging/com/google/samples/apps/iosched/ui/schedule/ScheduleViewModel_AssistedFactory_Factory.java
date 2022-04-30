package com.google.samples.apps.iosched.ui.schedule;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase;
import com.google.samples.apps.iosched.shared.domain.prefs.ScheduleUiHintsShownUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.ObserveConferenceDataUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.users.StarEventAndNotifyUseCase;
import com.google.samples.apps.iosched.shared.fcm.TopicSubscriber;
import com.google.samples.apps.iosched.ui.messages.SnackbarMessageManager;
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
public final class ScheduleViewModel_AssistedFactory_Factory implements Factory<ScheduleViewModel_AssistedFactory> {
  private final Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCaseProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider;

  private final Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCaseProvider;

  private final Provider<TopicSubscriber> topicSubscriberProvider;

  private final Provider<SnackbarMessageManager> snackbarMessageManagerProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCaseProvider;

  private final Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCaseProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public ScheduleViewModel_AssistedFactory_Factory(
      Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCaseProvider,
      Provider<TopicSubscriber> topicSubscriberProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCaseProvider,
      Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCaseProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.loadScheduleUserSessionsUseCaseProvider = loadScheduleUserSessionsUseCaseProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.starEventUseCaseProvider = starEventUseCaseProvider;
    this.scheduleUiHintsShownUseCaseProvider = scheduleUiHintsShownUseCaseProvider;
    this.topicSubscriberProvider = topicSubscriberProvider;
    this.snackbarMessageManagerProvider = snackbarMessageManagerProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.refreshConferenceDataUseCaseProvider = refreshConferenceDataUseCaseProvider;
    this.observeConferenceDataUseCaseProvider = observeConferenceDataUseCaseProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public ScheduleViewModel_AssistedFactory get() {
    return newInstance(loadScheduleUserSessionsUseCaseProvider, signInViewModelDelegateProvider, starEventUseCaseProvider, scheduleUiHintsShownUseCaseProvider, topicSubscriberProvider, snackbarMessageManagerProvider, getTimeZoneUseCaseProvider, refreshConferenceDataUseCaseProvider, observeConferenceDataUseCaseProvider, analyticsHelperProvider);
  }

  public static ScheduleViewModel_AssistedFactory_Factory create(
      Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<StarEventAndNotifyUseCase> starEventUseCaseProvider,
      Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCaseProvider,
      Provider<TopicSubscriber> topicSubscriberProvider,
      Provider<SnackbarMessageManager> snackbarMessageManagerProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCaseProvider,
      Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCaseProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new ScheduleViewModel_AssistedFactory_Factory(loadScheduleUserSessionsUseCaseProvider, signInViewModelDelegateProvider, starEventUseCaseProvider, scheduleUiHintsShownUseCaseProvider, topicSubscriberProvider, snackbarMessageManagerProvider, getTimeZoneUseCaseProvider, refreshConferenceDataUseCaseProvider, observeConferenceDataUseCaseProvider, analyticsHelperProvider);
  }

  public static ScheduleViewModel_AssistedFactory newInstance(
      Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<StarEventAndNotifyUseCase> starEventUseCase,
      Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCase,
      Provider<TopicSubscriber> topicSubscriber,
      Provider<SnackbarMessageManager> snackbarMessageManager,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCase,
      Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCase,
      Provider<AnalyticsHelper> analyticsHelper) {
    return new ScheduleViewModel_AssistedFactory(loadScheduleUserSessionsUseCase, signInViewModelDelegate, starEventUseCase, scheduleUiHintsShownUseCase, topicSubscriber, snackbarMessageManager, getTimeZoneUseCase, refreshConferenceDataUseCase, observeConferenceDataUseCase, analyticsHelper);
  }
}
