package com.woocommerce.android.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/common/UserEligibilityFetcher;", "Lkotlinx/coroutines/CoroutineScope;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "userStore", "Lorg/wordpress/android/fluxc/store/WCUserStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lcom/woocommerce/android/AppPrefs;Lorg/wordpress/android/fluxc/store/WCUserStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "job", "Lkotlinx/coroutines/Job;", "fetchUserEligibility", "", "fetchUserInfo", "Lorg/wordpress/android/fluxc/model/user/WCUserModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserByEmail", "email", "", "updateUserInfo", "user", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class UserEligibilityFetcher implements kotlinx.coroutines.CoroutineScope {
    private final com.woocommerce.android.AppPrefs appPrefs = null;
    private final org.wordpress.android.fluxc.store.WCUserStore userStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final kotlinx.coroutines.Job job = null;
    
    @javax.inject.Inject
    public UserEligibilityFetcher(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs appPrefs, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCUserStore userStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public final void fetchUserEligibility() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchUserInfo(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.user.WCUserModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.wordpress.android.fluxc.model.user.WCUserModel getUserByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    public final void updateUserInfo(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.user.WCUserModel user) {
    }
}