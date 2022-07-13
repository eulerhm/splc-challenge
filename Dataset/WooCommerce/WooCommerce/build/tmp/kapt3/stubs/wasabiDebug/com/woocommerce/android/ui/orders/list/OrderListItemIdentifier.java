package com.woocommerce.android.ui.orders.list;

import java.lang.System;

/**
 * Identifies the two main types of view items in the order list view while providing a
 * common interface for managing them as a single type:
 * <ul>
 *    <li>Section Header</li>
 *    <li>Order Item</li>
 * </ul>
 *
 * Mostly used by [OrderListItemDataSource] for properly syncing these two
 * types of views against the data being fetched and populated.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier;", "", "()V", "OrderIdentifier", "SectionHeaderIdentifier", "Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier$SectionHeaderIdentifier;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier$OrderIdentifier;", "WooCommerce_wasabiDebug"})
public abstract class OrderListItemIdentifier {
    
    private OrderListItemIdentifier() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier$SectionHeaderIdentifier;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier;", "title", "Lcom/woocommerce/android/model/TimeGroup;", "(Lcom/woocommerce/android/model/TimeGroup;)V", "getTitle", "()Lcom/woocommerce/android/model/TimeGroup;", "WooCommerce_wasabiDebug"})
    public static final class SectionHeaderIdentifier extends com.woocommerce.android.ui.orders.list.OrderListItemIdentifier {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.TimeGroup title = null;
        
        public SectionHeaderIdentifier(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.TimeGroup title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.TimeGroup getTitle() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier$OrderIdentifier;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemIdentifier;", "orderId", "", "isLastItemInSection", "", "(JZ)V", "()Z", "setLastItemInSection", "(Z)V", "getOrderId", "()J", "WooCommerce_wasabiDebug"})
    public static final class OrderIdentifier extends com.woocommerce.android.ui.orders.list.OrderListItemIdentifier {
        private final long orderId = 0L;
        private boolean isLastItemInSection;
        
        public OrderIdentifier(long orderId, boolean isLastItemInSection) {
            super();
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final boolean isLastItemInSection() {
            return false;
        }
        
        public final void setLastItemInSection(boolean p0) {
        }
    }
}