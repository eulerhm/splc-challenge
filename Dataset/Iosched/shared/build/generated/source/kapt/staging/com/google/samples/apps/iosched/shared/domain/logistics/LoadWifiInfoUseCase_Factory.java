package com.google.samples.apps.iosched.shared.domain.logistics;

import com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource;
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
public final class LoadWifiInfoUseCase_Factory implements Factory<LoadWifiInfoUseCase> {
  private final Provider<AppConfigDataSource> appConfigDataSourceProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadWifiInfoUseCase_Factory(Provider<AppConfigDataSource> appConfigDataSourceProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.appConfigDataSourceProvider = appConfigDataSourceProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadWifiInfoUseCase get() {
    return newInstance(appConfigDataSourceProvider.get(), dispatcherProvider.get());
  }

  public static LoadWifiInfoUseCase_Factory create(
      Provider<AppConfigDataSource> appConfigDataSourceProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadWifiInfoUseCase_Factory(appConfigDataSourceProvider, dispatcherProvider);
  }

  public static LoadWifiInfoUseCase newInstance(AppConfigDataSource appConfigDataSource,
      CoroutineDispatcher dispatcher) {
    return new LoadWifiInfoUseCase(appConfigDataSource, dispatcher);
  }
}
