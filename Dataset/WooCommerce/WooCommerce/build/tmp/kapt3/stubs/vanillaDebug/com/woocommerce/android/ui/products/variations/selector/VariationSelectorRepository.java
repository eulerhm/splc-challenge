package com.woocommerce.android.ui.products.variations.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;", "", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "fetchVariations", "Lkotlin/Result;", "", "productId", "", "offset", "", "pageSize", "fetchVariations-BWLJW6A", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "Lcom/woocommerce/android/model/Product;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeVariations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/model/ProductVariation;", "WooCommerce_vanillaDebug"})
public final class VariationSelectorRepository {
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject()
    public VariationSelectorRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.ProductVariation>> observeVariations(long productId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProduct(long productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.Product> continuation) {
        return null;
    }
}