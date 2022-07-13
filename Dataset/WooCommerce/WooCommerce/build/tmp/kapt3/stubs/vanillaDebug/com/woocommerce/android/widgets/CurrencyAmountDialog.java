package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/widgets/CurrencyAmountDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/content/DialogInterface$OnClickListener;", "()V", "confirmed", "", "currencyEditTextLayout", "Lcom/woocommerce/android/widgets/WCMaterialOutlinedCurrencyEditTextView;", "currentValue", "Ljava/math/BigDecimal;", "headerText", "Landroid/widget/TextView;", "maxValue", "messageText", "minValue", "isAmountValid", "amount", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "onSaveInstanceState", "outState", "returnResult", "enteredAmount", "Companion", "WooCommerce_vanillaDebug"})
public class CurrencyAmountDialog extends androidx.fragment.app.DialogFragment implements android.content.DialogInterface.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.widgets.CurrencyAmountDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE_KEY = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENT_VALUE_KEY = "currentValue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIN_VALUE_KEY = "minValue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAX_VALUE_KEY = "maxValue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_KEY = "message";
    private android.widget.TextView headerText;
    private com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView currencyEditTextLayout;
    private android.widget.TextView messageText;
    private java.math.BigDecimal currentValue;
    private boolean confirmed = false;
    private java.math.BigDecimal maxValue;
    private java.math.BigDecimal minValue;
    
    public CurrencyAmountDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final boolean isAmountValid(java.math.BigDecimal amount) {
        return false;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog, int which) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    public void returnResult(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal enteredAmount) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/widgets/CurrencyAmountDialog$Companion;", "", "()V", "CURRENT_VALUE_KEY", "", "MAX_VALUE_KEY", "MESSAGE_KEY", "MIN_VALUE_KEY", "TITLE_KEY", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}