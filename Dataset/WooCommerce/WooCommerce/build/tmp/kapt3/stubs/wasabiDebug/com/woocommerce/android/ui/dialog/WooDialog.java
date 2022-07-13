package com.woocommerce.android.ui.dialog;

import java.lang.System;

/**
 * Used to display discard dialog across the app.
 * Currently used in Products and Orders
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007Js\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0015R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/dialog/WooDialog;", "", "()V", "dialogRef", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/app/AlertDialog;", "onCleared", "", "showDialog", "activity", "Landroid/app/Activity;", "posBtnAction", "Landroid/content/DialogInterface$OnClickListener;", "negBtnAction", "neutBtAction", "titleId", "", "messageId", "positiveButtonId", "negativeButtonId", "neutralButtonId", "(Landroid/app/Activity;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "WooCommerce_wasabiDebug"})
public final class WooDialog {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.dialog.WooDialog INSTANCE = null;
    private static java.lang.ref.WeakReference<androidx.appcompat.app.AlertDialog> dialogRef;
    
    private WooDialog() {
        super();
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnClickListener posBtnAction, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnClickListener negBtnAction, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnClickListener neutBtAction, @org.jetbrains.annotations.Nullable
    @androidx.annotation.StringRes
    java.lang.Integer titleId, @org.jetbrains.annotations.Nullable
    @androidx.annotation.StringRes
    java.lang.Integer messageId, @org.jetbrains.annotations.Nullable
    @androidx.annotation.StringRes
    java.lang.Integer positiveButtonId, @org.jetbrains.annotations.Nullable
    @androidx.annotation.StringRes
    java.lang.Integer negativeButtonId, @org.jetbrains.annotations.Nullable
    @androidx.annotation.StringRes
    java.lang.Integer neutralButtonId) {
    }
    
    public final void onCleared() {
    }
}