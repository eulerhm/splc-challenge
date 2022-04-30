package com.google.samples.apps.iosched.ui.feed;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.feed.GetConferenceStateUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FeedViewModel_AssistedFactory implements ViewModelAssistedFactory<FeedViewModel> {
  private final Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCase;

  private final Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase;

  private final Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<GetConferenceStateUseCase> getConferenceStateUseCase;

  private final Provider<TimeProvider> timeProvider;

  private final Provider<AnalyticsHelper> analyticsHelper;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<ThemedActivityDelegate> themedActivityDelegate;

  @Inject
  FeedViewModel_AssistedFactory(Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCase,
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase,
      Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<GetConferenceStateUseCase> getConferenceStateUseCase,
      Provider<TimeProvider> timeProvider, Provider<AnalyticsHelper> analyticsHelper,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<ThemedActivityDelegate> themedActivityDelegate) {
    this.loadCurrentMomentUseCase = loadCurrentMomentUseCase;
    this.loadAnnouncementsUseCase = loadAnnouncementsUseCase;
    this.loadStarredAndReservedSessionsUseCase = loadStarredAndReservedSessionsUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.getConferenceStateUseCase = getConferenceStateUseCase;
    this.timeProvider = timeProvider;
    this.analyticsHelper = analyticsHelper;
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.themedActivityDelegate = themedActivityDelegate;
  }

  @Override
  @NonNull
  public FeedViewModel create(@NonNull SavedStateHandle arg0) {
    return new FeedViewModel(loadCurrentMomentUseCase.get(), loadAnnouncementsUseCase.get(),
        loadStarredAndReservedSessionsUseCase.get(), getTimeZoneUseCase.get(),
        getConferenceStateUseCase.get(), timeProvider.get(), analyticsHelper.get(),
        signInViewModelDelegate.get(), themedActivityDelegate.get());
  }
}
