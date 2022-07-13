package com.woocommerce.android.ui.orders.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u0000 \u00102\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections;", "", "()V", "ActionOrderDetailFragmentToAddOrderNoteFragment", "ActionOrderDetailFragmentToCardReaderFlow", "ActionOrderDetailFragmentToCreateShippingLabelFragment", "ActionOrderDetailFragmentToIssueRefund", "ActionOrderDetailFragmentToOrderCreationFragment", "ActionOrderDetailFragmentToOrderFulfillFragment", "ActionOrderDetailFragmentToOrderShippingLabelRefundFragment", "ActionOrderDetailFragmentToOrderStatusSelectorDialog", "ActionOrderDetailFragmentToOrderedAddonFragment", "ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment", "ActionOrderDetailFragmentToPrintShippingLabelFragment", "ActionOrderDetailFragmentToReceiptPreviewFragment", "ActionOrderDetailFragmentToRefundDetailFragment", "Companion", "WooCommerce_wasabiDebug"})
public final class OrderDetailFragmentDirections {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.Companion Companion = null;
    
    private OrderDetailFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToAddOrderNoteFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "orderNumber", "", "(JLjava/lang/String;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "getOrderNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToAddOrderNoteFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String orderNumber = null;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_addOrderNoteFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToAddOrderNoteFragment copy(long orderId, @org.jetbrains.annotations.NotNull
        java.lang.String orderNumber) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToAddOrderNoteFragment(long orderId, @org.jetbrains.annotations.NotNull
        java.lang.String orderNumber) {
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
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderFulfillFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "(J)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToOrderFulfillFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_orderFulfillFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToOrderFulfillFragment copy(long orderId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToOrderFulfillFragment(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderShippingLabelRefundFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "shippingLabelId", "(JJ)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "getShippingLabelId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToOrderShippingLabelRefundFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final long shippingLabelId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_orderShippingLabelRefundFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToOrderShippingLabelRefundFragment copy(long orderId, long shippingLabelId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToOrderShippingLabelRefundFragment() {
            super();
        }
        
