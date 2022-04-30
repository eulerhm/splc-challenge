package com.google.samples.apps.iosched.ui.feed;

import com.google.samples.apps.iosched.shared.domain.feed.LoadAnnouncementsUseCase;
import com.google.samples.apps.iosched.shared.domain.settings.GetTimeZoneUseCase;
import com.google.samples.apps.iosched.shared.time.TimeProvider;
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
public final class AnnouncementsViewModel_AssistedFactory_Factory implements Factory<AnnouncementsViewModel_AssistedFactory> {
  private final Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider;

  private final Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider;

  private final Provider<TimeProvider> timeProvider;

  public AnnouncementsViewModel_AssistedFactory_Factory(
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<TimeProvider> timeProvider) {
    this.loadAnnouncementsUseCaseProvider = loadAnnouncementsUseCaseProvider;
    this.getTimeZoneUseCaseProvider = getTimeZoneUseCaseProvider;
    this.timeProvider = timeProvider;
  }

  @Override
  public AnnouncementsViewModel_AssistedFactory get() {
    return newInstance(loadAnnouncementsUseCaseProvider, getTimeZoneUseCaseProvider, timeProvider);
  }

  public static AnnouncementsViewModel_AssistedFactory_Factory create(
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCaseProvider,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCaseProvider,
      Provider<TimeProvider> timeProvider) {
    return new AnnouncementsViewModel_AssistedFactory_Factory(loadAnnouncementsUseCaseProvider, getTimeZoneUseCaseProvider, timeProvider);
  }

  public static AnnouncementsViewModel_AssistedFactory newInstance(
      Provider<LoadAnnouncementsUseCase> loadAnnouncementsUseCase,
      Provider<GetTimeZoneUseCase> getTimeZoneUseCase, Provider<TimeProvider> timeProvider) {
    return new AnnouncementsViewModel_AssistedFactory(loadAnnouncementsUseCase, getTimeZoneUseCase, timeProvider);
  }
}
