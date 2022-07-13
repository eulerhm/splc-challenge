package com.woocommerce.android.ui.sitepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00190\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\n  *\u0004\u0018\u00010\u001f0\u001fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\"J\u0006\u0010#\u001a\u00020\rJ\u0013\u0010$\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0007J\u0006\u0010)\u001a\u00020&J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerRepository;", "", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "(Lorg/wordpress/android/fluxc/store/SiteStore;Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;)V", "continuationLogout", "Lcom/woocommerce/android/util/ContinuationWrapper;", "", "fetchSiteProductSettings", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/WooResult;", "Lorg/wordpress/android/fluxc/model/WCProductSettingsModel;", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "(Lorg/wordpress/android/fluxc/model/SiteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchSiteSettings", "Lorg/wordpress/android/fluxc/model/WCSettingsModel;", "fetchWooCommerceSite", "siteModel", "fetchWooCommerceSites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSiteBySiteUrl", "url", "", "getUserAccount", "Lorg/wordpress/android/fluxc/model/AccountModel;", "kotlin.jvm.PlatformType", "getWooCommerceSites", "", "isUserLoggedIn", "logout", "onAccountChanged", "", "event", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAccountChanged;", "onCleanup", "verifySiteWooAPIVersion", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/system/WCApiVersionResponse;", "WooCommerce_vanillaDebug"})
public final class SitePickerRepository {
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private com.woocommerce.android.util.ContinuationWrapper<java.lang.Boolean> continuationLogout;
    
    @javax.inject.Inject()
    public SitePickerRepository(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore) {
        super();
    }
    
    public final void onCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wordpress.android.fluxc.model.SiteModel> getWooCommerceSites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wordpress.android.fluxc.model.SiteModel getSiteBySiteUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    public final org.wordpress.android.fluxc.model.AccountModel getUserAccount() {
        return null;
    }
    
    public final boolean isUserLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchWooCommerceSites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<java.util.List<org.wordpress.android.fluxc.model.SiteModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchWooCommerceSite(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel siteModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.SiteModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchSiteSettings(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.WCSettingsModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchSiteProductSettings(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.model.WCProductSettingsModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifySiteWooAPIVersion(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.network.rest.wpcom.wc.WooResult<org.wordpress.android.fluxc.network.rest.wpcom.wc.system.WCApiVersionResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAccountChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore.OnAccountChanged event) {
    }
}