package com.google.samples.apps.iosched.shared.domain.users;

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
public final class SwapActionUseCase_Factory implements Factory<SwapActionUseCase> {
  private final Provider<SessionAndUserEventRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public SwapActionUseCase_Factory(Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public SwapActionUseCase get() {
    return newInstance(repositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static SwapActionUseCase_Factory create(
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new SwapActionUseCase_Factory(repositoryProvider, ioDispatcherProvider);
  }

  public static SwapActionUseCase newInstance(SessionAndUserEventRepository repository,
      CoroutineDispatcher ioDispatcher) {
    return new SwapActionUseCase(repository, ioDispatcher);
  }
}
