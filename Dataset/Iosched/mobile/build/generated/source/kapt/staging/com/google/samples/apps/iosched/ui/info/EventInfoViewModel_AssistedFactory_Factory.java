package com.google.samples.apps.iosched.ui.info;

import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase;
import com.google.samples.apps.iosched.util.wifi.WifiInstaller;
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
public final class EventInfoViewModel_AssistedFactory_Factory implements Factory<EventInfoViewModel_AssistedFactory> {
  private final Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider;

  private final Provider<WifiInstaller> wifiInstallerProvider;

  private final Provider<AnalyticsHelper> analyticsHelperProvider;

  public EventInfoViewModel_AssistedFactory_Factory(
      Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider,
      Provider<WifiInstaller> wifiInstallerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    this.loadWifiInfoUseCaseProvider = loadWifiInfoUseCaseProvider;
    this.wifiInstallerProvider = wifiInstallerProvider;
    this.analyticsHelperProvider = analyticsHelperProvider;
  }

  @Override
  public EventInfoViewModel_AssistedFactory get() {
    return newInstance(loadWifiInfoUseCaseProvider, wifiInstallerProvider, analyticsHelperProvider);
  }

  public static EventInfoViewModel_AssistedFactory_Factory create(
      Provider<LoadWifiInfoUseCase> loadWifiInfoUseCaseProvider,
      Provider<WifiInstaller> wifiInstallerProvider,
      Provider<AnalyticsHelper> analyticsHelperProvider) {
    return new EventInfoViewModel_AssistedFactory_Factory(loadWifiInfoUseCaseProvider, wifiInstallerProvider, analyticsHelperProvider);
  }

  public static EventInfoViewModel_AssistedFactory newInstance(
      Provider<LoadWifiInfoUseCase> loadWifiInfoUseCase, Provider<WifiInstaller> wifiInstaller,
      Provider<AnalyticsHelper> analyticsHelper) {
    return new EventInfoViewModel_AssistedFactory(loadWifiInfoUseCase, wifiInstaller, analyticsHelper);
  }
}
