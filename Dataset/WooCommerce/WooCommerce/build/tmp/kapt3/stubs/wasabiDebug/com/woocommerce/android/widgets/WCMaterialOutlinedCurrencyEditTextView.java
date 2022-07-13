package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002:;B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0014J\u0018\u0010.\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,H\u0014J\u0006\u0010/\u001a\u000200J\u0012\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u00010-H\u0014J\n\u00103\u001a\u0004\u0018\u00010-H\u0016J\u0010\u00104\u001a\u00020-2\u0006\u00102\u001a\u000205H\u0002J\u000e\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020&J\u000e\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020&R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedCurrencyEditTextView;", "Lcom/google/android/material/textfield/TextInputLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "usesFullFormatting", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "currencyEditText", "Lcom/woocommerce/android/widgets/CurrencyEditText;", "editText", "Lcom/google/android/material/textfield/TextInputEditText;", "getEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "value", "imeOptions", "getImeOptions", "()I", "setImeOptions", "(I)V", "parameterRepository", "Lcom/woocommerce/android/ui/products/ParameterRepository;", "getParameterRepository", "()Lcom/woocommerce/android/ui/products/ParameterRepository;", "setParameterRepository", "(Lcom/woocommerce/android/ui/products/ParameterRepository;)V", "supportsEmptyState", "getSupportsEmptyState", "()Z", "setSupportsEmptyState", "(Z)V", "supportsNegativeValues", "getSupportsNegativeValues", "setSupportsNegativeValues", "Landroidx/lifecycle/LiveData;", "Ljava/math/BigDecimal;", "getValue", "()Landroidx/lifecycle/LiveData;", "dispatchRestoreInstanceState", "", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchSaveInstanceState", "getText", "", "onRestoreInstanceState", "state", "onSaveInstanceState", "restoreViewState", "Lcom/woocommerce/android/widgets/WCSavedState;", "setValue", "currentValue", "setValueIfDifferent", "newValue", "Companion", "EditTextLayoutMode", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class WCMaterialOutlinedCurrencyEditTextView extends com.google.android.material.textfield.TextInputLayout {
    private final boolean usesFullFormatting = false;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.WCMaterialOutlinedCurrencyEditTextView.Companion Companion = null;
    private static final java.lang.String KEY_SUPER_STATE = "WC-OUTLINED-CURRENCY-VIEW-SUPER-STATE";
    private com.woocommerce.android.widgets.CurrencyEditText currencyEditText;
    @javax.inject.Inject
    public com.woocommerce.android.ui.products.ParameterRepository parameterRepository;
    private boolean supportsNegativeValues = true;
    private boolean supportsEmptyState = true;
    private int imeOptions = 0;
    
    @kotlin.jvm.JvmOverloads
    public WCMaterialOutlinedCurrencyEditTextView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCMaterialOutlinedCurrencyEditTextView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCMaterialOutlinedCurrencyEditTextView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @androidx.annotation.AttrRes
    int defStyleRes) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCMaterialOutlinedCurrencyEditTextView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @androidx.annotation.AttrRes
    int defStyleRes, boolean usesFullFormatting) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.textfield.TextInputEditText getEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ParameterRepository getParameterRepository() {
        return null;
    }
    
    public final void setParameterRepository(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ParameterRepository p0) {
    }
    
    public final boolean getSupportsNegativeValues() {
        return false;
    }
    
    public final void setSupportsNegativeValues(boolean value) {
    }
    
    public final boolean getSupportsEmptyState() {
        return false;
    }
    
    public final void setSupportsEmptyState(boolean value) {
    }
    
    public final int getImeOptions() {
        return 0;
    }
    
    public final void setImeOptions(int value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.math.BigDecimal> getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal currentValue) {
    }
    
    /**
     * Updates the value only if the current one is different from the supplied one.
     * Helpful when binding the value to a state in the ViewModel without losing the cursor position
     */
    public final void setValueIfDifferent(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal newValue) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable
    android.os.Parcelable state) {
    }
    
    private final android.os.Parcelable restoreViewState(com.woocommerce.android.widgets.WCSavedState state) {
        return null;
    }
    
    @java.lang.Override
    protected void dispatchSaveInstanceState(@org.jetbrains.annotations.Nullable
    android.util.SparseArray<android.os.Parcelable> container) {
    }
    
    @java.lang.Override
    protected void dispatchRestoreInstanceState(@org.jetbrains.annotations.NotNull
    android.util.SparseArray<android.os.Parcelable> container) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedCurrencyEditTextView$EditTextLayoutMode;", "", "(Ljava/lang/String;I)V", "FILL", "WRAP", "WooCommerce_wasabiDebug"})
    static enum EditTextLayoutMode {
        /*public static final*/ FILL /* = new FILL() */,
        /*public static final*/ WRAP /* = new WRAP() */;
        
        EditTextLayoutMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedCurrencyEditTextView$Companion;", "", "()V", "KEY_SUPER_STATE", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}