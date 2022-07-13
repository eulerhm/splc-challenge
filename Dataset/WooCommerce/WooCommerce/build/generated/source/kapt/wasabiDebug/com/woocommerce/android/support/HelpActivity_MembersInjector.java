// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.support;

import com.woocommerce.android.tools.SelectedSite;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.AccountStore;
import org.wordpress.android.fluxc.store.SiteStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HelpActivity_MembersInjector implements MembersInjector<HelpActivity> {
  private final Provider<AccountStore> accountStoreProvider;

  private final Provider<SiteStore> siteStoreProvider;

  private final Provider<SupportHelper> supportHelperProvider;

  private final Provider<ZendeskHelper> zendeskHelperProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public HelpActivity_MembersInjector(Provider<AccountStore> accountStoreProvider,
      Provider<SiteStore> siteStoreProvider, Provider<SupportHelper> supportHelperProvider,
      Provider<ZendeskHelper> zendeskHelperProvider, Provider<SelectedSite> selectedSiteProvider) {
    this.accountStoreProvider = accountStoreProvider;
    this.siteStoreProvider = siteStoreProvider;
    this.supportHelperProvider = supportHelperProvider;
    this.zendeskHelperProvider = zendeskHelperProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  public static MembersInjector<HelpActivity> create(Provider<AccountStore> accountStoreProvider,
      Provider<SiteStore> siteStoreProvider, Provider<SupportHelper> supportHelperProvider,
      Provider<ZendeskHelper> zendeskHelperProvider, Provider<SelectedSite> selectedSiteProvider) {
    return new HelpActivity_MembersInjector(accountStoreProvider, siteStoreProvider, supportHelperProvider, zendeskHelperProvider, selectedSiteProvider);
  }

  @Override
  public void injectMembers(HelpActivity instance) {
    injectAccountStore(instance, accountStoreProvider.get());
    injectSiteStore(instance, siteStoreProvider.get());
    injectSupportHelper(instance, supportHelperProvider.get());
    injectZendeskHelper(instance, zendeskHelperProvider.get());
    injectSelectedSite(instance, selectedSiteProvider.get());
  }

  @InjectedFieldSignature("com.woocommerce.android.support.HelpActivity.accountStore")
  public static void injectAccountStore(HelpActivity instance, AccountStore accountStore) {
    instance.accountStore = accountStore;
  }

  @InjectedFieldSignature("com.woocommerce.android.support.HelpActivity.siteStore")
  public static void injectSiteStore(HelpActivity instance, SiteStore siteStore) {
    instance.siteStore = siteStore;
  }

  @InjectedFieldSignature("com.woocommerce.android.support.HelpActivity.supportHelper")
  public static void injectSupportHelper(HelpActivity instance, SupportHelper supportHelper) {
    instance.supportHelper = supportHelper;
  }

  @InjectedFieldSignature("com.woocommerce.android.support.HelpActivity.zendeskHelper")
  public static void injectZendeskHelper(HelpActivity instance, ZendeskHelper zendeskHelper) {
    instance.zendeskHelper = zendeskHelper;
  }

  @InjectedFieldSignature("com.woocommerce.android.support.HelpActivity.selectedSite")
  public static void injectSelectedSite(HelpActivity instance, SelectedSite selectedSite) {
    instance.selectedSite = selectedSite;
  }
}