package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u00a8\u0006\b"}, d2 = {"loadProducts", "", "Lcom/woocommerce/android/model/ShippingLabel;", "products", "Lcom/woocommerce/android/model/Order$Item;", "toAppModel", "Lcom/woocommerce/android/model/ShippingLabel$Refund;", "Lorg/wordpress/android/fluxc/model/shippinglabels/WCShippingLabelModel$WCShippingLabelRefundModel;", "WooCommerce_wasabiDebug"})
public final class ShippingLabelKt {
    
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.ShippingLabel.Refund toAppModel(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.shippinglabels.WCShippingLabelModel.WCShippingLabelRefundModel $this$toAppModel) {
        return null;
    }
    
    /**
     * Method fetches a list of product details for the product ids or names associated with each shipping label
     *
     * The [ShippingLabel.productIds] field is only available from the API after WCS 1.24.1.
     * Adding a check in this method to fetch products by productIds only if it is available.
     * Otherwise default to using [ShippingLabel.productNames]
     */
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.woocommerce.android.model.ShippingLabel> loadProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingLabel> $this$loadProducts, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.Item> products) {
        return null;
    }
}