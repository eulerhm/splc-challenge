package com.google.samples.apps.iosched.shared.domain.ar;

import com.google.samples.apps.iosched.shared.data.ar.ArDebugFlagEndpoint;
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
public final class LoadArDebugFlagUseCase_Factory implements Factory<LoadArDebugFlagUseCase> {
  private final Provider<ArDebugFlagEndpoint> endpointProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public LoadArDebugFlagUseCase_Factory(Provider<ArDebugFlagEndpoint> endpointProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.endpointProvider = endpointProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public LoadArDebugFlagUseCase get() {
    return newInstance(endpointProvider.get(), ioDispatcherProvider.get());
  }

  public static LoadArDebugFlagUseCase_Factory create(
      Provider<ArDebugFlagEndpoint> endpointProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new LoadArDebugFlagUseCase_Factory(endpointProvider, ioDispatcherProvider);
  }

  public static LoadArDebugFlagUseCase newInstance(ArDebugFlagEndpoint endpoint,
      CoroutineDispatcher ioDispatcher) {
    return new LoadArDebugFlagUseCase(endpoint, ioDispatcher);
  }
}
