package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u0001:\u00019B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0016\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010%\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J-\u0010,\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\'0-2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010/\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0006\u00100\u001a\u00020\u001eJ\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0007J\u0010\u00104\u001a\u00020\u001e2\u0006\u00102\u001a\u000205H\u0007J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u00020\u001eH\u0002R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "notificationStore", "Lorg/wordpress/android/fluxc/store/NotificationStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/WCProductStore;Lorg/wordpress/android/fluxc/store/NotificationStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "<set-?>", "", "canLoadMore", "getCanLoadMore", "()Z", "continuationNotification", "Lcom/woocommerce/android/util/ContinuationWrapper;", "continuationProduct", "isFetchingProductReviews", "offset", "", "fetchNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductReviews", "Lcom/woocommerce/android/model/RequestResult;", "loadMore", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductReviewsFromApi", "fetchProductsByRemoteId", "", "remoteProductIds", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedProductReviews", "Lcom/woocommerce/android/model/ProductReview;", "getHasUnreadCachedProductReviews", "getProductByRemoteId", "Lcom/woocommerce/android/model/ProductReviewProduct;", "remoteProductId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductReviewsFromDB", "Lorg/wordpress/android/fluxc/model/WCProductReviewModel;", "getProductsByRemoteIdMap", "", "getReviewNotifReadValueByRemoteIdMap", "markAllProductReviewsAsRead", "onCleanup", "onNotificationChanged", "event", "Lorg/wordpress/android/fluxc/store/NotificationStore$OnNotificationChanged;", "onProductChanged", "Lorg/wordpress/android/fluxc/store/WCProductStore$OnProductChanged;", "trackMarkAllProductReviewsAsReadResult", "result", "trackMarkAllProductReviewsAsReadStarted", "Companion", "WooCommerce_vanillaDebug"})
public final class ReviewListRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final org.wordpress.android.fluxc.store.NotificationStore notificationStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.reviews.ReviewListRepository.Companion Companion = null;
    private static final int PAGE_SIZE = 25;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationProduct;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationNotification;
    private int offset = 0;
    private boolean isFetchingProductReviews = false;
    private boolean canLoadMore = false;
    
    @javax.inject.Inject()
    public ReviewListRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.NotificationStore notificationStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final boolean getCanLoadMore() {
        return false;
    }
    
    public final void onCleanup() {
    }
    
    /**
     * Fetch product reviews and notifications from the API. Wait for both requests to complete. If the
     * fetch is already in progress return [RequestResult.NO_ACTION_NEEDED].
     *
     * @param [loadMore] if true, creates an offset to fetch the next page of [ProductReview]s
     * from the API.
     * @return the result of the fetch as a [RequestResult]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchProductReviews(boolean loadMore, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    /**
     * Fires the request to mark all product review notifications as read to the API. If there are
     * no unread product review notifications in the database, then the result will be
     * [RequestResult.NO_ACTION_NEEDED].
     *
     * @return the result of the action as a [RequestResult]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markAllProductReviewsAsRead(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    private final void trackMarkAllProductReviewsAsReadStarted() {
    }
    
    private final void trackMarkAllProductReviewsAsReadResult(org.wordpress.android.fluxc.store.NotificationStore.OnNotificationChanged result) {
    }
    
    /**
     * Create a distinct list of products associated with the reviews already in the db, then
     * pass that list to get a map of those products from the db. Only reviews that have an existing
     * cached product will be returned.
     *
     * Also populates the [ProductReview.read] field with the value of a matching Notification, or if
     * one doesn't exist, it is set to true.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCachedProductReviews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.woocommerce.android.model.ProductReview>> continuation) {
        return null;
    }
    
    /**
     * Checks the database for any product review notifications where [NotificationModel.#read] = false
     *
     * @return true if unread product reviews exist in db, else false
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHasUnreadCachedProductReviews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Fetch products from the API and suspends until finished.
     */
    private final java.lang.Object fetchProductsByRemoteId(java.util.List<java.lang.Long> remoteProductIds, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Fetches notifications from the API. We use these results to populate [ProductReview.read].
     */
    private final java.lang.Object fetchNotifications(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchProductReviewsFromApi(boolean loadMore, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Returns a list of all [WCProductReviewModel]s for the active site.
     */
    private final java.lang.Object getProductReviewsFromDB(kotlin.coroutines.Continuation<? super java.util.List<org.wordpress.android.fluxc.model.WCProductReviewModel>> continuation) {
        return null;
    }
    
    /**
     * Queries the db for a [org.wordpress.android.fluxc.model.WCProductModel] matching the
     * provided [remoteProductId] and returns it as a [ProductReviewProduct] or null if not found.
     */
    private final java.lang.Object getProductByRemoteId(long remoteProductId, kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ProductReviewProduct> continuation) {
        return null;
    }
    
    /**
     * Returns a map of [ProductReviewProduct] by the remote_product_id pulled from the db.
     */
    private final java.lang.Object getProductsByRemoteIdMap(java.util.List<java.lang.Long> remoteProductIds, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.Long, com.woocommerce.android.model.ProductReviewProduct>> continuation) {
        return null;
    }
    
    /**
     * Uses the product review notifications to create a map of
     * [org.wordpress.android.fluxc.model.notification.NotificationModel.read] by [ProductReview.remoteId].
     */
    private final java.lang.Object getReviewNotifReadValueByRemoteIdMap(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.Long, java.lang.Boolean>> continuation) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProductChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore.OnProductChanged event) {
    }
    
    @java.lang.SuppressWarnings(value = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onNotificationChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.NotificationStore.OnNotificationChanged event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewListRepository$Companion;", "", "()V", "PAGE_SIZE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}