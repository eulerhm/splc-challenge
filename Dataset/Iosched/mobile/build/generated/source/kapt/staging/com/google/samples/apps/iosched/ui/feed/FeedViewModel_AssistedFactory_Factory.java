package com.google.samples.apps.iosched.ui.feed;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.feed.GetConferenceStateUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase;
import com.google.samples.apps.iosched.shared.domain.feed.LoadCurrentMomentUseCase;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadStarredAndReservedSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import com.google.samples.apps.iosched.ui.theme.ThemedActivityDelegate;
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
public final class FeedViewModel_AssistedFactory_Factory implements Factory<FeedViewModel_AssistedFactory> {
  private final Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCaseProvider;

  private final Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider;

  private final Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<GetConferenceStateUseCase> getConferenceStateUseCaseProvider;

  private final Provider<TimeProvider> timeProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<ThemedActivityDelegate> themedActivityDelegateProvider;

  public FeedViewModel_AssistedFactory_Factory(
      Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCaseProvider,
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider,
      Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<GetConferenceStateUseCase> getConferenceStateUseCaseProvider,
      Provider<TimeProvider> timeProvider, Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider) {
    this.loadCurrentMomentUseCaseProvider = loadCurrentMomentUseCaseProvider;
    this.loadAnnouncementsUseCaseProvider = loadAnnouncementsUseCaseProvider;
    this.loadStarredAndReservedSessionsUseCaseProvider = loadStarredAndReservedSessionsUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.getConferenceStateUseCaseProvider = getConferenceStateUseCaseProvider;
    this.timeProvider = timeProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.themedActivityDelegateProvider = themedActivityDelegateProvider;
  }

  @Override
  public FeedViewModel_AssistedFactory get() {
    return newInstance(loadCurrentMomentUseCaseProvider, loadAnnouncementsUseCaseProvider, loadStarredAndReservedSessionsUseCaseProvider, getTimeZoneUseCaseProvider, getConferenceStateUseCaseProvider, timeProvider, analyticsHelperProvider, signInViewModelDelegateProvider, themedActivityDelegateProvider);
  }

  public static FeedViewModel_AssistedFactory_Factory create(
      Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCaseProvider,
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider,
      Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<GetConferenceStateUseCase> getConferenceStateUseCaseProvider,
      Provider<TimeProvider> timeProvider, Provider<AnalyticsHelper> analyticsHelperProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<ThemedActivityDelegate> themedActivityDelegateProvider) {
    return new FeedViewModel_AssistedFactory_Factory(loadCurrentMomentUseCaseProvider, loadAnnouncementsUseCaseProvider, loadStarredAndReservedSessionsUseCaseProvider, getTimeZoneUseCaseProvider, getConferenceStateUseCaseProvider, timeProvider, analyticsHelperProvider, signInViewModelDelegateProvider, themedActivityDelegateProvider);
  }

  public static FeedViewModel_AssistedFactory newInstance(
      Provider<LoadCurrentMomentUseCase> loadCurrentMomentUseCase,
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase,
      Provider<LoadStarredAndReservedSessionsUseCase> loadStarredAndReservedSessionsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<GetConferenceStateUseCase> getConferenceStateUseCase,
      Provider<TimeProvider> timeProvider, Provider<AnalyticsHelper> analyticsHelper,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<ThemedActivityDelegate> themedActivityDelegate) {
    return new FeedViewModel_AssistedFactory(loadCurrentMomentUseCase, loadAnnouncementsUseCase, loadStarredAndReservedSessionsUseCase, getTimeZoneUseCase, getConferenceStateUseCase, timeProvider, analyticsHelper, signInViewModelDelegate, themedActivityDelegate);
  }
}
