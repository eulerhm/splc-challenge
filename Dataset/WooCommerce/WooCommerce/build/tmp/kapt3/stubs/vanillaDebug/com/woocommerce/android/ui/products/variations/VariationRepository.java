package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ?\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u0004\u0018\u00010\u0016J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010$\u001a\u0004\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationRepository;", "", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCProductStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "<set-?>", "", "canLoadMoreProductVariations", "getCanLoadMoreProductVariations", "()Z", "offset", "", "bulkUpdateVariations", "remoteProductId", "", "variationIds", "", "newRegularPrice", "", "newSalePrice", "(JLjava/util/Collection;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEmptyVariation", "Lcom/woocommerce/android/model/ProductVariation;", "product", "Lcom/woocommerce/android/model/Product;", "(Lcom/woocommerce/android/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductVariations", "", "loadMore", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrencyCode", "getProductVariationList", "handleVariationCreateResult", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/WooResult;", "Lorg/wordpress/android/fluxc/model/WCProductVariationModel;", "Companion", "WooCommerce_vanillaDebug"})
public final class VariationRepository {
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.VariationRepository.Companion Companion = null;
    private static final int PRODUCT_VARIATIONS_PAGE_SIZE = 25;
    private int offset = 0;
    private boolean canLoadMoreProductVariations = true;
    
    @javax.inject.Inject()
    public VariationRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final boolean getCanLoadMoreProductVariations() {
        return false;
    }
    
    /**
     * Submits a fetch request to get a list of products variations for the current site and productId
     * and returns the full list of product variations from the database
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchProductVariations(long remoteProductId, boolean loadMore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductVariation>> continuation) {
        return null;
    }
    
    /**
     * Returns all product variations for a product and current site that are in the database
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ProductVariation> getProductVariationList(long remoteProductId) {
        return null;
    }
    
    /**
     * Returns the currency code for the site
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrencyCode() {
        return null;
    }
    
    /**
     * Fires the request to create a empty variation to a given product
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createEmptyVariation(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ProductVariation> continuation) {
        return null;
    }
    
    /**
     * Bulk updates variations.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object bulkUpdateVariations(long remoteProductId, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> variationIds, @org.jetbrains.annotations.Nullable()
    java.lang.String newRegularPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String newSalePrice, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final com.woocommerce.android.model.ProductVariation handleVariationCreateResult(org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.WCProductVariationModel> $this$handleVariationCreateResult, com.woocommerce.android.model.Product product) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationRepository$Companion;", "", "()V", "PRODUCT_VARIATIONS_PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}