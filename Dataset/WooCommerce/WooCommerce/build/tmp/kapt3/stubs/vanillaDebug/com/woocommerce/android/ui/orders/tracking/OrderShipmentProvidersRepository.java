package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/OrderShipmentProvidersRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCOrderStore;)V", "fetchOrderShipmentProviders", "", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "orderId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShipmentProvidersFromDB", "WooCommerce_vanillaDebug"})
public final class OrderShipmentProvidersRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    
    @javax.inject.Inject()
    public OrderShipmentProvidersRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCOrderStore orderStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"ReturnCount"})
    public final java.lang.Object fetchOrderShipmentProviders(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.OrderShipmentProvider>> continuation) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> getShipmentProvidersFromDB() {
        return null;
    }
}