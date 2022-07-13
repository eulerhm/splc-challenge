package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * A [TextInputEditText] that provides full formatting experience
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J*\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\tH\u0014J\u001c\u0010(\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/widgets/FullFormattingCurrencyEditText;", "Lcom/woocommerce/android/widgets/CurrencyEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_value", "Landroidx/lifecycle/MutableLiveData;", "Ljava/math/BigDecimal;", "decimals", "", "getDecimals", "()I", "formattingParameters", "Lcom/woocommerce/android/ui/products/models/CurrencyFormattingParameters;", "isChangingText", "", "isInitialized", "value", "supportsNegativeValues", "getSupportsNegativeValues", "()Z", "setSupportsNegativeValues", "(Z)V", "Landroidx/lifecycle/LiveData;", "getValue", "()Landroidx/lifecycle/LiveData;", "clearValue", "", "formatAndUpdateValue", "currentText", "", "cleanValue", "formatValue", "", "initView", "onTextChanged", "text", "start", "lengthBefore", "lengthAfter", "setText", "type", "Landroid/widget/TextView$BufferType;", "setValue", "TextCleaner", "WooCommerce_vanillaDebug"})
final class FullFormattingCurrencyEditText extends com.woocommerce.android.widgets.CurrencyEditText {
    private boolean isChangingText = false;
    private boolean isInitialized = false;
    private com.woocommerce.android.ui.products.models.CurrencyFormattingParameters formattingParameters;
    private final androidx.lifecycle.MutableLiveData<java.math.BigDecimal> _value = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.math.BigDecimal> value = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.widgets.FullFormattingCurrencyEditText.TextCleaner TextCleaner = null;
    
    public FullFormattingCurrencyEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final int getDecimals() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getSupportsNegativeValues() {
        return false;
    }
    
    @java.lang.Override()
    public void setSupportsNegativeValues(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.math.BigDecimal> getValue() {
        return null;
    }
    
    @java.lang.Override()
    public void initView(@org.jetbrains.annotations.Nullable()
    com.woocommerce.android.ui.products.models.CurrencyFormattingParameters formattingParameters) {
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal value) {
    }
    
    @java.lang.Override()
    protected void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) {
    }
    
    private final void formatAndUpdateValue(java.lang.CharSequence currentText, java.math.BigDecimal cleanValue) {
    }
    
    @java.lang.Override()
    public void setText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, @org.jetbrains.annotations.Nullable()
    android.widget.TextView.BufferType type) {
    }
    
    private final void clearValue() {
    }
    
    private final java.lang.String formatValue(java.math.BigDecimal value) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/widgets/FullFormattingCurrencyEditText$TextCleaner;", "", "()V", "clean", "Ljava/math/BigDecimal;", "text", "", "decimals", "", "WooCommerce_vanillaDebug"})
    public static final class TextCleaner {
        
        private TextCleaner() {
            super();
        }
        
        /**
         * Cleans the [text] so that it only has numerical characters and has the correct number of fractional digits.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal clean(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence text, int decimals) {
            return null;
        }
    }
}