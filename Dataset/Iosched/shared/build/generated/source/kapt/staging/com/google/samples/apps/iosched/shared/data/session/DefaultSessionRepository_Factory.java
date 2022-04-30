package com.google.samples.apps.iosched.shared.data.session;

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
public final class DefaultSessionRepository_Factory implements Factory<DefaultSessionRepository> {
  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  public DefaultSessionRepository_Factory(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
  }

  @Override
  public DefaultSessionRepository get() {
    return newInstance(conferenceDataRepositoryProvider.get());
  }

  public static DefaultSessionRepository_Factory create(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    return new DefaultSessionRepository_Factory(conferenceDataRepositoryProvider);
  }

  public static DefaultSessionRepository newInstance(
      ConferenceDataRepository conferenceDataRepository) {
    return new DefaultSessionRepository(conferenceDataRepository);
  }
}
