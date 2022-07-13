package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/widgets/ConfirmationDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/content/DialogInterface$OnClickListener;", "()V", "confirmed", "", "headerText", "Landroid/widget/TextView;", "messageText", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "returnResult", "result", "Companion", "WooCommerce_wasabiDebug"})
public class ConfirmationDialog extends androidx.fragment.app.DialogFragment implements android.content.DialogInterface.OnClickListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.ConfirmationDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TITLE_KEY = "title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MESSAGE_KEY = "message";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String POSITIVE_BUTTON_KEY = "positiveButtonTitle";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NEGATIVE_BUTTON_KEY = "negativeButtonTitle";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RESULT_CONFIRMED = "result-confirmed";
    private android.widget.TextView headerText;
    private android.widget.TextView messageText;
    private boolean confirmed = false;
    
    public ConfirmationDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog, int which) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    public void returnResult(boolean result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/widgets/ConfirmationDialog$Companion;", "", "()V", "MESSAGE_KEY", "", "NEGATIVE_BUTTON_KEY", "POSITIVE_BUTTON_KEY", "RESULT_CONFIRMED", "TITLE_KEY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}