package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Item decoration for recycler views which simply shows a vertical indicator bar to the left to
 * communicate unread items (such as unread product reviews)
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/widgets/UnreadItemDecoration;", "Landroidx/recyclerview/widget/DividerItemDecoration;", "context", "Landroid/content/Context;", "decorListener", "Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemDecorationListener;", "(Landroid/content/Context;Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemDecorationListener;)V", "bounds", "Landroid/graphics/Rect;", "dividerWidth", "", "getItemOffsets", "", "outRect", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "onDrawOver", "canvas", "ItemDecorationListener", "ItemType", "WooCommerce_vanillaDebug"})
public final class UnreadItemDecoration extends androidx.recyclerview.widget.DividerItemDecoration {
    private final com.woocommerce.android.widgets.UnreadItemDecoration.ItemDecorationListener decorListener = null;
    private final float dividerWidth = 0.0F;
    private final android.graphics.Rect bounds = null;
    
    public UnreadItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.widgets.UnreadItemDecoration.ItemDecorationListener decorListener) {
        super(null, 0);
    }
    
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemDecorationListener;", "", "getItemTypeAtPosition", "Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemType;", "position", "", "WooCommerce_vanillaDebug"})
    public static abstract interface ItemDecorationListener {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.woocommerce.android.widgets.UnreadItemDecoration.ItemType getItemTypeAtPosition(int position);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemType;", "", "(Ljava/lang/String;I)V", "HEADER", "UNREAD", "READ", "WooCommerce_vanillaDebug"})
    public static enum ItemType {
        /*public static final*/ HEADER /* = new HEADER() */,
        /*public static final*/ UNREAD /* = new UNREAD() */,
        /*public static final*/ READ /* = new READ() */;
        
        ItemType() {
        }
    }
}