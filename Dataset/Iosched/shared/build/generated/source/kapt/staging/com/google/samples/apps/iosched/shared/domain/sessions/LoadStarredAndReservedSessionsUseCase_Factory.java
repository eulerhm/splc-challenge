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
public final class LoadStarredAndReservedSessionsUseCase_Factory implements Factory<LoadStarredAndReservedSessionsUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadStarredAndReservedSessionsUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadStarredAndReservedSessionsUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadStarredAndReservedSessionsUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadStarredAndReservedSessionsUseCase_Factory(userEventRepositoryProvider, dispatcherProvider);
  }

  public static LoadStarredAndReservedSessionsUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, CoroutineDispatcher dispatcher) {
    return new LoadStarredAndReservedSessionsUseCase(userEventRepository, dispatcher);
  }
}
