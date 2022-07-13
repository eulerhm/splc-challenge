package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/di/SelectedSiteModule;", "", "()V", "provideSelectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "context", "Landroid/content/Context;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "WooCommerce_wasabiDebug"})
@dagger.Module
public final class SelectedSiteModule {
    
    public SelectedSiteModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.woocommerce.android.tools.SelectedSite provideSelectedSite(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.SiteStore siteStore) {
        return null;
    }
}