package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\bJ\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/widgets/ActionableEmptyView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ActionableEmptyViewBinding;", "checkOrientation", "", "initView", "setOnClickListener", "action", "Lkotlin/Function1;", "Landroid/view/View;", "showButton", "show", "", "updateLayoutForSearch", "isSearching", "topMargin", "updateVisibility", "shouldBeVisible", "WooCommerce_wasabiDebug"})
public final class ActionableEmptyView extends android.widget.LinearLayout {
    private final com.woocommerce.android.databinding.ActionableEmptyViewBinding binding = null;
    
    public ActionableEmptyView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ActionableEmptyView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initView(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    public final void updateVisibility(boolean shouldBeVisible, boolean showButton) {
    }
    
    public final void showButton(boolean show) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> action) {
    }
    
    /**
     * Update actionable empty view layout when used while searching.  The following characteristics are for each case:
     *     Default - center in parent, use original top margin
     *     Search  - center at top of parent, use original top margin, add 48dp top padding, hide image, hide button
     *
     * @param isSearching true when searching; false otherwise
     * @param topMargin top margin in pixels to offset with other views (e.g. toolbar or tabs)
     */
    public final void updateLayoutForSearch(boolean isSearching, int topMargin) {
    }
    
    /**
     * Hide the main image in landscape since there isn't enough room for it on most devices
     */
    private final void checkOrientation() {
    }
}