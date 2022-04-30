package com.google.samples.apps.iosched.shared.data.config;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
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
public final class RemoteAppConfigDataSource_Factory implements Factory<RemoteAppConfigDataSource> {
  private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;

  private final Provider<FirebaseRemoteConfigSettings> configSettingsProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public RemoteAppConfigDataSource_Factory(
      Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider,
      Provider<FirebaseRemoteConfigSettings> configSettingsProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
    this.configSettingsProvider = configSettingsProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public RemoteAppConfigDataSource get() {
    return newInstance(firebaseRemoteConfigProvider.get(), configSettingsProvider.get(), ioDispatcherProvider.get());
  }

  public static RemoteAppConfigDataSource_Factory create(
      Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider,
      Provider<FirebaseRemoteConfigSettings> configSettingsProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new RemoteAppConfigDataSource_Factory(firebaseRemoteConfigProvider, configSettingsProvider, ioDispatcherProvider);
  }

  public static RemoteAppConfigDataSource newInstance(FirebaseRemoteConfig firebaseRemoteConfig,
      FirebaseRemoteConfigSettings configSettings, CoroutineDispatcher ioDispatcher) {
    return new RemoteAppConfigDataSource(firebaseRemoteConfig, configSettings, ioDispatcher);
  }
}
