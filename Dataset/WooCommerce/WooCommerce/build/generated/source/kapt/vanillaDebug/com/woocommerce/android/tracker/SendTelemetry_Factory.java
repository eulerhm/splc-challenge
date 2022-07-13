// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.tracker;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerStore;
import org.wordpress.android.fluxc.utils.CurrentTimeProvider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SendTelemetry_Factory implements Factory<SendTelemetry> {
  private final Provider<TrackerStore> trackerStoreProvider;

  private final Provider<TrackerRepository> trackerRepositoryProvider;

  private final Provider<CurrentTimeProvider> currentTimeProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public SendTelemetry_Factory(Provider<TrackerStore> trackerStoreProvider,
      Provider<TrackerRepository> trackerRepositoryProvider,
      Provider<CurrentTimeProvider> currentTimeProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.trackerStoreProvider = trackerStoreProvider;
    this.trackerRepositoryProvider = trackerRepositoryProvider;
    this.currentTimeProvider = currentTimeProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public SendTelemetry get() {
    return newInstance(trackerStoreProvider.get(), trackerRepositoryProvider.get(), currentTimeProvider.get(), selectedSiteProvider.get());
  }

  public static SendTelemetry_Factory create(Provider<TrackerStore> trackerStoreProvider,
      Provider<TrackerRepository> trackerRepositoryProvider,
      Provider<CurrentTimeProvider> currentTimeProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new SendTelemetry_Factory(trackerStoreProvider, trackerRepositoryProvider, currentTimeProvider, selectedSiteProvider);
  }

  public static SendTelemetry newInstance(TrackerStore trackerStore,
      TrackerRepository trackerRepository, CurrentTimeProvider currentTimeProvider,
      SelectedSite selectedSite) {
    return new SendTelemetry(trackerStore, trackerRepository, currentTimeProvider, selectedSite);
  }
}