package com.woocommerce.android.ui.cardreader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoImpl;", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoProvider;", "Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "()V", "trackingInfo", "Lcom/woocommerce/android/ui/cardreader/TrackingInfo;", "getTrackingInfo", "()Lcom/woocommerce/android/ui/cardreader/TrackingInfo;", "trackingInfoInternal", "setCardReaderModel", "", "cardReaderModel", "", "setCountry", "country", "setCurrency", "currency", "setPaymentMethodType", "paymentMethodType", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class CardReaderTrackingInfoImpl implements com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoProvider, com.woocommerce.android.ui.cardreader.CardReaderTrackingInfoKeeper {
    @kotlin.jvm.Volatile()
    private volatile com.woocommerce.android.ui.cardreader.TrackingInfo trackingInfoInternal;
    
    @javax.inject.Inject()
    public CardReaderTrackingInfoImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.cardreader.TrackingInfo getTrackingInfo() {
        return null;
    }
    
    @java.lang.Override()
    public void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String country) {
    }
    
    @java.lang.Override()
    public void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
    
    @java.lang.Override()
    public void setPaymentMethodType(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodType) {
    }
    
    @java.lang.Override()
    public void setCardReaderModel(@org.jetbrains.annotations.Nullable()
    java.lang.String cardReaderModel) {
    }
}