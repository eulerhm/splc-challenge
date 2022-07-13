package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Class that provides the recyclerview selection library the information about the
 * items associated with the users selection.
 *
 * That selection is based on a MotionEvent that we have mapped to the [ProductItemViewHolder].
 * Given that motion event, we will find the child of the RecyclerView where the event happened and
 * return the details of that item.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductSelectionListItemLookup;", "Landroidx/recyclerview/selection/ItemDetailsLookup;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getItemDetails", "Landroidx/recyclerview/selection/ItemDetailsLookup$ItemDetails;", "event", "Landroid/view/MotionEvent;", "WooCommerce_vanillaDebug"})
public final class ProductSelectionListItemLookup extends androidx.recyclerview.selection.ItemDetailsLookup<java.lang.Long> {
    private final androidx.recyclerview.widget.RecyclerView recyclerView = null;
    
    public ProductSelectionListItemLookup(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.recyclerview.selection.ItemDetailsLookup.ItemDetails<java.lang.Long> getItemDetails(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return null;
    }
}