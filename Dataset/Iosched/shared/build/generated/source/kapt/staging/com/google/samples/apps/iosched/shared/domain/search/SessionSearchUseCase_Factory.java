package com.google.samples.apps.iosched.shared.domain.search;

import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
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
public final class SessionSearchUseCase_Factory implements Factory<SessionSearchUseCase> {
  private final Provider<SessionAndUserEventRepository> repositoryProvider;

  private final Provider<SessionTextMatchStrategy> textMatchStrategyProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public SessionSearchUseCase_Factory(Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<SessionTextMatchStrategy> textMatchStrategyProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.textMatchStrategyProvider = textMatchStrategyProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public SessionSearchUseCase get() {
    return newInstance(repositoryProvider.get(), textMatchStrategyProvider.get(), dispatcherProvider.get());
  }

  public static SessionSearchUseCase_Factory create(
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<SessionTextMatchStrategy> textMatchStrategyProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new SessionSearchUseCase_Factory(repositoryProvider, textMatchStrategyProvider, dispatcherProvider);
  }

  public static SessionSearchUseCase newInstance(SessionAndUserEventRepository repository,
      SessionTextMatchStrategy textMatchStrategy, CoroutineDispatcher dispatcher) {
    return new SessionSearchUseCase(repository, textMatchStrategy, dispatcher);
  }
}
