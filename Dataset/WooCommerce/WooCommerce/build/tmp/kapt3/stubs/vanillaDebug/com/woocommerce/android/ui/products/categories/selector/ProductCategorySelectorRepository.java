package com.woocommerce.android.ui.products.categories.selector;

import java.lang.System;

/**
 * This class seems like a duplicate of [ProductCategoriesRepository].
 * The goal here is to make this as the main repository after adding having features parity between
 * [ProductCategorySelectorFragment] and [ProductCategoriesFragment], and then remove the old one that depends
 * on EventBus.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J:\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "store", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCProductStore;)V", "fetchCategories", "Lkotlin/Result;", "", "offset", "", "pageSize", "fetchCategories-0E7RQCE", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeCategories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/model/ProductCategory;", "searchCategories", "Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorRepository$SearchResult;", "searchQuery", "", "searchCategories-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SearchResult", "WooCommerce_vanillaDebug"})
public final class ProductCategorySelectorRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCProductStore store = null;
    
    @javax.inject.Inject()
    public ProductCategorySelectorRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore store) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.ProductCategory>> observeCategories() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/selector/ProductCategorySelectorRepository$SearchResult;", "", "productCategories", "", "Lcom/woocommerce/android/model/ProductCategory;", "canLoadMore", "", "(Ljava/util/List;Z)V", "getCanLoadMore", "()Z", "getProductCategories", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class SearchResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ProductCategory> productCategories = null;
        private final boolean canLoadMore = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.categories.selector.ProductCategorySelectorRepository.SearchResult copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductCategory> productCategories, boolean canLoadMore) {
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
        
        public SearchResult(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductCategory> productCategories, boolean canLoadMore) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductCategory> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductCategory> getProductCategories() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getCanLoadMore() {
            return false;
        }
    }
}