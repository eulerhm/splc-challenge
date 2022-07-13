package com.woocommerce.android.ui.compose.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/compose/component/BigDecimalTextFieldValueMapper;", "Lcom/woocommerce/android/ui/compose/component/TextFieldValueMapper;", "Ljava/math/BigDecimal;", "supportsNegativeValue", "", "(Z)V", "parseText", "text", "", "printValue", "value", "transformText", "oldText", "newText", "WooCommerce_wasabiDebug"})
public final class BigDecimalTextFieldValueMapper implements com.woocommerce.android.ui.compose.component.TextFieldValueMapper<java.math.BigDecimal> {
    private final boolean supportsNegativeValue = false;
    
    /**
     * Checks whether the old value that the text field had [oldValue] equals the [newValue]
     * The Text field won't emit changes until the values are different
     */
    public boolean equals(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal oldValue, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal newValue) {
        return false;
    }
    
    public BigDecimalTextFieldValueMapper() {
        super();
    }
    
    public BigDecimalTextFieldValueMapper(boolean supportsNegativeValue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.math.BigDecimal parseText(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String printValue(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String transformText(@org.jetbrains.annotations.NotNull
    java.lang.String oldText, @org.jetbrains.annotations.NotNull
    java.lang.String newText) {
        return null;
    }
}