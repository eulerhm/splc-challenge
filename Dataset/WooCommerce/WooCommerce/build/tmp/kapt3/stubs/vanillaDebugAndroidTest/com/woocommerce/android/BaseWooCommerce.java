package com.woocommerce.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/BaseWooCommerce;", "Landroid/app/Application;", "Ldagger/android/HasAndroidInjector;", "()V", "androidInjector", "Ldagger/android/AndroidInjector;", "", "onCreate", "", "AndroidInjectorEntryPoint", "WooCommerce_vanillaDebug"})
public class BaseWooCommerce extends android.app.Application implements dagger.android.HasAndroidInjector {
    
    public BaseWooCommerce() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
    @dagger.hilt.EntryPoint()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/BaseWooCommerce$AndroidInjectorEntryPoint;", "", "injector", "Ldagger/android/DispatchingAndroidInjector;", "WooCommerce_vanillaDebug"})
    public static abstract interface AndroidInjectorEntryPoint {
        
        @org.jetbrains.annotations.NotNull()
        public abstract dagger.android.DispatchingAndroidInjector<java.lang.Object> injector();
    }
}