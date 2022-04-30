package com.google.samples.apps.iosched.shared.domain.speakers;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoadSpeakerUseCase_Factory implements Factory<LoadSpeakerUseCase> {
  private final Provider<ConferenceDataRepository> conferenceDataRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadSpeakerUseCase_Factory(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.conferenceDataRepositoryProvider = conferenceDataRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadSpeakerUseCase get() {
    return newInstance(conferenceDataRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadSpeakerUseCase_Factory create(
      Provider<ConferenceDataRepository> conferenceDataRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadSpeakerUseCase_Factory(conferenceDataRepositoryProvider, dispatcherProvider);
  }

  public static LoadSpeakerUseCase newInstance(ConferenceDataRepository conferenceDataRepository,
      CoroutineDispatcher dispatcher) {
    return new LoadSpeakerUseCase(conferenceDataRepository, dispatcher);
  }
}
