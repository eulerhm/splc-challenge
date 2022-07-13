package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Special RecyclerView ItemDecorator to draw a divider that aligns to the beginning, end, or both of a child element
 * inside a list view element.
 *
 * Define an element to align the begging of the divider with:
 *
 * +-------------------------+
 * |ImageView TextView Button|
 * |          ---------------|<-- Divider aligns with second element (R.id.text2)
 * |ImageView TextView Button|
 * |          ---------------|
 * |ImageView TextView Button|
 * |          ---------------|
 * |ImageView TextView Button|
 * +_________________________+
 *
 * You would create an instance of this class by feeding the [alignStartToStartOf] with the id of this view:
 * `AlignedDividerDecoration(context, DividerItemDecoration.VERTICAL, R.id.text2))`
 *
 * Define an element to align the start and end of the divider and respect the margins:
 *
 * +-------------------------+
 * |ImageView TextView Button|
 * |          --------       |<-- Divider aligns with second element (R.id.text2)
 * |ImageView TextView Button|
 * |          --------       |
 * |ImageView TextView Button|
 * |          --------       |
 * |ImageView TextView Button|
 * +_________________________+
 *
 * You would create an instance of this class by feeding the [alignStartToStartOf] and [alignEndToEndOf] with the id
 * of this view:
 * `AlignedDividerDecoration(context, DividerItemDecoration.VERTICAL, R.id.text2, R.id.text2, true))`
 *
 * For Horizontal lists, the start = top, and end = bottom.
 *
 * @param [ctx] The active context
 * @param [orientation] The orientation of the list. Either [AlignedDividerDecoration.HORIZONTAL]
 * or [AlignedDividerDecoration.VERTICAL]
 * @param [alignStartToStartOf] Optional. The resource ID of the component in the list view to align the start of the
 * divider with. If not provided, the start will be aligned with the start of the parent.
 * @param [alignEndToEndOf] Optional. The resource ID of the component in the list item view to align the end of the
 * divider with. If not provided, the end will be aligned with the end of the parent.
 * @param [clipToMargin] True if the divider should also clip itself to match the margins of the provided components.
 * Default is false.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/widgets/AlignedDividerDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "ctx", "Landroid/content/Context;", "orientation", "", "alignStartToStartOf", "alignEndToEndOf", "clipToMargin", "", "padding", "(Landroid/content/Context;IIIZI)V", "bounds", "Landroid/graphics/Rect;", "divider", "Landroid/graphics/drawable/Drawable;", "getDivider", "()Landroid/graphics/drawable/Drawable;", "setDivider", "(Landroid/graphics/drawable/Drawable;)V", "drawForHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "drawForVertical", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDrawOver", "setDrawable", "drawable", "Companion", "WooCommerce_wasabiDebug"})
public final class AlignedDividerDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int orientation = 0;
    private final int alignStartToStartOf = 0;
    private final int alignEndToEndOf = 0;
    private final boolean clipToMargin = false;
    private final int padding = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.widgets.AlignedDividerDecoration.Companion Companion = null;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public android.graphics.drawable.Drawable divider;
    private final android.graphics.Rect bounds = null;
    
    @kotlin.jvm.JvmOverloads
    public AlignedDividerDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int orientation) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public AlignedDividerDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int orientation, int alignStartToStartOf) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public AlignedDividerDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int orientation, int alignStartToStartOf, int alignEndToEndOf) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public AlignedDividerDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int orientation, int alignStartToStartOf, int alignEndToEndOf, boolean clipToMargin) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public AlignedDividerDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, int orientation, int alignStartToStartOf, int alignEndToEndOf, boolean clipToMargin, int padding) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getDivider() {
        return null;
    }
    
    public final void setDivider(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable p0) {
    }
    
    @java.lang.Override
    public void onDrawOver(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void drawForVertical(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent) {
    }
    
    private final void drawForHorizontal(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView parent) {
    }
    
    @java.lang.Override
    public void getItemOffsets(@org.jetbrains.annotations.NotNull
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    public final void setDrawable(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/widgets/AlignedDividerDecoration$Companion;", "", "()V", "HORIZONTAL", "", "VERTICAL", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}