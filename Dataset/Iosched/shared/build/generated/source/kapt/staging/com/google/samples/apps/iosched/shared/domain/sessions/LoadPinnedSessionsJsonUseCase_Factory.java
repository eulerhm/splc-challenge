package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.gson.Gson;
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
public final class LoadPinnedSessionsJsonUseCase_Factory implements Factory<LoadPinnedSessionsJsonUseCase> {
  private final Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider;

  private final Provider<Gson> gsonProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public LoadPinnedSessionsJsonUseCase_Factory(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<Gson> gsonProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.userEventRepositoryProvider = userEventRepositoryProvider;
    this.gsonProvider = gsonProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public LoadPinnedSessionsJsonUseCase get() {
    return newInstance(userEventRepositoryProvider.get(), gsonProvider.get(), ioDispatcherProvider.get());
  }

  public static LoadPinnedSessionsJsonUseCase_Factory create(
      Provider<DefaultSessionAndUserEventRepository> userEventRepositoryProvider,
      Provider<Gson> gsonProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new LoadPinnedSessionsJsonUseCase_Factory(userEventRepositoryProvider, gsonProvider, ioDispatcherProvider);
  }

  public static LoadPinnedSessionsJsonUseCase newInstance(
      DefaultSessionAndUserEventRepository userEventRepository, Gson gson,
      CoroutineDispatcher ioDispatcher) {
    return new LoadPinnedSessionsJsonUseCase(userEventRepository, gson, ioDispatcher);
  }
}
