package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Used to display a custom progress dialog. The progress dialog is deprecated in Android so adding a custom
 * class temporarily when updating a product.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/widgets/CustomProgressDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "onCancelListener", "Lkotlin/Function0;", "", "progressMessage", "", "progressTitle", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "WooCommerce_wasabiDebug"})
public final class CustomProgressDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.CustomProgressDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "CustomProgressDialog";
    private java.lang.String progressTitle;
    private java.lang.String progressMessage;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCancelListener;
    
    public CustomProgressDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onCancel(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/widgets/CustomProgressDialog$Companion;", "", "()V", "TAG", "", "show", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "title", "message", "onCancelListener", "Lkotlin/Function0;", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.widgets.CustomProgressDialog show(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onCancelListener) {
            return null;
        }
    }
}