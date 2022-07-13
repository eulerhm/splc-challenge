package com.woocommerce.android.widgets;

import java.lang.System;

@androidx.annotation.VisibleForTesting
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J6\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/widgets/RegularCurrencyInputHandler;", "", "supportsEmptyState", "", "supportsNegativeValues", "decimalSeparator", "", "numberOfDecimals", "", "(ZZLjava/lang/String;I)V", "getDecimalSeparator", "()Ljava/lang/String;", "getNumberOfDecimals", "()I", "getSupportsEmptyState", "()Z", "setSupportsEmptyState", "(Z)V", "getSupportsNegativeValues", "setSupportsNegativeValues", "adjustText", "", "text", "filter", "source", "start", "end", "dest", "dstart", "dend", "WooCommerce_wasabiDebug"})
public final class RegularCurrencyInputHandler {
    private boolean supportsEmptyState;
    private boolean supportsNegativeValues;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String decimalSeparator = null;
    private final int numberOfDecimals = 0;
    
    public RegularCurrencyInputHandler(boolean supportsEmptyState, boolean supportsNegativeValues, @org.jetbrains.annotations.NotNull
    java.lang.String decimalSeparator, int numberOfDecimals) {
        super();
    }
    
    public final boolean getSupportsEmptyState() {
        return false;
    }
    
    public final void setSupportsEmptyState(boolean p0) {
    }
    
    public final boolean getSupportsNegativeValues() {
        return false;
    }
    
    public final void setSupportsNegativeValues(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDecimalSeparator() {
        return null;
    }
    
    public final int getNumberOfDecimals() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"LongParameterList", "ComplexMethod"})
    public final java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull
    java.lang.CharSequence dest, int dstart, int dend) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.CharSequence adjustText(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
        return null;
    }
}