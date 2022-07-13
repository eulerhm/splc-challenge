// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.util;

import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.util.locale.LocaleProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import org.wordpress.android.fluxc.store.WooCommerceStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrencyFormatter_Factory implements Factory<CurrencyFormatter> {
  private final Provider<WooCommerceStore> wcStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<LocaleProvider> localeProvider;

  private final Provider<CoroutineScope> appCoroutineScopeProvider;

  private final Provider<CoroutineDispatchers> dispatchersProvider;

  public CurrencyFormatter_Factory(Provider<WooCommerceStore> wcStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<LocaleProvider> localeProvider,
      Provider<CoroutineScope> appCoroutineScopeProvider,
      Provider<CoroutineDispatchers> dispatchersProvider) {
    this.wcStoreProvider = wcStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
    this.localeProvider = localeProvider;
    this.appCoroutineScopeProvider = appCoroutineScopeProvider;
    this.dispatchersProvider = dispatchersProvider;
  }

  @Override
  public CurrencyFormatter get() {
    return newInstance(wcStoreProvider.get(), selectedSiteProvider.get(), localeProvider.get(), appCoroutineScopeProvider.get(), dispatchersProvider.get());
  }

  public static CurrencyFormatter_Factory create(Provider<WooCommerceStore> wcStoreProvider,
      Provider<SelectedSite> selectedSiteProvider, Provider<LocaleProvider> localeProvider,
      Provider<CoroutineScope> appCoroutineScopeProvider,
      Provider<CoroutineDispatchers> dispatchersProvider) {
    return new CurrencyFormatter_Factory(wcStoreProvider, selectedSiteProvider, localeProvider, appCoroutineScopeProvider, dispatchersProvider);
  }

  public static CurrencyFormatter newInstance(WooCommerceStore wcStore, SelectedSite selectedSite,
      LocaleProvider localeProvider, CoroutineScope appCoroutineScope,
      CoroutineDispatchers dispatchers) {
    return new CurrencyFormatter(wcStore, selectedSite, localeProvider, appCoroutineScope, dispatchers);
  }
}