package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

/**
 * Maps the shipping carriers with the corresponding tracking urls since it is currently not possible
 * from the API to fetch tracking urls for a shipment without the Shipment Tracking plugin.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShipmentTrackingUrls;", "", "trackingUrl", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTrackingUrl", "()Ljava/lang/String;", "USPS", "FEDEX", "UPS", "DHL", "Companion", "WooCommerce_vanillaDebug"})
public enum ShipmentTrackingUrls {
    /*public static final*/ USPS /* = new USPS(null) */,
    /*public static final*/ FEDEX /* = new FEDEX(null) */,
    /*public static final*/ UPS /* = new UPS(null) */,
    /*public static final*/ DHL /* = new DHL(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String trackingUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.ShipmentTrackingUrls.Companion Companion = null;
    
    ShipmentTrackingUrls(java.lang.String trackingUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackingUrl() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/ShipmentTrackingUrls$Companion;", "", "()V", "fromCarrier", "", "carrierId", "trackingNumber", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String fromCarrier(@org.jetbrains.annotations.NotNull()
        java.lang.String carrierId, @org.jetbrains.annotations.NotNull()
        java.lang.String trackingNumber) {
            return null;
        }
    }
}