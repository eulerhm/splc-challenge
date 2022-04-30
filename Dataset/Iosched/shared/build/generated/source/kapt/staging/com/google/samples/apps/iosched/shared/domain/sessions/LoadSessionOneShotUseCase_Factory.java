package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.samples.apps.iosched.shared.data.session.SessionRepository;
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
public final class LoadSessionOneShotUseCase_Factory implements Factory<LoadSessionOneShotUseCase> {
  private final Provider<SessionRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadSessionOneShotUseCase_Factory(Provider<SessionRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadSessionOneShotUseCase get() {
    return newInstance(repositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadSessionOneShotUseCase_Factory create(
      Provider<SessionRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadSessionOneShotUseCase_Factory(repositoryProvider, dispatcherProvider);
  }

  public static LoadSessionOneShotUseCase newInstance(SessionRepository repository,
      CoroutineDispatcher dispatcher) {
    return new LoadSessionOneShotUseCase(repository, dispatcher);
  }
}
