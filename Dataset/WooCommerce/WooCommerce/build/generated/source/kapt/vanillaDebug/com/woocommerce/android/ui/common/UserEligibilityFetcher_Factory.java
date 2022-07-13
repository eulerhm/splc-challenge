// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.common;

import com.woocommerce.android.AppPrefs;
import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCUserStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserEligibilityFetcher_Factory implements Factory<UserEligibilityFetcher> {
  private final Provider<AppPrefs> appPrefsProvider;

  private final Provider<WCUserStore> userStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public UserEligibilityFetcher_Factory(Provider<AppPrefs> appPrefsProvider,
      Provider<WCUserStore> userStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    this.appPrefsProvider = appPrefsProvider;
    this.userStoreProvider = userStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public UserEligibilityFetcher get() {
    return newInstance(appPrefsProvider.get(), userStoreProvider.get(), selectedSiteProvider.get());
  }

  public static UserEligibilityFetcher_Factory create(Provider<AppPrefs> appPrefsProvider,
      Provider<WCUserStore> userStoreProvider, Provider<SelectedSite> selectedSiteProvider) {
    return new UserEligibilityFetcher_Factory(appPrefsProvider, userStoreProvider, selectedSiteProvider);
  }

  public static UserEligibilityFetcher newInstance(AppPrefs appPrefs, WCUserStore userStore,
      SelectedSite selectedSite) {
    return new UserEligibilityFetcher(appPrefs, userStore, selectedSite);
  }
}