package com.woocommerce.android.ui.products.variations.attributes;

import java.lang.System;

/**
 * Adapter which shows a simple list of attribute term names
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003-./B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000fJ\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0004J\u001c\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u000e\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\fJ\u0016\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000RD\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$TermViewHolder;", "enableDragAndDrop", "", "enableDeleting", "defaultItemBackground", "Landroid/util/TypedValue;", "dragHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "(ZZLandroid/util/TypedValue;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "onTermListener", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$OnTermListener;", "value", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "termNames", "getTermNames", "()Ljava/util/ArrayList;", "setTermNames", "(Ljava/util/ArrayList;)V", "addTerm", "", "termName", "clear", "containsTerm", "delayedChangeNotification", "getItemCount", "", "isEmpty", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeTerm", "term", "setOnTermListener", "listener", "swapItems", "from", "to", "OnTermListener", "TermItemDiffUtil", "TermViewHolder", "WooCommerce_wasabiDebug"})
public final class AttributeTermsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.TermViewHolder> {
    private final boolean enableDragAndDrop = false;
    private final boolean enableDeleting = false;
    private final android.util.TypedValue defaultItemBackground = null;
    private final androidx.recyclerview.widget.ItemTouchHelper dragHelper = null;
    private com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.OnTermListener onTermListener;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.String> termNames;
    
    public AttributeTermsListAdapter(boolean enableDragAndDrop, boolean enableDeleting, @org.jetbrains.annotations.NotNull
    android.util.TypedValue defaultItemBackground, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.ItemTouchHelper dragHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getTermNames() {
        return null;
    }
    
    public final void setTermNames(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> value) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.TermViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.TermViewHolder holder, int position) {
    }
    
    public final void setOnTermListener(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.OnTermListener listener) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void clear() {
    }
    
    public final boolean containsTerm(@org.jetbrains.annotations.NotNull
    java.lang.String termName) {
        return false;
    }
    
    public final void addTerm(@org.jetbrains.annotations.NotNull
    java.lang.String termName) {
    }
    
    public final void removeTerm(@org.jetbrains.annotations.NotNull
    java.lang.String term) {
    }
    
    /**
     * When the list changes from/to a single term we must refresh all the views since we only show the drag
     * handle when there's more than one term, but we delay the refresh to give the added/removed term time
     * to animate
     */
    private final void delayedChangeNotification() {
    }
    
    public final void swapItems(int from, int to) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$OnTermListener;", "", "onTermClick", "", "termName", "", "onTermDelete", "onTermMoved", "fromTermName", "toTermName", "WooCommerce_wasabiDebug"})
    public static abstract interface OnTermListener {
        
        public abstract void onTermClick(@org.jetbrains.annotations.NotNull
        java.lang.String termName);
        
        public abstract void onTermDelete(@org.jetbrains.annotations.NotNull
        java.lang.String termName);
        
        public abstract void onTermMoved(@org.jetbrains.annotations.NotNull
        java.lang.String fromTermName, @org.jetbrains.annotations.NotNull
        java.lang.String toTermName);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$TermItemDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "getOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    static final class TermItemDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> oldList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> newList = null;
        
        public TermItemDiffUtil(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> newList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getOldList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getNewList() {
            return null;
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$TermViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/AttributeTermListItemBinding;", "(Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter;Lcom/woocommerce/android/databinding/AttributeTermListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/AttributeTermListItemBinding;", "bind", "", "termName", "", "WooCommerce_wasabiDebug"})
    public final class TermViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.AttributeTermListItemBinding viewBinding = null;
        
        public TermViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.AttributeTermListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.AttributeTermListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        java.lang.String termName) {
        }
    }
}