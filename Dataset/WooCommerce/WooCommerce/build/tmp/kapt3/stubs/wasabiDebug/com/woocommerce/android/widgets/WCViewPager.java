package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Simple ViewPager wrapped design to address the common "pointer index out of bounds" exception in
 * the native ViewPager.
 *
 * https://github.com/woocommerce/woocommerce-android/issues/1729
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/widgets/WCViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "WooCommerce_wasabiDebug"})
public class WCViewPager extends androidx.viewpager.widget.ViewPager {
    
    @kotlin.jvm.JvmOverloads
    public WCViewPager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCViewPager(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
}