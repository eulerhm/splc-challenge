package com.woocommerce.android.ui.coupons.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001aV\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u001a\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003\u001a\u001a\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003\u001a$\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0007\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a\u0012\u0010\u001c\u001a\u00020\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0003\u00a8\u0006\u001e"}, d2 = {"CouponDetailsScreen", "", "viewModel", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel;", "onBackPress", "Lkotlin/Function0;", "", "state", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponDetailsState;", "onCopyButtonClick", "onShareButtonClick", "onEditButtonClick", "onDeleteButtonClick", "CouponPerformanceAmount", "couponPerformanceState", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponPerformanceState;", "modifier", "Landroidx/compose/ui/Modifier;", "CouponPerformanceCount", "CouponPerformanceSection", "CouponSummaryHeading", "code", "", "isActive", "description", "CouponSummarySection", "couponSummary", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel$CouponSummaryUi;", "SummaryLabel", "text", "WooCommerce_wasabiDebug"})
public final class CouponDetailsScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void CouponDetailsScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<java.lang.Boolean> onBackPress) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CouponDetailsScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponDetailsState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<java.lang.Boolean> onBackPress, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onCopyButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onShareButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onEditButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDeleteButtonClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CouponSummaryHeading(@org.jetbrains.annotations.Nullable
    java.lang.String code, boolean isActive, @org.jetbrains.annotations.Nullable
    java.lang.String description) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CouponSummarySection(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponSummaryUi couponSummary) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SummaryLabel(java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CouponPerformanceSection(com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CouponPerformanceCount(com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void CouponPerformanceAmount(com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel.CouponPerformanceState couponPerformanceState, androidx.compose.ui.Modifier modifier) {
    }
}