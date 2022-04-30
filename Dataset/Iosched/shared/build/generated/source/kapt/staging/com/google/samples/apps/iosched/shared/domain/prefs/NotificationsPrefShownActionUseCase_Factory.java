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
public final class NotificationsPrefShownActionUseCase_Factory implements Factory<NotificationsPrefShownActionUseCase> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public NotificationsPrefShownActionUseCase_Factory(
      Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public NotificationsPrefShownActionUseCase get() {
    return newInstance(preferenceStorageProvider.get(), dispatcherProvider.get());
  }

  public static NotificationsPrefShownActionUseCase_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new NotificationsPrefShownActionUseCase_Factory(preferenceStorageProvider, dispatcherProvider);
  }

  public static NotificationsPrefShownActionUseCase newInstance(PreferenceStorage preferenceStorage,
      CoroutineDispatcher dispatcher) {
    return new NotificationsPrefShownActionUseCase(preferenceStorage, dispatcher);
  }
}
