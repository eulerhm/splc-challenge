// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.jetpack;

import androidx.lifecycle.SavedStateHandle;
import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WooCommerceStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class JetpackInstallViewModel_Factory implements Factory<JetpackInstallViewModel> {
  private final Provider<SavedStateHandle> savedStateProvider;

  private final Provider<PluginRepository> repositoryProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<WooCommerceStore> wooCommerceStoreProvider;

  public JetpackInstallViewModel_Factory(Provider<SavedStateHandle> savedStateProvider,
      Provider<PluginRepository> repositoryProvider, Provider<SelectedSite> selectedSiteProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider) {
    this.savedStateProvider = savedStateProvider;
    this.repositoryProvider = repositoryProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.wooCommerceStoreProvider = wooCommerceStoreProvider;
  }

  @Override
  public JetpackInstallViewModel get() {
    return newInstance(savedStateProvider.get(), repositoryProvider.get(), selectedSiteProvider.get(), wooCommerceStoreProvider.get());
  }

  public static JetpackInstallViewModel_Factory create(
      Provider<SavedStateHandle> savedStateProvider, Provider<PluginRepository> repositoryProvider,
      Provider<SelectedSite> selectedSiteProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider) {
    return new JetpackInstallViewModel_Factory(savedStateProvider, repositoryProvider, selectedSiteProvider, wooCommerceStoreProvider);
  }

  public static JetpackInstallViewModel newInstance(SavedStateHandle savedState,
      PluginRepository repository, SelectedSite selectedSite, WooCommerceStore wooCommerceStore) {
    return new JetpackInstallViewModel(savedState, repository, selectedSite, wooCommerceStore);
  }
}