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
public final class LoadScheduleUserSessionsUseCase_Factory implements Factory<LoadScheduleUserSessionsUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadScheduleUserSessionsUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadScheduleUserSessionsUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadScheduleUserSessionsUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadScheduleUserSessionsUseCase_Factory(userEventRepositoryProvider, dispatcherProvider);
  }

  public static LoadScheduleUserSessionsUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, CoroutineDispatcher dispatcher) {
    return new LoadScheduleUserSessionsUseCase(userEventRepository, dispatcher);
  }
}
