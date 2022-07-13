package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginNoJetpackRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "(Lorg/wordpress/android/fluxc/Dispatcher;)V", "continuationFetchSiteInfo", "Lcom/woocommerce/android/util/ContinuationWrapper;", "", "onCleanup", "", "onFetchedConnectSiteInfo", "event", "Lorg/wordpress/android/fluxc/store/SiteStore$OnConnectSiteInfoChecked;", "verifyJetpackAvailable", "siteAddress", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
public final class LoginNoJetpackRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationFetchSiteInfo;
    
    @javax.inject.Inject()
    public LoginNoJetpackRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher) {
        super();
    }
    
    public final void onCleanup() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifyJetpackAvailable(@org.jetbrains.annotations.NotNull()
    java.lang.String siteAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onFetchedConnectSiteInfo(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.SiteStore.OnConnectSiteInfoChecked event) {
    }
}