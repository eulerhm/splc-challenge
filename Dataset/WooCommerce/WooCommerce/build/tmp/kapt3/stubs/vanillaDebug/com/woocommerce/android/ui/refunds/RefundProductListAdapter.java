package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%B]\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004j\u0004\u0018\u0001`\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0014\u0010\u001e\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140 R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004j\u0004\u0018\u0001`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$RefundViewHolder;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "imageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "isProductDetailList", "", "onItemClicked", "", "", "onViewAddonsClick", "Lcom/woocommerce/android/model/Order$Item;", "Lcom/woocommerce/android/ui/refunds/ViewAddonClickListener;", "(Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/tools/ProductImageMap;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "items", "", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "itemType", "update", "newItems", "", "IssueRefundViewHolder", "OrderItemDiffCallback", "ProductRefundListItem", "RefundDetailViewHolder", "RefundViewHolder", "WooCommerce_vanillaDebug"})
public final class RefundProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.refunds.RefundProductListAdapter.RefundViewHolder> {
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
    private final com.woocommerce.android.tools.ProductImageMap imageMap = null;
    private final boolean isProductDetailList = false;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> onItemClicked = null;
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick = null;
    private java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> items;
    
    public RefundProductListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.ProductImageMap imageMap, boolean isProductDetailList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.refunds.RefundProductListAdapter.RefundViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int itemType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.refunds.RefundProductListAdapter.RefundViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> newItems) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$RefundViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "layout", "", "(Landroid/view/ViewGroup;I)V", "bind", "", "item", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "WooCommerce_vanillaDebug"})
    public static abstract class RefundViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public RefundViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @androidx.annotation.LayoutRes()
        int layout) {
            super(null);
        }
        
        public abstract void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem item);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005j\u0004\u0018\u0001`\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005j\u0004\u0018\u0001`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$RefundDetailViewHolder;", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$RefundViewHolder;", "parent", "Landroid/view/ViewGroup;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "imageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "onViewAddonsClick", "Lcom/woocommerce/android/model/Order$Item;", "", "Lcom/woocommerce/android/ui/refunds/ViewAddonClickListener;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/tools/ProductImageMap;Lkotlin/jvm/functions/Function1;)V", "descriptionTextView", "Landroid/widget/TextView;", "nameTextView", "productAddonsView", "productImageView", "Landroid/widget/ImageView;", "quantityTextView", "skuTextView", "bind", "item", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "WooCommerce_vanillaDebug"})
    public static final class RefundDetailViewHolder extends com.woocommerce.android.ui.refunds.RefundProductListAdapter.RefundViewHolder {
        private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
        private final com.woocommerce.android.tools.ProductImageMap imageMap = null;
        private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick = null;
        private final android.widget.TextView nameTextView = null;
        private final android.widget.TextView descriptionTextView = null;
        private final android.widget.TextView skuTextView = null;
        private final android.widget.TextView quantityTextView = null;
        private final android.widget.ImageView productImageView = null;
        private final android.widget.TextView productAddonsView = null;
        
        public RefundDetailViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.tools.ProductImageMap imageMap, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick) {
            super(null, 0);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$IssueRefundViewHolder;", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$RefundViewHolder;", "parent", "Landroid/view/ViewGroup;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "onItemClicked", "", "", "imageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/tools/ProductImageMap;)V", "descriptionTextView", "Landroid/widget/TextView;", "nameTextView", "productImageView", "Landroid/widget/ImageView;", "quantityTextView", "bind", "item", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "WooCommerce_vanillaDebug"})
    public static final class IssueRefundViewHolder extends com.woocommerce.android.ui.refunds.RefundProductListAdapter.RefundViewHolder {
        private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
        private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> onItemClicked = null;
        private final com.woocommerce.android.tools.ProductImageMap imageMap = null;
        private final android.widget.TextView nameTextView = null;
        private final android.widget.TextView descriptionTextView = null;
        private final android.widget.TextView quantityTextView = null;
        private final android.widget.ImageView productImageView = null;
        
        public IssueRefundViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.tools.ProductImageMap imageMap) {
            super(null, 0);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        @java.lang.Override()
        public void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem item) {
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\t\u001a\u00020\u00078F\u00a2\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "Landroid/os/Parcelable;", "orderItem", "Lcom/woocommerce/android/model/Order$Item;", "maxQuantity", "", "quantity", "", "(Lcom/woocommerce/android/model/Order$Item;FI)V", "availableRefundQuantity", "getAvailableRefundQuantity$annotations", "()V", "getAvailableRefundQuantity", "()I", "getMaxQuantity", "()F", "getOrderItem", "()Lcom/woocommerce/android/model/Order$Item;", "getQuantity", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toDataModel", "Lorg/wordpress/android/fluxc/model/refunds/WCRefundModel$WCRefundItem;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ProductRefundListItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.Order.Item orderItem = null;
        private final float maxQuantity = 0.0F;
        private final int quantity = 0;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.Item orderItem, float maxQuantity, int quantity) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProductRefundListItem(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.Item orderItem, float maxQuantity, int quantity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order.Item component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Order.Item getOrderItem() {
            return null;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getMaxQuantity() {
            return 0.0F;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel()
        @java.lang.Deprecated()
        public static void getAvailableRefundQuantity$annotations() {
        }
        
        public final int getAvailableRefundQuantity() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.model.refunds.WCRefundModel.WCRefundItem toDataModel() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$OrderItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    public static final class OrderItemDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> oldList = null;
        private final java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> newList = null;
        
        public OrderItemDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> newList) {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}