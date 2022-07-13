package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductHelper;", "", "()V", "getDefaultNewProduct", "Lcom/woocommerce/android/model/Product;", "productType", "Lcom/woocommerce/android/ui/products/ProductType;", "isVirtual", "", "productOrVariationId", "", "productId", "variationId", "(Ljava/lang/Long;Ljava/lang/Long;)J", "WooCommerce_vanillaDebug"})
public final class ProductHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductHelper INSTANCE = null;
    
    private ProductHelper() {
        super();
    }
    
    /**
     * Simple helper which returns the variation ID if it's not null and non-zero, otherwise returns the product ID
     * if it's not null (and if it is, returns 0). This is useful when deciding whether to use a product ID or a
     * variation ID when looking up a product - we want to favor the variation ID when available because that will
     * get us the actual variation (the productId in this situation will be the ID of the parent product)
     */
    public final long productOrVariationId(@org.jetbrains.annotations.Nullable()
    java.lang.Long productId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variationId) {
        return 0L;
    }
    
    /**
     * Default Product for initial state of Product Add flow
     */
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Product getDefaultNewProduct(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductType productType, boolean isVirtual) {
        return null;
    }
}