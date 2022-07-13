package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository;", "", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "notificationStore", "Lorg/wordpress/android/fluxc/store/NotificationStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCProductStore;Lorg/wordpress/android/fluxc/store/NotificationStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "fetchProductByRemoteId", "", "remoteProductId", "", "remoteReviewId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductReview", "Lcom/woocommerce/android/model/RequestResult;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchProductReviewFromApi", "getCachedNotificationForReview", "Lorg/wordpress/android/fluxc/model/notification/NotificationModel;", "getCachedProductReview", "Lcom/woocommerce/android/model/ProductReview;", "remoteId", "getProductFromDb", "Lorg/wordpress/android/fluxc/model/WCProductModel;", "getProductReviewFromDb", "Lorg/wordpress/android/fluxc/model/WCProductReviewModel;", "markNotificationAsRead", "", "notification", "(Lorg/wordpress/android/fluxc/model/notification/NotificationModel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackMarkNotificationAsReadStarted", "trackMarkNotificationReadResult", "result", "Lorg/wordpress/android/fluxc/store/NotificationStore$OnNotificationChanged;", "Companion", "WooCommerce_wasabiDebug"})
public final class ReviewDetailRepository {
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final org.wordpress.android.fluxc.store.NotificationStore notificationStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.reviews.ReviewDetailRepository.Companion Companion = null;
    private static final java.lang.String TAG = "ReviewDetailRepository";
    
    @javax.inject.Inject
    public ReviewDetailRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.NotificationStore notificationStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchProductReview(long remoteReviewId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCachedProductReview(long remoteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.ProductReview> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCachedNotificationForReview(long remoteReviewId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.notification.NotificationModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object markNotificationAsRead(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.notification.NotificationModel notification, long remoteReviewId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void trackMarkNotificationAsReadStarted(org.wordpress.android.fluxc.model.notification.NotificationModel notification, long remoteReviewId) {
    }
    
    private final void trackMarkNotificationReadResult(org.wordpress.android.fluxc.store.NotificationStore.OnNotificationChanged result) {
    }
    
    private final java.lang.Object fetchProductByRemoteId(long remoteProductId, long remoteReviewId, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchProductReviewFromApi(long remoteReviewId, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object getProductReviewFromDb(long remoteId, kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.WCProductReviewModel> continuation) {
        return null;
    }
    
    private final java.lang.Object getProductFromDb(long remoteProductId, kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.WCProductModel> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository$Companion;", "", "()V", "TAG", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}