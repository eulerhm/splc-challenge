package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
import com.google.samples.apps.iosched.shared.data.session.SessionRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SharedModule_ProvideSessionRepositoryFactory implements Factory<SessionRepository> {
  private final SharedModule module;

  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  public SharedModule_ProvideSessionRepositoryFactory(SharedModule module,
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    this.module = module;
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
  }

  @Override
  public SessionRepository get() {
    return provideSessionRepository(module, conferenceDataRepositoryProvider.get());
  }

  public static SharedModule_ProvideSessionRepositoryFactory create(SharedModule module,
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider) {
    return new SharedModule_ProvideSessionRepositoryFactory(module, conferenceDataRepositoryProvider);
  }

  public static SessionRepository provideSessionRepository(SharedModule instance,
      ConferenceDataRepository conferenceDataRepository) {
    return Preconditions.checkNotNull(instance.provideSessionRepository(conferenceDataRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
