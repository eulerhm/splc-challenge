// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.inbox.domain;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.WCInboxStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InboxRepository_Factory implements Factory<InboxRepository> {
  private final Provider<WCInboxStore> inboxStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public InboxRepository_Factory(Provider<WCInboxStore> inboxStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.inboxStoreProvider = inboxStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public InboxRepository get() {
    return newInstance(inboxStoreProvider.get(), selectedSiteProvider.get());
  }

  public static InboxRepository_Factory create(Provider<WCInboxStore> inboxStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new InboxRepository_Factory(inboxStoreProvider, selectedSiteProvider);
  }

  public static InboxRepository newInstance(WCInboxStore inboxStore, SelectedSite selectedSite) {
    return new InboxRepository(inboxStore, selectedSite);
  }
}