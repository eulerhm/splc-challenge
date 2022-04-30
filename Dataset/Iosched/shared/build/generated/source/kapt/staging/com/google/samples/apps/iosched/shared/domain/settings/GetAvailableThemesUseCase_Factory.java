package com.google.samples.apps.iosched.shared.domain.settings;

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
public final class GetAvailableThemesUseCase_Factory implements Factory<GetAvailableThemesUseCase> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public GetAvailableThemesUseCase_Factory(Provider<CoroutineDispatcher> dispatcherProvider) {
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public GetAvailableThemesUseCase get() {
    return newInstance(dispatcherProvider.get());
  }

  public static GetAvailableThemesUseCase_Factory create(
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new GetAvailableThemesUseCase_Factory(dispatcherProvider);
  }

  public static GetAvailableThemesUseCase newInstance(CoroutineDispatcher dispatcher) {
    return new GetAvailableThemesUseCase(dispatcher);
  }
}
