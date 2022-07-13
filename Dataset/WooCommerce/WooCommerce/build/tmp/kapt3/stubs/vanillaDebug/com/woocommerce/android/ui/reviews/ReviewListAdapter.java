package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0002J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListAdapter;", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionedRecyclerViewAdapter;", "clickListener", "Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$OnReviewClickListener;", "(Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$OnReviewClickListener;)V", "reviewList", "", "Lcom/woocommerce/android/model/ProductReview;", "getItemTypeAtRecyclerPosition", "Lcom/woocommerce/android/widgets/UnreadItemDecoration$ItemType;", "position", "", "isEmpty", "", "isHeaderAtRecyclerPosition", "isSameList", "reviews", "", "setReviews", "", "ItemViewHolder", "OnReviewClickListener", "ReviewListSection", "WooCommerce_vanillaDebug"})
public final class ReviewListAdapter extends com.woocommerce.android.widgets.sectionedrecyclerview.SectionedRecyclerViewAdapter {
    private final com.woocommerce.android.ui.reviews.ReviewListAdapter.OnReviewClickListener clickListener = null;
    private final java.util.List<com.woocommerce.android.model.ProductReview> reviewList = null;
    
    public ReviewListAdapter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewListAdapter.OnReviewClickListener clickListener) {
        super();
    }
    
    public final void setReviews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ProductReview> reviews) {
    }
    
    private final boolean isSameList(java.util.List<com.woocommerce.android.model.ProductReview> reviews) {
        return false;
    }
    
    /**
     * Return true if the item at the passed position is a header
     *
     * @param position position of the item in the recycler
     */
    private final boolean isHeaderAtRecyclerPosition(int position) {
        return false;
    }
    
    /**
     * Returns the type of item at the passed position for use so the item decoration
     * can draw a bar beside unread items
     *
     * @param position position of the item in the recycler
     */
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.widgets.UnreadItemDecoration.ItemType getItemTypeAtRecyclerPosition(int position) {
        return null;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$OnReviewClickListener;", "", "onReviewClick", "", "review", "Lcom/woocommerce/android/model/ProductReview;", "sharedView", "Landroid/view/View;", "WooCommerce_vanillaDebug"})
    public static abstract interface OnReviewClickListener {
        
        public abstract void onReviewClick(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.Nullable()
        android.view.View sharedView);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            public static void onReviewClick(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.reviews.ReviewListAdapter.OnReviewClickListener $this, @org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.Nullable()
            android.view.View sharedView) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\rH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$ReviewListSection;", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/StatelessSection;", "title", "", "list", "", "Lcom/woocommerce/android/model/ProductReview;", "(Lcom/woocommerce/android/ui/reviews/ReviewListAdapter;Ljava/lang/String;Ljava/util/List;)V", "getList", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getContentItemsTotal", "", "getHeaderViewHolder", "Lcom/woocommerce/android/ui/reviews/HeaderViewHolder;", "view", "Landroid/view/View;", "getItemViewHolder", "Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$ItemViewHolder;", "onBindHeaderViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onBindItemViewHolder", "position", "WooCommerce_vanillaDebug"})
    final class ReviewListSection extends com.woocommerce.android.widgets.sectionedrecyclerview.StatelessSection {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ProductReview> list = null;
        
        public ReviewListSection(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductReview> list) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductReview> getList() {
            return null;
        }
        
        @java.lang.Override()
        public int getContentItemsTotal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.woocommerce.android.ui.reviews.ReviewListAdapter.ItemViewHolder getItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindItemViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.woocommerce.android.ui.reviews.HeaderViewHolder getHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/NotifsListItemBinding;", "(Lcom/woocommerce/android/databinding/NotifsListItemBinding;)V", "bullet", "", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "notifsIconPendingColor", "", "pendingLabelColor", "getViewBinding", "()Lcom/woocommerce/android/databinding/NotifsListItemBinding;", "bind", "", "review", "Lcom/woocommerce/android/model/ProductReview;", "position", "totalItems", "reviewStatus", "Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "getPendingReviewLabel", "WooCommerce_vanillaDebug"})
    static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.NotifsListItemBinding viewBinding = null;
        private final android.content.Context context = null;
        private final java.lang.String bullet = "\u2022";
        private final int pendingLabelColor = 0;
        private final int notifsIconPendingColor = 0;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.NotifsListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.NotifsListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductReview review, int position, int totalItems, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.reviews.ProductReviewStatus reviewStatus) {
        }
        
        private final java.lang.String getPendingReviewLabel() {
            return null;
        }
    }
}