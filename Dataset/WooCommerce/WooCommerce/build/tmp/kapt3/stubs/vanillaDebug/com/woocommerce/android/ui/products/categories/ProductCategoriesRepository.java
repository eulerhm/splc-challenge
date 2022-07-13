package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001*B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "addProductCategoryContinuation", "Lcom/woocommerce/android/util/ContinuationWrapper;", "Lcom/woocommerce/android/model/RequestResult;", "canLoadMoreProductCategories", "", "getCanLoadMoreProductCategories", "()Z", "setCanLoadMoreProductCategories", "(Z)V", "loadContinuation", "offset", "", "addProductCategory", "categoryName", "", "parentId", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductCategories", "", "Lcom/woocommerce/android/model/ProductCategory;", "loadMore", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductCategoriesList", "getProductCategoryByNameAndParentId", "getProductCategoryByRemoteId", "Lorg/wordpress/android/fluxc/model/WCProductCategoryModel;", "remoteId", "onCleanup", "", "onProductCategoriesChanged", "event", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductCategoryChanged;", "Companion", "WooCommerce_vanillaDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug()
public class ProductCategoriesRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.categories.ProductCategoriesRepository.Companion Companion = null;
    private static final int PRODUCT_CATEGORIES_PAGE_SIZE = 100;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> loadContinuation;
    private com.woocommerce.android.util.ContinuationWrapper<com.woocommerce.android.model.RequestResult> addProductCategoryContinuation;
    private int offset = 0;
    private boolean canLoadMoreProductCategories = true;
    
    @javax.inject.Inject()
    public ProductCategoriesRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public boolean getCanLoadMoreProductCategories() {
        return false;
    }
    
    public void setCanLoadMoreProductCategories(boolean p0) {
    }
    
    public void onCleanup() {
    }
    
    /**
     * Submits a fetch request to get a list of products categories for the current site
     * and returns the full list of product categories from the database
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchProductCategories(boolean loadMore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductCategory>> continuation) {
        return null;
    }
    
    /**
     * Returns all product categories for the current site that are in the database
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.woocommerce.android.model.ProductCategory> getProductCategoriesList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.wordpress.android.fluxc.model.WCProductCategoryModel getProductCategoryByRemoteId(long remoteId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.woocommerce.android.model.ProductCategory getProductCategoryByNameAndParentId(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, long parentId) {
        return null;
    }
    
    /**
     * Fires the request to add a new product category
     *
     * @return the result of the action as a [Boolean]
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addProductCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, long parentId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onProductCategoriesChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore.OnProductCategoryChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesRepository$Companion;", "", "()V", "PRODUCT_CATEGORIES_PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}