package com.woocommerce.android.ui.products.variations.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationListHandler;", "", "repository", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;", "(Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorRepository;)V", "canLoadMore", "", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "offset", "", "fetchVariations", "Lkotlin/Result;", "", "productId", "", "forceRefresh", "fetchVariations-0E7RQCE", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVariationsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/model/ProductVariation;", "loadMore", "loadMore-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadVariations", "loadVariations-gIAlu-s", "Companion", "WooCommerce_wasabiDebug"})
public final class VariationListHandler {
    private final com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository repository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.variations.selector.VariationListHandler.Companion Companion = null;
    private static final int PAGE_SIZE = 10;
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    private int offset = 0;
    private boolean canLoadMore = true;
    
    @javax.inject.Inject
    public VariationListHandler(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.ProductVariation>> getVariationsFlow(long productId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/selector/VariationListHandler$Companion;", "", "()V", "PAGE_SIZE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}