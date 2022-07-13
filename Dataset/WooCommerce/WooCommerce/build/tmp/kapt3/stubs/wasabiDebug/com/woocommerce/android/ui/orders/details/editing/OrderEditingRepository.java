package com.woocommerce.android.ui.orders.details.editing;

import java.lang.System;

@kotlin.Suppress(names = {"UnusedPrivateMember"})
@dagger.hilt.android.scopes.ViewModelScoped
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/editing/OrderEditingRepository;", "", "orderUpdateStore", "Lorg/wordpress/android/fluxc/store/OrderUpdateStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/OrderUpdateStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "updateBothOrderAddresses", "Lkotlinx/coroutines/flow/Flow;", "Lorg/wordpress/android/fluxc/store/WCOrderStore$UpdateOrderResult;", "remoteOrderId", "", "shippingAddress", "Lorg/wordpress/android/fluxc/model/order/OrderAddress$Shipping;", "billingAddress", "Lorg/wordpress/android/fluxc/model/order/OrderAddress$Billing;", "(JLorg/wordpress/android/fluxc/model/order/OrderAddress$Shipping;Lorg/wordpress/android/fluxc/model/order/OrderAddress$Billing;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCustomerOrderNote", "orderId", "customerOrderNote", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrderAddress", "orderAddress", "Lorg/wordpress/android/fluxc/model/order/OrderAddress;", "(JLorg/wordpress/android/fluxc/model/order/OrderAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public final class OrderEditingRepository {
    private final org.wordpress.android.fluxc.store.OrderUpdateStore orderUpdateStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject
    public OrderEditingRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.OrderUpdateStore orderUpdateStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateCustomerOrderNote(long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String customerOrderNote, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateOrderAddress(long orderId, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.order.OrderAddress orderAddress, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateBothOrderAddresses(long remoteOrderId, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.order.OrderAddress.Shipping shippingAddress, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.order.OrderAddress.Billing billingAddress, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult>> continuation) {
        return null;
    }
}