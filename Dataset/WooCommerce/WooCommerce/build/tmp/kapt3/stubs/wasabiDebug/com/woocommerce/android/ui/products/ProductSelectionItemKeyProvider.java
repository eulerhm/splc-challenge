package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Class provides the selection library access to stable selection keys and identifying items
 * presented by a [RecyclerView] instance.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSelectionItemKeyProvider;", "Landroidx/recyclerview/selection/ItemKeyProvider;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getKey", "position", "", "(I)Ljava/lang/Long;", "getPosition", "key", "WooCommerce_wasabiDebug"})
public final class ProductSelectionItemKeyProvider extends androidx.recyclerview.selection.ItemKeyProvider<java.lang.Long> {
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    
    public ProductSelectionItemKeyProvider(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Long getKey(int position) {
        return null;
    }
    
    @java.lang.Override
    public int getPosition(long key) {
        return 0;
    }
}