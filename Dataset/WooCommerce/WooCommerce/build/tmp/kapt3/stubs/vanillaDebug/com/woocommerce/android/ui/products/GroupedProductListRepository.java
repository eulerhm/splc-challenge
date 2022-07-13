package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\b\b\u0002\u0010\u0017\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCProductStore;)V", "<set-?>", "", "canLoadMoreProducts", "getCanLoadMoreProducts", "()Z", "loadContinuation", "Lcom/woocommerce/android/util/ContinuationWrapper;", "offset", "", "fetchProductList", "", "Lcom/woocommerce/android/model/Product;", "productIds", "", "loadMore", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductList", "onCleanup", "", "onProductChanged", "event", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductChanged;", "Companion", "WooCommerce_vanillaDebug"})
public final class GroupedProductListRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.GroupedProductListRepository.Companion Companion = null;
    private static final int PRODUCT_PAGE_SIZE = 25;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> loadContinuation;
    private int offset = 0;
    private boolean canLoadMoreProducts = true;
    
    @javax.inject.Inject()
    public GroupedProductListRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore) {
        super();
    }
    
    public final boolean getCanLoadMoreProducts() {
        return false;
    }
    
    public final void onCleanup() {
    }
    
    /**
     * Submits a fetch request to get a page of products for the [productIds] and returns the full
     * list of products from the database
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds, boolean loadMore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.Product>> continuation) {
        return null;
    }
    
    /**
     * Returns all products for the [productIds] that are in the database
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.Product> getProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProductChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore.OnProductChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListRepository$Companion;", "", "()V", "PRODUCT_PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}