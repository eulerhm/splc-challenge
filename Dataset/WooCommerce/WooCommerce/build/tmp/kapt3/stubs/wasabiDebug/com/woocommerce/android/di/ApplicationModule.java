package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/di/ApplicationModule;", "", "()V", "bindContext", "Landroid/content/Context;", "context", "bindContext$WooCommerce_wasabiDebug", "bindCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scope", "bindTrackerRepository", "Lcom/woocommerce/android/tracker/TrackerRepository;", "repository", "Lcom/woocommerce/android/tracker/DataStoreTrackerRepository;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.Module(includes = {dagger.android.AndroidInjectionModule.class, org.wordpress.android.login.di.LoginServiceModule.class})
public abstract class ApplicationModule {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.di.ApplicationModule.Companion Companion = null;
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract android.content.Context bindContext$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract kotlinx.coroutines.CoroutineScope bindCoroutineScope(@org.jetbrains.annotations.NotNull
    @AppCoroutineScope
    kotlinx.coroutines.CoroutineScope scope);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.woocommerce.android.tracker.TrackerRepository bindTrackerRepository(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tracker.DataStoreTrackerRepository repository);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/di/ApplicationModule$Companion;", "", "()V", "provideAppCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideBackgroundDispatcher", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @javax.inject.Singleton
        @AppCoroutineScope
        @dagger.Provides
        public final kotlinx.coroutines.CoroutineScope provideAppCoroutineScope(@org.jetbrains.annotations.NotNull
        kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @dagger.Provides
        public final kotlinx.coroutines.CoroutineDispatcher provideBackgroundDispatcher() {
            return null;
        }
    }
}