package com.woocommerce.android.ui.reviews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002&\'B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u000eJ\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "repository", "Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository;", "markReviewAsSeen", "Lcom/woocommerce/android/ui/reviews/domain/MarkReviewAsSeen;", "reviewModerationHandler", "Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository;Lcom/woocommerce/android/ui/reviews/domain/MarkReviewAsSeen;Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;)V", "launchedFromNotification", "", "remoteReviewId", "", "<set-?>", "Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "fetchProductReview", "", "loadProductReview", "moderateReview", "newStatus", "Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "onBackPressed", "start", "ReviewDetailEvent", "ViewState", "WooCommerce_wasabiDebug"})
public final class ReviewDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final com.woocommerce.android.ui.reviews.ReviewDetailRepository repository = null;
    private final com.woocommerce.android.ui.reviews.domain.MarkReviewAsSeen markReviewAsSeen = null;
    private final com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler = null;
    private long remoteReviewId = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private boolean launchedFromNotification = false;
    
    @javax.inject.Inject
    public ReviewDetailViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewDetailRepository repository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.domain.MarkReviewAsSeen markReviewAsSeen, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState p0) {
    }
    
    public final void start(long remoteReviewId, boolean launchedFromNotification) {
    }
    
    public final void moderateReview(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus) {
    }
    
    private final void loadProductReview(long remoteReviewId, boolean launchedFromNotification) {
    }
    
    private final void fetchProductReview(long remoteReviewId) {
    }
    
    public final boolean onBackPressed() {
        return false;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ViewState;", "Landroid/os/Parcelable;", "productReview", "Lcom/woocommerce/android/model/ProductReview;", "isSkeletonShown", "", "(Lcom/woocommerce/android/model/ProductReview;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductReview", "()Lcom/woocommerce/android/model/ProductReview;", "component1", "component2", "copy", "(Lcom/woocommerce/android/model/ProductReview;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final com.woocommerce.android.model.ProductReview productReview = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isSkeletonShown = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ProductReview productReview, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable
        com.woocommerce.android.model.ProductReview productReview, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isSkeletonShown) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ProductReview component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.model.ProductReview getProductReview() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isSkeletonShown() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ReviewDetailEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "NavigateBackFromNotification", "Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ReviewDetailEvent$NavigateBackFromNotification;", "WooCommerce_wasabiDebug"})
    public static abstract class ReviewDetailEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ReviewDetailEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ReviewDetailEvent$NavigateBackFromNotification;", "Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel$ReviewDetailEvent;", "()V", "WooCommerce_wasabiDebug"})
        public static final class NavigateBackFromNotification extends com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ReviewDetailEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.reviews.ReviewDetailViewModel.ReviewDetailEvent.NavigateBackFromNotification INSTANCE = null;
            
            private NavigateBackFromNotification() {
                super();
            }
        }
    }
}