package com.google.samples.apps.iosched.shared.domain.prefs;

import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
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
public final class OptIntoMyLocationUseCase_Factory implements Factory<OptIntoMyLocationUseCase> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public OptIntoMyLocationUseCase_Factory(Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public OptIntoMyLocationUseCase get() {
    return newInstance(preferenceStorageProvider.get(), dispatcherProvider.get());
  }

  public static OptIntoMyLocationUseCase_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new OptIntoMyLocationUseCase_Factory(preferenceStorageProvider, dispatcherProvider);
  }

  public static OptIntoMyLocationUseCase newInstance(PreferenceStorage preferenceStorage,
      CoroutineDispatcher dispatcher) {
    return new OptIntoMyLocationUseCase(preferenceStorage, dispatcher);
  }
}
