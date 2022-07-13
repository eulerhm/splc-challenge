package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.testing.TestInstallIn(components = {dagger.hilt.components.SingletonComponent.class}, replaces = {com.woocommerce.android.di.InterceptorModule.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/di/DummyInterceptorModule;", "", "()V", "provideNetworkInterceptor", "Lokhttp3/Interceptor;", "WooCommerce_vanillaDebug"})
@dagger.Module()
public final class DummyInterceptorModule {
    
    public DummyInterceptorModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "network-interceptors")
    @dagger.multibindings.IntoSet()
    @dagger.Provides()
    public final okhttp3.Interceptor provideNetworkInterceptor() {
        return null;
    }
}