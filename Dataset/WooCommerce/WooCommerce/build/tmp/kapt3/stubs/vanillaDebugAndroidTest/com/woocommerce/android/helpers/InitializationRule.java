package com.woocommerce.android.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/helpers/InitializationRule;", "Lorg/junit/rules/TestRule;", "()V", "instrumentation", "Landroid/app/Instrumentation;", "kotlin.jvm.PlatformType", "getInstrumentation", "()Landroid/app/Instrumentation;", "apply", "Lorg/junit/runners/model/Statement;", "base", "description", "Lorg/junit/runner/Description;", "AppEntryPoint", "WooCommerce_vanillaDebug"})
public final class InitializationRule implements org.junit.rules.TestRule {
    
    public InitializationRule() {
        super();
    }
    
    private final android.app.Instrumentation getInstrumentation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.junit.runners.model.Statement apply(@org.jetbrains.annotations.Nullable()
    org.junit.runners.model.Statement base, @org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
        return null;
    }
    
    @dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
    @dagger.hilt.EntryPoint()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/helpers/InitializationRule$AppEntryPoint;", "", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initializer", "Lcom/woocommerce/android/AppInitializer;", "WooCommerce_vanillaDebug"})
    public static abstract interface AppEntryPoint {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.woocommerce.android.AppInitializer initializer();
        
        @org.jetbrains.annotations.NotNull()
        @com.woocommerce.android.di.AppCoroutineScope()
        public abstract kotlinx.coroutines.CoroutineScope appCoroutineScope();
    }
}