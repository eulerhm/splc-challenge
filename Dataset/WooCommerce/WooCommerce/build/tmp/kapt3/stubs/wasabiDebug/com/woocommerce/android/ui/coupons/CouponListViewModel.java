package com.woocommerce.android.ui.coupons;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u0005/0123B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020\u001fJ\u000e\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0015J\u000e\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+J\f\u0010,\u001a\u00020-*\u00020.H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "couponListHandler", "Lcom/woocommerce/android/ui/coupons/CouponListHandler;", "couponUtils", "Lcom/woocommerce/android/util/CouponUtils;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Landroidx/lifecycle/SavedStateHandle;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/coupons/CouponListHandler;Lcom/woocommerce/android/util/CouponUtils;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "couponsState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListState;", "getCouponsState", "()Landroidx/lifecycle/LiveData;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currencyCode$delegate", "Lkotlin/Lazy;", "loadingState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;", "searchQuery", "fetchCoupons", "Lkotlinx/coroutines/Job;", "monitorSearchQuery", "", "onCouponClick", "couponId", "", "onLoadMore", "onRefresh", "onSearchQueryChanged", "query", "onSearchStateChanged", "open", "", "toUiModel", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListItem;", "Lcom/woocommerce/android/model/Coupon;", "Companion", "CouponListItem", "CouponListState", "LoadingState", "NavigateToCouponDetailsEvent", "WooCommerce_wasabiDebug"})
public final class CouponListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.coupons.CouponListHandler couponListHandler = null;
    private final com.woocommerce.android.util.CouponUtils couponUtils = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.coupons.CouponListViewModel.Companion Companion = null;
    private static final long LOADING_STATE_DELAY = 100L;
    private final kotlin.Lazy currencyCode$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState> loadingState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListState> couponsState = null;
    
    @javax.inject.Inject
    public CouponListViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.CouponListHandler couponListHandler, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CouponUtils couponUtils, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super(null);
    }
    
    private final java.lang.String getCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListState> getCouponsState() {
        return null;
    }
    
    private final com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem toUiModel(com.woocommerce.android.model.Coupon $this$toUiModel) {
        return null;
    }
    
    public final void onCouponClick(long couponId) {
    }
    
    public final void onLoadMore() {
    }
    
    public final void onSearchQueryChanged(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    public final void onSearchStateChanged(boolean open) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onRefresh() {
        return null;
    }
    
    private final kotlinx.coroutines.Job fetchCoupons() {
        return null;
    }
    
    private final void monitorSearchQuery() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListState;", "", "loadingState", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;", "searchQuery", "", "coupons", "", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListItem;", "(Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;Ljava/lang/String;Ljava/util/List;)V", "getCoupons", "()Ljava/util/List;", "isSearchOpen", "", "()Z", "getLoadingState", "()Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;", "getSearchQuery", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class CouponListState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState loadingState = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String searchQuery = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> coupons = null;
        private final boolean isSearchOpen = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState loadingState, @org.jetbrains.annotations.Nullable
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> coupons) {
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
        
        public CouponListState() {
            super();
        }
        
        public CouponListState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState loadingState, @org.jetbrains.annotations.Nullable
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> coupons) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState getLoadingState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> getCoupons() {
            return null;
        }
        
        public final boolean isSearchOpen() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListItem;", "", "id", "", "code", "", "summary", "isActive", "", "(JLjava/lang/String;Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getId", "()J", "()Z", "getSummary", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class CouponListItem {
        private final long id = 0L;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String summary = null;
        private final boolean isActive = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem copy(long id, @org.jetbrains.annotations.Nullable
        java.lang.String code, @org.jetbrains.annotations.NotNull
        java.lang.String summary, boolean isActive) {
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
        
        public CouponListItem(long id, @org.jetbrains.annotations.Nullable
        java.lang.String code, @org.jetbrains.annotations.NotNull
        java.lang.String summary, boolean isActive) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSummary() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isActive() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;", "", "(Ljava/lang/String;I)V", "Idle", "Loading", "Refreshing", "Appending", "WooCommerce_wasabiDebug"})
    public static enum LoadingState {
        /*public static final*/ Idle /* = new Idle() */,
        /*public static final*/ Loading /* = new Loading() */,
        /*public static final*/ Refreshing /* = new Refreshing() */,
        /*public static final*/ Appending /* = new Appending() */;
        
        LoadingState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel$NavigateToCouponDetailsEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "couponId", "", "(J)V", "getCouponId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class NavigateToCouponDetailsEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long couponId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.CouponListViewModel.NavigateToCouponDetailsEvent copy(long couponId) {
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
        
        public NavigateToCouponDetailsEvent(long couponId) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getCouponId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListViewModel$Companion;", "", "()V", "LOADING_STATE_DELAY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}