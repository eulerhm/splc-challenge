package com.woocommerce.android.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderCustomerHelper;", "", "()V", "createEmail", "", "context", "Landroid/content/Context;", "order", "Lcom/woocommerce/android/model/Order;", "emailAddr", "", "dialPhone", "phone", "sendSms", "Action", "WooCommerce_vanillaDebug"})
public final class OrderCustomerHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.OrderCustomerHelper INSTANCE = null;
    
    private OrderCustomerHelper() {
        super();
    }
    
    public final void createEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    java.lang.String emailAddr) {
    }
    
    public final void dialPhone(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    public final void sendSms(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderCustomerHelper$Action;", "", "(Ljava/lang/String;I)V", "EMAIL", "CALL", "SMS", "WooCommerce_vanillaDebug"})
    public static enum Action {
        /*public static final*/ EMAIL /* = new EMAIL() */,
        /*public static final*/ CALL /* = new CALL() */,
        /*public static final*/ SMS /* = new SMS() */;
        
        Action() {
        }
    }
}