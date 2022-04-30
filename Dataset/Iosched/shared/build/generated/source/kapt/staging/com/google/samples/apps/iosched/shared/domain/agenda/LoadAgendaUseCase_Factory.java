package com.google.samples.apps.iosched.shared.domain.agenda;

import com.google.samples.apps.iosched.shared.data.agenda.AgendaRepository;
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
public final class LoadAgendaUseCase_Factory implements Factory<LoadAgendaUseCase> {
  private final Provider<AgendaRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public LoadAgendaUseCase_Factory(Provider<AgendaRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public LoadAgendaUseCase get() {
    return newInstance(repositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static LoadAgendaUseCase_Factory create(Provider<AgendaRepository> repositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new LoadAgendaUseCase_Factory(repositoryProvider, ioDispatcherProvider);
  }

  public static LoadAgendaUseCase newInstance(AgendaRepository repository,
      CoroutineDispatcher ioDispatcher) {
    return new LoadAgendaUseCase(repository, ioDispatcher);
  }
}
