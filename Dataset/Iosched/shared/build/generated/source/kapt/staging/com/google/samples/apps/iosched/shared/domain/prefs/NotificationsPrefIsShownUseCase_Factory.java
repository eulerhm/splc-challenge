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
public final class NotificationsPrefIsShownUseCase_Factory implements Factory<NotificationsPrefIsShownUseCase> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public NotificationsPrefIsShownUseCase_Factory(
      Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public NotificationsPrefIsShownUseCase get() {
    return newInstance(preferenceStorageProvider.get(), dispatcherProvider.get());
  }

  public static NotificationsPrefIsShownUseCase_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new NotificationsPrefIsShownUseCase_Factory(preferenceStorageProvider, dispatcherProvider);
  }

  public static NotificationsPrefIsShownUseCase newInstance(PreferenceStorage preferenceStorage,
      CoroutineDispatcher dispatcher) {
    return new NotificationsPrefIsShownUseCase(preferenceStorage, dispatcher);
  }
}
