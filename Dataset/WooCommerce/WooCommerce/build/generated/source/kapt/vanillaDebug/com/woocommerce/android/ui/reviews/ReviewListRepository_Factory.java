// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.reviews;

import com.woocommerce.android.tools.SelectedSite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.Dispatcher;
import org.wordpress.android.fluxc.store.NotificationStore;
import org.wordpress.android.fluxc.store.WCProductStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ReviewListRepository_Factory implements Factory<ReviewListRepository> {
  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<WCProductStore> productStoreProvider;

  private final Provider<NotificationStore> notificationStoreProvider;

  private final Provider<SelectedSite> selectedSiteProvider;

  public ReviewListRepository_Factory(Provider<Dispatcher> dispatcherProvider,
      Provider<WCProductStore> productStoreProvider,
      Provider<NotificationStore> notificationStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.productStoreProvider = productStoreProvider;
    this.notificationStoreProvider = notificationStoreProvider;
    this.selectedSiteProvider = selectedSiteProvider;
  }

  @Override
  public ReviewListRepository get() {
    return newInstance(dispatcherProvider.get(), productStoreProvider.get(), notificationStoreProvider.get(), selectedSiteProvider.get());
  }

  public static ReviewListRepository_Factory create(Provider<Dispatcher> dispatcherProvider,
      Provider<WCProductStore> productStoreProvider,
      Provider<NotificationStore> notificationStoreProvider,
      Provider<SelectedSite> selectedSiteProvider) {
    return new ReviewListRepository_Factory(dispatcherProvider, productStoreProvider, notificationStoreProvider, selectedSiteProvider);
  }

  public static ReviewListRepository newInstance(Dispatcher dispatcher, WCProductStore productStore,
      NotificationStore notificationStore, SelectedSite selectedSite) {
    return new ReviewListRepository(dispatcher, productStore, notificationStore, selectedSite);
  }
}