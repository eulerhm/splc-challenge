package com.woocommerce.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\fH\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/di/CardReaderModule;", "", "()V", "provideCardReaderConfigFactory", "Lcom/woocommerce/android/cardreader/internal/config/CardReaderConfigFactory;", "provideCardReaderManager", "Lcom/woocommerce/android/cardreader/CardReaderManager;", "application", "Landroid/app/Application;", "cardReaderStore", "Lcom/woocommerce/android/cardreader/CardReaderStore;", "logWrapper", "Lcom/woocommerce/android/cardreader/LogWrapper;", "provideInPersonPaymentsStore", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "inPersonPaymentsStore", "Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;", "responseMapper", "Lcom/woocommerce/android/util/CapturePaymentResponseMapper;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "provideLogWrapper", "WooCommerce_vanillaDebug"})
@dagger.Module()
public final class CardReaderModule {
    
    public CardReaderModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.woocommerce.android.cardreader.CardReaderManager provideCardReaderManager(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.CardReaderStore cardReaderStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.LogWrapper logWrapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.woocommerce.android.cardreader.CardReaderStore provideInPersonPaymentsStore(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.WCInPersonPaymentsStore inPersonPaymentsStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CapturePaymentResponseMapper responseMapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefs appPrefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.woocommerce.android.cardreader.LogWrapper provideLogWrapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Reusable()
    @dagger.Provides()
    public final com.woocommerce.android.cardreader.internal.config.CardReaderConfigFactory provideCardReaderConfigFactory() {
        return null;
    }
}