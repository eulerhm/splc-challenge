package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "gatewayStore", "Lorg/wordpress/android/fluxc/store/WCGatewayStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/util/CoroutineDispatchers;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/WCGatewayStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "continuationOrderStatus", "Lcom/woocommerce/android/util/ContinuationWrapper;", "Lcom/woocommerce/android/model/RequestResult;", "isFetchingOrderStatusOptions", "", "isFetchingPaymentGateways", "fetchOrderStatusOptionsFromApi", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPaymentGateways", "getCachedOrderStatusOptions", "", "", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "onCleanup", "", "onOrderStatusOptionsChanged", "event", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderStatusOptionsChanged;", "Companion", "WooCommerce_wasabiDebug"})
public final class OrderListRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.WCGatewayStore gatewayStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.list.OrderListRepository.Companion Companion = null;
    private static final java.lang.String TAG = "OrderListRepository";
    private boolean isFetchingOrderStatusOptions = false;
    private boolean isFetchingPaymentGateways = false;
    private com.woocommerce.android.util.ContinuationWrapper<com.woocommerce.android.model.RequestResult> continuationOrderStatus;
    
    @javax.inject.Inject
    public OrderListRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCGatewayStore gatewayStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final void onCleanup() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchOrderStatusOptionsFromApi(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCachedOrderStatusOptions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchPaymentGateways(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onOrderStatusOptionsChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore.OnOrderStatusOptionsChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListRepository$Companion;", "", "()V", "TAG", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}