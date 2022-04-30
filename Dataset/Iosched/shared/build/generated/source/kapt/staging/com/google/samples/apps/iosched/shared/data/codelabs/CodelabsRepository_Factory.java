package com.google.samples.apps.iosched.shared.data.codelabs;

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
public final class CodelabsRepository_Factory implements Factory<CodelabsRepository> {
  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  public CodelabsRepository_Factory(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
  }

  @Override
  public CodelabsRepository get() {
    return newInstance(conferenceDataRepositoryProvider.get());
  }

  public static CodelabsRepository_Factory create(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    return new CodelabsRepository_Factory(conferenceDataRepositoryProvider);
  }

  public static CodelabsRepository newInstance(ConferenceDataRepository conferenceDataRepository) {
    return new CodelabsRepository(conferenceDataRepository);
  }
}
