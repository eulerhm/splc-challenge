package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J8\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J*\u0010*\u001a\u00020\'2\b\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 H\u0014J\u0010\u0010.\u001a\u00020\'2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0019X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/widgets/RegularCurrencyEditText;", "Lcom/woocommerce/android/widgets/CurrencyEditText;", "Landroid/text/InputFilter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_value", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "decimalSeparator", "", "inputHandler", "Lcom/woocommerce/android/widgets/RegularCurrencyInputHandler;", "isChangingText", "", "isInitialized", "value", "supportsEmptyState", "getSupportsEmptyState", "()Z", "setSupportsEmptyState", "(Z)V", "supportsNegativeValues", "getSupportsNegativeValues", "setSupportsNegativeValues", "Landroidx/lifecycle/LiveData;", "getValue", "()Landroidx/lifecycle/LiveData;", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "initView", "", "formattingParameters", "Lcom/woocommerce/android/ui/products/models/CurrencyFormattingParameters;", "onTextChanged", "text", "lengthBefore", "lengthAfter", "setValue", "WooCommerce_wasabiDebug"})
final class RegularCurrencyEditText extends com.woocommerce.android.widgets.CurrencyEditText implements android.text.InputFilter {
    private boolean isChangingText = false;
    private boolean isInitialized = false;
    private java.lang.String decimalSeparator;
    private boolean supportsNegativeValues = false;
    private boolean supportsEmptyState;
    private final androidx.lifecycle.MutableLiveData<java.math.BigDecimal> _value = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.math.BigDecimal> value = null;
    private com.woocommerce.android.widgets.RegularCurrencyInputHandler inputHandler;
    
    public RegularCurrencyEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override
    public boolean getSupportsNegativeValues() {
        return false;
    }
    
    @java.lang.Override
    public void setSupportsNegativeValues(boolean value) {
    }
    
    @java.lang.Override
    public boolean getSupportsEmptyState() {
        return false;
    }
    
    @java.lang.Override
    public void setSupportsEmptyState(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.math.BigDecimal> getValue() {
        return null;
    }
    
    @java.lang.Override
    public void initView(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.ui.products.models.CurrencyFormattingParameters formattingParameters) {
    }
    
    @java.lang.Override
    public void setValue(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull
    android.text.Spanned dest, int dstart, int dend) {
        return null;
    }
    
    @kotlin.Suppress(names = {"TooGenericExceptionCaught", "NestedBlockDepth", "SwallowedException"})
    @java.lang.Override
    protected void onTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    }
}