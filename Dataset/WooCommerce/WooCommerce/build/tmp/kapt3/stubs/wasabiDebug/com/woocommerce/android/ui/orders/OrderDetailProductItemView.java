package com.woocommerce.android.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJH\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderDetailProductItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailProductItemBinding;", "initView", "", "item", "Lcom/woocommerce/android/model/Order$Item;", "productImage", "", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "onViewAddonsClick", "Lcom/woocommerce/android/ui/orders/ViewAddonClickListener;", "WooCommerce_wasabiDebug"})
public final class OrderDetailProductItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.woocommerce.android.databinding.OrderDetailProductItemBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailProductItemView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item item, @org.jetbrains.annotations.Nullable
    java.lang.String productImage, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick) {
    }
}