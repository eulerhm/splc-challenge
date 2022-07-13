package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u000201B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u0014\u0010#\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!J\u000e\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001eJ\u0015\u0010\'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010,J\u0015\u0010.\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*J\u0015\u0010/\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "navArgs", "Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "restrictionsDraft", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "viewState", "Landroidx/lifecycle/LiveData;", "Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel$ViewState;", "getViewState", "()Landroidx/lifecycle/LiveData;", "onAllowedEmailsButtonClicked", "", "onAllowedEmailsUpdated", "allowedEmails", "", "", "onBackPressed", "onExcludeCategoriesButtonClick", "onExcludeProductsButtonClick", "onExcludeSaleItemsChanged", "areSaleItemsExcluded", "", "onExcludedProductCategoriesChanged", "excludedCategoryIds", "", "", "onExcludedProductChanged", "excludedProductIds", "onIndividualUseChanged", "isForIndividualUse", "onLimitUsageToXItemsChanged", "value", "", "(Ljava/lang/Integer;)V", "onMaximumAmountChanged", "Ljava/math/BigDecimal;", "onMinimumAmountChanged", "onUsageLimitPerCouponChanged", "onUsageLimitPerUserChanged", "OpenAllowedEmailsEditor", "ViewState", "WooCommerce_vanillaDebug"})
public final class CouponRestrictionsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.woocommerce.android.model.Coupon.CouponRestrictions> restrictionsDraft = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.ViewState> viewState = null;
    
    @javax.inject.Inject()
    public CouponRestrictionsViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super(null);
    }
    
    private final com.woocommerce.android.ui.coupons.edit.CouponRestrictionsFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.ViewState> getViewState() {
        return null;
    }
    
    public final void onBackPressed() {
    }
    
    public final void onMinimumAmountChanged(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal value) {
    }
    
    public final void onMaximumAmountChanged(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal value) {
    }
    
    public final void onUsageLimitPerCouponChanged(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    public final void onLimitUsageToXItemsChanged(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    public final void onUsageLimitPerUserChanged(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    public final void onIndividualUseChanged(boolean isForIndividualUse) {
    }
    
    public final void onExcludeSaleItemsChanged(boolean areSaleItemsExcluded) {
    }
    
    public final void onAllowedEmailsButtonClicked() {
    }
    
    public final void onAllowedEmailsUpdated(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allowedEmails) {
    }
    
    public final void onExcludeProductsButtonClick() {
    }
    
    public final void onExcludeCategoriesButtonClick() {
    }
    
    public final void onExcludedProductChanged(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> excludedProductIds) {
    }
    
    public final void onExcludedProductCategoriesChanged(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> excludedCategoryIds) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel$ViewState;", "", "restrictions", "Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "currencyCode", "", "hasChanges", "", "showLimitUsageToXItems", "(Lcom/woocommerce/android/model/Coupon$CouponRestrictions;Ljava/lang/String;ZZ)V", "getCurrencyCode", "()Ljava/lang/String;", "getHasChanges", "()Z", "getRestrictions", "()Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "getShowLimitUsageToXItems", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Coupon.CouponRestrictions restrictions = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currencyCode = null;
        private final boolean hasChanges = false;
        private final boolean showLimitUsageToXItems = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.ViewState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Coupon.CouponRestrictions restrictions, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, boolean hasChanges, boolean showLimitUsageToXItems) {
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
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Coupon.CouponRestrictions restrictions, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, boolean hasChanges, boolean showLimitUsageToXItems) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Coupon.CouponRestrictions component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Coupon.CouponRestrictions getRestrictions() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrencyCode() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getHasChanges() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean getShowLimitUsageToXItems() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/CouponRestrictionsViewModel$OpenAllowedEmailsEditor;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "allowedEmails", "", "", "(Ljava/util/List;)V", "getAllowedEmails", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class OpenAllowedEmailsEditor extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> allowedEmails = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.CouponRestrictionsViewModel.OpenAllowedEmailsEditor copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> allowedEmails) {
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
        
        public OpenAllowedEmailsEditor(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> allowedEmails) {
            super(false);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getAllowedEmails() {
            return null;
        }
    }
}