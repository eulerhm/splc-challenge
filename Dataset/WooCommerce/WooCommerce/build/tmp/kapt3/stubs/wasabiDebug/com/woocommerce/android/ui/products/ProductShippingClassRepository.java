package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0007R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "<set-?>", "", "canLoadMoreShippingClasses", "getCanLoadMoreShippingClasses", "()Z", "continuationShippingClasses", "Lcom/woocommerce/android/util/ContinuationWrapper;", "shippingClassOffset", "", "fetchShippingClassesForSite", "", "Lcom/woocommerce/android/model/ShippingClass;", "loadMore", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductShippingClassesForSite", "onCleanup", "", "onProductShippingClassesChanged", "event", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductShippingClassesChanged;", "Companion", "WooCommerce_wasabiDebug"})
public final class ProductShippingClassRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductShippingClassRepository.Companion Companion = null;
    private static final int SHIPPING_CLASS_PAGE_SIZE = 25;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationShippingClasses;
    private int shippingClassOffset = 0;
    private boolean canLoadMoreShippingClasses = true;
    
    @javax.inject.Inject
    public ProductShippingClassRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final boolean getCanLoadMoreShippingClasses() {
        return false;
    }
    
    public final void onCleanup() {
    }
    
    /**
     * Fetches the list of shipping classes for the [selectedSite], optionally loading the next page of classes
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchShippingClassesForSite(boolean loadMore, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ShippingClass>> continuation) {
        return null;
    }
    
    /**
     * Returns a list of cached (SQLite) shipping classes for the current site
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ShippingClass> getProductShippingClassesForSite() {
        return null;
    }
    
    /**
     * The list of shipping classes has been fetched for the current site
     */
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProductShippingClassesChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore.OnProductShippingClassesChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassRepository$Companion;", "", "()V", "SHIPPING_CLASS_PAGE_SIZE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}