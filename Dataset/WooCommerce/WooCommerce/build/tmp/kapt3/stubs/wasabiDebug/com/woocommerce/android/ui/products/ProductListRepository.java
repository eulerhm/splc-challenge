package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJI\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010$\u001a\u00020\f2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00100&2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020)J4\u0010.\u001a\b\u0012\u0004\u0012\u00020!0 2\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u00100&2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010 J\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0007J\u0010\u00104\u001a\u0002002\u0006\u00102\u001a\u000205H\u0007J=\u00106\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u00107\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\f2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u0019\u00109\u001a\u00020\f2\u0006\u0010-\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListRepository;", "", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lcom/woocommerce/android/AppPrefsWrapper;Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "<set-?>", "", "canLoadMoreProducts", "getCanLoadMoreProducts", "()Z", "", "lastSearchQuery", "getLastSearchQuery", "()Ljava/lang/String;", "loadContinuation", "Lcom/woocommerce/android/util/ContinuationWrapper;", "offset", "", "value", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "productSortingChoice", "getProductSortingChoice", "()Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;", "setProductSortingChoice", "(Lorg/wordpress/android/fluxc/store/WCProductStore$ProductSorting;)V", "searchContinuation", "", "Lcom/woocommerce/android/model/Product;", "trashContinuation", "fetchProductList", "loadMore", "productFilterOptions", "", "Lorg/wordpress/android/fluxc/store/WCProductStore$ProductFilterOption;", "excludedProductIds", "", "(ZLjava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "Lorg/wordpress/android/fluxc/model/WCProductModel;", "remoteProductId", "getProductList", "onCleanup", "", "onProductChanged", "event", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductChanged;", "onProductsSearched", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductsSearched;", "searchProductList", "searchQuery", "(Ljava/lang/String;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trashProduct", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "WooCommerce_wasabiDebug"})
public final class ProductListRepository {
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductListRepository.Companion Companion = null;
    private static final int PRODUCT_PAGE_SIZE = 25;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> loadContinuation;
    private com.woocommerce.android.util.ContinuationWrapper<java.util.List<com.woocommerce.android.model.Product>> searchContinuation;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> trashContinuation;
    private int offset = 0;
    private boolean canLoadMoreProducts = true;
    @org.jetbrains.annotations.Nullable
    private java.lang.String lastSearchQuery;
    
    @javax.inject.Inject
    public ProductListRepository(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final boolean getCanLoadMoreProducts() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.store.WCProductStore.ProductSorting getProductSortingChoice() {
        return null;
    }
    
    public final void setProductSortingChoice(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore.ProductSorting value) {
    }
    
    public final void onCleanup() {
    }
    
    /**
     * Submits a fetch request to get a page of products for the current site and returns the full
     * list of products from the database
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchProductList(boolean loadMore, @org.jetbrains.annotations.NotNull
    java.util.Map<org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption, java.lang.String> productFilterOptions, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> excludedProductIds, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.Product>> continuation) {
        return null;
    }
    
    /**
     * Submits a fetch request to get a page of products for the current site matching the passed
     * query and returns only that page of products - note that this returns null if the search
     * is interrupted (which means the user submitted another search while this was running)
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchProductList(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, boolean loadMore, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> excludedProductIds, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.Product>> continuation) {
        return null;
    }
    
    /**
     * Dispatches a request to trash a specific product
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object trashProduct(long remoteProductId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Returns all products for the current site that are in the database
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Product> getProductList(@org.jetbrains.annotations.NotNull
    java.util.Map<org.wordpress.android.fluxc.store.WCProductStore.ProductFilterOption, java.lang.String> productFilterOptions, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.Long> excludedProductIds) {
        return null;
    }
    
    /**
     * Returns a single product
     */
    @org.jetbrains.annotations.Nullable
    public final org.wordpress.android.fluxc.model.WCProductModel getProduct(long remoteProductId) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProductChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore.OnProductChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProductsSearched(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore.OnProductsSearched event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListRepository$Companion;", "", "()V", "PRODUCT_PAGE_SIZE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}