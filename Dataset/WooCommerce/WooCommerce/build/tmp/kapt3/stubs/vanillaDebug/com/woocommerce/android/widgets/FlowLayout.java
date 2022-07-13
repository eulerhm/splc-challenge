package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * FlowLayout: taken from the WordPress Android source and modified for Woo.
 *
 * Displays a horizontal list of items that automatically wraps when room on the current
 * line runs out to ensure all items are visible.
 *
 * @attr ref com.woocommerce.android.R.styleable#FlowLayout_horizontalSpacing
 * @attr ref com.woocommerce.android.R.styleable#FlowLayout_verticalSpacing
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0014J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/widgets/FlowLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mHorizontalSpacing", "", "mVerticalSpacing", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "Lcom/woocommerce/android/widgets/FlowLayout$LayoutParams;", "generateLayoutParams", "onLayout", "", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "LayoutParams", "WooCommerce_vanillaDebug"})
public class FlowLayout extends android.view.ViewGroup {
    private int mHorizontalSpacing = 0;
    private int mVerticalSpacing = 0;
    
    @kotlin.jvm.JvmOverloads()
    public FlowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public FlowLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    @java.lang.Override()
    protected boolean checkLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.woocommerce.android.widgets.FlowLayout.LayoutParams generateDefaultLayoutParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.widgets.FlowLayout.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.woocommerce.android.widgets.FlowLayout.LayoutParams generateLayoutParams(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup.LayoutParams p) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/widgets/FlowLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "w", "", "h", "(II)V", "horizontalSpacing", "getHorizontalSpacing", "()I", "setHorizontalSpacing", "(I)V", "x", "getX$WooCommerce_vanillaDebug", "setX$WooCommerce_vanillaDebug", "y", "getY$WooCommerce_vanillaDebug", "setY$WooCommerce_vanillaDebug", "WooCommerce_vanillaDebug"})
    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private int x = 0;
        private int y = 0;
        private int horizontalSpacing = -1;
        
        public final int getX$WooCommerce_vanillaDebug() {
            return 0;
        }
        
        public final void setX$WooCommerce_vanillaDebug(int p0) {
        }
        
        public final int getY$WooCommerce_vanillaDebug() {
            return 0;
        }
        
        public final void setY$WooCommerce_vanillaDebug(int p0) {
        }
        
        public final int getHorizontalSpacing() {
            return 0;
        }
        
        public final void setHorizontalSpacing(int p0) {
        }
        
        @android.annotation.SuppressLint(value = {"CustomViewStyleable"})
        public LayoutParams(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.util.AttributeSet attrs) {
            super(null, null);
        }
        
        public LayoutParams(int w, int h) {
            super(null, null);
        }
    }
}