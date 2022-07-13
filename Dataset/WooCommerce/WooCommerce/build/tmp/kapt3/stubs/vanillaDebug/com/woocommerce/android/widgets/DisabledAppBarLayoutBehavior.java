package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom layout behavior which prevents collapsing toolbar from being expanded
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/widgets/DisabledAppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "()V", "onStartNestedScroll", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/appbar/AppBarLayout;", "directTargetChild", "Landroid/view/View;", "target", "nestedScrollAxes", "", "type", "WooCommerce_vanillaDebug"})
public final class DisabledAppBarLayoutBehavior extends com.google.android.material.appbar.AppBarLayout.Behavior {
    
    public DisabledAppBarLayoutBehavior() {
        super();
    }
    
    /**
     * Prevent nested scroll
     */
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int nestedScrollAxes, int type) {
        return false;
    }
}