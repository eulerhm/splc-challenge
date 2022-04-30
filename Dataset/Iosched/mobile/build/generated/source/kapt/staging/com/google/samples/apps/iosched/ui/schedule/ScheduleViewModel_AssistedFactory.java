package com.google.samples.apps.iosched.ui.schedule;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
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
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ScheduleViewModel_AssistedFactory implements ViewModelAssistedFactory<ScheduleViewModel> {
  private final Provider<LoadScheduleUserSessionsUseCase> loadScheduleUserSessionsUseCase;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<StarEventAndNotifyUseCase> starEventUseCase;

  private final Provider<ScheduleUiHintsShownUseCase> scheduleUiHintsShownUseCase;

  private final Provider<TopicSubscriber> topicSubscriber;

  private final Provider<SnackbarMessageManager> snackbarMessageManager;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<RefreshConferenceDataUseCase> refreshConferenceDataUseCase;

  private final Provider<ObserveConferenceDataUseCase> observeConferenceDataUseCase;

  private final Provider<AnalyticsHelper> analyticsHelper;

  @Inject
  ScheduleViewModel_AssistedFactory(
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
    this.loadScheduleUserSessionsUseCase = loadScheduleUserSessionsUseCase;
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.starEventUseCase = starEventUseCase;
    this.scheduleUiHintsShownUseCase = scheduleUiHintsShownUseCase;
    this.topicSubscriber = topicSubscriber;
    this.snackbarMessageManager = snackbarMessageManager;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.refreshConferenceDataUseCase = refreshConferenceDataUseCase;
    this.observeConferenceDataUseCase = observeConferenceDataUseCase;
    this.analyticsHelper = analyticsHelper;
  }

  @Override
  @NonNull
  public ScheduleViewModel create(@NonNull SavedStateHandle arg0) {
    return new ScheduleViewModel(loadScheduleUserSessionsUseCase.get(),
        signInViewModelDelegate.get(), starEventUseCase.get(), scheduleUiHintsShownUseCase.get(),
        topicSubscriber.get(), snackbarMessageManager.get(), getTimeZoneUseCase.get(),
        refreshConferenceDataUseCase.get(), observeConferenceDataUseCase.get(),
        analyticsHelper.get());
  }
}
