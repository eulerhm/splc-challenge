package com.woocommerce.android.ui.products.tags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0017R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "addProductTagsContinuation", "Lcom/woocommerce/android/util/ContinuationWrapper;", "", "canLoadMoreProductTags", "getCanLoadMoreProductTags", "()Z", "setCanLoadMoreProductTags", "(Z)V", "loadContinuation", "offset", "", "addProductTags", "", "Lcom/woocommerce/android/model/ProductTag;", "tagNames", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductTags", "loadMore", "searchQuery", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductTagByName", "name", "getProductTags", "getProductTagsByNames", "names", "onCleanup", "", "onProductTagsChanged", "event", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductTagChanged;", "Companion", "WooCommerce_vanillaDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug()
public class ProductTagsRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.tags.ProductTagsRepository.Companion Companion = null;
    private static final int PRODUCT_TAGS_PAGE_SIZE = 100;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> loadContinuation;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> addProductTagsContinuation;
    private int offset = 0;
    private boolean canLoadMoreProductTags = true;
    
    @javax.inject.Inject()
    public ProductTagsRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public boolean getCanLoadMoreProductTags() {
        return false;
    }
    
    public void setCanLoadMoreProductTags(boolean p0) {
    }
    
    public void onCleanup() {
    }
    
    /**
     * Submits a fetch request to get a list of products tags for the current site
     * and returns the full list of product tags from the database
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchProductTags(boolean loadMore, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductTag>> continuation) {
        return null;
    }
    
    /**
     * Returns all product tags for the current site that are in the database
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.woocommerce.android.model.ProductTag> getProductTags() {
        return null;
    }
    
    /**
     * Fires the request to add a new product tags
     *
     * @return the result of the action as a [Boolean]
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addProductTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tagNames, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductTag>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.woocommerce.android.model.ProductTag> getProductTagsByNames(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> names) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.woocommerce.android.model.ProductTag getProductTagByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public void onProductTagsChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore.OnProductTagChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsRepository$Companion;", "", "()V", "PRODUCT_TAGS_PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}