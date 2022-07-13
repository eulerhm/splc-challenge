package com.woocommerce.android.ui.orders;

import java.lang.System;

/**
 * Represents a single order status label.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderStatusTag;", "Lcom/woocommerce/android/widgets/tags/ITag;", "orderStatus", "Lcom/woocommerce/android/model/Order$OrderStatus;", "(Lcom/woocommerce/android/model/Order$OrderStatus;)V", "getTagConfiguration", "Lcom/woocommerce/android/widgets/tags/TagConfig;", "context", "Landroid/content/Context;", "WooCommerce_vanillaDebug"})
public final class OrderStatusTag extends com.woocommerce.android.widgets.tags.ITag {
    private final com.woocommerce.android.model.Order.OrderStatus orderStatus = null;
    
    public OrderStatusTag(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order.OrderStatus orderStatus) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.widgets.tags.TagConfig getTagConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}