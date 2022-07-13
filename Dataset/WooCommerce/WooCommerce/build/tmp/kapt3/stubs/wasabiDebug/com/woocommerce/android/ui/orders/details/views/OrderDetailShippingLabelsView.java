package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ@\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailShippingLabelsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailShippingLabelListBinding;", "updateShippingLabels", "", "shippingLabels", "", "Lcom/woocommerce/android/model/ShippingLabel;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "productClickListener", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "shippingLabelClickListener", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;", "WooCommerce_wasabiDebug"})
public final class OrderDetailShippingLabelsView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.woocommerce.android.databinding.OrderDetailShippingLabelListBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailShippingLabelsView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailShippingLabelsView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailShippingLabelsView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void updateShippingLabels(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingLabel> shippingLabels, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener shippingLabelClickListener) {
    }
}