package com.google.samples.apps.iosched.shared.domain;

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
public final class RefreshConferenceDataUseCase_Factory implements Factory<RefreshConferenceDataUseCase> {
  private final Provider<ConferenceDataRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public RefreshConferenceDataUseCase_Factory(Provider<ConferenceDataRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public RefreshConferenceDataUseCase get() {
    return newInstance(repositoryProvider.get(), dispatcherProvider.get());
  }

  public static RefreshConferenceDataUseCase_Factory create(
      Provider<ConferenceDataRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new RefreshConferenceDataUseCase_Factory(repositoryProvider, dispatcherProvider);
  }

  public static RefreshConferenceDataUseCase newInstance(ConferenceDataRepository repository,
      CoroutineDispatcher dispatcher) {
    return new RefreshConferenceDataUseCase(repository, dispatcher);
  }
}
