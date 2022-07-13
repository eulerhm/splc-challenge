package com.woocommerce.android.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002JM\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderShipmentTrackingHelper;", "", "()V", "copyTrackingNumber", "", "context", "Landroid/content/Context;", "trackingNumber", "", "showTrackingOrDeleteOptionPopup", "anchor", "Landroid/view/View;", "trackingLink", "onDeleteTrackingClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "trackShipment", "WooCommerce_vanillaDebug"})
public final class OrderShipmentTrackingHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.OrderShipmentTrackingHelper INSTANCE = null;
    
    private OrderShipmentTrackingHelper() {
        super();
    }
    
    private final void copyTrackingNumber(android.content.Context context, java.lang.String trackingNumber) {
    }
    
    public final void trackShipment(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String trackingLink) {
    }
    
    public final void showTrackingOrDeleteOptionPopup(@org.jetbrains.annotations.NotNull()
    android.view.View anchor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String trackingLink, @org.jetbrains.annotations.NotNull()
    java.lang.String trackingNumber, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeleteTrackingClicked) {
    }
}