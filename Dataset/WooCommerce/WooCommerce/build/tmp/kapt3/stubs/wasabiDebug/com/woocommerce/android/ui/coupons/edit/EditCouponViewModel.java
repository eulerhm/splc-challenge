package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002=>B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010\'\u001a\u00020\"J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u000fJ\u0010\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013J\u0014\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100J\u0006\u00102\u001a\u00020\"J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020\"J\u0006\u00109\u001a\u00020\"J\u0014\u0010:\u001a\u00020\"2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020100J\u0006\u0010<\u001a\u00020\"R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006?"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "couponRepository", "Lcom/woocommerce/android/ui/coupons/CouponRepository;", "couponUtils", "Lcom/woocommerce/android/util/CouponUtils;", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/ui/coupons/CouponRepository;Lcom/woocommerce/android/util/CouponUtils;Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "couponDraft", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/model/Coupon;", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "isSaving", "", "navArgs", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/coupons/edit/EditCouponFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "storedCoupon", "Lkotlinx/coroutines/Deferred;", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onAmountChanged", "", "value", "Ljava/math/BigDecimal;", "onCouponCodeChanged", "code", "onDescriptionButtonClick", "onDescriptionChanged", "description", "onExpiryDateChanged", "expiryDate", "Ljava/util/Date;", "onFreeShippingChanged", "onIncludedCategoriesChanged", "includedCategoryIds", "", "", "onRegenerateCodeClick", "onRestrictionsUpdated", "restrictions", "Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "onSaveClick", "Lkotlinx/coroutines/Job;", "onSelectCategoriesButtonClick", "onSelectProductsButtonClick", "onSelectedProductsUpdated", "productIds", "onUsageRestrictionsClick", "Companion", "ViewState", "WooCommerce_wasabiDebug"})
public final class EditCouponViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.ui.coupons.CouponRepository couponRepository = null;
    private final com.woocommerce.android.util.CouponUtils couponUtils = null;
    private final com.woocommerce.android.ui.products.ParameterRepository parameterRepository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.Companion Companion = null;
    private static final java.lang.String PARAMETERS_KEY = "parameters_key";
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.Deferred<com.woocommerce.android.model.Coupon> storedCoupon = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.model.Coupon> couponDraft = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isSaving = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject
    public EditCouponViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.coupons.CouponRepository couponRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CouponUtils couponUtils, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository parameterRepository) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.coupons.edit.EditCouponFragmentArgs getNavArgs() {
        return null;
    }
    
    private final java.lang.String getCurrencyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onAmountChanged(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal value) {
    }
    
    public final void onCouponCodeChanged(@org.jetbrains.annotations.NotNull
    java.lang.String code) {
    }
    
    public final void onRegenerateCodeClick() {
    }
    
    public final void onDescriptionButtonClick() {
    }
    
    public final void onDescriptionChanged(@org.jetbrains.annotations.NotNull
    java.lang.String description) {
    }
    
    public final void onExpiryDateChanged(@org.jetbrains.annotations.Nullable
    java.util.Date expiryDate) {
    }
    
    public final void onFreeShippingChanged(boolean value) {
    }
    
    public final void onUsageRestrictionsClick() {
    }
    
    public final void onSelectProductsButtonClick() {
    }
    
    public final void onSelectedProductsUpdated(@org.jetbrains.annotations.NotNull
    java.util.Set<java.lang.Long> productIds) {
    }
    
    public final void onSelectCategoriesButtonClick() {
    }
    
    public final void onIncludedCategoriesChanged(@org.jetbrains.annotations.NotNull
    java.util.Set<java.lang.Long> includedCategoryIds) {
    }
    
    public final void onRestrictionsUpdated(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Coupon.CouponRestrictions restrictions) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onSaveClick() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel$ViewState;", "", "couponDraft", "Lcom/woocommerce/android/model/Coupon;", "localizedType", "", "amountUnit", "hasChanges", "", "isSaving", "(Lcom/woocommerce/android/model/Coupon;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAmountUnit", "()Ljava/lang/String;", "getCouponDraft", "()Lcom/woocommerce/android/model/Coupon;", "getHasChanges", "()Z", "getLocalizedType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.Coupon couponDraft = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String localizedType = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String amountUnit = null;
        private final boolean hasChanges = false;
        private final boolean isSaving = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.coupons.edit.EditCouponViewModel.ViewState copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Coupon couponDraft, @org.jetbrains.annotations.Nullable
        java.lang.String localizedType, @org.jetbrains.annotations.NotNull
        java.lang.String amountUnit, boolean hasChanges, boolean isSaving) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Coupon couponDraft, @org.jetbrains.annotations.Nullable
        java.lang.String localizedType, @org.jetbrains.annotations.NotNull
        java.lang.String amountUnit, boolean hasChanges, boolean isSaving) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Coupon component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Coupon getCouponDraft() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLocalizedType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAmountUnit() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getHasChanges() {
            return false;
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isSaving() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponViewModel$Companion;", "", "()V", "PARAMETERS_KEY", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}