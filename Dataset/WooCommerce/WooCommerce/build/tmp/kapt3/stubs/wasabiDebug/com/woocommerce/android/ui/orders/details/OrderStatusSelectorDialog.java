package com.woocommerce.android.ui.orders.details;

import java.lang.System;

/**
 * Dialog displays a list of order statuses and allows for selecting a single order status for
 * manually changing order statuses.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderStatusSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "navArgs", "Lcom/woocommerce/android/ui/orders/details/OrderStatusSelectorDialogArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/details/OrderStatusSelectorDialogArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "Companion", "WooCommerce_wasabiDebug"})
public final class OrderStatusSelectorDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.details.OrderStatusSelectorDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_ORDER_STATUS_RESULT = "key_order_status_result";
    private static final java.lang.String REFUNDED_ID = "refunded";
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    
    public OrderStatusSelectorDialog() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.details.OrderStatusSelectorDialogArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/OrderStatusSelectorDialog$Companion;", "", "()V", "KEY_ORDER_STATUS_RESULT", "", "REFUNDED_ID", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}