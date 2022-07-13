package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/di/AppConfigModule;", "", "()V", "provideAppSecrets", "Lorg/wordpress/android/fluxc/network/rest/wpcom/auth/AppSecrets;", "provideDefaultLocale", "Ljava/util/Locale;", "provideUserAgent", "Lorg/wordpress/android/fluxc/network/UserAgent;", "appContext", "Landroid/content/Context;", "providesAppPrefs", "Lcom/woocommerce/android/AppPrefs;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.Module
public final class AppConfigModule {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.di.AppConfigModule.Companion Companion = null;
    private static final java.lang.String USER_AGENT_APPNAME = "wc-android";
    
    public AppConfigModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final org.wordpress.android.fluxc.network.rest.wpcom.auth.AppSecrets provideAppSecrets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final org.wordpress.android.fluxc.network.UserAgent provideUserAgent(@org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final java.util.Locale provideDefaultLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.woocommerce.android.AppPrefs providesAppPrefs(@org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/di/AppConfigModule$Companion;", "", "()V", "USER_AGENT_APPNAME", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}