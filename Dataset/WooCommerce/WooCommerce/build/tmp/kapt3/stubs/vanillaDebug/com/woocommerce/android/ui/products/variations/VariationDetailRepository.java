package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0012J#\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationDetailRepository;", "", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lorg/wordpress/android/fluxc/store/WCProductStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "deleteVariation", "", "productID", "", "variationID", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchVariation", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnVariationChanged;", "remoteProductId", "remoteVariationId", "getCachedWCVariation", "Lorg/wordpress/android/fluxc/model/WCProductVariationModel;", "getVariation", "Lcom/woocommerce/android/model/ProductVariation;", "updateVariation", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnVariationUpdated;", "updatedVariation", "(Lcom/woocommerce/android/model/ProductVariation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
@com.woocommerce.android.annotations.OpenClassOnDebug()
public class VariationDetailRepository {
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    
    @javax.inject.Inject()
    public VariationDetailRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchVariation(long remoteProductId, long remoteVariationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCProductStore.OnVariationChanged> continuation) {
        return null;
    }
    
    /**
     * Fires the request to update the variation
     *
     * @return the result of the action as [OnVariationUpdated]
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateVariation(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductVariation updatedVariation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCProductStore.OnVariationUpdated> continuation) {
        return null;
    }
    
    /**
     * Fires the request to delete a variation
     *
     * @return the result of the action as a [Boolean]
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteVariation(long productID, long variationID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private org.wordpress.android.fluxc.model.WCProductVariationModel getCachedWCVariation(long remoteProductId, long remoteVariationId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getVariation(long remoteProductId, long remoteVariationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ProductVariation> continuation) {
        return null;
    }
}