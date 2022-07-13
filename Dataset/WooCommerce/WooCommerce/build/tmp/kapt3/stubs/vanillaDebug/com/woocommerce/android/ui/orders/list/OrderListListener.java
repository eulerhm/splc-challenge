package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListListener;", "", "openOrderDetail", "", "orderId", "", "orderStatus", "", "sharedView", "Landroid/view/View;", "WooCommerce_vanillaDebug"})
public abstract interface OrderListListener {
    
    public abstract void openOrderDetail(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderStatus, @org.jetbrains.annotations.Nullable()
    android.view.View sharedView);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}