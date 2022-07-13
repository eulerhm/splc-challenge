package com.woocommerce.android.ui.coupons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001+B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0011\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0014\u0010\u000fJ2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0 0\u001dJ:\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b%\u0010&J*\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010(\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b)\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponRepository;", "", "store", "Lorg/wordpress/android/fluxc/store/CouponStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Lorg/wordpress/android/fluxc/store/CouponStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/util/DateUtils;)V", "deleteCoupon", "Lkotlin/Result;", "", "couponId", "", "deleteCoupon-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCoupon", "fetchCoupon-gIAlu-s", "fetchCouponPerformance", "Lcom/woocommerce/android/model/CouponPerformanceReport;", "fetchCouponPerformance-gIAlu-s", "fetchCoupons", "", "page", "", "pageSize", "fetchCoupons-0E7RQCE", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeCoupon", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/model/Coupon;", "observeCoupons", "", "searchCoupons", "Lcom/woocommerce/android/ui/coupons/CouponRepository$SearchResult;", "searchString", "", "searchCoupons-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCoupon", "coupon", "updateCoupon-gIAlu-s", "(Lcom/woocommerce/android/model/Coupon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SearchResult", "WooCommerce_vanillaDebug"})
public final class CouponRepository {
    private final org.wordpress.android.fluxc.store.CouponStore store = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    
    @javax.inject.Inject()
    public CouponRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.CouponStore store, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.model.Coupon>> observeCoupons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.model.Coupon> observeCoupon(long couponId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponRepository$SearchResult;", "", "coupons", "", "Lcom/woocommerce/android/model/Coupon;", "canLoadMore", "", "(Ljava/util/List;Z)V", "getCanLoadMore", "()Z", "getCoupons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class SearchResult {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Coupon> coupons = null;
        private final boolean canLoadMore = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.CouponRepository.SearchResult copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Coupon> coupons, boolean canLoadMore) {
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
        
        public SearchResult(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Coupon> coupons, boolean canLoadMore) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Coupon> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Coupon> getCoupons() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getCanLoadMore() {
            return false;
        }
    }
}