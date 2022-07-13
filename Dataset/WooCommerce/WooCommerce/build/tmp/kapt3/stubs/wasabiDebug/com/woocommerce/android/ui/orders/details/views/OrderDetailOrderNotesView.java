package com.woocommerce.android.ui.orders.details.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015J\"\u0010\u0018\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/views/OrderDetailOrderNotesView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderDetailNoteListBinding;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "addHeaders", "", "Lcom/woocommerce/android/ui/orders/notes/OrderNoteListItem;", "notes", "Lcom/woocommerce/android/model/OrderNote;", "enableItemAnimator", "", "enable", "", "showSkeleton", "show", "updateOrderNotesView", "orderNotes", "onTapAddOrderNote", "Lkotlin/Function0;", "WooCommerce_wasabiDebug"})
public final class OrderDetailOrderNotesView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderDetailNoteListBinding binding = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailOrderNotesView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailOrderNotesView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderDetailOrderNotesView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void showSkeleton(boolean show) {
    }
    
    public final void updateOrderNotesView(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.OrderNote> orderNotes, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onTapAddOrderNote) {
    }
    
    private final java.util.List<com.woocommerce.android.ui.orders.notes.OrderNoteListItem> addHeaders(java.util.List<com.woocommerce.android.model.OrderNote> notes) {
        return null;
    }
    
    private final void enableItemAnimator(boolean enable) {
    }
}