package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r*\u00020\u0002H\u0007\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0001*\u00020\u0002\u001a(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r*\u00020\u00022\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"collapse", "", "Landroid/view/View;", "duration", "", "Landroidx/constraintlayout/widget/Group;", "expand", "expandHitArea", "horizontal", "", "vertical", "hide", "scrollStartEvents", "Lkotlinx/coroutines/flow/Flow;", "setEnabledRecursive", "Landroid/view/ViewGroup;", "enabled", "", "show", "touchEvents", "Landroid/view/MotionEvent;", "handled", "Lkotlin/Function1;", "WooCommerce_wasabiDebug"})
public final class ViewExtKt {
    
    public static final void show(@org.jetbrains.annotations.NotNull
    android.view.View $this$show) {
    }
    
    public static final void hide(@org.jetbrains.annotations.NotNull
    android.view.View $this$hide) {
    }
    
    public static final void expand(@org.jetbrains.annotations.NotNull
    android.view.View $this$expand, long duration) {
    }
    
    public static final void collapse(@org.jetbrains.annotations.NotNull
    android.view.View $this$collapse, long duration) {
    }
    
    public static final void expand(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.Group $this$expand) {
    }
    
    public static final void collapse(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.Group $this$collapse) {
    }
    
    public static final void expandHitArea(@org.jetbrains.annotations.NotNull
    android.view.View $this$expandHitArea, int horizontal, int vertical) {
    }
    
    public static final void setEnabledRecursive(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup $this$setEnabledRecursive, boolean enabled) {
    }
    
    /**
     * Return a Flow of events matching what an [OnTouchListener] would return.
     *
     * @param handled defines what the [OnTouchListener.onTouch] returns, defaults to returning false
     */
    @org.jetbrains.annotations.NotNull
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public static final kotlinx.coroutines.flow.Flow<android.view.MotionEvent> touchEvents(@org.jetbrains.annotations.NotNull
    android.view.View $this$touchEvents, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> handled) {
        return null;
    }
    
    /**
     * Returns a Flow of events that are triggered when a scroll is started on a view.
     */
    @org.jetbrains.annotations.NotNull
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    public static final kotlinx.coroutines.flow.Flow<kotlin.Unit> scrollStartEvents(@org.jetbrains.annotations.NotNull
    android.view.View $this$scrollStartEvents) {
        return null;
    }
}