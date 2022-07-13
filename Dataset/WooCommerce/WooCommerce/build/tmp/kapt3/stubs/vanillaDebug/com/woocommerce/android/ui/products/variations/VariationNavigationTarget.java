package com.woocommerce.android.ui.products.variations;

import java.lang.System;

/**
 * [VariationNavigationTarget] is a utility sealed class that identifies the different types of navigation that can
 * take place from the product details view while providing a common interface for managing them as a single type:
 *
 * Mostly used by [VariationDetailFragment] for handling navigation in the Products detail/product sub detail screen
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "ViewAttributes", "ViewDescriptionEditor", "ViewImageGallery", "ViewInventory", "ViewMediaUploadErrors", "ViewPricing", "ViewShipping", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewInventory;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewPricing;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewShipping;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewDescriptionEditor;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewMediaUploadErrors;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewAttributes;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewImageGallery;", "WooCommerce_vanillaDebug"})
public abstract class VariationNavigationTarget extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private VariationNavigationTarget() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewInventory;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "inventoryData", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "sku", "", "(Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;Ljava/lang/String;)V", "getInventoryData", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "getSku", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewInventory extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sku = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewInventory copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.NotNull()
        java.lang.String sku) {
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
        
        public ViewInventory(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.NotNull()
        java.lang.String sku) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData getInventoryData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSku() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewPricing;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "pricingData", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "(Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;)V", "getPricingData", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewPricing extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewPricing copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
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
        
        public ViewPricing(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData getPricingData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewShipping;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "shippingData", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "(Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;)V", "getShippingData", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewShipping extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewShipping copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData) {
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
        
        public ViewShipping(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData getShippingData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewDescriptionEditor;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "description", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewDescriptionEditor extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewDescriptionEditor copy(@org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
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
        
        public ViewDescriptionEditor(@org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewMediaUploadErrors;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewMediaUploadErrors extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewMediaUploadErrors copy(long remoteId) {
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
        
        public ViewMediaUploadErrors(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewAttributes;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "remoteProductId", "", "remoteVariationId", "(JJ)V", "getRemoteProductId", "()J", "getRemoteVariationId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewAttributes extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        private final long remoteProductId = 0L;
        private final long remoteVariationId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewAttributes copy(long remoteProductId, long remoteVariationId) {
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
        
        public ViewAttributes(long remoteProductId, long remoteVariationId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteProductId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getRemoteVariationId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget$ViewImageGallery;", "Lcom/woocommerce/android/ui/products/variations/VariationNavigationTarget;", "remoteId", "", "images", "", "Lcom/woocommerce/android/model/Product$Image;", "showChooser", "", "selectedImage", "(JLjava/util/List;ZLcom/woocommerce/android/model/Product$Image;)V", "getImages", "()Ljava/util/List;", "getRemoteId", "()J", "getSelectedImage", "()Lcom/woocommerce/android/model/Product$Image;", "getShowChooser", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewImageGallery extends com.woocommerce.android.ui.products.variations.VariationNavigationTarget {
        private final long remoteId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.Product.Image> images = null;
        private final boolean showChooser = false;
        @org.jetbrains.annotations.Nullable()
        private final com.woocommerce.android.model.Product.Image selectedImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.VariationNavigationTarget.ViewImageGallery copy(long remoteId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Product.Image> images, boolean showChooser, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product.Image selectedImage) {
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
        
        public ViewImageGallery(long remoteId, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.Product.Image> images, boolean showChooser, @org.jetbrains.annotations.Nullable()
        com.woocommerce.android.model.Product.Image selectedImage) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Product.Image> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.Product.Image> getImages() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getShowChooser() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product.Image component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.woocommerce.android.model.Product.Image getSelectedImage() {
            return null;
        }
    }
}