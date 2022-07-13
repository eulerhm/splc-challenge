package com.woocommerce.android.ui.orders.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/ShippingLabelOnboardingRepository;", "", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "appSharedPrefs", "Lcom/woocommerce/android/AppPrefsWrapper;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/tools/SelectedSite;)V", "isShippingPluginReady", "", "()Z", "isShippingPluginReady$delegate", "Lkotlin/Lazy;", "hasVirtualProductsOnly", "order", "Lcom/woocommerce/android/model/Order;", "markWcShippingBannerAsDismissed", "", "shouldShowWcShippingBanner", "eligibleForIpp", "Companion", "WooCommerce_vanillaDebug"})
public final class ShippingLabelOnboardingRepository {
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.AppPrefsWrapper appSharedPrefs = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.details.ShippingLabelOnboardingRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUPPORTED_WCS_VERSION = "1.25.11";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUPPORTED_WCS_CURRENCY = "USD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUPPORTED_WCS_COUNTRY = "US";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy isShippingPluginReady$delegate = null;
    
    @javax.inject.Inject()
    public ShippingLabelOnboardingRepository(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appSharedPrefs, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final boolean isShippingPluginReady() {
        return false;
    }
    
    public final boolean shouldShowWcShippingBanner(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, boolean eligibleForIpp) {
        return false;
    }
    
    public final void markWcShippingBannerAsDismissed() {
    }
    
    private final boolean hasVirtualProductsOnly(com.woocommerce.android.model.Order order) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/ShippingLabelOnboardingRepository$Companion;", "", "()V", "SUPPORTED_WCS_COUNTRY", "", "SUPPORTED_WCS_CURRENCY", "SUPPORTED_WCS_VERSION", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}