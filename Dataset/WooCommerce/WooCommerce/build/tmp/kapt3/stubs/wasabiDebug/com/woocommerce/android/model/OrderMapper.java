package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\nH\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\nH\u0002J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b*\b\u0012\u0004\u0012\u00020\u00140\u000bH\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b*\b\u0012\u0004\u0012\u00020\u00170\u000bH\u0002J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b*\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0002J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b*\b\u0012\u0004\u0012\u00020\u001a0\u000bH\u0002J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b*\b\u0012\u0004\u0012\u00020\u001f0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/model/OrderMapper;", "", "getLocations", "Lcom/woocommerce/android/model/GetLocations;", "(Lcom/woocommerce/android/model/GetLocations;)V", "toAppModel", "Lcom/woocommerce/android/model/Order;", "databaseEntity", "Lorg/wordpress/android/fluxc/model/OrderEntity;", "getOrEmpty", "", "", "Lorg/wordpress/android/fluxc/model/WCMetaData;", "key", "getOrNull", "mapAddress", "Lcom/woocommerce/android/model/Address;", "Lorg/wordpress/android/fluxc/model/order/OrderAddress;", "mapFeesLines", "Lcom/woocommerce/android/model/Order$FeeLine;", "Lorg/wordpress/android/fluxc/model/order/FeeLine;", "mapLineItems", "Lcom/woocommerce/android/model/Order$Item;", "Lorg/wordpress/android/fluxc/model/order/LineItem;", "mapShippingLines", "Lcom/woocommerce/android/model/Order$ShippingLine;", "Lorg/wordpress/android/fluxc/model/order/ShippingLine;", "mapShippingMethods", "Lcom/woocommerce/android/model/Order$ShippingMethod;", "mapTaxLines", "Lcom/woocommerce/android/model/Order$TaxLine;", "Lorg/wordpress/android/fluxc/model/order/TaxLine;", "WooCommerce_wasabiDebug"})
public final class OrderMapper {
    private final com.woocommerce.android.model.GetLocations getLocations = null;
    
    @javax.inject.Inject
    public OrderMapper(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.GetLocations getLocations) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order toAppModel(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.OrderEntity databaseEntity) {
        return null;
    }
    
    private final java.lang.String getOrNull(java.util.List<org.wordpress.android.fluxc.model.WCMetaData> $this$getOrNull, java.lang.String key) {
        return null;
    }
    
    private final java.lang.String getOrEmpty(java.util.List<org.wordpress.android.fluxc.model.WCMetaData> $this$getOrEmpty, java.lang.String key) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.FeeLine> mapFeesLines(java.util.List<org.wordpress.android.fluxc.model.order.FeeLine> $this$mapFeesLines) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.TaxLine> mapTaxLines(java.util.List<org.wordpress.android.fluxc.model.order.TaxLine> $this$mapTaxLines) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.ShippingLine> mapShippingLines(java.util.List<org.wordpress.android.fluxc.model.order.ShippingLine> $this$mapShippingLines) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.Item> mapLineItems(java.util.List<org.wordpress.android.fluxc.model.order.LineItem> $this$mapLineItems) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.model.Order.ShippingMethod> mapShippingMethods(java.util.List<org.wordpress.android.fluxc.model.order.ShippingLine> $this$mapShippingMethods) {
        return null;
    }
    
    private final com.woocommerce.android.model.Address mapAddress(org.wordpress.android.fluxc.model.order.OrderAddress $this$mapAddress) {
        return null;
    }
}