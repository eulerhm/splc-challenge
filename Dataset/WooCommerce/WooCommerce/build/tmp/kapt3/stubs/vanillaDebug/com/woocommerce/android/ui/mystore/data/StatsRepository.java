package com.woocommerce.android.ui.mystore.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ>\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r0\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\r0\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ<\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00170\u001d0\r0\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/mystore/data/StatsRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wcStatsStore", "Lorg/wordpress/android/fluxc/store/WCStatsStore;", "wcOrderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "wcLeaderboardsStore", "Lorg/wordpress/android/fluxc/store/WCLeaderboardsStore;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCStatsStore;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lorg/wordpress/android/fluxc/store/WCLeaderboardsStore;)V", "checkIfStoreHasNoOrders", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductLeaderboards", "", "Lorg/wordpress/android/fluxc/model/leaderboards/WCTopPerformerProductModel;", "forced", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "quantity", "", "(ZLorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRevenueStats", "Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel;", "(Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchVisitorStats", "", "", "Companion", "StatsException", "WooCommerce_vanillaDebug"})
public final class StatsRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCStatsStore wcStatsStore = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore wcOrderStore = null;
    private final org.wordpress.android.fluxc.store.WCLeaderboardsStore wcLeaderboardsStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.mystore.data.StatsRepository.Companion Companion = null;
    private static final java.lang.Class<com.woocommerce.android.ui.mystore.data.StatsRepository> TAG = null;
    
    @javax.inject.Inject()
    public StatsRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore wcStatsStore, @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UnusedPrivateMember", "Required to ensure the WCOrderStore is initialized!"})
    org.wordpress.android.fluxc.store.WCOrderStore wcOrderStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCLeaderboardsStore wcLeaderboardsStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchRevenueStats(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, boolean forced, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<org.wordpress.android.fluxc.model.WCRevenueStatsModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchVisitorStats(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, boolean forced, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.Map<java.lang.String, java.lang.Integer>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchProductLeaderboards(boolean forced, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, int quantity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkIfStoreHasNoOrders(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/mystore/data/StatsRepository$StatsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lorg/wordpress/android/fluxc/store/WCStatsStore$OrderStatsError;", "(Lorg/wordpress/android/fluxc/store/WCStatsStore$OrderStatsError;)V", "getError", "()Lorg/wordpress/android/fluxc/store/WCStatsStore$OrderStatsError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class StatsException extends java.lang.Exception {
        @org.jetbrains.annotations.Nullable()
        private final org.wordpress.android.fluxc.store.WCStatsStore.OrderStatsError error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.mystore.data.StatsRepository.StatsException copy(@org.jetbrains.annotations.Nullable()
        org.wordpress.android.fluxc.store.WCStatsStore.OrderStatsError error) {
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
        
        public StatsException(@org.jetbrains.annotations.Nullable()
        org.wordpress.android.fluxc.store.WCStatsStore.OrderStatsError error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wordpress.android.fluxc.store.WCStatsStore.OrderStatsError component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wordpress.android.fluxc.store.WCStatsStore.OrderStatsError getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/mystore/data/StatsRepository$Companion;", "", "()V", "TAG", "Ljava/lang/Class;", "Lcom/woocommerce/android/ui/mystore/data/StatsRepository;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}