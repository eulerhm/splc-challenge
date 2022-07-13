package com.woocommerce.android.ui.reviews.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/reviews/domain/MarkReviewAsSeen;", "", "repository", "Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository;", "notificationHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "(Lcom/woocommerce/android/ui/reviews/ReviewDetailRepository;Lcom/woocommerce/android/push/NotificationMessageHandler;)V", "invoke", "", "remoteReviewId", "", "notification", "Lorg/wordpress/android/fluxc/model/notification/NotificationModel;", "(JLorg/wordpress/android/fluxc/model/notification/NotificationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
public class MarkReviewAsSeen {
    private final com.woocommerce.android.ui.reviews.ReviewDetailRepository repository = null;
    private final com.woocommerce.android.push.NotificationMessageHandler notificationHandler = null;
    
    @javax.inject.Inject()
    public MarkReviewAsSeen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewDetailRepository repository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationMessageHandler notificationHandler) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(long remoteReviewId, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.notification.NotificationModel notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}