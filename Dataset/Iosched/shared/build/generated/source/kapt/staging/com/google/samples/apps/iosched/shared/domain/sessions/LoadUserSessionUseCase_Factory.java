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
public final class LoadUserSessionUseCase_Factory implements Factory<LoadUserSessionUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public LoadUserSessionUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public LoadUserSessionUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static LoadUserSessionUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new LoadUserSessionUseCase_Factory(userEventRepositoryProvider, ioDispatcherProvider);
  }

  public static LoadUserSessionUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, CoroutineDispatcher ioDispatcher) {
    return new LoadUserSessionUseCase(userEventRepository, ioDispatcher);
  }
}
