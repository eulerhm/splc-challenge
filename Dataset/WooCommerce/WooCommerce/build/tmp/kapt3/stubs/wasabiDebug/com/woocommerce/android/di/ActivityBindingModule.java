package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/di/ActivityBindingModule;", "", "()V", "provideMagicLinkInterceptActivityInjector", "Lcom/woocommerce/android/ui/login/MagicLinkInterceptActivity;", "WooCommerce_wasabiDebug"})
@dagger.Module
public abstract class ActivityBindingModule {
    
    public ActivityBindingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.android.ContributesAndroidInjector
    @ActivityScope
    public abstract com.woocommerce.android.ui.login.MagicLinkInterceptActivity provideMagicLinkInterceptActivityInjector();
}