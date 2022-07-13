package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014j\u0002`\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailOrderStatusView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailOrderStatusBinding;", "mode", "Lcom/woocommerce/android/ui/orders/details/views/OrderDetailOrderStatusView$Mode;", "getFormattedDate", "", "date", "Ljava/util/Date;", "initView", "", "editOrderStatusClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/woocommerce/android/ui/orders/details/views/EditStatusClickListener;", "updateOrder", "order", "Lcom/woocommerce/android/model/Order;", "updateStatus", "orderStatus", "Lcom/woocommerce/android/model/Order$OrderStatus;", "Mode", "WooCommerce_vanillaDebug"})
public final class OrderDetailOrderStatusView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderDetailOrderStatusBinding binding = null;
    private com.woocommerce.android.ui.orders.details.views.OrderDetailOrderStatusView.Mode mode = com.woocommerce.android.ui.orders.details.views.OrderDetailOrderStatusView.Mode.OrderEdit;
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailOrderStatusView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailOrderStatusView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailOrderStatusView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void updateStatus(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order.OrderStatus orderStatus) {
    }
    
    public final void updateOrder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order) {
    }
    
    private final java.lang.String getFormattedDate(java.util.Date date) {
        return null;
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.views.OrderDetailOrderStatusView.Mode mode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> editOrderStatusClickListener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailOrderStatusView$Mode;", "", "(Ljava/lang/String;I)V", "OrderCreation", "OrderEdit", "WooCommerce_vanillaDebug"})
    public static enum Mode {
        /*public static final*/ OrderCreation /* = new OrderCreation() */,
        /*public static final*/ OrderEdit /* = new OrderEdit() */;
        
        Mode() {
        }
    }
}