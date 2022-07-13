package com.woocommerce.android.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00126\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper;", "dragDirs", "", "onDragStarted", "Lkotlin/Function0;", "", "onMove", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "from", "to", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V", "isAttached", "", "()Z", "setAttached", "(Z)V", "attachToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "WooCommerce_vanillaDebug"})
public final class DraggableItemTouchHelper extends androidx.recyclerview.widget.ItemTouchHelper {
    private final int dragDirs = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDragStarted = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> onMove = null;
    private boolean isAttached = false;
    
    public DraggableItemTouchHelper(int dragDirs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDragStarted, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onMove) {
        super(null);
    }
    
    public final boolean isAttached() {
        return false;
    }
    
    public final void setAttached(boolean p0) {
    }
    
    @java.lang.Override()
    public void attachToRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}