package com.google.samples.apps.iosched.shared.domain.codelabs;

import com.google.samples.apps.iosched.shared.data.codelabs.CodelabsRepository;
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
public final class LoadCodelabsUseCase_Factory implements Factory<LoadCodelabsUseCase> {
  private final Provider<CodelabsRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public LoadCodelabsUseCase_Factory(Provider<CodelabsRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public LoadCodelabsUseCase get() {
    return newInstance(repositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static LoadCodelabsUseCase_Factory create(Provider<CodelabsRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new LoadCodelabsUseCase_Factory(repositoryProvider, ioDispatcherProvider);
  }

  public static LoadCodelabsUseCase newInstance(CodelabsRepository repository,
      CoroutineDispatcher ioDispatcher) {
    return new LoadCodelabsUseCase(repository, ioDispatcher);
  }
}
