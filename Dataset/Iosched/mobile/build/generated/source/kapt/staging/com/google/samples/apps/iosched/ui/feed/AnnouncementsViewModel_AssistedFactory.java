package com.google.samples.apps.iosched.ui.feed;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AnnouncementsViewModel_AssistedFactory implements ViewModelAssistedFactory<AnnouncementsViewModel> {
  private final Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCase;

  private final Provider<TimeProvider> timeProvider;

  @Inject
  AnnouncementsViewModel_AssistedFactory(
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase, Provider<TimeProvider> timeProvider) {
    this.loadAnnouncementsUseCase = loadAnnouncementsUseCase;
    this.getTimeZoneUseCase = getTimeZoneUseCase;
    this.timeProvider = timeProvider;
  }

  @Override
  @NonNull
  public AnnouncementsViewModel create(@NonNull SavedStateHandle arg0) {
    return new AnnouncementsViewModel(loadAnnouncementsUseCase.get(), getTimeZoneUseCase.get(),
        timeProvider.get());
  }
}
