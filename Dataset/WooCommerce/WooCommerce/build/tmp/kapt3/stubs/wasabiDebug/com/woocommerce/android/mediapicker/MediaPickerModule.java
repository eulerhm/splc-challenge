package com.woocommerce.android.mediapicker;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H!\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H!\u00a2\u0006\u0002\b\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/mediapicker/MediaPickerModule;", "", "()V", "bindMediaLoaderFactory", "Lorg/wordpress/android/mediapicker/loader/MediaLoaderFactory;", "mediaPickerLoaderFactory", "Lcom/woocommerce/android/mediapicker/MediaPickerLoaderFactory;", "bindMediaPickerSetupFactory", "Lorg/wordpress/android/mediapicker/api/MediaPickerSetup$Factory;", "factory", "Lcom/woocommerce/android/mediapicker/MediaPickerSetupFactory;", "bindTracker", "Lorg/wordpress/android/mediapicker/api/Tracker;", "tracker", "Lcom/woocommerce/android/mediapicker/MediaPickerTracker;", "provideMediaPickerLogger", "Lorg/wordpress/android/mediapicker/api/Log;", "logger", "Lcom/woocommerce/android/mediapicker/MediaPickerLogger;", "provideMediaPickerLogger$WooCommerce_wasabiDebug", "provideMimeTypeSupportProvider", "Lorg/wordpress/android/mediapicker/api/MimeTypeProvider;", "provider", "Lcom/woocommerce/android/mediapicker/MediaPickerMimeTypeProvider;", "provideMimeTypeSupportProvider$WooCommerce_wasabiDebug", "Companion", "WooCommerce_wasabiDebug"})
@dagger.Module(includes = {dagger.android.AndroidInjectionModule.class, org.wordpress.android.login.di.LoginServiceModule.class})
public abstract class MediaPickerModule {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.mediapicker.MediaPickerModule.Companion Companion = null;
    
    public MediaPickerModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract org.wordpress.android.mediapicker.api.Log provideMediaPickerLogger$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.mediapicker.MediaPickerLogger logger);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract org.wordpress.android.mediapicker.api.MimeTypeProvider provideMimeTypeSupportProvider$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.mediapicker.MediaPickerMimeTypeProvider provider);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract org.wordpress.android.mediapicker.loader.MediaLoaderFactory bindMediaLoaderFactory(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.mediapicker.MediaPickerLoaderFactory mediaPickerLoaderFactory);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract org.wordpress.android.mediapicker.api.Tracker bindTracker(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.mediapicker.MediaPickerTracker tracker);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract org.wordpress.android.mediapicker.api.MediaPickerSetup.Factory bindMediaPickerSetupFactory(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.mediapicker.MediaPickerSetupFactory factory);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/mediapicker/MediaPickerModule$Companion;", "", "()V", "provideSelectedSite", "Lorg/wordpress/android/fluxc/model/SiteModel;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @dagger.Provides
        public final org.wordpress.android.fluxc.model.SiteModel provideSelectedSite(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.tools.SelectedSite selectedSite) {
            return null;
        }
    }
}