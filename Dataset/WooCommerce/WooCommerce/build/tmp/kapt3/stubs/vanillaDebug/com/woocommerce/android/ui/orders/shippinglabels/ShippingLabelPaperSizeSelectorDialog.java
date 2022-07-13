package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "navArgs", "Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialogArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialogArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "paperSizeOptions", "", "", "getPaperSizeOptions", "()[Ljava/lang/String;", "paperSizeOptions$delegate", "Lkotlin/Lazy;", "getCurrentPaperSizeIndex", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ShippingLabelPaperSize", "WooCommerce_vanillaDebug"})
public final class ShippingLabelPaperSizeSelectorDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PAPER_SIZE_RESULT = "key_paper_size_result";
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private final kotlin.Lazy paperSizeOptions$delegate = null;
    
    public ShippingLabelPaperSizeSelectorDialog() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.ShippingLabelPaperSizeSelectorDialogArgs getNavArgs() {
        return null;
    }
    
    private final java.lang.String[] getPaperSizeOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final int getCurrentPaperSizeIndex() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$ShippingLabelPaperSize;", "", "stringResource", "", "(Ljava/lang/String;II)V", "getStringResource", "()I", "LEGAL", "LETTER", "LABEL", "WooCommerce_vanillaDebug"})
    public static enum ShippingLabelPaperSize {
        /*public static final*/ LEGAL /* = new LEGAL(0) */,
        /*public static final*/ LETTER /* = new LETTER(0) */,
        /*public static final*/ LABEL /* = new LABEL(0) */;
        private final int stringResource = 0;
        
        ShippingLabelPaperSize(@androidx.annotation.StringRes()
        int stringResource) {
        }
        
        public final int getStringResource() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShippingLabelPaperSizeSelectorDialog$Companion;", "", "()V", "KEY_PAPER_SIZE_RESULT", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}