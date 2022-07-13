package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u001c\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011Jd\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0018\u00010\u001fj\u0004\u0018\u0001`&R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailProductListView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailProductListBinding;", "notifyProductChanged", "", "remoteProductId", "", "showCreateShippingLabelButton", "isVisible", "", "onCreateShippingLabelButtonTapped", "Lkotlin/Function0;", "onShippingLabelNoticeTapped", "showMarkOrderCompleteButton", "onMarkOrderCompleteButtonTapped", "showProductListMenuButton", "updateProductList", "orderItems", "", "Lcom/woocommerce/android/model/Order$Item;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "productClickListener", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "onProductMenuItemClicked", "onViewAddonsClick", "Lcom/woocommerce/android/ui/orders/ViewAddonClickListener;", "WooCommerce_vanillaDebug"})
public final class OrderDetailProductListView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderDetailProductListBinding binding = null;
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailProductListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailProductListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailProductListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void updateProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Order.Item> orderItems, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onProductMenuItemClicked, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick) {
    }
    
    public final void notifyProductChanged(long remoteProductId) {
    }
    
    public final void showMarkOrderCompleteButton(boolean isVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onMarkOrderCompleteButtonTapped) {
    }
    
    public final void showCreateShippingLabelButton(boolean isVisible, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCreateShippingLabelButtonTapped, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShippingLabelNoticeTapped) {
    }
    
    public final void showProductListMenuButton(boolean isVisible) {
    }
}