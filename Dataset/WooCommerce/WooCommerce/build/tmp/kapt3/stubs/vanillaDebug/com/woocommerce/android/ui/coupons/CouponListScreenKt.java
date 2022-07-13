package com.woocommerce.android.ui.coupons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aN\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001a$\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0003\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0003\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a@\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\b\u0010\u0019\u001a\u00020\u0001H\u0003\u001a\b\u0010\u001a\u001a\u00020\u0001H\u0003\u001a\b\u0010\u001b\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0012H\u0003\u00a8\u0006\u001e"}, d2 = {"CouponList", "", "coupons", "", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListItem;", "loadingState", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$LoadingState;", "onCouponClick", "Lkotlin/Function1;", "", "onRefresh", "Lkotlin/Function0;", "onLoadMore", "CouponListEmptyPreview", "CouponListItem", "coupon", "CouponListItemInfo", "summary", "", "CouponListPreview", "CouponListScreen", "viewModel", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel;", "state", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel$CouponListState;", "CouponListSkeleton", "CouponListSkeletonPreview", "EmptyCouponList", "SearchEmptyList", "searchQuery", "WooCommerce_vanillaDebug"})
public final class CouponListScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CouponListScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.coupons.CouponListViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CouponListScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListState state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onCouponClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EmptyCouponList() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CouponList(java.util.List<com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem> coupons, com.woocommerce.android.ui.coupons.CouponListViewModel.LoadingState loadingState, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onCouponClick, kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CouponListItem(com.woocommerce.android.ui.coupons.CouponListViewModel.CouponListItem coupon, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onCouponClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CouponListItemInfo(java.lang.String summary) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CouponListSkeleton() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SearchEmptyList(java.lang.String searchQuery) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void CouponListPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void CouponListEmptyPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void CouponListSkeletonPreview() {
    }
}