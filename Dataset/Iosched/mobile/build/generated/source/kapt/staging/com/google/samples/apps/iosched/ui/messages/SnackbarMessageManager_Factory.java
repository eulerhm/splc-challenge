package com.google.samples.apps.iosched.ui.messages;

import com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SnackbarMessageManager_Factory implements Factory<SnackbarMessageManager> {
  private final Provider<PreferenceStorage> preferenceStorageProvider;

  public SnackbarMessageManager_Factory(Provider<PreferenceStorage> preferenceStorageProvider) {
    this.preferenceStorageProvider = preferenceStorageProvider;
  }

  @Override
  public SnackbarMessageManager get() {
    return newInstance(preferenceStorageProvider.get());
  }

  public static SnackbarMessageManager_Factory create(
      Provider<PreferenceStorage> preferenceStorageProvider) {
    return new SnackbarMessageManager_Factory(preferenceStorageProvider);
  }

  public static SnackbarMessageManager newInstance(PreferenceStorage preferenceStorage) {
    return new SnackbarMessageManager(preferenceStorage);
  }
}
