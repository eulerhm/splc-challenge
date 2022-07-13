package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0003\u001a,\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003\u001a \u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003\u001a\u0080\u0001\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\tH\u0003\u001a\b\u0010\u001b\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0007\u001a\u00cc\u0001\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u001a(\u0010!\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00010\tH\u0003\u001a\u001e\u0010#\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003\u00a8\u0006$"}, d2 = {"AmountField", "", "amount", "Ljava/math/BigDecimal;", "amountUnit", "", "type", "Lcom/woocommerce/android/model/Coupon$Type;", "onAmountChanged", "Lkotlin/Function1;", "ConditionsSection", "viewState", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel$ViewState;", "onSelectProductsButtonClick", "Lkotlin/Function0;", "onSelectCategoriesButtonClick", "DescriptionButton", "description", "onButtonClicked", "DetailsSection", "onCouponCodeChanged", "onRegenerateCodeClick", "onDescriptionButtonClick", "onExpiryDateChanged", "Ljava/util/Date;", "onFreeShippingChanged", "", "EditCouponPreview", "EditCouponScreen", "viewModel", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel;", "onUsageRestrictionsClick", "onSaveClick", "ExpiryField", "dateExpires", "UsageRestrictionsSection", "WooCommerce_wasabiDebug"})
public final class EditCouponScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void EditCouponScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.edit.EditCouponViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void EditCouponScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState viewState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onAmountChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCouponCodeChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRegenerateCodeClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onDescriptionButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> onExpiryDateChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFreeShippingChanged, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onUsageRestrictionsClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSelectProductsButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSelectCategoriesButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSaveClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void DetailsSection(com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState viewState, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onAmountChanged, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCouponCodeChanged, kotlin.jvm.functions.Function0<kotlin.Unit> onRegenerateCodeClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDescriptionButtonClick, kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> onExpiryDateChanged, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFreeShippingChanged) {
    }
    
    @kotlin.Suppress(names = {"UnusedPrivateMember"})
    @androidx.compose.runtime.Composable
    private static final void ConditionsSection(com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState viewState, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectProductsButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectCategoriesButtonClick) {
    }
    
    @kotlin.Suppress(names = {"UnusedPrivateMember"})
    @androidx.compose.runtime.Composable
    private static final void UsageRestrictionsSection(com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState viewState, kotlin.jvm.functions.Function0<kotlin.Unit> onUsageRestrictionsClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void AmountField(java.math.BigDecimal amount, java.lang.String amountUnit, com.woocommerce.android.model.Coupon.Type type, kotlin.jvm.functions.Function1<? super java.math.BigDecimal, kotlin.Unit> onAmountChanged) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void DescriptionButton(java.lang.String description, kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClicked) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.Suppress(names = {"LongMethod"})
    private static final void ExpiryField(java.util.Date dateExpires, kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> onExpiryDateChanged) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview
    @androidx.compose.runtime.Composable
    private static final void EditCouponPreview() {
    }
}