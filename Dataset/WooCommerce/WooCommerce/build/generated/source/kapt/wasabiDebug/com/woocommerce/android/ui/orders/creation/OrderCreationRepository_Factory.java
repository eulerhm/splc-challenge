// Generated by Dagger (https://dagger.dev).
package com.woocommerce.android.ui.orders.creation;

import com.woocommerce.android.analytics.AnalyticsTrackerWrapper;
import com.woocommerce.android.model.OrderMapper;
import com.woocommerce.android.tools.SelectedSite;
import com.woocommerce.android.util.CoroutineDispatchers;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.wordpress.android.fluxc.store.OrderUpdateStore;
import org.wordpress.android.fluxc.store.WCOrderStore;
import org.wordpress.android.fluxc.store.WooCommerceStore;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OrderCreationRepository_Factory implements Factory<OrderCreationRepository> {
  private final Provider<SelectedSite> selectedSiteProvider;

  private final Provider<WCOrderStore> orderStoreProvider;

  private final Provider<OrderUpdateStore> orderUpdateStoreProvider;

  private final Provider<OrderMapper> orderMapperProvider;

  private final Provider<CoroutineDispatchers> dispatchersProvider;

  private final Provider<WooCommerceStore> wooCommerceStoreProvider;

  private final Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider;

  public OrderCreationRepository_Factory(Provider<SelectedSite> selectedSiteProvider,
      Provider<WCOrderStore> orderStoreProvider,
      Provider<OrderUpdateStore> orderUpdateStoreProvider,
      Provider<OrderMapper> orderMapperProvider, Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider,
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    this.selectedSiteProvider = selectedSiteProvider;
    this.orderStoreProvider = orderStoreProvider;
    this.orderUpdateStoreProvider = orderUpdateStoreProvider;
    this.orderMapperProvider = orderMapperProvider;
    this.dispatchersProvider = dispatchersProvider;
    this.wooCommerceStoreProvider = wooCommerceStoreProvider;
    this.analyticsTrackerWrapperProvider = analyticsTrackerWrapperProvider;
  }

  @Override
  public OrderCreationRepository get() {
    return newInstance(selectedSiteProvider.get(), orderStoreProvider.get(), orderUpdateStoreProvider.get(), orderMapperProvider.get(), dispatchersProvider.get(), wooCommerceStoreProvider.get(), analyticsTrackerWrapperProvider.get());
  }

  public static OrderCreationRepository_Factory create(Provider<SelectedSite> selectedSiteProvider,
      Provider<WCOrderStore> orderStoreProvider,
      Provider<OrderUpdateStore> orderUpdateStoreProvider,
      Provider<OrderMapper> orderMapperProvider, Provider<CoroutineDispatchers> dispatchersProvider,
      Provider<WooCommerceStore> wooCommerceStoreProvider,
      Provider<AnalyticsTrackerWrapper> analyticsTrackerWrapperProvider) {
    return new OrderCreationRepository_Factory(selectedSiteProvider, orderStoreProvider, orderUpdateStoreProvider, orderMapperProvider, dispatchersProvider, wooCommerceStoreProvider, analyticsTrackerWrapperProvider);
  }

  public static OrderCreationRepository newInstance(SelectedSite selectedSite,
      WCOrderStore orderStore, OrderUpdateStore orderUpdateStore, OrderMapper orderMapper,
      CoroutineDispatchers dispatchers, WooCommerceStore wooCommerceStore,
      AnalyticsTrackerWrapper analyticsTrackerWrapper) {
    return new OrderCreationRepository(selectedSite, orderStore, orderUpdateStore, orderMapper, dispatchers, wooCommerceStore, analyticsTrackerWrapper);
  }
}