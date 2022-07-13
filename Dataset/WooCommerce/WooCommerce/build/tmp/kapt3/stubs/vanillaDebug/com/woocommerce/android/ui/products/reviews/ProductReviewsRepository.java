package com.woocommerce.android.ui.products.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "<set-?>", "", "canLoadMore", "getCanLoadMore", "()Z", "offset", "", "fetchApprovedProductReviewsFromApi", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductReviewChanged;", "remoteProductId", "", "loadMore", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductReviewsFromDB", "", "Lcom/woocommerce/android/model/ProductReview;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "WooCommerce_vanillaDebug"})
public final class ProductReviewsRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.reviews.ProductReviewsRepository.Companion Companion = null;
    private static final int PAGE_SIZE = 25;
    private int offset = 0;
    private boolean canLoadMore = false;
    
    @javax.inject.Inject()
    public ProductReviewsRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers) {
        super();
    }
    
    public final boolean getCanLoadMore() {
        return false;
    }
    
    /**
     * Submits a fetch request to get a page of product reviews for the current site and [remoteProductId]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchApprovedProductReviewsFromApi(long remoteProductId, boolean loadMore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCProductStore.OnProductReviewChanged> continuation) {
        return null;
    }
    
    /**
     * Returns all product reviews for the current site and product from the local database
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductReviewsFromDB(long remoteProductId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductReview>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsRepository$Companion;", "", "()V", "PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}