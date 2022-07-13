package com.woocommerce.android.ui.coupons.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "EditExcludedProductCategories", "EditExcludedProducts", "EditIncludedProductCategories", "EditIncludedProducts", "OpenCouponRestrictions", "OpenDescriptionEditor", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$OpenDescriptionEditor;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$OpenCouponRestrictions;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditIncludedProducts;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditIncludedProductCategories;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditExcludedProducts;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditExcludedProductCategories;", "WooCommerce_vanillaDebug"})
public abstract class EditCouponNavigationTarget extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private EditCouponNavigationTarget() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$OpenDescriptionEditor;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "currentDescription", "", "(Ljava/lang/String;)V", "getCurrentDescription", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class OpenDescriptionEditor extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currentDescription = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.OpenDescriptionEditor copy(@org.jetbrains.annotations.Nullable()
        java.lang.String currentDescription) {
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
        
        public OpenDescriptionEditor(@org.jetbrains.annotations.Nullable()
        java.lang.String currentDescription) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrentDescription() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$OpenCouponRestrictions;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "restrictions", "Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "currencyCode", "", "showLimitUsageToXItems", "", "(Lcom/woocommerce/android/model/Coupon$CouponRestrictions;Ljava/lang/String;Z)V", "getCurrencyCode", "()Ljava/lang/String;", "getRestrictions", "()Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "getShowLimitUsageToXItems", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class OpenCouponRestrictions extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Coupon.CouponRestrictions restrictions = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currencyCode = null;
        private final boolean showLimitUsageToXItems = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.OpenCouponRestrictions copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Coupon.CouponRestrictions restrictions, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, boolean showLimitUsageToXItems) {
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
        
        public OpenCouponRestrictions(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Coupon.CouponRestrictions restrictions, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode, boolean showLimitUsageToXItems) {
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
        
        public final boolean getShowLimitUsageToXItems() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditIncludedProducts;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "selectedProductIds", "", "", "(Ljava/util/List;)V", "getSelectedProductIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditIncludedProducts extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> selectedProductIds = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.EditIncludedProducts copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> selectedProductIds) {
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
        
        public EditIncludedProducts(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> selectedProductIds) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getSelectedProductIds() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditIncludedProductCategories;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "categoryIds", "", "", "(Ljava/util/List;)V", "getCategoryIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditIncludedProductCategories extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> categoryIds = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.EditIncludedProductCategories copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> categoryIds) {
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
        
        public EditIncludedProductCategories(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> categoryIds) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getCategoryIds() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditExcludedProducts;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "excludedProductIds", "", "", "(Ljava/util/List;)V", "getExcludedProductIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditExcludedProducts extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> excludedProductIds = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.EditExcludedProducts copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedProductIds) {
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
        
        public EditExcludedProducts(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedProductIds) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getExcludedProductIds() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget$EditExcludedProductCategories;", "Lcom/woocommerce/android/ui/coupons/edit/EditCouponNavigationTarget;", "excludedCategoryIds", "", "", "(Ljava/util/List;)V", "getExcludedCategoryIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditExcludedProductCategories extends com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> excludedCategoryIds = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.coupons.edit.EditCouponNavigationTarget.EditExcludedProductCategories copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedCategoryIds) {
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
        
        public EditExcludedProductCategories(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedCategoryIds) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getExcludedCategoryIds() {
            return null;
        }
    }
}