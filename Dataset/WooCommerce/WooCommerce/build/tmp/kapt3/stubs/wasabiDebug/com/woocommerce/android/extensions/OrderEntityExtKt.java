package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"CASH_ON_DELIVERY_PAYMENT_TYPE", "", "CASH_PAYMENTS", "", "getCASH_PAYMENTS", "()Ljava/util/List;", "STRIPE_PAYMENTS_PAYMENT_TYPE", "WOOCOMMERCE_BOOKINGS_PAYMENT_TYPE", "WOOCOMMERCE_PAYMENTS_PAYMENT_TYPE", "isCashPayment", "", "(Ljava/lang/String;)Z", "getBillingName", "Lorg/wordpress/android/fluxc/model/OrderEntity;", "defaultValue", "WooCommerce_wasabiDebug"})
public final class OrderEntityExtKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CASH_ON_DELIVERY_PAYMENT_TYPE = "cod";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WOOCOMMERCE_PAYMENTS_PAYMENT_TYPE = "woocommerce_payments";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STRIPE_PAYMENTS_PAYMENT_TYPE = "stripe";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WOOCOMMERCE_BOOKINGS_PAYMENT_TYPE = "wc-booking-gateway";
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.String> CASH_PAYMENTS = null;
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> getCASH_PAYMENTS() {
        return null;
    }
    
    public static final boolean isCashPayment(@org.jetbrains.annotations.NotNull
    java.lang.String $this$isCashPayment) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getBillingName(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.OrderEntity $this$getBillingName, @org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
        return null;
    }
}