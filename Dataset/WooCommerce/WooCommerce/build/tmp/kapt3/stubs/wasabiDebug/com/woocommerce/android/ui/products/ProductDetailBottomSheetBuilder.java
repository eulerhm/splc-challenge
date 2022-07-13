package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002J\u000e\u0010\r\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002J\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder;", "", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "buildBottomSheetList", "", "Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetUiItem;", "product", "Lcom/woocommerce/android/model/Product;", "getCategories", "getDownloadableFiles", "getLinkedProducts", "getShipping", "getShortDescription", "getTags", "ProductDetailBottomSheetType", "ProductDetailBottomSheetUiItem", "WooCommerce_wasabiDebug"})
public final class ProductDetailBottomSheetBuilder {
    private final com.woocommerce.android.viewmodel.ResourceProvider resources = null;
    
    public ProductDetailBottomSheetBuilder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resources) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem> buildBottomSheetList(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product product) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getShipping(com.woocommerce.android.model.Product $this$getShipping) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getCategories(com.woocommerce.android.model.Product $this$getCategories) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getTags(com.woocommerce.android.model.Product $this$getTags) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getShortDescription(com.woocommerce.android.model.Product $this$getShortDescription) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getLinkedProducts(com.woocommerce.android.model.Product $this$getLinkedProducts) {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem getDownloadableFiles(com.woocommerce.android.model.Product $this$getDownloadableFiles) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetType;", "", "titleResource", "", "descResource", "(Ljava/lang/String;III)V", "getDescResource", "()I", "getTitleResource", "PRODUCT_SHIPPING", "PRODUCT_CATEGORIES", "PRODUCT_TAGS", "SHORT_DESCRIPTION", "LINKED_PRODUCTS", "PRODUCT_DOWNLOADS", "WooCommerce_wasabiDebug"})
    public static enum ProductDetailBottomSheetType {
        /*public static final*/ PRODUCT_SHIPPING /* = new PRODUCT_SHIPPING(0, 0) */,
        /*public static final*/ PRODUCT_CATEGORIES /* = new PRODUCT_CATEGORIES(0, 0) */,
        /*public static final*/ PRODUCT_TAGS /* = new PRODUCT_TAGS(0, 0) */,
        /*public static final*/ SHORT_DESCRIPTION /* = new SHORT_DESCRIPTION(0, 0) */,
        /*public static final*/ LINKED_PRODUCTS /* = new LINKED_PRODUCTS(0, 0) */,
        /*public static final*/ PRODUCT_DOWNLOADS /* = new PRODUCT_DOWNLOADS(0, 0) */;
        private final int titleResource = 0;
        private final int descResource = 0;
        
        ProductDetailBottomSheetType(@androidx.annotation.StringRes
        int titleResource, @androidx.annotation.StringRes
        int descResource) {
        }
        
        public final int getTitleResource() {
            return 0;
        }
        
        public final int getDescResource() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetUiItem;", "", "type", "Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetType;", "clickEvent", "Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "(Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetType;Lcom/woocommerce/android/ui/products/ProductNavigationTarget;Lcom/woocommerce/android/analytics/AnalyticsEvent;)V", "getClickEvent", "()Lcom/woocommerce/android/ui/products/ProductNavigationTarget;", "getStat", "()Lcom/woocommerce/android/analytics/AnalyticsEvent;", "getType", "()Lcom/woocommerce/android/ui/products/ProductDetailBottomSheetBuilder$ProductDetailBottomSheetType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ProductDetailBottomSheetUiItem {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetType type = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.ProductNavigationTarget clickEvent = null;
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.analytics.AnalyticsEvent stat = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetUiItem copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetType type, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductNavigationTarget clickEvent, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.analytics.AnalyticsEvent stat) {
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
        
        public ProductDetailBottomSheetUiItem(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetType type, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductNavigationTarget clickEvent, @org.jetbrains.annotations.Nullable
        com.woocommerce.android.analytics.AnalyticsEvent stat) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductDetailBottomSheetBuilder.ProductDetailBottomSheetType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductNavigationTarget getClickEvent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.analytics.AnalyticsEvent component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.analytics.AnalyticsEvent getStat() {
            return null;
        }
    }
}