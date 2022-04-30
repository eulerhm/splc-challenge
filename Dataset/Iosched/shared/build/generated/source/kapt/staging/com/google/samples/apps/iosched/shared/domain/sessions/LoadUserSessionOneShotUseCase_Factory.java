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
public final class LoadUserSessionOneShotUseCase_Factory implements Factory<LoadUserSessionOneShotUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadUserSessionOneShotUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadUserSessionOneShotUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadUserSessionOneShotUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadUserSessionOneShotUseCase_Factory(userEventRepositoryProvider, dispatcherProvider);
  }

  public static LoadUserSessionOneShotUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, CoroutineDispatcher dispatcher) {
    return new LoadUserSessionOneShotUseCase(userEventRepository, dispatcher);
  }
}