        public ActionOrderDetailFragmentToOrderShippingLabelRefundFragment(long orderId, long shippingLabelId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getShippingLabelId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToPrintShippingLabelFragment;", "Landroidx/navigation/NavDirections;", "shippingLabelIds", "", "orderId", "", "isReprint", "", "([JJZ)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "()Z", "getOrderId", "()J", "getShippingLabelIds", "()[J", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToPrintShippingLabelFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final long[] shippingLabelIds = null;
        private final long orderId = 0L;
        private final boolean isReprint = false;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_printShippingLabelFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToPrintShippingLabelFragment copy(@org.jetbrains.annotations.NotNull
        long[] shippingLabelIds, long orderId, boolean isReprint) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToPrintShippingLabelFragment(@org.jetbrains.annotations.NotNull
        long[] shippingLabelIds, long orderId, boolean isReprint) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final long[] component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final long[] getShippingLabelIds() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isReprint() {
            return false;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToIssueRefund;", "Landroidx/navigation/NavDirections;", "orderId", "", "(J)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToIssueRefund implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_issue_refund;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToIssueRefund copy(long orderId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToIssueRefund() {
            super();
        }
        
        public ActionOrderDetailFragmentToIssueRefund(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToRefundDetailFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "refundId", "(JJ)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "getRefundId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToRefundDetailFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final long refundId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_refundDetailFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToRefundDetailFragment copy(long orderId, long refundId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToRefundDetailFragment() {
            super();
        }
        
        public ActionOrderDetailFragmentToRefundDetailFragment(long orderId, long refundId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getRefundId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J(\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderStatusSelectorDialog;", "Landroidx/navigation/NavDirections;", "currentStatus", "", "orderStatusList", "", "Lcom/woocommerce/android/model/Order$OrderStatus;", "(Ljava/lang/String;[Lcom/woocommerce/android/model/Order$OrderStatus;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getCurrentStatus", "()Ljava/lang/String;", "getOrderStatusList", "()[Lcom/woocommerce/android/model/Order$OrderStatus;", "[Lcom/woocommerce/android/model/Order$OrderStatus;", "component1", "component2", "copy", "(Ljava/lang/String;[Lcom/woocommerce/android/model/Order$OrderStatus;)Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderStatusSelectorDialog;", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToOrderStatusSelectorDialog implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String currentStatus = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.Order.OrderStatus[] orderStatusList = null;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_orderStatusSelectorDialog;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToOrderStatusSelectorDialog copy(@org.jetbrains.annotations.NotNull
        java.lang.String currentStatus, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Order.OrderStatus[] orderStatusList) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToOrderStatusSelectorDialog(@org.jetbrains.annotations.NotNull
        java.lang.String currentStatus, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Order.OrderStatus[] orderStatusList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCurrentStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.OrderStatus[] component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.OrderStatus[] getOrderStatusList() {
            return null;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToCreateShippingLabelFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "(J)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToCreateShippingLabelFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_createShippingLabelFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToCreateShippingLabelFragment copy(long orderId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToCreateShippingLabelFragment(long orderId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToReceiptPreviewFragment;", "Landroidx/navigation/NavDirections;", "receiptUrl", "", "billingEmail", "orderId", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getBillingEmail", "()Ljava/lang/String;", "getOrderId", "()J", "getReceiptUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToReceiptPreviewFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String receiptUrl = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String billingEmail = null;
        private final long orderId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_receiptPreviewFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToReceiptPreviewFragment copy(@org.jetbrains.annotations.NotNull
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull
        java.lang.String billingEmail, long orderId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToReceiptPreviewFragment(@org.jetbrains.annotations.NotNull
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull
        java.lang.String billingEmail, long orderId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getReceiptUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBillingEmail() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J(\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment;", "Landroidx/navigation/NavDirections;", "invoices", "", "", "isReprint", "", "([Ljava/lang/String;Z)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getInvoices", "()[Ljava/lang/String;", "[Ljava/lang/String;", "()Z", "component1", "component2", "copy", "([Ljava/lang/String;Z)Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment;", "equals", "other", "", "hashCode", "toString", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String[] invoices = null;
        private final boolean isReprint = false;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_printShippingLabelCustomsFormFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment copy(@org.jetbrains.annotations.NotNull
        java.lang.String[] invoices, boolean isReprint) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment(@org.jetbrains.annotations.NotNull
        java.lang.String[] invoices, boolean isReprint) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getInvoices() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean isReprint() {
            return false;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderedAddonFragment;", "Landroidx/navigation/NavDirections;", "orderId", "", "orderItemId", "addonsProductId", "(JJJ)V", "actionId", "", "getActionId", "()I", "getAddonsProductId", "()J", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getOrderId", "getOrderItemId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToOrderedAddonFragment implements androidx.navigation.NavDirections {
        private final long orderId = 0L;
        private final long orderItemId = 0L;
        private final long addonsProductId = 0L;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_orderedAddonFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToOrderedAddonFragment copy(long orderId, long orderItemId, long addonsProductId) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToOrderedAddonFragment(long orderId, long orderItemId, long addonsProductId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getOrderId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getOrderItemId() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getAddonsProductId() {
            return 0L;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToCardReaderFlow;", "Landroidx/navigation/NavDirections;", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "(Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getCardReaderFlowParam", "()Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToCardReaderFlow implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam = null;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_cardReaderFlow;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToCardReaderFlow copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToCardReaderFlow(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam getCardReaderFlowParam() {
            return null;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$ActionOrderDetailFragmentToOrderCreationFragment;", "Landroidx/navigation/NavDirections;", "mode", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "(Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getMode", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
    static final class ActionOrderDetailFragmentToOrderCreationFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode mode = null;
        private final int actionId = com.woocommerce.android.R.id.action_orderDetailFragment_to_orderCreationFragment;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.details.OrderDetailFragmentDirections.ActionOrderDetailFragmentToOrderCreationFragment copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode mode) {
            return null;
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
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ActionOrderDetailFragmentToOrderCreationFragment(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode mode) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode getMode() {
            return null;
        }
        
        @java.lang.Override
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override
        public android.os.Bundle getArguments() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nJE\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u0006J!\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e\u00a2\u0006\u0002\u0010\'J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006J!\u0010+\u001a\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010-\u001a\u00020\n\u00a2\u0006\u0002\u0010.J\"\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u0002012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\nJ\u0006\u00102\u001a\u00020\u0004J\u001e\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u00106\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u0006J\u0006\u00108\u001a\u00020\u0004J5\u00109\u001a\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000e2\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\b\u00a2\u0006\u0002\u0010=\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderDetailFragmentDirections$Companion;", "", "()V", "actionGlobalAddOrderShipmentTrackingFragment", "Landroidx/navigation/NavDirections;", "orderId", "", "orderTrackingProvider", "", "isCustomProvider", "", "actionGlobalItemSelectorDialog", "selectedItem", "keys", "", "values", "requestKey", "title", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;", "actionOrderDetailFragmentToAddOrderNoteFragment", "orderNumber", "actionOrderDetailFragmentToBillingAddressEditingFragment", "actionOrderDetailFragmentToCardReaderFlow", "cardReaderFlowParam", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "actionOrderDetailFragmentToCreateShippingLabelFragment", "actionOrderDetailFragmentToEditCustomerOrderNoteFragment", "actionOrderDetailFragmentToInstallWcShippingFlow", "actionOrderDetailFragmentToIssueRefund", "actionOrderDetailFragmentToOrderCreationFragment", "mode", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel$Mode;", "actionOrderDetailFragmentToOrderFulfillFragment", "actionOrderDetailFragmentToOrderShippingLabelRefundFragment", "shippingLabelId", "actionOrderDetailFragmentToOrderStatusSelectorDialog", "currentStatus", "orderStatusList", "Lcom/woocommerce/android/model/Order$OrderStatus;", "(Ljava/lang/String;[Lcom/woocommerce/android/model/Order$OrderStatus;)Landroidx/navigation/NavDirections;", "actionOrderDetailFragmentToOrderedAddonFragment", "orderItemId", "addonsProductId", "actionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment", "invoices", "isReprint", "([Ljava/lang/String;Z)Landroidx/navigation/NavDirections;", "actionOrderDetailFragmentToPrintShippingLabelFragment", "shippingLabelIds", "", "actionOrderDetailFragmentToPrintingInstructionsFragment", "actionOrderDetailFragmentToReceiptPreviewFragment", "receiptUrl", "billingEmail", "actionOrderDetailFragmentToRefundDetailFragment", "refundId", "actionOrderDetailFragmentToShippingAddressEditingFragment", "actionSearchFilterFragment", "items", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "hint", "([Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToAddOrderNoteFragment(long orderId, @org.jetbrains.annotations.NotNull
        java.lang.String orderNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToOrderFulfillFragment(long orderId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToOrderShippingLabelRefundFragment(long orderId, long shippingLabelId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToPrintShippingLabelFragment(@org.jetbrains.annotations.NotNull
        long[] shippingLabelIds, long orderId, boolean isReprint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToIssueRefund(long orderId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToRefundDetailFragment(long orderId, long refundId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToOrderStatusSelectorDialog(@org.jetbrains.annotations.NotNull
        java.lang.String currentStatus, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Order.OrderStatus[] orderStatusList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToCreateShippingLabelFragment(long orderId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToReceiptPreviewFragment(@org.jetbrains.annotations.NotNull
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull
        java.lang.String billingEmail, long orderId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToPrintingInstructionsFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToPrintShippingLabelCustomsFormFragment(@org.jetbrains.annotations.NotNull
        java.lang.String[] invoices, boolean isReprint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToOrderedAddonFragment(long orderId, long orderItemId, long addonsProductId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToEditCustomerOrderNoteFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToShippingAddressEditingFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToBillingAddressEditingFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToCardReaderFlow(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam cardReaderFlowParam) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToOrderCreationFragment(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.OrderCreationViewModel.Mode mode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionOrderDetailFragmentToInstallWcShippingFlow() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionGlobalAddOrderShipmentTrackingFragment(long orderId, @org.jetbrains.annotations.Nullable
        java.lang.String orderTrackingProvider, boolean isCustomProvider) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionGlobalItemSelectorDialog(@org.jetbrains.annotations.Nullable
        java.lang.String selectedItem, @org.jetbrains.annotations.NotNull
        java.lang.String[] keys, @org.jetbrains.annotations.NotNull
        java.lang.String[] values, @org.jetbrains.annotations.NotNull
        java.lang.String requestKey, @org.jetbrains.annotations.Nullable
        java.lang.String title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.navigation.NavDirections actionSearchFilterFragment(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.searchfilter.SearchFilterItem[] items, @org.jetbrains.annotations.NotNull
        java.lang.String requestKey, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String hint) {
            return null;
        }
    }
}