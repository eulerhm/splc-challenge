package com.woocommerce.android.ui.products.addons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015JC\u0010\u0019\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0011\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110!2\u0006\u0010\u001f\u001a\u00020\u0014J\u0011\u0010\"\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001c\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0011*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J=\u0010%\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u0011\u0018\u00010\u001a*\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "addonsStore", "Lorg/wordpress/android/fluxc/store/WCAddonsStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/WCProductStore;Lorg/wordpress/android/fluxc/store/WCAddonsStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "containsAddonsFrom", "", "orderItem", "Lcom/woocommerce/android/model/Order$Item;", "(Lcom/woocommerce/android/model/Order$Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddonsFrom", "", "Lorg/wordpress/android/fluxc/domain/Addon;", "productID", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrder", "Lorg/wordpress/android/fluxc/model/OrderEntity;", "orderID", "getOrderAddonsData", "Lkotlin/Pair;", "Lcom/woocommerce/android/model/Order$Item$Attribute;", "orderItemID", "(JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasAnyProductSpecificAddons", "productRemoteID", "observeProductSpecificAddons", "Lkotlinx/coroutines/flow/Flow;", "updateGlobalAddonsSuccessfully", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findOrderAttributesWith", "joinWithAddonsFrom", "(Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public final class AddonRepository {
    private final org.wordpress.android.fluxc.store.WCOrderStore orderStore = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final org.wordpress.android.fluxc.store.WCAddonsStore addonsStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject
    public AddonRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCAddonsStore addonsStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateGlobalAddonsSuccessfully(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object containsAddonsFrom(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item orderItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<org.wordpress.android.fluxc.domain.Addon>> observeProductSpecificAddons(long productRemoteID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object hasAnyProductSpecificAddons(long productRemoteID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOrderAddonsData(long orderID, long orderItemID, long productID, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<? extends org.wordpress.android.fluxc.domain.Addon>, ? extends java.util.List<com.woocommerce.android.model.Order.Item.Attribute>>> continuation) {
        return null;
    }
    
    private final java.lang.Object getOrder(long orderID, kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.OrderEntity> continuation) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.Item.Attribute> findOrderAttributesWith(org.wordpress.android.fluxc.model.OrderEntity $this$findOrderAttributesWith, long orderItemID) {
        return null;
    }
    
    private final java.lang.Object joinWithAddonsFrom(java.util.List<com.woocommerce.android.model.Order.Item.Attribute> $this$joinWithAddonsFrom, long productID, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<? extends org.wordpress.android.fluxc.domain.Addon>, ? extends java.util.List<com.woocommerce.android.model.Order.Item.Attribute>>> p2) {
        return null;
    }
    
    private final java.lang.Object getAddonsFrom(long productID, kotlin.coroutines.Continuation<? super java.util.List<? extends org.wordpress.android.fluxc.domain.Addon>> continuation) {
        return null;
    }
}