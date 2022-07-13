package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0010H&R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\u0006X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/widgets/CurrencyEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "supportsEmptyState", "", "getSupportsEmptyState", "()Z", "setSupportsEmptyState", "(Z)V", "supportsNegativeValues", "getSupportsNegativeValues", "setSupportsNegativeValues", "value", "Landroidx/lifecycle/LiveData;", "Ljava/math/BigDecimal;", "getValue", "()Landroidx/lifecycle/LiveData;", "initView", "", "formattingParameters", "Lcom/woocommerce/android/ui/products/models/CurrencyFormattingParameters;", "setValue", "WooCommerce_vanillaDebug"})
abstract class CurrencyEditText extends com.google.android.material.textfield.TextInputEditText {
    private boolean supportsEmptyState = true;
    
    public CurrencyEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public boolean getSupportsEmptyState() {
        return false;
    }
    
    public void setSupportsEmptyState(boolean p0) {
    }
    
    public abstract boolean getSupportsNegativeValues();
    
    public abstract void setSupportsNegativeValues(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.math.BigDecimal> getValue();
    
    public abstract void initView(@org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.models.CurrencyFormattingParameters formattingParameters);
    
    public abstract void setValue(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value);
}