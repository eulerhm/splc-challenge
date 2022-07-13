package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u001e\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J*\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\"\u0010\u0016J\u001c\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\f\u0010\'\u001a\u00020(*\u00020)H\u0002J\f\u0010\'\u001a\u00020**\u00020+H\u0002J\u0015\u0010\'\u001a\u00020,*\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "orderUpdateStore", "Lorg/wordpress/android/fluxc/store/OrderUpdateStore;", "orderMapper", "Lcom/woocommerce/android/model/OrderMapper;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/OrderUpdateStore;Lcom/woocommerce/android/model/OrderMapper;Lcom/woocommerce/android/util/CoroutineDispatchers;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "createOrUpdateDraft", "Lkotlin/Result;", "Lcom/woocommerce/android/model/Order;", "order", "createOrUpdateDraft-gIAlu-s", "(Lcom/woocommerce/android/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSimplePaymentOrder", "currentPrice", "Ljava/math/BigDecimal;", "createSimplePaymentOrder-gIAlu-s", "(Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDraftOrder", "", "isAutoDraftSupported", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "placeOrder-gIAlu-s", "trackOrderSyncFailed", "errorType", "", "errorDescription", "toDataModel", "Lorg/wordpress/android/fluxc/model/order/FeeLine;", "Lcom/woocommerce/android/model/Order$FeeLine;", "Lorg/wordpress/android/fluxc/model/order/ShippingLine;", "Lcom/woocommerce/android/model/Order$ShippingLine;", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "Lcom/woocommerce/android/model/Order$Status;", "(Lcom/woocommerce/android/model/Order$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "WooCommerce_vanillaDebug"})
public final class OrderCreationRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.OrderUpdateStore orderUpdateStore = null;
    private final com.woocommerce.android.model.OrderMapper orderMapper = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.creation.OrderCreationRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTO_DRAFT_SUPPORTED_VERSION = "6.3.0";
    
    @javax.inject.Inject()
    public OrderCreationRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.OrderUpdateStore orderUpdateStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.OrderMapper orderMapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super();
    }
    
    private final void trackOrderSyncFailed(java.lang.String errorType, java.lang.String errorDescription) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteDraftOrder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object isAutoDraftSupported(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object toDataModel(com.woocommerce.android.model.Order.Status $this$toDataModel, kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.WCOrderStatusModel> p1) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.model.order.ShippingLine toDataModel(com.woocommerce.android.model.Order.ShippingLine $this$toDataModel) {
        return null;
    }
    
    private final org.wordpress.android.fluxc.model.order.FeeLine toDataModel(com.woocommerce.android.model.Order.FeeLine $this$toDataModel) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationRepository$Companion;", "", "()V", "AUTO_DRAFT_SUPPORTED_VERSION", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}