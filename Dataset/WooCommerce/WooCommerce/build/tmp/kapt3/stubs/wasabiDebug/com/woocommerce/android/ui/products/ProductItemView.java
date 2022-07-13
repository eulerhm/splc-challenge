package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * ProductItemView is a reusable view for showing basic product information.
 * We use this in multiple places to provide a consistent product view.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ,\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eJ(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010&\u001a\u00020\u00152\b\u0010\'\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u000eH\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u000eH\u0002J$\u0010,\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0002R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ProductItemViewBinding;", "getBinding", "()Lcom/woocommerce/android/databinding/ProductItemViewBinding;", "bullet", "", "imageSize", "selectedBackgroundColor", "statusColor", "statusPendingColor", "unSelectedBackgroundColor", "bind", "", "product", "Lcom/woocommerce/android/model/Product;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "currencyCode", "isActivated", "", "productUIModel", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "getDecimalFormatter", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "getProductStatusHtml", "productStatus", "Lcom/woocommerce/android/ui/products/ProductStatus;", "getStockText", "showProductImage", "imageUrl", "showProductName", "productName", "showProductSku", "sku", "showProductStockStatusPrice", "WooCommerce_wasabiDebug"})
public final class ProductItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.databinding.ProductItemViewBinding binding = null;
    private final int imageSize = 0;
    private final java.lang.String bullet = "\u2022";
    private final int statusColor = 0;
    private final int statusPendingColor = 0;
    private final int selectedBackgroundColor = 0;
    private final int unSelectedBackgroundColor = 0;
    
    @kotlin.jvm.JvmOverloads
    public ProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.databinding.ProductItemViewBinding getBinding() {
        return null;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode, boolean isActivated) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.ProductUIModel productUIModel, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode) {
    }
    
    private final void showProductName(java.lang.String productName) {
    }
    
    private final void showProductSku(java.lang.String sku) {
    }
    
    private final void showProductImage(java.lang.String imageUrl, boolean isActivated) {
    }
    
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> getDecimalFormatter(com.woocommerce.android.util.CurrencyFormatter currencyFormatter, java.lang.String currencyCode) {
        return null;
    }
    
    private final void showProductStockStatusPrice(com.woocommerce.android.model.Product product, com.woocommerce.android.util.CurrencyFormatter currencyFormatter, java.lang.String currencyCode) {
    }
    
    private final java.lang.String getProductStatusHtml(com.woocommerce.android.ui.products.ProductStatus productStatus) {
        return null;
    }
    
    private final java.lang.String getStockText(com.woocommerce.android.model.Product product) {
        return null;
    }
}