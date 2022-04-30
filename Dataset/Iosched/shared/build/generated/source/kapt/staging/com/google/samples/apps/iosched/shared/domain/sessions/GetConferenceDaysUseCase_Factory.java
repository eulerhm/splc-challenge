package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
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
public final class GetConferenceDaysUseCase_Factory implements Factory<GetConferenceDaysUseCase> {
  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  public GetConferenceDaysUseCase_Factory(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
  }

  @Override
  public GetConferenceDaysUseCase get() {
    return newInstance(conferenceDataRepositoryProvider.get());
  }

  public static GetConferenceDaysUseCase_Factory create(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    return new GetConferenceDaysUseCase_Factory(conferenceDataRepositoryProvider);
  }

  public static GetConferenceDaysUseCase newInstance(
      ConferenceDataRepository conferenceDataRepository) {
    return new GetConferenceDaysUseCase(conferenceDataRepository);
  }
}
