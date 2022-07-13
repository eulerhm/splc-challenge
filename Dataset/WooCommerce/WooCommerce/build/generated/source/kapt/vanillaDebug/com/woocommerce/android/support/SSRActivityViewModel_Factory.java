// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.support;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.NetworkStatus;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WooCommerceStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SSRActivityViewModel_Factory implements Factory<SSRActivityViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<CoroutineDispatchers> dispatchersProvider;

  private final Provider<WooCommerceStore> wooCommerceStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<NetworkStatus> networkStatusProvider;

  public SSRActivityViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<NetworkStatus> networkStatusProvider) {
    this.savedStateProvider = savedStateProvider;
    this.dispatchersProvider = dispatchersProvider;
    this.wooCommerceStoreProvider = wooCommerceStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.networkStatusProvider = networkStatusProvider;
  }

  @Override
  public SSRActivityViewModel get() {
    return newInstance(savedStateProvider.get(), dispatchersProvider.get(), wooCommerceStoreProvider.get(), selectedSiteProvider.get(), networkStatusProvider.get());
  }

  public static SSRActivityViewModel_Factory create(Provider<SavedStateHandle> savedStateProvider,
      Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<NetworkStatus> networkStatusProvider) {
    return new SSRActivityViewModel_Factory(savedStateProvider, dispatchersProvider, wooCommerceStoreProvider, selectedSiteProvider, networkStatusProvider);
  }

  public static SSRActivityViewModel newInstance(SavedStateHandle savedState,
      CoroutineDispatchers dispatchers, WooCommerceStore wooCommerceStore,
      SelectedSite selectedSite, NetworkStatus networkStatus) {
    return new SSRActivityViewModel(savedState, dispatchers, wooCommerceStore, selectedSite, networkStatus);
  }
}