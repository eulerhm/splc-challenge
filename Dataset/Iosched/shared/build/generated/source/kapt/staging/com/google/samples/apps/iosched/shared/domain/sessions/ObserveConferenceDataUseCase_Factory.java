package com.google.samples.apps.iosched.shared.domain.sessions;

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
public final class ObserveConferenceDataUseCase_Factory implements Factory<ObserveConferenceDataUseCase> {
  private final Provider<ConferenceDataRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public ObserveConferenceDataUseCase_Factory(Provider<ConferenceDataRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public ObserveConferenceDataUseCase get() {
    return newInstance(repositoryProvider.get(), dispatcherProvider.get());
  }

  public static ObserveConferenceDataUseCase_Factory create(
      Provider<ConferenceDataRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new ObserveConferenceDataUseCase_Factory(repositoryProvider, dispatcherProvider);
  }

  public static ObserveConferenceDataUseCase newInstance(ConferenceDataRepository repository,
      CoroutineDispatcher dispatcher) {
    return new ObserveConferenceDataUseCase(repository, dispatcher);
  }
}
