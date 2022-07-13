package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u00d0\u0001\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00010\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a,\u0010\u001a\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001a$\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001a$\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001a:\u0010\u001f\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020$H\u0003\u00a8\u0006%"}, d2 = {"AllowedEmailsButton", "", "allowedEmails", "", "", "onClick", "Lkotlin/Function0;", "CouponRestrictionsScreen", "viewModel", "Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel;", "viewState", "Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel$ViewState;", "onMinimumAmountChanged", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "onMaximumAmountChanged", "onUsageLimitPerCouponChanged", "", "onLimitUsageToXItemsChanged", "onUsageLimitPerUserChanged", "onIndividualUseChanged", "", "onExcludeSaleItemsChanged", "onAllowedEmailsButtonClicked", "onExcludeProductsButtonClick", "onExcludeCategoriesButtonClick", "ExclusionsSection", "IndividualUseSwitch", "isForIndividualUse", "SaleItemsSwitch", "areSaleItemsExcluded", "SpendingRestrictionField", "value", "onValueChange", "label", "modifier", "Landroidx/compose/ui/Modifier;", "WooCommerce_wasabiDebug"})
public final class CouponRestrictionsScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void CouponRestrictionsScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void CouponRestrictionsScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.ViewState viewState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onMinimumAmountChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onMaximumAmountChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onUsageLimitPerCouponChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onLimitUsageToXItemsChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onUsageLimitPerUserChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onIndividualUseChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onExcludeSaleItemsChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onAllowedEmailsButtonClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onExcludeProductsButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onExcludeCategoriesButtonClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SpendingRestrictionField(java.math.BigDecimal value, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onValueChange, java.lang.String label, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void IndividualUseSwitch(boolean isForIndividualUse, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onIndividualUseChanged) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void AllowedEmailsButton(java.util.List<java.lang.String> allowedEmails, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SaleItemsSwitch(boolean areSaleItemsExcluded, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onExcludeSaleItemsChanged) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void ExclusionsSection(com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.ViewState viewState, kotlin.jvm.functions.Function0<kotlin.Unit> onExcludeProductsButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onExcludeCategoriesButtonClick) {
    }
}