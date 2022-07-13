package com.woocommerce.android.ui.orders.list;

import java.lang.System;

/**
 * This class represents three possible list item view states for the order list page,
 * and contains the data needed to properly populate the view associated with this state.
 *
 * <ul>
 *    <li>Section Headers</li>
 *    <li>Order List Item</li>
 *    <li>Order List Item - Loading</li>
 * </ul>
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "", "()V", "equals", "", "other", "hashCode", "", "LoadingItem", "OrderListItemUI", "SectionHeader", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$SectionHeader;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$LoadingItem;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$OrderListItemUI;", "WooCommerce_wasabiDebug"})
public abstract class OrderListItemUIType {
    
    private OrderListItemUIType() {
        super();
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data required to populate a section header in the order list view.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$SectionHeader;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "title", "Lcom/woocommerce/android/model/TimeGroup;", "(Lcom/woocommerce/android/model/TimeGroup;)V", "getTitle", "()Lcom/woocommerce/android/model/TimeGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class SectionHeader extends com.woocommerce.android.ui.orders.list.OrderListItemUIType {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.TimeGroup title = null;
        
        /**
         * Data required to populate a section header in the order list view.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.list.OrderListItemUIType.SectionHeader copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.TimeGroup title) {
            return null;
        }
        
        /**
         * Data required to populate a section header in the order list view.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data required to populate a section header in the order list view.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data required to populate a section header in the order list view.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SectionHeader(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.TimeGroup title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.TimeGroup component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.TimeGroup getTitle() {
            return null;
        }
    }
    
    /**
     * Flag that the data or a single order item is not yet available for
     * display. Signals a loading view for that item should be displayed.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$LoadingItem;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class LoadingItem extends com.woocommerce.android.ui.orders.list.OrderListItemUIType {
        private final long orderId = 0L;
        
        /**
         * Flag that the data or a single order item is not yet available for
         * display. Signals a loading view for that item should be displayed.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.list.OrderListItemUIType.LoadingItem copy(long orderId) {
            return null;
        }
        
        /**
         * Flag that the data or a single order item is not yet available for
         * display. Signals a loading view for that item should be displayed.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Flag that the data or a single order item is not yet available for
         * display. Signals a loading view for that item should be displayed.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Flag that the data or a single order item is not yet available for
         * display. Signals a loading view for that item should be displayed.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public LoadingItem(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    /**
     * Data required to populate a single order item in the order list view.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$OrderListItemUI;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "orderId", "", "orderNumber", "", "orderName", "orderTotal", "status", "dateCreated", "currencyCode", "isLastItemInSection", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCurrencyCode", "()Ljava/lang/String;", "getDateCreated", "()Z", "getOrderId", "()J", "getOrderName", "getOrderNumber", "getOrderTotal", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class OrderListItemUI extends com.woocommerce.android.ui.orders.list.OrderListItemUIType {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderNumber = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderName = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderTotal = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String status = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String dateCreated = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String currencyCode = null;
        private final boolean isLastItemInSection = false;
        
        /**
         * Data required to populate a single order item in the order list view.
         */
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.list.OrderListItemUIType.OrderListItemUI copy(long orderId, @org.jetbrains.annotations.NotNull
        java.lang.String orderNumber, @org.jetbrains.annotations.NotNull
        java.lang.String orderName, @org.jetbrains.annotations.NotNull
        java.lang.String orderTotal, @org.jetbrains.annotations.NotNull
        java.lang.String status, @org.jetbrains.annotations.NotNull
        java.lang.String dateCreated, @org.jetbrains.annotations.NotNull
        java.lang.String currencyCode, boolean isLastItemInSection) {
            return null;
        }
        
        /**
         * Data required to populate a single order item in the order list view.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data required to populate a single order item in the order list view.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data required to populate a single order item in the order list view.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public OrderListItemUI(long orderId, @org.jetbrains.annotations.NotNull
        java.lang.String orderNumber, @org.jetbrains.annotations.NotNull
        java.lang.String orderName, @org.jetbrains.annotations.NotNull
        java.lang.String orderTotal, @org.jetbrains.annotations.NotNull
        java.lang.String status, @org.jetbrains.annotations.NotNull
        java.lang.String dateCreated, @org.jetbrains.annotations.NotNull
        java.lang.String currencyCode, boolean isLastItemInSection) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOrderNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOrderName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOrderTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDateCreated() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCurrencyCode() {
            return null;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean isLastItemInSection() {
            return false;
        }
    }
}