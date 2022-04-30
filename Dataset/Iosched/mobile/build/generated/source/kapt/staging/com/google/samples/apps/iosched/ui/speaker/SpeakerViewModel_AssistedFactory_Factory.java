package com.google.samples.apps.iosched.ui.speaker;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate;
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
public final class SpeakerViewModel_AssistedFactory_Factory implements Factory<SpeakerViewModel_AssistedFactory> {
  private final Provider<LoadSpeakerUseCase> loadSpeakerUseCaseProvider;

  private final Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegateProvider;

  private final Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegateProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public SpeakerViewModel_AssistedFactory_Factory(
      Provider<LoadSpeakerUseCase> loadSpeakerUseCaseProvider,
      Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegateProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.loadSpeakerUseCaseProvider = loadSpeakerUseCaseProvider;
    this.loadSpeakerSessionsUseCaseProvider = loadSpeakerSessionsUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.signInViewModelDelegateProvider = signInViewModelDelegateProvider;
    this.eventActionsViewModelDelegateProvider = eventActionsViewModelDelegateProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public SpeakerViewModel_AssistedFactory get() {
    return newInstance(loadSpeakerUseCaseProvider, loadSpeakerSessionsUseCaseProvider, getTimeZoneUseCaseProvider, signInViewModelDelegateProvider, eventActionsViewModelDelegateProvider, analyticsHelperProvider);
  }

  public static SpeakerViewModel_AssistedFactory_Factory create(
      Provider<LoadSpeakerUseCase> loadSpeakerUseCaseProvider,
      Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<SignInViewModelDelegate> signInViewModelDelegateProvider,
      Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegateProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new SpeakerViewModel_AssistedFactory_Factory(loadSpeakerUseCaseProvider, loadSpeakerSessionsUseCaseProvider, getTimeZoneUseCaseProvider, signInViewModelDelegateProvider, eventActionsViewModelDelegateProvider, analyticsHelperProvider);
  }

  public static SpeakerViewModel_AssistedFactory newInstance(
      Provider<LoadSpeakerUseCase> loadSpeakerUseCase,
      Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegate,
      Provider<AnalyticsHelper> analyticsHelper) {
    return new SpeakerViewModel_AssistedFactory(loadSpeakerUseCase, loadSpeakerSessionsUseCase, getTimeZoneUseCase, signInViewModelDelegate, eventActionsViewModelDelegate, analyticsHelper);
  }
}
