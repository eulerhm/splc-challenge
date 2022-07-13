package com.woocommerce.android.ui.coupons.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0007-./0123B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0002J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020)R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "couponRepository", "Lcom/woocommerce/android/ui/coupons/CouponRepository;", "couponUtils", "Lcom/woocommerce/android/util/CouponUtils;", "(Landroidx/lifecycle/SavedStateHandle;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/coupons/CouponRepository;Lcom/woocommerce/android/util/CouponUtils;)V", "coupon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/woocommerce/android/model/Coupon;", "couponPerformance", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "couponState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponDetailsState;", "getCouponState", "()Landroidx/lifecycle/LiveData;", "couponSummary", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currencyCode$delegate", "Lkotlin/Lazy;", "navArgs", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/coupons/details/CouponDetailsFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "loadCouponPerformance", "loadCouponSummary", "onCopyButtonClick", "", "onDeleteButtonClick", "onEditButtonClick", "onShareButtonClick", "CopyCodeEvent", "CouponDetailsState", "CouponPerformanceState", "CouponPerformanceUi", "CouponSummaryUi", "ShareCodeEvent", "ShowEditCoupon", "WooCommerce_vanillaDebug"})
public final class CouponDetailsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.coupons.CouponRepository couponRepository = null;
    private final com.woocommerce.android.util.CouponUtils couponUtils = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlin.Lazy currencyCode$delegate = null;
    private final kotlinx.coroutines.flow.StateFlow<com.woocommerce.android.model.Coupon> coupon = null;
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi> couponSummary = null;
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState> couponPerformance = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponDetailsState> couponState = null;
    
    @javax.inject.Inject()
    public CouponDetailsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.coupons.CouponRepository couponRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CouponUtils couponUtils) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.coupons.details.CouponDetailsFragmentArgs getNavArgs() {
        return null;
    }
    
    private final java.lang.String getCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponDetailsState> getCouponState() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi> loadCouponSummary() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState> loadCouponPerformance() {
        return null;
    }
    
    public final void onDeleteButtonClick() {
    }
    
    public final void onCopyButtonClick() {
    }
    
    public final void onShareButtonClick() {
    }
    
    public final void onEditButtonClick() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponDetailsState;", "", "isLoading", "", "couponSummary", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;", "couponPerformanceState", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "(ZLcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;)V", "getCouponPerformanceState", "()Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "getCouponSummary", "()Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class CouponDetailsState {
        private final boolean isLoading = false;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi couponSummary = null;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponDetailsState copy(boolean isLoading, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi couponSummary, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState) {
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
        
        public CouponDetailsState() {
            super();
        }
        
        public CouponDetailsState(boolean isLoading, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi couponSummary, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi getCouponSummary() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState getCouponPerformanceState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00b3\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;", "", "code", "", "isActive", "", "description", "summary", "isForIndividualUse", "isShippingFree", "areSaleItemsExcluded", "discountType", "minimumSpending", "maximumSpending", "usageLimitPerUser", "usageLimitPerCoupon", "usageLimitPerItems", "expiration", "emailRestrictions", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAreSaleItemsExcluded", "()Z", "getCode", "()Ljava/lang/String;", "getDescription", "getDiscountType", "getEmailRestrictions", "getExpiration", "getMaximumSpending", "getMinimumSpending", "getSummary", "getUsageLimitPerCoupon", "getUsageLimitPerItems", "getUsageLimitPerUser", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class CouponSummaryUi {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String code = null;
        private final boolean isActive = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String summary = null;
        private final boolean isForIndividualUse = false;
        private final boolean isShippingFree = false;
        private final boolean areSaleItemsExcluded = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String discountType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String minimumSpending = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String maximumSpending = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String usageLimitPerUser = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String usageLimitPerCoupon = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String usageLimitPerItems = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String expiration = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String emailRestrictions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi copy(@org.jetbrains.annotations.Nullable()
        java.lang.String code, boolean isActive, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String summary, boolean isForIndividualUse, boolean isShippingFree, boolean areSaleItemsExcluded, @org.jetbrains.annotations.Nullable()
        java.lang.String discountType, @org.jetbrains.annotations.Nullable()
        java.lang.String minimumSpending, @org.jetbrains.annotations.Nullable()
        java.lang.String maximumSpending, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerUser, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerCoupon, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerItems, @org.jetbrains.annotations.Nullable()
        java.lang.String expiration, @org.jetbrains.annotations.Nullable()
        java.lang.String emailRestrictions) {
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
        
        public CouponSummaryUi(@org.jetbrains.annotations.Nullable()
        java.lang.String code, boolean isActive, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String summary, boolean isForIndividualUse, boolean isShippingFree, boolean areSaleItemsExcluded, @org.jetbrains.annotations.Nullable()
        java.lang.String discountType, @org.jetbrains.annotations.Nullable()
        java.lang.String minimumSpending, @org.jetbrains.annotations.Nullable()
        java.lang.String maximumSpending, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerUser, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerCoupon, @org.jetbrains.annotations.Nullable()
        java.lang.String usageLimitPerItems, @org.jetbrains.annotations.Nullable()
        java.lang.String expiration, @org.jetbrains.annotations.Nullable()
        java.lang.String emailRestrictions) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCode() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isActive() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSummary() {
            return null;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isForIndividualUse() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isShippingFree() {
            return false;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean getAreSaleItemsExcluded() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDiscountType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMinimumSpending() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMaximumSpending() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsageLimitPerUser() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsageLimitPerCoupon() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsageLimitPerItems() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getExpiration() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmailRestrictions() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceUi;", "", "ordersCount", "", "formattedAmount", "", "(ILjava/lang/String;)V", "getFormattedAmount", "()Ljava/lang/String;", "getOrdersCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class CouponPerformanceUi {
        private final int ordersCount = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String formattedAmount = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi copy(int ordersCount, @org.jetbrains.annotations.NotNull()
        java.lang.String formattedAmount) {
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
        
        public CouponPerformanceUi(int ordersCount, @org.jetbrains.annotations.NotNull()
        java.lang.String formattedAmount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getOrdersCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormattedAmount() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "", "()V", "ordersCount", "", "getOrdersCount", "()Ljava/lang/Integer;", "Failure", "Loading", "Success", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Loading;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Failure;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Success;", "WooCommerce_vanillaDebug"})
    public static abstract class CouponPerformanceState {
        
        private CouponPerformanceState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Integer getOrdersCount();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Loading;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "ordersCount", "", "(Ljava/lang/Integer;)V", "getOrdersCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Loading;", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Loading extends com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer ordersCount = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState.Loading copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer ordersCount) {
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
            
            public Loading() {
                super();
            }
            
            public Loading(@org.jetbrains.annotations.Nullable()
            java.lang.Integer ordersCount) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.Integer getOrdersCount() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Failure;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "ordersCount", "", "(Ljava/lang/Integer;)V", "getOrdersCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Failure;", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Failure extends com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer ordersCount = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState.Failure copy(@org.jetbrains.annotations.Nullable()
            java.lang.Integer ordersCount) {
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
            
            public Failure() {
                super();
            }
            
            public Failure(@org.jetbrains.annotations.Nullable()
            java.lang.Integer ordersCount) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            public java.lang.Integer getOrdersCount() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState$Success;", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "data", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceUi;", "(Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceUi;)V", "getData", "()Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceUi;", "ordersCount", "", "getOrdersCount", "()Ljava/lang/Integer;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Success extends com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi data = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState.Success copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi data) {
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
            
            public Success(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi data) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceUi getData() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.Integer getOrdersCount() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CopyCodeEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "couponCode", "", "(Ljava/lang/String;)V", "getCouponCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class CopyCodeEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String couponCode = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CopyCodeEvent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String couponCode) {
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
        
        public CopyCodeEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String couponCode) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCouponCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$ShareCodeEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "shareCodeMessage", "", "(Ljava/lang/String;)V", "getShareCodeMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ShareCodeEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String shareCodeMessage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.ShareCodeEvent copy(@org.jetbrains.annotations.NotNull()
        java.lang.String shareCodeMessage) {
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
        
        public ShareCodeEvent(@org.jetbrains.annotations.NotNull()
        java.lang.String shareCodeMessage) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getShareCodeMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$ShowEditCoupon;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "couponId", "", "(J)V", "getCouponId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ShowEditCoupon extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long couponId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.ShowEditCoupon copy(long couponId) {
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
        
        public ShowEditCoupon(long couponId) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getCouponId() {
            return 0L;
        }
    }
}