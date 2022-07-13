package com.woocommerce.android.ui.reviews;

import java.lang.System;

/**
 * This class is responsible for handling moderation requests of Product Reviews, the implementation allows
 * offering a way to undo the last operation when the user is taken back to the reviews list.
 *
 * A review moderation is handled by the following steps:
 * 1. The function [postModerationRequest] is called after the user's action.
 * 2. The handler will set the status of the request to [PENDING] and publishes it in [pendingModerationStatus].
 * 3. Then we wait for the delay defined by [UNDO_DELAY]
 * 3. After the delay is expired, the handler will fire a request to the server.
 * 4. Depending on the result of the API request, the server will update the status to either [SUCCESS] or [ERROR]
 * 5. If the request succeeded, we keep the status for the delay [SUCCESS_DELAY] to
 *   allow clients to refresh the list of reviews
 * 6. If the request fails, we keep the status for the duration [ERROR] to allow clients
 *   to display an error Snackbar
 * 7. After we are done, the handler will remove the request and its status.
 *
 * For this to work, the client class which should observe the review moderation (generally the ViewModel
 * of the reviews list) needs to implement the interface [ReviewModerationConsumer], and the corresponding screen
 * needs to implement [ReviewModerationUi]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\fH\u0002J\u0011\u0010&\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0014\u0010(\u001a\u00020\u0013*\u00020\u00072\u0006\u0010!\u001a\u00020\u0019H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WCProductStore;Lkotlinx/coroutines/CoroutineScope;)V", "_pendingModerationStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/woocommerce/android/ui/reviews/ReviewModerationStatus;", "_skipDelayTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "pendingJobs", "", "", "Lkotlinx/coroutines/Job;", "pendingModerationStatus", "Lkotlinx/coroutines/flow/Flow;", "getPendingModerationStatus", "()Lkotlinx/coroutines/flow/Flow;", "queue", "Lcom/woocommerce/android/ui/reviews/ReviewModerationRequest;", "enqueueAndProcessIncomingRequests", "postModerationRequest", "review", "Lcom/woocommerce/android/model/ProductReview;", "newStatus", "Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "submitReviewStatusToTheApi", "request", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "undoOperation", "updateStatus", "status", "wait", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processModerationRequest", "Companion", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class ReviewModerationHandler {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WCProductStore productStore = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.reviews.ReviewModerationHandler.Companion Companion = null;
    public static final long UNDO_DELAY = 2750L;
    public static final long ERROR_SNACKBAR_DELAY = 1000L;
    
    /**
     * This is needed to allow clients to refresh reviews list after success
     */
    public static final long SUCCESS_DELAY = 100L;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.woocommerce.android.ui.reviews.ReviewModerationRequest> queue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.woocommerce.android.ui.reviews.ReviewModerationStatus>> _pendingModerationStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.ui.reviews.ReviewModerationStatus>> pendingModerationStatus = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _skipDelayTrigger = null;
    private java.util.Map<java.lang.Long, kotlinx.coroutines.Job> pendingJobs;
    
    @javax.inject.Inject()
    public ReviewModerationHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    @com.woocommerce.android.di.AppCoroutineScope()
    kotlinx.coroutines.CoroutineScope appCoroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.ui.reviews.ReviewModerationStatus>> getPendingModerationStatus() {
        return null;
    }
    
    public final void postModerationRequest(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus) {
    }
    
    public final void undoOperation(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.ProductReview review) {
    }
    
    /**
     * Handles incoming requests, by enqueuing them, then executing them one by one
     */
    private final void enqueueAndProcessIncomingRequests() {
    }
    
    private final kotlinx.coroutines.Job processModerationRequest(kotlinx.coroutines.CoroutineScope $this$processModerationRequest, com.woocommerce.android.ui.reviews.ReviewModerationRequest request) {
        return null;
    }
    
    private final java.lang.Object wait(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updateStatus(com.woocommerce.android.ui.reviews.ReviewModerationStatus status) {
    }
    
    private final java.lang.Object submitReviewStatusToTheApi(com.woocommerce.android.ui.reviews.ReviewModerationRequest request, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler$Companion;", "", "()V", "ERROR_SNACKBAR_DELAY", "", "getERROR_SNACKBAR_DELAY$annotations", "SUCCESS_DELAY", "getSUCCESS_DELAY$annotations", "UNDO_DELAY", "getUNDO_DELAY$annotations", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getUNDO_DELAY$annotations() {
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getERROR_SNACKBAR_DELAY$annotations() {
        }
        
        /**
         * This is needed to allow clients to refresh reviews list after success
         */
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getSUCCESS_DELAY$annotations() {
        }
    }
}