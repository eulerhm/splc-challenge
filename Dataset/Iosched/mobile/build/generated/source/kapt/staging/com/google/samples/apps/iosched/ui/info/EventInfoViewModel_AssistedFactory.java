package com.google.samples.apps.iosched.ui.info;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.google.samples.apps.iosched.shared.analytics.AnalyticsHelper;
import com.google.samples.apps.iosched.shared.domain.logistics.LoadWifiInfoUseCase;
import com.google.samples.apps.iosched.util.wifi.WifiInstaller;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class EventInfoViewModel_AssistedFactory implements ViewModelAssistedFactory<EventInfoViewModel> {
  private final Provider<LoadWifiInfoUseCase> loadWifiInfoUseCase;

  private final Provider<WifiInstaller> wifiInstaller;

  private final Provider<AnalyticsHelper> analyticsHelper;

  @Inject
  EventInfoViewModel_AssistedFactory(Provider<LoadWifiInfoUseCase> loadWifiInfoUseCase,
      Provider<WifiInstaller> wifiInstaller, Provider<AnalyticsHelper> analyticsHelper) {
    this.loadWifiInfoUseCase = loadWifiInfoUseCase;
    this.wifiInstaller = wifiInstaller;
    this.analyticsHelper = analyticsHelper;
  }

  @Override
  @NonNull
  public EventInfoViewModel create(@NonNull SavedStateHandle arg0) {
    return new EventInfoViewModel(loadWifiInfoUseCase.get(), wifiInstaller.get(),
        analyticsHelper.get());
  }
}
