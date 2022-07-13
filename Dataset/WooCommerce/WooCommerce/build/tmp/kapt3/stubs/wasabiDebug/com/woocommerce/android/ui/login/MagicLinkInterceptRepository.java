package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0015\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0016\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001cH\u0007J\u0006\u0010\u001d\u001a\u00020\u0018J\u0019\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0006\u0010$\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/login/MagicLinkInterceptRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "loginAnalyticsListener", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lorg/wordpress/android/login/LoginAnalyticsListener;)V", "continuationFetchAccount", "Lcom/woocommerce/android/util/ContinuationWrapper;", "", "continuationFetchAccountSettings", "continuationUpdateToken", "isHandlingMagicLink", "fetchAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAccountInfo", "Lcom/woocommerce/android/model/RequestResult;", "fetchAccountSettings", "fetchSites", "onAccountChanged", "", "event", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAccountChanged;", "onAuthenticationChanged", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAuthenticationChanged;", "onCleanup", "storeMagicLinkToken", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMagicLinkAuthToken", "authToken", "userIsLoggedIn", "WooCommerce_wasabiDebug"})
public final class MagicLinkInterceptRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final org.wordpress.android.login.LoginAnalyticsListener loginAnalyticsListener = null;
    private boolean isHandlingMagicLink = false;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationUpdateToken;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationFetchAccount;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationFetchAccountSettings;
    
    @javax.inject.Inject
    public MagicLinkInterceptRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.login.LoginAnalyticsListener loginAnalyticsListener) {
        super();
    }
    
    public final void onCleanup() {
    }
    
    public final boolean userIsLoggedIn() {
        return false;
    }
    
    /**
     * Update magic link auth token to the FluxC cache and verify if the user is logged in.
     * Only if the user is logged in, fetch the account, the account settings and site list from the API.
     *
     * Wait for all three requests to complete. If the fetch is already in progress
     * return [RequestResult.NO_ACTION_NEEDED].
     *
     * @param [authToken] - the magic link auth token needed to be updated to the local cache
     * @return the result of the fetch as a [RequestResult]
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateMagicLinkAuthToken(@org.jetbrains.annotations.NotNull
    java.lang.String authToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    /**
     * Fetch the account, the account settings and site list from the API.
     *
     * Wait for all three requests to complete. If the fetch results in error for even one of the APIs
     * return [RequestResult.RETRY].
     *
     * @return the result of the fetch as a [RequestResult]
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchAccountInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.model.RequestResult> continuation) {
        return null;
    }
    
    /**
     * Fires the request to update the magic link token to the FluxC cache
     *
     * @return the result of the action as a [Boolean]
     */
    private final java.lang.Object storeMagicLinkToken(java.lang.String token, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Fires the request to fetch the account info
     *
     * @return the result of the action as a [Boolean]
     */
    private final java.lang.Object fetchAccount(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Fires the request to fetch the account settings
     *
     * @return the result of the action as a [Boolean]
     */
    private final java.lang.Object fetchAccountSettings(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * Fires the request to fetch all sites fot the account
     *
     * @return the result of the action as a [Boolean]
     */
    private final java.lang.Object fetchSites(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAuthenticationChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore.OnAuthenticationChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAccountChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore.OnAccountChanged event) {
    }
}