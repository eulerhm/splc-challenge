package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository;
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
public final class LoadUserSessionsUseCase_Factory implements Factory<LoadUserSessionsUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadUserSessionsUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadUserSessionsUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadUserSessionsUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadUserSessionsUseCase_Factory(userEventRepositoryProvider, dispatcherProvider);
  }

  public static LoadUserSessionsUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, CoroutineDispatcher dispatcher) {
    return new LoadUserSessionsUseCase(userEventRepository, dispatcher);
  }
}
