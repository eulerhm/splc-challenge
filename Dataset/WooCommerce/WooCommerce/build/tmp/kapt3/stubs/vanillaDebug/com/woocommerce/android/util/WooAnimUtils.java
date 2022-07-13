package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0004J&\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/util/WooAnimUtils;", "", "()V", "DEFAULT_DURATION", "Lcom/woocommerce/android/util/WooAnimUtils$Duration;", "animateBar", "", "view", "Landroid/view/View;", "isVisible", "", "isTopBar", "duration", "animateBottomBar", "show", "fadeIn", "target", "animDuration", "fadeOut", "endVisibility", "", "getFadeInAnim", "Landroid/animation/ObjectAnimator;", "getFadeOutAnim", "getScaleInAnim", "getScaleOutAnim", "pop", "rotate", "scale", "scaleStart", "", "scaleEnd", "scaleIn", "scaleOut", "Duration", "WooCommerce_vanillaDebug"})
public final class WooAnimUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.WooAnimUtils INSTANCE = null;
    private static final com.woocommerce.android.util.WooAnimUtils.Duration DEFAULT_DURATION = com.woocommerce.android.util.WooAnimUtils.Duration.SHORT;
    
    private WooAnimUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ObjectAnimator getFadeInAnim(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
        return null;
    }
    
    public final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ObjectAnimator getFadeOutAnim(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
        return null;
    }
    
    public final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration, int endVisibility) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ObjectAnimator getScaleInAnim(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
        return null;
    }
    
    public final void scaleIn(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
    }
    
    public final void scaleOut(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ObjectAnimator getScaleOutAnim(@org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration animDuration) {
        return null;
    }
    
    public final void scale(@org.jetbrains.annotations.NotNull()
    android.view.View target, float scaleStart, float scaleEnd, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration duration) {
    }
    
    public final void animateBottomBar(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean show, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration duration) {
    }
    
    private final void animateBar(android.view.View view, boolean isVisible, boolean isTopBar, com.woocommerce.android.util.WooAnimUtils.Duration duration) {
    }
    
    public final void pop(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration duration) {
    }
    
    public final void rotate(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooAnimUtils.Duration duration) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/util/WooAnimUtils$Duration;", "", "(Ljava/lang/String;I)V", "toMillis", "", "context", "Landroid/content/Context;", "SHORT", "MEDIUM", "LONG", "EXTRA_LONG", "WooCommerce_vanillaDebug"})
    public static enum Duration {
        /*public static final*/ SHORT /* = new SHORT() */,
        /*public static final*/ MEDIUM /* = new MEDIUM() */,
        /*public static final*/ LONG /* = new LONG() */,
        /*public static final*/ EXTRA_LONG /* = new EXTRA_LONG() */;
        
        Duration() {
        }
        
        public final long toMillis(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return 0L;
        }
    }
}