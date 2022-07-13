package com.woocommerce.android.ui.orders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "AddOrderNote", "AddOrderShipmentTracking", "EditOrder", "IssueOrderRefund", "PreviewReceipt", "PrintShippingLabel", "RefundShippingLabel", "StartCardReaderPaymentFlow", "StartShippingLabelCreationFlow", "ViewCreateShippingLabelInfo", "ViewOrderFulfillInfo", "ViewOrderStatusSelector", "ViewOrderedAddons", "ViewPrintCustomsForm", "ViewPrintShippingLabelInfo", "ViewPrintingInstructions", "ViewRefundedProducts", "ViewShipmentTrackingProviders", "ViewShippingLabelFormatOptions", "ViewShippingLabelPaperSizes", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderStatusSelector;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$IssueOrderRefund;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewRefundedProducts;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderFulfillInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$AddOrderNote;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$RefundShippingLabel;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$AddOrderShipmentTracking;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShipmentTrackingProviders;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$PrintShippingLabel;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShippingLabelPaperSizes;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewCreateShippingLabelInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintShippingLabelInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShippingLabelFormatOptions;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintCustomsForm;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$StartShippingLabelCreationFlow;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$StartCardReaderPaymentFlow;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintingInstructions;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$PreviewReceipt;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderedAddons;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$EditOrder;", "WooCommerce_vanillaDebug"})
public abstract class OrderNavigationTarget extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private OrderNavigationTarget() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderStatusSelector;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "currentStatus", "", "orderStatusList", "", "Lcom/woocommerce/android/model/Order$OrderStatus;", "(Ljava/lang/String;[Lcom/woocommerce/android/model/Order$OrderStatus;)V", "getCurrentStatus", "()Ljava/lang/String;", "getOrderStatusList", "()[Lcom/woocommerce/android/model/Order$OrderStatus;", "[Lcom/woocommerce/android/model/Order$OrderStatus;", "component1", "component2", "copy", "(Ljava/lang/String;[Lcom/woocommerce/android/model/Order$OrderStatus;)Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderStatusSelector;", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewOrderStatusSelector extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currentStatus = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Order.OrderStatus[] orderStatusList = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewOrderStatusSelector copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currentStatus, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.OrderStatus[] orderStatusList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewOrderStatusSelector(@org.jetbrains.annotations.NotNull()
        java.lang.String currentStatus, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.OrderStatus[] orderStatusList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrentStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order.OrderStatus[] component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order.OrderStatus[] getOrderStatusList() {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$IssueOrderRefund;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "remoteOrderId", "", "(J)V", "getRemoteOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class IssueOrderRefund extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long remoteOrderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.IssueOrderRefund copy(long remoteOrderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public IssueOrderRefund(long remoteOrderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewRefundedProducts;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewRefundedProducts extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewRefundedProducts copy(long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewRefundedProducts(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderFulfillInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewOrderFulfillInfo extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewOrderFulfillInfo copy(long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewOrderFulfillInfo(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$AddOrderNote;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "orderNumber", "", "(JLjava/lang/String;)V", "getOrderId", "()J", "getOrderNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class AddOrderNote extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String orderNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.AddOrderNote copy(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderNumber) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AddOrderNote(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderNumber) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderNumber() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$RefundShippingLabel;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "remoteOrderId", "", "shippingLabelId", "(JJ)V", "getRemoteOrderId", "()J", "getShippingLabelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class RefundShippingLabel extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long remoteOrderId = 0L;
        private final long shippingLabelId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.RefundShippingLabel copy(long remoteOrderId, long shippingLabelId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RefundShippingLabel(long remoteOrderId, long shippingLabelId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteOrderId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getShippingLabelId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$AddOrderShipmentTracking;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "orderTrackingProvider", "", "isCustomProvider", "", "(JLjava/lang/String;Z)V", "()Z", "getOrderId", "()J", "getOrderTrackingProvider", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class AddOrderShipmentTracking extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String orderTrackingProvider = null;
        private final boolean isCustomProvider = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.AddOrderShipmentTracking copy(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderTrackingProvider, boolean isCustomProvider) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AddOrderShipmentTracking(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String orderTrackingProvider, boolean isCustomProvider) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOrderTrackingProvider() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isCustomProvider() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShipmentTrackingProviders;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "selectedProvider", "", "(JLjava/lang/String;)V", "getOrderId", "()J", "getSelectedProvider", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewShipmentTrackingProviders extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String selectedProvider = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewShipmentTrackingProviders copy(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String selectedProvider) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewShipmentTrackingProviders(long orderId, @org.jetbrains.annotations.NotNull()
        java.lang.String selectedProvider) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSelectedProvider() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$PrintShippingLabel;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "remoteOrderId", "", "shippingLabelId", "(JJ)V", "getRemoteOrderId", "()J", "getShippingLabelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class PrintShippingLabel extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long remoteOrderId = 0L;
        private final long shippingLabelId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.PrintShippingLabel copy(long remoteOrderId, long shippingLabelId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PrintShippingLabel(long remoteOrderId, long shippingLabelId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteOrderId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getShippingLabelId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShippingLabelPaperSizes;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "currentPaperSize", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;)V", "getCurrentPaperSize", "()Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewShippingLabelPaperSizes extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize currentPaperSize = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewShippingLabelPaperSizes copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize currentPaperSize) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewShippingLabelPaperSizes(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize currentPaperSize) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.ShippingLabelPaperSize getCurrentPaperSize() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewCreateShippingLabelInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewCreateShippingLabelInfo extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewCreateShippingLabelInfo INSTANCE = null;
        
        private ViewCreateShippingLabelInfo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintShippingLabelInfo;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewPrintShippingLabelInfo extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewPrintShippingLabelInfo INSTANCE = null;
        
        private ViewPrintShippingLabelInfo() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewShippingLabelFormatOptions;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewShippingLabelFormatOptions extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewShippingLabelFormatOptions INSTANCE = null;
        
        private ViewShippingLabelFormatOptions() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0006H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintCustomsForm;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "invoices", "", "", "isReprint", "", "(Ljava/util/List;Z)V", "getInvoices", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ViewPrintCustomsForm extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> invoices = null;
        private final boolean isReprint = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewPrintCustomsForm copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> invoices, boolean isReprint) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewPrintCustomsForm(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> invoices, boolean isReprint) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getInvoices() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isReprint() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$StartShippingLabelCreationFlow;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class StartShippingLabelCreationFlow extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.StartShippingLabelCreationFlow copy(long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StartShippingLabelCreationFlow(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$StartCardReaderPaymentFlow;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class StartCardReaderPaymentFlow extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.StartCardReaderPaymentFlow copy(long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StartCardReaderPaymentFlow(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewPrintingInstructions;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ViewPrintingInstructions extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewPrintingInstructions INSTANCE = null;
        
        private ViewPrintingInstructions() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$PreviewReceipt;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "billingEmail", "", "receiptUrl", "orderId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getBillingEmail", "()Ljava/lang/String;", "getOrderId", "()J", "getReceiptUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class PreviewReceipt extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String billingEmail = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String receiptUrl = null;
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.PreviewReceipt copy(@org.jetbrains.annotations.NotNull()
        java.lang.String billingEmail, @org.jetbrains.annotations.NotNull()
        java.lang.String receiptUrl, long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PreviewReceipt(@org.jetbrains.annotations.NotNull()
        java.lang.String billingEmail, @org.jetbrains.annotations.NotNull()
        java.lang.String receiptUrl, long orderId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBillingEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReceiptUrl() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$ViewOrderedAddons;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "remoteOrderID", "", "orderItemID", "addonsProductID", "(JJJ)V", "getAddonsProductID", "()J", "getOrderItemID", "getRemoteOrderID", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class ViewOrderedAddons extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long remoteOrderID = 0L;
        private final long orderItemID = 0L;
        private final long addonsProductID = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.ViewOrderedAddons copy(long remoteOrderID, long orderItemID, long addonsProductID) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewOrderedAddons(long remoteOrderID, long orderItemID, long addonsProductID) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteOrderID() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getOrderItemID() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getAddonsProductID() {
            return 0L;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/OrderNavigationTarget$EditOrder;", "Lcom/woocommerce/android/ui/orders/OrderNavigationTarget;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class EditOrder extends com.woocommerce.android.ui.orders.OrderNavigationTarget {
        private final long orderId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderNavigationTarget.EditOrder copy(long orderId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public EditOrder(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
    }
}