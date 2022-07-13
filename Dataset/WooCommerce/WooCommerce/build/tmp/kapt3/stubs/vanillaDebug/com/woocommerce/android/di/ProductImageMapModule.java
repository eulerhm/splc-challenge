package com.woocommerce.android.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/di/ProductImageMapModule;", "", "()V", "provideProductImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productStore", "Lorg/wordpress/android/fluxc/store/WCProductStore;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "WooCommerce_vanillaDebug"})
@dagger.Module()
public final class ProductImageMapModule {
    
    public ProductImageMapModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.woocommerce.android.tools.ProductImageMap provideProductImageMap(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCProductStore productStore, @org.jetbrains.annotations.NotNull()
    @AppCoroutineScope()
    kotlinx.coroutines.CoroutineScope appCoroutineScope, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers) {
        return null;
    }
}