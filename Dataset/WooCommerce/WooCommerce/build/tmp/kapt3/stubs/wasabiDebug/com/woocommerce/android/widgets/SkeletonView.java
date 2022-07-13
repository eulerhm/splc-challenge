package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\fJ\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/widgets/SkeletonView;", "", "()V", "_actualView", "Landroid/view/ViewGroup;", "_parentView", "actualView", "getActualView", "()Landroid/view/ViewGroup;", "handler", "Landroid/os/Handler;", "isShowing", "", "parentView", "getParentView", "shimmerView", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "skeletonView", "Landroid/view/View;", "findViewById", "id", "", "hide", "", "show", "viewActual", "viewSkeleton", "delayed", "layoutId", "WooCommerce_wasabiDebug"})
public final class SkeletonView {
    private android.view.ViewGroup _parentView;
    private android.view.ViewGroup _actualView;
    private android.view.View skeletonView;
    private com.facebook.shimmer.ShimmerFrameLayout shimmerView;
    private final android.os.Handler handler = null;
    private boolean isShowing = false;
    
    public SkeletonView() {
        super();
    }
    
    private final android.view.ViewGroup getParentView() {
        return null;
    }
    
    private final android.view.ViewGroup getActualView() {
        return null;
    }
    
    /**
     * Replaces the passed ViewGroup with a skeleton view inflated from the passed layout id
     * and starts a shimmer animation on the skeleton view
     *
     * @param viewActual The view containing the data which will be hidden during loading
     * @param viewSkeleton The skeleton view which will replace the actual view during loading
     * @param delayed Whether to show the skeleton after a brief delay, which avoids the skeleton appearing
     * and then immediately disappearing if the network request completes very quickly
     */
    public final void show(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewActual, @org.jetbrains.annotations.NotNull
    android.view.View viewSkeleton, boolean delayed) {
    }
    
    /**
     * Wrapper for show() which accepts a layoutId for the skeleton view
     */
    public final void show(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewActual, @androidx.annotation.LayoutRes
    int layoutId, boolean delayed) {
    }
    
    /**
     * hides the shimmer and skeleton layout then restores the real data layout
     */
    public final void hide() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View findViewById(@androidx.annotation.IdRes
    int id) {
        return null;
    }
}