package com.woocommerce.android;

import java.lang.System;

/**
 * A utility class that can be used to force fetching data specific to current site,
 * the fetching will occur on app launch, and on each site switching
 *
 * TODO: check and move other relevant pieces to this class, currently it's used only for fetching plugins
 */
@kotlin.Suppress(names = {"ForbiddenComment"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/SiteObserver;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;)V", "observeAndUpdateSelectedSiteData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public final class SiteObserver {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    
    @javax.inject.Inject
    public SiteObserver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object observeAndUpdateSelectedSiteData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}