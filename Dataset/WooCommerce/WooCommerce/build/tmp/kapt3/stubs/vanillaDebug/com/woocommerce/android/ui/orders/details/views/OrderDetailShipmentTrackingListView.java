package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J?\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\f0\u00162\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailShipmentTrackingListView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailShipmentTrackingListBinding;", "showAddTrackingButton", "", "show", "", "onTap", "Lkotlin/Function0;", "updateShipmentTrackingList", "shipmentTrackings", "", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "onDeleteShipmentTrackingClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "trackingNumber", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "WooCommerce_vanillaDebug"})
public final class OrderDetailShipmentTrackingListView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderDetailShipmentTrackingListBinding binding = null;
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailShipmentTrackingListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailShipmentTrackingListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderDetailShipmentTrackingListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void updateShipmentTrackingList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.OrderShipmentTracking> shipmentTrackings, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeleteShipmentTrackingClicked, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils) {
    }
    
    public final void showAddTrackingButton(boolean show, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onTap) {
    }
}