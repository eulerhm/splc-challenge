package com.woocommerce.android.ui.main;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/main/MainModule;", "", "()V", "provideMainPresenter", "Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "mainActivityPresenter", "Lcom/woocommerce/android/ui/main/MainPresenter;", "provideUiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "mainUIMessageResolver", "Lcom/woocommerce/android/ui/main/MainUIMessageResolver;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.Module()
public abstract class MainModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.main.MainModule.Companion Companion = null;
    
    public MainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Binds()
    public abstract com.woocommerce.android.ui.main.MainContract.Presenter provideMainPresenter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.MainPresenter mainActivityPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Binds()
    public abstract com.woocommerce.android.ui.base.UIMessageResolver provideUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.MainUIMessageResolver mainUIMessageResolver);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/main/MainModule$Companion;", "", "()V", "provideMainActivity", "Lcom/woocommerce/android/ui/main/MainActivity;", "activity", "Landroid/app/Activity;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.woocommerce.android.ui.main.MainActivity provideMainActivity(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
    }
}