package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom [MaterialTextView] with built-in text selection support and automatically selects
 * all text before the action mode menu (Copy, etc.) appears
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001c\u0010\u001e\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/widgets/WCSelectableTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Landroid/view/ActionMode$Callback;", "Landroid/view/GestureDetector$OnDoubleTapListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickableParent", "Landroid/view/View;", "detector", "Landroidx/core/view/GestureDetectorCompat;", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onDoubleTap", "e", "Landroid/view/MotionEvent;", "onDoubleTapEvent", "onPrepareActionMode", "onSingleTapConfirmed", "setClickableParent", "view", "WooCommerce_wasabiDebug"})
public final class WCSelectableTextView extends com.google.android.material.textview.MaterialTextView implements android.view.ActionMode.Callback, android.view.GestureDetector.OnDoubleTapListener {
    private final androidx.core.view.GestureDetectorCompat detector = null;
    private android.view.View clickableParent;
    
    @kotlin.jvm.JvmOverloads
    public WCSelectableTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCSelectableTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCSelectableTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setClickableParent(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @java.lang.Override
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override
    public boolean onSingleTapConfirmed(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override
    public boolean onDoubleTap(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override
    public boolean onDoubleTapEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent e) {
        return false;
    }
}