package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * [ProductNavigationTarget] is a utility sealed class that identifies the different types of navigation that can
 * take place from the product details view while providing a common interface for managing them as a single type:
 *
 * Mostly used by [ProductDetailFragment] for handling navigation in the Products detail/product sub detail screen
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:&\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'(B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001&)*+,-./0123456789:;<=>?@ABCDEFGHIJKLMN\u00a8\u0006O"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "AddProductAttribute", "AddProductAttributeTerms", "AddProductCategory", "AddProductDownloadableFile", "ExitProduct", "NavigateToVariationSelector", "RenameProductAttribute", "ShareProduct", "ViewGroupedProducts", "ViewLinkedProducts", "ViewMediaUploadErrors", "ViewProductAdd", "ViewProductAddonsDetails", "ViewProductAttributes", "ViewProductCatalogVisibility", "ViewProductCategories", "ViewProductDescriptionEditor", "ViewProductDetailBottomSheet", "ViewProductDownloadDetails", "ViewProductDownloads", "ViewProductDownloadsSettings", "ViewProductExternalLink", "ViewProductImageGallery", "ViewProductInventory", "ViewProductMenuOrder", "ViewProductPricing", "ViewProductPurchaseNoteEditor", "ViewProductReviews", "ViewProductSelectionList", "ViewProductSettings", "ViewProductShipping", "ViewProductShortDescriptionEditor", "ViewProductSlug", "ViewProductStatus", "ViewProductTags", "ViewProductTypes", "ViewProductVariations", "ViewProductVisibility", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ShareProduct;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductVariations;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductInventory;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAttributes;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductPricing;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductShipping;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductExternalLink;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDescriptionEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductPurchaseNoteEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductShortDescriptionEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductImageGallery;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewMediaUploadErrors;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSettings;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductStatus;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductCatalogVisibility;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductVisibility;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSlug;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductMenuOrder;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ExitProduct;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductCategories;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductCategory;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductTags;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDetailBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductTypes;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductReviews;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAdd;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewGroupedProducts;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewLinkedProducts;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSelectionList;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloads;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloadsSettings;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloadDetails;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAddonsDetails;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductDownloadableFile;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductAttribute;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductAttributeTerms;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$RenameProductAttribute;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget$NavigateToVariationSelector;", "WooCommerce_wasabiDebug"})
public abstract class ProductNavigationTarget extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private ProductNavigationTarget() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ShareProduct;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "url", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ShareProduct extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String url = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ShareProduct copy(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
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
        
        public ShareProduct(@org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductVariations;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductVariations extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductVariations copy(long remoteId) {
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
        
        public ViewProductVariations(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductInventory;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "inventoryData", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "sku", "", "productType", "Lcom/woocommerce/android/ui/products/ProductType;", "(Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;Ljava/lang/String;Lcom/woocommerce/android/ui/products/ProductType;)V", "getInventoryData", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel$InventoryData;", "getProductType", "()Lcom/woocommerce/android/ui/products/ProductType;", "getSku", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductInventory extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductType productType = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductInventory copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType productType) {
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
        
        public ViewProductInventory(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData inventoryData, @org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType productType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductInventoryViewModel.InventoryData getInventoryData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType getProductType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAttributes;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ViewProductAttributes extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductAttributes INSTANCE = null;
        
        private ViewProductAttributes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductPricing;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "pricingData", "Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "(Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;)V", "getPricingData", "()Lcom/woocommerce/android/ui/products/ProductPricingViewModel$PricingData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductPricing extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductPricing copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
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
        
        public ViewProductPricing(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData pricingData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductPricingViewModel.PricingData getPricingData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductShipping;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "shippingData", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "(Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;)V", "getShippingData", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel$ShippingData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductShipping extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductShipping copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData) {
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
        
        public ViewProductShipping(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData shippingData) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductShippingViewModel.ShippingData getShippingData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductExternalLink;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductExternalLink extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductExternalLink copy(long remoteId) {
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
        
        public ViewProductExternalLink(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDescriptionEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "description", "", "title", "productTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getProductTitle", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductDescriptionEditor extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String productTitle = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductDescriptionEditor copy(@org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String productTitle) {
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
        
        public ViewProductDescriptionEditor(@org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String productTitle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getProductTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductPurchaseNoteEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "purchaseNote", "", "title", "caption", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaption", "()Ljava/lang/String;", "getPurchaseNote", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductPurchaseNoteEditor extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String purchaseNote = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String caption = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductPurchaseNoteEditor copy(@org.jetbrains.annotations.NotNull
        java.lang.String purchaseNote, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String caption) {
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
        
        public ViewProductPurchaseNoteEditor(@org.jetbrains.annotations.NotNull
        java.lang.String purchaseNote, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String caption) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPurchaseNote() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCaption() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductShortDescriptionEditor;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "shortDescription", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "getShortDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductShortDescriptionEditor extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String shortDescription = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductShortDescriptionEditor copy(@org.jetbrains.annotations.NotNull
        java.lang.String shortDescription, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
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
        
        public ViewProductShortDescriptionEditor(@org.jetbrains.annotations.NotNull
        java.lang.String shortDescription, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getShortDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductImageGallery;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "images", "", "Lcom/woocommerce/android/model/Product$Image;", "showChooser", "", "selectedImage", "(JLjava/util/List;ZLcom/woocommerce/android/model/Product$Image;)V", "getImages", "()Ljava/util/List;", "getRemoteId", "()J", "getSelectedImage", "()Lcom/woocommerce/android/model/Product$Image;", "getShowChooser", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductImageGallery extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.model.Product.Image> images = null;
        private final boolean showChooser = false;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.Product.Image selectedImage = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductImageGallery copy(long remoteId, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Product.Image> images, boolean showChooser, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product.Image selectedImage) {
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
        
        public ViewProductImageGallery(long remoteId, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Product.Image> images, boolean showChooser, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.Product.Image selectedImage) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Product.Image> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Product.Image> getImages() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getShowChooser() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product.Image component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.Product.Image getSelectedImage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewMediaUploadErrors;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewMediaUploadErrors extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewMediaUploadErrors copy(long remoteId) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSettings;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductSettings extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductSettings copy(long remoteId) {
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
        
        public ViewProductSettings(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductStatus;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "status", "Lcom/woocommerce/android/ui/products/ProductStatus;", "(Lcom/woocommerce/android/ui/products/ProductStatus;)V", "getStatus", "()Lcom/woocommerce/android/ui/products/ProductStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductStatus extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.products.ProductStatus status = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductStatus copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.ProductStatus status) {
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
        
        public ViewProductStatus(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.ProductStatus status) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.ProductStatus component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.ProductStatus getStatus() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductCatalogVisibility;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "catalogVisibility", "Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;", "isFeatured", "", "(Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;Z)V", "getCatalogVisibility", "()Lcom/woocommerce/android/ui/products/settings/ProductCatalogVisibility;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductCatalogVisibility extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility = null;
        private final boolean isFeatured = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductCatalogVisibility copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility, boolean isFeatured) {
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
        
        public ViewProductCatalogVisibility(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.settings.ProductCatalogVisibility catalogVisibility, boolean isFeatured) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.settings.ProductCatalogVisibility getCatalogVisibility() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isFeatured() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductVisibility;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "visibility", "Lcom/woocommerce/android/ui/products/settings/ProductVisibility;", "password", "", "(Lcom/woocommerce/android/ui/products/settings/ProductVisibility;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "getVisibility", "()Lcom/woocommerce/android/ui/products/settings/ProductVisibility;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductVisibility extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.ui.products.settings.ProductVisibility visibility = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String password = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductVisibility copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.settings.ProductVisibility visibility, @org.jetbrains.annotations.Nullable
        java.lang.String password) {
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
        
        public ViewProductVisibility(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.ui.products.settings.ProductVisibility visibility, @org.jetbrains.annotations.Nullable
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.settings.ProductVisibility component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.settings.ProductVisibility getVisibility() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPassword() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSlug;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "slug", "", "(Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductSlug extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String slug = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductSlug copy(@org.jetbrains.annotations.NotNull
        java.lang.String slug) {
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
        
        public ViewProductSlug(@org.jetbrains.annotations.NotNull
        java.lang.String slug) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSlug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductMenuOrder;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "menuOrder", "", "(I)V", "getMenuOrder", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductMenuOrder extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final int menuOrder = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductMenuOrder copy(int menuOrder) {
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
        
        public ViewProductMenuOrder(int menuOrder) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMenuOrder() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ExitProduct;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ExitProduct extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ExitProduct INSTANCE = null;
        
        private ExitProduct() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductCategories;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductCategories extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductCategories copy(long remoteId) {
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
        
        public ViewProductCategories(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductCategory;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class AddProductCategory extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.AddProductCategory INSTANCE = null;
        
        private AddProductCategory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductTags;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductTags extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductTags copy(long remoteId) {
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
        
        public ViewProductTags(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDetailBottomSheet;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "productType", "Lcom/woocommerce/android/ui/products/ProductType;", "(Lcom/woocommerce/android/ui/products/ProductType;)V", "getProductType", "()Lcom/woocommerce/android/ui/products/ProductType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductDetailBottomSheet extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductType productType = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductDetailBottomSheet copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType productType) {
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
        
        public ViewProductDetailBottomSheet(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductType productType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType getProductType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductTypes;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "isAddProduct", "", "currentProductType", "", "isCurrentProductVirtual", "(ZLjava/lang/String;Z)V", "getCurrentProductType", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class ViewProductTypes extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final boolean isAddProduct = false;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String currentProductType = null;
        private final boolean isCurrentProductVirtual = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductTypes copy(boolean isAddProduct, @org.jetbrains.annotations.NotNull
        java.lang.String currentProductType, boolean isCurrentProductVirtual) {
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
        
        public ViewProductTypes(boolean isAddProduct, @org.jetbrains.annotations.NotNull
        java.lang.String currentProductType, boolean isCurrentProductVirtual) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isAddProduct() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCurrentProductType() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isCurrentProductVirtual() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductReviews;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductReviews extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductReviews copy(long remoteId) {
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
        
        public ViewProductReviews(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAdd;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ViewProductAdd extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductAdd INSTANCE = null;
        
        private ViewProductAdd() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewGroupedProducts;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "groupedProductIds", "", "(JLjava/util/List;)V", "getGroupedProductIds", "()Ljava/util/List;", "getRemoteId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewGroupedProducts extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Long> groupedProductIds = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewGroupedProducts copy(long remoteId, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> groupedProductIds) {
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
        
        public ViewGroupedProducts(long remoteId, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> groupedProductIds) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> getGroupedProductIds() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewLinkedProducts;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "(J)V", "getRemoteId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewLinkedProducts extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewLinkedProducts copy(long remoteId) {
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
        
        public ViewLinkedProducts(long remoteId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductSelectionList;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "remoteId", "", "groupedProductType", "Lcom/woocommerce/android/ui/products/GroupedProductListType;", "excludedProductIds", "", "(JLcom/woocommerce/android/ui/products/GroupedProductListType;Ljava/util/List;)V", "getExcludedProductIds", "()Ljava/util/List;", "getGroupedProductType", "()Lcom/woocommerce/android/ui/products/GroupedProductListType;", "getRemoteId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductSelectionList extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long remoteId = 0L;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.GroupedProductListType groupedProductType = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Long> excludedProductIds = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductSelectionList copy(long remoteId, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.GroupedProductListType groupedProductType, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> excludedProductIds) {
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
        
        public ViewProductSelectionList(long remoteId, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.GroupedProductListType groupedProductType, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Long> excludedProductIds) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.GroupedProductListType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.GroupedProductListType getGroupedProductType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Long> getExcludedProductIds() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloads;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ViewProductDownloads extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductDownloads INSTANCE = null;
        
        private ViewProductDownloads() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloadsSettings;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ViewProductDownloadsSettings extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductDownloadsSettings INSTANCE = null;
        
        private ViewProductDownloadsSettings() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductDownloadDetails;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "isEditing", "", "file", "Lcom/woocommerce/android/model/ProductFile;", "(ZLcom/woocommerce/android/model/ProductFile;)V", "getFile", "()Lcom/woocommerce/android/model/ProductFile;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewProductDownloadDetails extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final boolean isEditing = false;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.ProductFile file = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductDownloadDetails copy(boolean isEditing, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductFile file) {
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
        
        public ViewProductDownloadDetails(boolean isEditing, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductFile file) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isEditing() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ProductFile component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ProductFile getFile() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$ViewProductAddonsDetails;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class ViewProductAddonsDetails extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.ViewProductAddonsDetails INSTANCE = null;
        
        private ViewProductAddonsDetails() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductDownloadableFile;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "()V", "WooCommerce_wasabiDebug"})
    public static final class AddProductDownloadableFile extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.ProductNavigationTarget.AddProductDownloadableFile INSTANCE = null;
        
        private AddProductDownloadableFile() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductAttribute;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "isVariationCreation", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class AddProductAttribute extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final boolean isVariationCreation = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.AddProductAttribute copy(boolean isVariationCreation) {
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
        
        public AddProductAttribute() {
            super();
        }
        
        public AddProductAttribute(boolean isVariationCreation) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isVariationCreation() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$AddProductAttributeTerms;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "attributeId", "", "attributeName", "", "isNewAttribute", "", "isVariationCreation", "(JLjava/lang/String;ZZ)V", "getAttributeId", "()J", "getAttributeName", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class AddProductAttributeTerms extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long attributeId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String attributeName = null;
        private final boolean isNewAttribute = false;
        private final boolean isVariationCreation = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.AddProductAttributeTerms copy(long attributeId, @org.jetbrains.annotations.NotNull
        java.lang.String attributeName, boolean isNewAttribute, boolean isVariationCreation) {
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
        
        public AddProductAttributeTerms(long attributeId, @org.jetbrains.annotations.NotNull
        java.lang.String attributeName, boolean isNewAttribute, boolean isVariationCreation) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getAttributeId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAttributeName() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isNewAttribute() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isVariationCreation() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$RenameProductAttribute;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "attributeName", "", "(Ljava/lang/String;)V", "getAttributeName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class RenameProductAttribute extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String attributeName = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.RenameProductAttribute copy(@org.jetbrains.annotations.NotNull
        java.lang.String attributeName) {
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
        
        public RenameProductAttribute(@org.jetbrains.annotations.NotNull
        java.lang.String attributeName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAttributeName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductNavigationTarget$NavigateToVariationSelector;", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "productId", "", "selectedVariationIds", "", "(JLjava/util/Set;)V", "getProductId", "()J", "getSelectedVariationIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class NavigateToVariationSelector extends com.woocommerce.android.ui.products.ProductNavigationTarget {
        private final long productId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.util.Set<java.lang.Long> selectedVariationIds = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget.NavigateToVariationSelector copy(long productId, @org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.Long> selectedVariationIds) {
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
        
        public NavigateToVariationSelector(long productId, @org.jetbrains.annotations.NotNull
        java.util.Set<java.lang.Long> selectedVariationIds) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.Long> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Set<java.lang.Long> getSelectedVariationIds() {
            return null;
        }
    }
}