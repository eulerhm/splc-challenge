package com.woocommerce.android.ui.moremenu.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/domain/MoreMenuRepository;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/AppPrefsWrapper;)V", "isInboxEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeCouponBetaSwitch", "Lkotlinx/coroutines/flow/Flow;", "Companion", "WooCommerce_wasabiDebug"})
public final class MoreMenuRepository {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.moremenu.domain.MoreMenuRepository.Companion Companion = null;
    private static final java.lang.String INBOX_MINIMUM_SUPPORTED_VERSION = "6.4.0";
    
    @javax.inject.Inject
    public MoreMenuRepository(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object isInboxEnabled(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> observeCouponBetaSwitch() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/moremenu/domain/MoreMenuRepository$Companion;", "", "()V", "INBOX_MINIMUM_SUPPORTED_VERSION", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}