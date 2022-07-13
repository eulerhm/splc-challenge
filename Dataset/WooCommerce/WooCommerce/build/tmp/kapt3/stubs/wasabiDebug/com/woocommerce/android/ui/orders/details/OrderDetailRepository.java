package com.woocommerce.android.ui.orders.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 R2\u00020\u0001:\u0001RBO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J!\u0010#\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010.\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001f\u00100\u001a\b\u0012\u0004\u0012\u0002010,2\u0006\u00102\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J%\u00103\u001a\b\u0012\u0004\u0012\u0002040,2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0019\u00107\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001b\u00108\u001a\u0004\u0018\u00010\'2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\u001b0,2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010<\u001a\u00020=J\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020!0,2\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u0002010,2\u0006\u00102\u001a\u00020\u0019J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=J\f\u0010C\u001a\b\u0012\u0004\u0012\u00020A0,J\u0014\u0010D\u001a\u00020E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190,J\b\u0010G\u001a\u0004\u0018\u00010=J\u0006\u0010H\u001a\u00020IJ\u0014\u0010J\u001a\u00020*2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190,J\u0014\u0010K\u001a\u00020*2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190,J\u000e\u0010L\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u0019J\'\u0010M\u001a\b\u0012\u0004\u0012\u00020O0N2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010P\u001a\u00020=H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006S"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "refundStore", "Lorg/wordpress/android/fluxc/store/WCRefundStore;", "shippingLabelStore", "Lorg/wordpress/android/fluxc/store/WCShippingLabelStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderMapper", "Lcom/woocommerce/android/model/OrderMapper;", "shippingLabelMapper", "Lcom/woocommerce/android/model/ShippingLabelMapper;", "(Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/WCProductStore;Lorg/wordpress/android/fluxc/store/WCRefundStore;Lorg/wordpress/android/fluxc/store/WCShippingLabelStore;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/model/OrderMapper;Lcom/woocommerce/android/model/ShippingLabelMapper;)V", "addOrderNote", "Lkotlin/Result;", "", "orderId", "", "noteModel", "Lcom/woocommerce/android/model/OrderNote;", "addOrderNote-0E7RQCE", "(JLcom/woocommerce/android/model/OrderNote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrderShipmentTracking", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "shipmentTrackingModel", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "(JLcom/woocommerce/android/model/OrderShipmentTracking;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrderShipmentTracking", "Lorg/wordpress/android/fluxc/model/WCOrderShipmentTrackingModel;", "(JLorg/wordpress/android/fluxc/model/WCOrderShipmentTrackingModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOrderById", "Lcom/woocommerce/android/model/Order;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOrderNotes", "", "fetchOrderRefunds", "", "Lcom/woocommerce/android/model/Refund;", "fetchOrderShipmentTrackingList", "Lcom/woocommerce/android/model/RequestResult;", "fetchOrderShippingLabels", "Lcom/woocommerce/android/model/ShippingLabel;", "remoteOrderId", "fetchProductsByRemoteIds", "Lcom/woocommerce/android/model/Product;", "remoteIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSLCreationEligibility", "getOrderById", "getOrderNotes", "getOrderRefunds", "getOrderShipmentTrackingByTrackingNumber", "trackingNumber", "", "getOrderShipmentTrackings", "getOrderShippingLabels", "getOrderStatus", "Lcom/woocommerce/android/model/Order$OrderStatus;", "key", "getOrderStatusOptions", "getProductCountForOrder", "", "remoteProductIds", "getStoreCountryCode", "getWooServicesPluginInfo", "Lcom/woocommerce/android/model/WooPlugin;", "hasSubscriptionProducts", "hasVirtualProductsOnly", "isOrderEligibleForSLCreation", "updateOrderStatus", "Lkotlinx/coroutines/flow/Flow;", "Lorg/wordpress/android/fluxc/store/WCOrderStore$UpdateOrderResult;", "newStatus", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "WooCommerce_wasabiDebug"})
public final class OrderDetailRepository {
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final org.wordpress.android.fluxc.store.WCRefundStore refundStore = null;
    private final org.wordpress.android.fluxc.store.WCShippingLabelStore shippingLabelStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.model.OrderMapper orderMapper = null;
    private final com.woocommerce.android.model.ShippingLabelMapper shippingLabelMapper = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.details.OrderDetailRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRODUCT_SUBSCRIPTION_TYPE = "subscription";
    
    @javax.inject.Inject
    public OrderDetailRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCRefundStore refundStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCShippingLabelStore shippingLabelStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderMapper orderMapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelMapper shippingLabelMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderById(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Order> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderNotes(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderShipmentTrackingList(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderRefunds(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.Refund>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderShippingLabels(long remoteOrderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ShippingLabel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateOrderStatus(long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String newStatus, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.wordpress.android.fluxc.store.WCOrderStore.UpdateOrderResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addOrderShipmentTracking(long orderId, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderShipmentTracking shipmentTrackingModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteOrderShipmentTracking(long orderId, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.WCOrderShipmentTrackingModel shipmentTrackingModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOrderById(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Order> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order.OrderStatus getOrderStatus(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.OrderStatus> getOrderStatusOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOrderNotes(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.OrderNote>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchProductsByRemoteIds(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> remoteIds, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.Product>> continuation) {
        return null;
    }
    
    public final boolean hasVirtualProductsOnly(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> remoteProductIds) {
        return false;
    }
    
    public final int getProductCountForOrder(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> remoteProductIds) {
        return 0;
    }
    
    public final boolean hasSubscriptionProducts(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> remoteProductIds) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund> getOrderRefunds(long orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.OrderShipmentTracking getOrderShipmentTrackingByTrackingNumber(long orderId, @org.jetbrains.annotations.NotNull
    java.lang.String trackingNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.OrderShipmentTracking> getOrderShipmentTrackings(long orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ShippingLabel> getOrderShippingLabels(long remoteOrderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.WooPlugin getWooServicesPluginInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStoreCountryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchSLCreationEligibility(long orderId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final boolean isOrderEligibleForSLCreation(long orderId) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository$Companion;", "", "()V", "PRODUCT_SUBSCRIPTION_TYPE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}