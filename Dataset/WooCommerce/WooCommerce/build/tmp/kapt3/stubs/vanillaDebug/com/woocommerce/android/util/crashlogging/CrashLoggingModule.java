package com.woocommerce.android.util.crashlogging;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/CrashLoggingModule;", "", "()V", "bindCrashLoggingDataProvider", "Lcom/automattic/android/tracks/crashlogging/CrashLoggingDataProvider;", "dataProvider", "Lcom/woocommerce/android/util/crashlogging/WCCrashLoggingDataProvider;", "bindLocaleProvider", "Lcom/woocommerce/android/util/locale/LocaleProvider;", "contextBasedLocaleProvider", "Lcom/woocommerce/android/util/locale/ContextBasedLocaleProvider;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.Module()
public abstract class CrashLoggingModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.crashlogging.CrashLoggingModule.Companion Companion = null;
    
    public CrashLoggingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.automattic.android.tracks.crashlogging.CrashLoggingDataProvider bindCrashLoggingDataProvider(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.crashlogging.WCCrashLoggingDataProvider dataProvider);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.woocommerce.android.util.locale.LocaleProvider bindLocaleProvider(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.locale.ContextBasedLocaleProvider contextBasedLocaleProvider);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/CrashLoggingModule$Companion;", "", "()V", "provideCrashLogging", "Lcom/automattic/android/tracks/crashlogging/CrashLogging;", "context", "Landroid/content/Context;", "crashLoggingDataProvider", "Lcom/automattic/android/tracks/crashlogging/CrashLoggingDataProvider;", "provideEncryptedLoggingKey", "Lorg/wordpress/android/fluxc/model/encryptedlogging/EncryptedLoggingKey;", "provideFluxCCrashLogger", "Lorg/wordpress/android/fluxc/logging/FluxCCrashLogger;", "crashLogging", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.automattic.android.tracks.crashlogging.CrashLogging provideCrashLogging(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.automattic.android.tracks.crashlogging.CrashLoggingDataProvider crashLoggingDataProvider) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final org.wordpress.android.fluxc.model.encryptedlogging.EncryptedLoggingKey provideEncryptedLoggingKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final org.wordpress.android.fluxc.logging.FluxCCrashLogger provideFluxCCrashLogger(@org.jetbrains.annotations.NotNull()
        com.automattic.android.tracks.crashlogging.CrashLogging crashLogging) {
            return null;
        }
    }
}