package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0007H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0014R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000e\u001a\u0004\b!\u0010\u0013R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b%\u0010\u0013\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/widgets/CircleProgressOverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationInterpolator", "Landroid/view/animation/LinearInterpolator;", "getAnimationInterpolator", "()Landroid/view/animation/LinearInterpolator;", "animationInterpolator$delegate", "Lkotlin/Lazy;", "borderColor", "borderPaint", "Landroid/graphics/Paint;", "getBorderPaint", "()Landroid/graphics/Paint;", "borderPaint$delegate", "borderSizePx", "value", "currentProgressPercentage", "getCurrentProgressPercentage", "()I", "setCurrentProgressPercentage", "(I)V", "progressAngle", "", "Ljava/lang/Float;", "progressColor", "progressPaint", "getProgressPaint", "progressPaint$delegate", "restColor", "restPaint", "getRestPaint", "restPaint$delegate", "animateProgress", "", "from", "to", "calculateProgressAngle", "progressPercent", "onDraw", "canvas", "Landroid/graphics/Canvas;", "WooCommerce_vanillaDebug"})
public final class CircleProgressOverlayView extends android.view.View {
    private java.lang.Float progressAngle;
    private int currentProgressPercentage = 0;
    private int progressColor;
    private int restColor;
    private int borderColor;
    private int borderSizePx;
    private final kotlin.Lazy progressPaint$delegate = null;
    private final kotlin.Lazy restPaint$delegate = null;
    private final kotlin.Lazy borderPaint$delegate = null;
    private final kotlin.Lazy animationInterpolator$delegate = null;
    
    @kotlin.jvm.JvmOverloads()
    public CircleProgressOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CircleProgressOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CircleProgressOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final int getCurrentProgressPercentage() {
        return 0;
    }
    
    public final void setCurrentProgressPercentage(int value) {
    }
    
    private final android.graphics.Paint getProgressPaint() {
        return null;
    }
    
    private final android.graphics.Paint getRestPaint() {
        return null;
    }
    
    private final android.graphics.Paint getBorderPaint() {
        return null;
    }
    
    private final android.view.animation.LinearInterpolator getAnimationInterpolator() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void animateProgress(float from, float to) {
    }
    
    private final float calculateProgressAngle(int progressPercent) {
        return 0.0F;
    }
}