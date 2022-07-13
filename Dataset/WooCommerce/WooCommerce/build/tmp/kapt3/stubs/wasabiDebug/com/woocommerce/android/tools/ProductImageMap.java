package com.woocommerce.android.tools;

import java.lang.System;

/**
 * Maintains a map of product <remoteId, imageUrl> used for quick lookups when attempting to display
 * product images. If the product isn't in our map we load it from the db. If it's not in the db,
 * we fire an event which tells the MainPresenter to fetch it from the backend.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\rJ\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/tools/ProductImageMap;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCProductStore;Lkotlinx/coroutines/CoroutineScope;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "map", "Ljava/util/HashMap;", "", "", "getMap", "()Ljava/util/HashMap;", "map$delegate", "Lkotlin/Lazy;", "observers", "", "Ljava/lang/ref/WeakReference;", "Lcom/woocommerce/android/tools/ProductImageMap$OnProductFetchedListener;", "pendingRequestIds", "Ljava/util/HashSet;", "getPendingRequestIds", "()Ljava/util/HashSet;", "pendingRequestIds$delegate", "get", "remoteProductId", "remove", "", "reset", "subscribeToOnProductFetchedEvents", "observer", "unsubscribeFromOnProductFetchedEvents", "", "OnProductFetchedListener", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class ProductImageMap {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final java.util.List<java.lang.ref.WeakReference<com.woocommerce.android.tools.ProductImageMap.OnProductFetchedListener>> observers = null;
    private final kotlin.Lazy map$delegate = null;
    private final kotlin.Lazy pendingRequestIds$delegate = null;
    
    @javax.inject.Inject
    public ProductImageMap(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    @com.woocommerce.android.di.AppCoroutineScope
    kotlinx.coroutines.CoroutineScope appCoroutineScope, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super();
    }
    
    private final java.util.HashMap<java.lang.Long, java.lang.String> getMap() {
        return null;
    }
    
    private final java.util.HashSet<java.lang.Long> getPendingRequestIds() {
        return null;
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String get(long remoteProductId) {
        return null;
    }
    
    public final void remove(long remoteProductId) {
    }
    
    public final void subscribeToOnProductFetchedEvents(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap.OnProductFetchedListener observer) {
    }
    
    public final boolean unsubscribeFromOnProductFetchedEvents(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap.OnProductFetchedListener observer) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/tools/ProductImageMap$OnProductFetchedListener;", "", "onProductFetched", "", "remoteProductId", "", "WooCommerce_wasabiDebug"})
    public static abstract interface OnProductFetchedListener {
        
        public abstract void onProductFetched(long remoteProductId);
    }
}