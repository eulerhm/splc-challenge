package com.woocommerce.android.push;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/push/UnseenReviewsCountHandler;", "", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notificationStore", "Lorg/wordpress/android/fluxc/store/NotificationStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lkotlinx/coroutines/CoroutineScope;Lorg/wordpress/android/fluxc/store/NotificationStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "unseenReviewsCount", "Lkotlinx/coroutines/flow/SharedFlow;", "", "observeUnseenCount", "Lkotlinx/coroutines/flow/Flow;", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class UnseenReviewsCountHandler {
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    private final org.wordpress.android.fluxc.store.NotificationStore notificationStore = null;
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Integer> unseenReviewsCount = null;
    
    @javax.inject.Inject
    public UnseenReviewsCountHandler(@org.jetbrains.annotations.NotNull
    @com.woocommerce.android.di.AppCoroutineScope
    kotlinx.coroutines.CoroutineScope appCoroutineScope, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.NotificationStore notificationStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> observeUnseenCount() {
        return null;
    }
}