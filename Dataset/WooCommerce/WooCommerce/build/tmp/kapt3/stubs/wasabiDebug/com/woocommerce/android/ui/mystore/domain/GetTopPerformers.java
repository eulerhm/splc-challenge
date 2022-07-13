package com.woocommerce.android.ui.mystore.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers;", "", "statsRepository", "Lcom/woocommerce/android/ui/mystore/data/StatsRepository;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lcom/woocommerce/android/ui/mystore/data/StatsRepository;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult;", "forceRefresh", "", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "topPerformersCount", "", "(ZLorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sortTopPerformers", "", "Lorg/wordpress/android/fluxc/model/leaderboards/WCTopPerformerProductModel;", "topPerformers", "TopPerformersResult", "WooCommerce_wasabiDebug"})
public final class GetTopPerformers {
    private final com.woocommerce.android.ui.mystore.data.StatsRepository statsRepository = null;
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    
    @javax.inject.Inject
    public GetTopPerformers(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.mystore.data.StatsRepository statsRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(boolean forceRefresh, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity, int topPerformersCount, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.woocommerce.android.ui.mystore.domain.GetTopPerformers.TopPerformersResult>> continuation) {
        return null;
    }
    
    private final java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> sortTopPerformers(java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> topPerformers) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult;", "", "()V", "TopPerformersError", "TopPerformersSuccess", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult$TopPerformersSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult$TopPerformersError;", "WooCommerce_wasabiDebug"})
    public static abstract class TopPerformersResult {
        
        private TopPerformersResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult$TopPerformersSuccess;", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult;", "topPerformers", "", "Lorg/wordpress/android/fluxc/model/leaderboards/WCTopPerformerProductModel;", "(Ljava/util/List;)V", "getTopPerformers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class TopPerformersSuccess extends com.woocommerce.android.ui.mystore.domain.GetTopPerformers.TopPerformersResult {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> topPerformers = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.mystore.domain.GetTopPerformers.TopPerformersResult.TopPerformersSuccess copy(@org.jetbrains.annotations.NotNull
            java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> topPerformers) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public TopPerformersSuccess(@org.jetbrains.annotations.NotNull
            java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> topPerformers) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<org.wordpress.android.fluxc.model.leaderboards.WCTopPerformerProductModel> getTopPerformers() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult$TopPerformersError;", "Lcom/woocommerce/android/ui/mystore/domain/GetTopPerformers$TopPerformersResult;", "()V", "WooCommerce_wasabiDebug"})
        public static final class TopPerformersError extends com.woocommerce.android.ui.mystore.domain.GetTopPerformers.TopPerformersResult {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.mystore.domain.GetTopPerformers.TopPerformersResult.TopPerformersError INSTANCE = null;
            
            private TopPerformersError() {
                super();
            }
        }
    }
}