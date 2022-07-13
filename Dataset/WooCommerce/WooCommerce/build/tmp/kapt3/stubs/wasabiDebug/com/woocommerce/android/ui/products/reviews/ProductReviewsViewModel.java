package com.woocommerce.android.ui.products.reviews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001;B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ!\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0006\u00101\u001a\u00020,J\b\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u00020,J\u0006\u00105\u001a\u00020,J\b\u00106\u001a\u00020,H\u0002J\u0018\u00107\u001a\u00020,2\u0006\u00108\u001a\u0002092\u0006\u0010/\u001a\u00020\u0011H\u0002J\f\u0010:\u001a\u00020,*\u00020\u0002H\u0016R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0&*\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0018\u0010\t\u001a\u00020\n*\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "reviewsRepository", "Lcom/woocommerce/android/ui/products/reviews/ProductReviewsRepository;", "reviewModerationHandler", "Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/products/reviews/ProductReviewsRepository;Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;)V", "_reviewList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/ProductReview;", "hasModifiedReviews", "", "navArgs", "Lcom/woocommerce/android/ui/products/reviews/ProductReviewsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/reviews/ProductReviewsFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "<set-?>", "Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel$ProductReviewsViewState;", "productReviewsViewState", "getProductReviewsViewState", "()Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel$ProductReviewsViewState;", "setProductReviewsViewState", "(Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel$ProductReviewsViewState;)V", "productReviewsViewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "productReviewsViewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getProductReviewsViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "rawReviewList", "Landroidx/lifecycle/LiveData;", "getRawReviewList", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Landroidx/lifecycle/LiveData;", "getReviewModerationHandler", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "fetchProductReviews", "", "remoteProductId", "", "loadMore", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoreReviews", "loadProductReviews", "Lkotlinx/coroutines/Job;", "onBackButtonClicked", "refreshProductReviews", "reloadReviewsFromCache", "trackFetchProductReviewsResult", "result", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductReviewChanged;", "onReviewModerationSuccess", "ProductReviewsViewState", "WooCommerce_wasabiDebug"})
public final class ProductReviewsViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel implements com.woocommerce.android.ui.reviews.ReviewModerationConsumer {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.products.reviews.ProductReviewsRepository reviewsRepository = null;
    private final com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductReview>> _reviewList = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState> productReviewsViewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate productReviewsViewState$delegate = null;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    private boolean hasModifiedReviews = false;
    
    @javax.inject.Inject
    public ProductReviewsViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.reviews.ProductReviewsRepository reviewsRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.reviews.ReviewModerationHandler getReviewModerationHandler(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$reviewModerationHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductReview>> getRawReviewList(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$rawReviewList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState> getProductReviewsViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState getProductReviewsViewState() {
        return null;
    }
    
    private final void setProductReviewsViewState(com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState p0) {
    }
    
    private final com.woocommerce.android.ui.products.reviews.ProductReviewsFragmentArgs getNavArgs() {
        return null;
    }
    
    public final void refreshProductReviews() {
    }
    
    public final void loadMoreReviews() {
    }
    
    @java.lang.Override
    public void onReviewModerationSuccess(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$onReviewModerationSuccess) {
    }
    
    public final void onBackButtonClicked() {
    }
    
    private final void reloadReviewsFromCache() {
    }
    
    private final kotlinx.coroutines.Job loadProductReviews() {
        return null;
    }
    
    private final java.lang.Object fetchProductReviews(long remoteProductId, boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void trackFetchProductReviewsResult(org.wordpress.android.fluxc.store.WCProductStore.OnProductReviewChanged result, boolean loadMore) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ>\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel$ProductReviewsViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoadingMore", "isRefreshing", "isEmptyViewVisible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel$ProductReviewsViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ProductReviewsViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isEmptyViewVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewVisible) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ProductReviewsViewState() {
            super();
        }
        
        public ProductReviewsViewState(@org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isEmptyViewVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isEmptyViewVisible() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel.ProductReviewsViewState[] newArray(int size) {
                return null;
            }
        }
    }
}