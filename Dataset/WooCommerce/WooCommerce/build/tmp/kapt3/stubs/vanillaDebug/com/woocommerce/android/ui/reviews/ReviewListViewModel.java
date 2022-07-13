package com.woocommerce.android.ui.reviews;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0003;<=B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010)\u001a\u00020*J\u0019\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020*J\u0006\u00100\u001a\u00020*J\u0006\u00101\u001a\u00020*J\b\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020*H\u0014J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0007J\b\u00107\u001a\u00020*H\u0002J\b\u00108\u001a\u00020*H\u0002J\u0006\u00109\u001a\u00020*J\f\u0010:\u001a\u00020**\u00020\u0002H\u0016R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140$*\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "reviewRepository", "Lcom/woocommerce/android/ui/reviews/ReviewListRepository;", "markAllReviewsAsSeen", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen;", "unseenReviewsCountHandler", "Lcom/woocommerce/android/push/UnseenReviewsCountHandler;", "reviewModerationHandler", "Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/woocommerce/android/tools/NetworkStatus;Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/ui/reviews/ReviewListRepository;Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen;Lcom/woocommerce/android/push/UnseenReviewsCountHandler;Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;)V", "_reviewList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/model/ProductReview;", "<set-?>", "Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "rawReviewList", "Landroidx/lifecycle/LiveData;", "getRawReviewList", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Landroidx/lifecycle/LiveData;", "getReviewModerationHandler", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "checkForUnreadReviews", "", "fetchReviewList", "loadMore", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceRefreshReviews", "loadMoreReviews", "markAllReviewsAsRead", "observeReviewUpdates", "onCleared", "onEventMainThread", "event", "Lcom/woocommerce/android/network/ConnectionChangeReceiver$ConnectionChangeEvent;", "reloadReviewsFromCache", "showOfflineSnack", "start", "onReviewModerationSuccess", "Companion", "ReviewListEvent", "ViewState", "WooCommerce_vanillaDebug"})
public final class ReviewListViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel implements com.woocommerce.android.ui.reviews.ReviewModerationConsumer {
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final com.woocommerce.android.ui.reviews.ReviewListRepository reviewRepository = null;
    private final com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen markAllReviewsAsSeen = null;
    private final com.woocommerce.android.push.UnseenReviewsCountHandler unseenReviewsCountHandler = null;
    private final com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.reviews.ReviewListViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "ReviewListViewModel";
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.model.ProductReview>> _reviewList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    
    @javax.inject.Inject()
    public ReviewListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.NetworkStatus networkStatus, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewListRepository reviewRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen markAllReviewsAsSeen, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.UnseenReviewsCountHandler unseenReviewsCountHandler, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationHandler reviewModerationHandler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductReview>> getRawReviewList(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$rawReviewList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.reviews.ReviewModerationHandler getReviewModerationHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$reviewModerationHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    /**
     * Fetch and load cached reviews from the database, then fetch fresh reviews
     * from the API.
     */
    public final void start() {
    }
    
    @java.lang.Override()
    public void onReviewModerationSuccess(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$onReviewModerationSuccess) {
    }
    
    private final void reloadReviewsFromCache() {
    }
    
    public final void loadMoreReviews() {
    }
    
    public final void forceRefreshReviews() {
    }
    
    public final void checkForUnreadReviews() {
    }
    
    public final void markAllReviewsAsRead() {
    }
    
    private final java.lang.Object fetchReviewList(boolean loadMore, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void showOfflineSnack() {
    }
    
    private final void observeReviewUpdates() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.network.ConnectionChangeReceiver.ConnectionChangeEvent event) {
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ>\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ViewState;", "Landroid/os/Parcelable;", "isSkeletonShown", "", "isLoadingMore", "isRefreshing", "hasUnreadReviews", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getHasUnreadReviews", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isSkeletonShown = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isLoadingMore = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isRefreshing = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean hasUnreadReviews = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean hasUnreadReviews) {
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
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSkeletonShown, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isLoadingMore, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isRefreshing, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean hasUnreadReviews) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSkeletonShown() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isLoadingMore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isRefreshing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getHasUnreadReviews() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.reviews.ReviewListViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ReviewListEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "MarkAllAsRead", "Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ReviewListEvent$MarkAllAsRead;", "WooCommerce_vanillaDebug"})
    public static abstract class ReviewListEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private ReviewListEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ReviewListEvent$MarkAllAsRead;", "Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$ReviewListEvent;", "status", "Lcom/woocommerce/android/model/ActionStatus;", "(Lcom/woocommerce/android/model/ActionStatus;)V", "getStatus", "()Lcom/woocommerce/android/model/ActionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class MarkAllAsRead extends com.woocommerce.android.ui.reviews.ReviewListViewModel.ReviewListEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.ActionStatus status = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.reviews.ReviewListViewModel.ReviewListEvent.MarkAllAsRead copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ActionStatus status) {
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
            
            public MarkAllAsRead(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.ActionStatus status) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ActionStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.ActionStatus getStatus() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListViewModel$Companion;", "", "()V", "TAG", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}