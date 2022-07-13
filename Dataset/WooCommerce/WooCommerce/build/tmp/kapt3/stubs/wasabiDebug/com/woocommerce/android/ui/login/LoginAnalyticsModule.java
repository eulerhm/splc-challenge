package com.woocommerce.android.ui.login;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginAnalyticsModule;", "", "()V", "provideAnalyticsListener", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "WooCommerce_wasabiDebug"})
@dagger.Module
public final class LoginAnalyticsModule {
    
    public LoginAnalyticsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final org.wordpress.android.login.LoginAnalyticsListener provideAnalyticsListener(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker) {
        return null;
    }
}