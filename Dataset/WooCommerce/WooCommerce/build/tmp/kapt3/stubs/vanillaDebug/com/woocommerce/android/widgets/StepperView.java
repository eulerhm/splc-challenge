package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ=\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014R$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/widgets/StepperView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ViewStepperBinding;", "value", "", "isMinusButtonEnabled", "()Z", "setMinusButtonEnabled", "(Z)V", "isPlusButtonEnabled", "setPlusButtonEnabled", "plusMinusContentDescription", "Ljava/lang/Integer;", "getValue", "()I", "setValue", "(I)V", "init", "", "currentValue", "onPlusButtonClick", "Lkotlin/Function0;", "onMinusButtonClick", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V", "WooCommerce_vanillaDebug"})
public final class StepperView extends androidx.appcompat.widget.LinearLayoutCompat {
    private final com.woocommerce.android.databinding.ViewStepperBinding binding = null;
    private java.lang.Integer plusMinusContentDescription;
    
    @kotlin.jvm.JvmOverloads()
    public StepperView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public StepperView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public StepperView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final void setValue(int value) {
    }
    
    public final boolean isPlusButtonEnabled() {
        return false;
    }
    
    public final void setPlusButtonEnabled(boolean value) {
    }
    
    public final boolean isMinusButtonEnabled() {
        return false;
    }
    
    public final void setMinusButtonEnabled(boolean value) {
    }
    
    public final void init(int currentValue, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPlusButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onMinusButtonClick, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer plusMinusContentDescription) {
    }
}