package com.woocommerce.android.ui.mystore.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0087B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "statsRepository", "Lcom/woocommerce/android/ui/mystore/data/StatsRepository;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/mystore/data/StatsRepository;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "hasOrders", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$HasOrders;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "refresh", "", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "(ZLorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPluginNotActiveError", "error", "", "revenueStats", "forceRefresh", "visitorStats", "LoadStatsResult", "WooCommerce_vanillaDebug"})
public final class GetStats {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.mystore.data.StatsRepository statsRepository = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    
    @javax.inject.Inject()
    public GetStats(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.mystore.data.StatsRepository statsRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public final java.lang.Object invoke(boolean refresh, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult>> continuation) {
        return null;
    }
    
    private final java.lang.Object hasOrders(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.HasOrders>> continuation) {
        return null;
    }
    
    private final java.lang.Object revenueStats(boolean forceRefresh, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult>> continuation) {
        return null;
    }
    
    private final java.lang.Object visitorStats(boolean forceRefresh, org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult>> continuation) {
        return null;
    }
    
    private final boolean isPluginNotActiveError(java.lang.Throwable error) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "", "()V", "HasOrders", "IsJetPackCPEnabled", "PluginNotActive", "RevenueStatsError", "RevenueStatsSuccess", "VisitorsStatsError", "VisitorsStatsSuccess", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$RevenueStatsSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$VisitorsStatsSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$HasOrders;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$RevenueStatsError;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$VisitorsStatsError;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$PluginNotActive;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$IsJetPackCPEnabled;", "WooCommerce_vanillaDebug"})
    public static abstract class LoadStatsResult {
        
        private LoadStatsResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$RevenueStatsSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "stats", "Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel;", "(Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel;)V", "getStats", "()Lorg/wordpress/android/fluxc/model/WCRevenueStatsModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class RevenueStatsSuccess extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.Nullable()
            private final org.wordpress.android.fluxc.model.WCRevenueStatsModel stats = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.RevenueStatsSuccess copy(@org.jetbrains.annotations.Nullable()
            org.wordpress.android.fluxc.model.WCRevenueStatsModel stats) {
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
            
            public RevenueStatsSuccess(@org.jetbrains.annotations.Nullable()
            org.wordpress.android.fluxc.model.WCRevenueStatsModel stats) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final org.wordpress.android.fluxc.model.WCRevenueStatsModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final org.wordpress.android.fluxc.model.WCRevenueStatsModel getStats() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$VisitorsStatsSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "stats", "", "", "", "(Ljava/util/Map;)V", "getStats", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
        public static final class VisitorsStatsSuccess extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.NotNull()
            private final java.util.Map<java.lang.String, java.lang.Integer> stats = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.VisitorsStatsSuccess copy(@org.jetbrains.annotations.NotNull()
            java.util.Map<java.lang.String, java.lang.Integer> stats) {
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
            
            public VisitorsStatsSuccess(@org.jetbrains.annotations.NotNull()
            java.util.Map<java.lang.String, java.lang.Integer> stats) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Map<java.lang.String, java.lang.Integer> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Map<java.lang.String, java.lang.Integer> getStats() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$HasOrders;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "hasOrder", "", "(Z)V", "getHasOrder", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class HasOrders extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            private final boolean hasOrder = false;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.HasOrders copy(boolean hasOrder) {
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
            
            public HasOrders(boolean hasOrder) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean getHasOrder() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$RevenueStatsError;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "()V", "WooCommerce_vanillaDebug"})
        public static final class RevenueStatsError extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.RevenueStatsError INSTANCE = null;
            
            private RevenueStatsError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$VisitorsStatsError;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "()V", "WooCommerce_vanillaDebug"})
        public static final class VisitorsStatsError extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.VisitorsStatsError INSTANCE = null;
            
            private VisitorsStatsError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$PluginNotActive;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PluginNotActive extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.PluginNotActive INSTANCE = null;
            
            private PluginNotActive() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult$IsJetPackCPEnabled;", "Lcom/woocommerce/android/ui/mystore/domain/GetStats$LoadStatsResult;", "()V", "WooCommerce_vanillaDebug"})
        public static final class IsJetPackCPEnabled extends com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.mystore.domain.GetStats.LoadStatsResult.IsJetPackCPEnabled INSTANCE = null;
            
            private IsJetPackCPEnabled() {
                super();
            }
        }
    }
}