package com.woocommerce.android.ui.reviews.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "repository", "Lcom/woocommerce/android/ui/reviews/ReviewListRepository;", "notificationHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "(Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/reviews/ReviewListRepository;Lcom/woocommerce/android/push/NotificationMessageHandler;)V", "invoke", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$MarkReviewAsSeenResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Fail", "MarkReviewAsSeenResult", "Success", "WooCommerce_vanillaDebug"})
public final class MarkAllReviewsAsSeen {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.reviews.ReviewListRepository repository = null;
    private final com.woocommerce.android.push.NotificationMessageHandler notificationHandler = null;
    
    @javax.inject.Inject()
    public MarkAllReviewsAsSeen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewListRepository repository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationMessageHandler notificationHandler) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen.MarkReviewAsSeenResult> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$MarkReviewAsSeenResult;", "", "()V", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$Fail;", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$Success;", "WooCommerce_vanillaDebug"})
    public static abstract class MarkReviewAsSeenResult {
        
        private MarkReviewAsSeenResult() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$Fail;", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$MarkReviewAsSeenResult;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Fail extends com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen.MarkReviewAsSeenResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen.Fail INSTANCE = null;
        
        private Fail() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$Success;", "Lcom/woocommerce/android/ui/reviews/domain/MarkAllReviewsAsSeen$MarkReviewAsSeenResult;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Success extends com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen.MarkReviewAsSeenResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.reviews.domain.MarkAllReviewsAsSeen.Success INSTANCE = null;
        
        private Success() {
            super();
        }
    }
}