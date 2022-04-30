package com.google.samples.apps.iosched.ui.speaker;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.domain.speakers.LoadSpeakerUseCase;
import com.google.samples.apps.iosched.ui.sessioncommon.EventActionsViewModelDelegate;
import com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SpeakerViewModel_AssistedFactory implements ViewModelAssistedFactory<SpeakerViewModel> {
  private final Provider<LoadSpeakerUseCase> loadSpeakerUseCase;

  private final Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<SignInViewModelDelegate> signInViewModelDelegate;

  private final Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegate;

  private final Provider<AnalyticsHelper> analyticsHelper;

  @Inject
  SpeakerViewModel_AssistedFactory(Provider<LoadSpeakerUseCase> loadSpeakerUseCase,
      Provider<LoadUserSessionsUseCase> loadSpeakerSessionsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase,
      Provider<SignInViewModelDelegate> signInViewModelDelegate,
      Provider<EventActionsViewModelDelegate> eventActionsViewModelDelegate,
      Provider<AnalyticsHelper> analyticsHelper) {
    this.loadSpeakerUseCase = loadSpeakerUseCase;
    this.loadSpeakerSessionsUseCase = loadSpeakerSessionsUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.signInViewModelDelegate = signInViewModelDelegate;
    this.eventActionsViewModelDelegate = eventActionsViewModelDelegate;
    this.analyticsHelper = analyticsHelper;
  }

  @Override
  @NonNull
  public SpeakerViewModel create(@NonNull SavedStateHandle arg0) {
    return new SpeakerViewModel(loadSpeakerUseCase.get(), loadSpeakerSessionsUseCase.get(),
        getTimeZoneUseCase.get(), signInViewModelDelegate.get(),
        eventActionsViewModelDelegate.get(), analyticsHelper.get());
  }
}
