package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom [ClickableSpan] that removes the default text underline, as well as sets the color
 * of the text to the link color.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/widgets/WooClickableSpan;", "Landroid/text/style/ClickableSpan;", "onClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "useCustomStyle", "", "getUseCustomStyle", "()Z", "setUseCustomStyle", "(Z)V", "onClick", "widget", "updateDrawState", "ds", "Landroid/text/TextPaint;", "WooCommerce_vanillaDebug"})
public final class WooClickableSpan extends android.text.style.ClickableSpan {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> onClickListener = null;
    private boolean useCustomStyle = true;
    
    public WooClickableSpan(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getOnClickListener() {
        return null;
    }
    
    public final boolean getUseCustomStyle() {
        return false;
    }
    
    public final void setUseCustomStyle(boolean p0) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View widget) {
    }
    
    @java.lang.Override()
    public void updateDrawState(@org.jetbrains.annotations.NotNull()
    android.text.TextPaint ds) {
    }
}