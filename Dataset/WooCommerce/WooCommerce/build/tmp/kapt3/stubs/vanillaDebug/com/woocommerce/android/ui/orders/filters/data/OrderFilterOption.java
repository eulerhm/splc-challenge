package com.woocommerce.android.ui.orders.filters.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/data/OrderFilterOption;", "", "()V", "isSelected", "", "()Z", "Lcom/woocommerce/android/ui/orders/filters/data/OrderStatusOption;", "Lcom/woocommerce/android/ui/orders/filters/data/DateRangeFilterOption;", "WooCommerce_vanillaDebug"})
public abstract class OrderFilterOption {
    
    private OrderFilterOption() {
        super();
    }
    
    public abstract boolean isSelected();
}