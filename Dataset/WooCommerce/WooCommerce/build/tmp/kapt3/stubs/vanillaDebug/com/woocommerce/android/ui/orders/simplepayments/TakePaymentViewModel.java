package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cJ\u0019\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/tools/NetworkStatus;)V", "navArgs", "Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "order", "Lcom/woocommerce/android/model/Order;", "getOrder", "()Lcom/woocommerce/android/model/Order;", "orderTotal", "Ljava/math/BigDecimal;", "getOrderTotal", "()Ljava/math/BigDecimal;", "onCardPaymentClicked", "", "onCardReaderPaymentCompleted", "onCashPaymentClicked", "onCashPaymentConfirmed", "onConnectToReaderResultReceived", "connected", "", "onSharePaymentUrlClicked", "onSharePaymentUrlCompleted", "updateOrderStatus", "statusKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "SharePaymentUrl", "WooCommerce_vanillaDebug"})
public final class TakePaymentViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel.Companion Companion = null;
    private static final long DELAY_MS = 1L;
    
    @javax.inject.Inject()
    public TakePaymentViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.orders.simplepayments.TakePaymentFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Order getOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getOrderTotal() {
        return null;
    }
    
    public final void onCashPaymentClicked() {
    }
    
    /**
     * User has confirmed the cash payment, so mark it as completed
     */
    private final void onCashPaymentConfirmed() {
    }
    
    public final void onSharePaymentUrlClicked() {
    }
    
    public final void onSharePaymentUrlCompleted() {
    }
    
    public final void onCardPaymentClicked() {
    }
    
    public final void onConnectToReaderResultReceived(boolean connected) {
    }
    
    public final void onCardReaderPaymentCompleted() {
    }
    
    private final java.lang.Object updateOrderStatus(java.lang.String statusKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentViewModel$SharePaymentUrl;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "storeName", "", "paymentUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getPaymentUrl", "()Ljava/lang/String;", "getStoreName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class SharePaymentUrl extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String storeName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String paymentUrl = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel.SharePaymentUrl copy(@org.jetbrains.annotations.NotNull()
        java.lang.String storeName, @org.jetbrains.annotations.NotNull()
        java.lang.String paymentUrl) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SharePaymentUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String storeName, @org.jetbrains.annotations.NotNull()
        java.lang.String paymentUrl) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStoreName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPaymentUrl() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentViewModel$Companion;", "", "()V", "DELAY_MS", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}