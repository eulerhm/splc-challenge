package com.woocommerce.android.ui.cardreader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/CardReaderTrackingInfoKeeper;", "", "setCardReaderModel", "", "cardReaderModel", "", "setCountry", "country", "setCurrency", "currency", "setPaymentMethodType", "paymentMethodType", "WooCommerce_vanillaDebug"})
public abstract interface CardReaderTrackingInfoKeeper {
    
    public abstract void setCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String country);
    
    public abstract void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency);
    
    public abstract void setPaymentMethodType(@org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethodType);
    
    public abstract void setCardReaderModel(@org.jetbrains.annotations.Nullable()
    java.lang.String cardReaderModel);
}