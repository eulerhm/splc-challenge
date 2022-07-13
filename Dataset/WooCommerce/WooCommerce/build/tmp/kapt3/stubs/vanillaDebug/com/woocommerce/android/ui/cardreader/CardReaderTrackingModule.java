package com.woocommerce.android.ui.cardreader;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingModule;", "", "()V", "provideCardReaderTrackingInfoBuilder", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "impl", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoImpl;", "provideCardReaderTrackingInfoProvider", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoProvider;", "WooCommerce_vanillaDebug"})
@dagger.Module()
public abstract class CardReaderTrackingModule {
    
    public CardReaderTrackingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper provideCardReaderTrackingInfoBuilder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoImpl impl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoProvider provideCardReaderTrackingInfoProvider(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoImpl impl);
}