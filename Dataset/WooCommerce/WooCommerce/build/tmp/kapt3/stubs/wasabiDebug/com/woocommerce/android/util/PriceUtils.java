package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJZ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/util/PriceUtils;", "", "()V", "formatCurrency", "", "amount", "Ljava/math/BigDecimal;", "currencyCode", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getPriceGroup", "", "parameters", "Lcom/woocommerce/android/ui/products/models/SiteParameters;", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "regularPrice", "salePrice", "isSaleScheduled", "", "saleStartDateGmt", "Ljava/util/Date;", "saleEndDateGmt", "getProductSaleDates", "dateOnSaleFrom", "dateOnSaleTo", "WooCommerce_wasabiDebug"})
public final class PriceUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.PriceUtils INSTANCE = null;
    
    private PriceUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"LongParameterList"})
    public final java.util.Map<java.lang.String, java.lang.String> getPriceGroup(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.models.SiteParameters parameters, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resources, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal regularPrice, @org.jetbrains.annotations.Nullable
    java.math.BigDecimal salePrice, boolean isSaleScheduled, @org.jetbrains.annotations.Nullable
    java.util.Date saleStartDateGmt, @org.jetbrains.annotations.Nullable
    java.util.Date saleEndDateGmt) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatCurrency(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        return null;
    }
    
    private final java.lang.String getProductSaleDates(java.util.Date dateOnSaleFrom, java.util.Date dateOnSaleTo, com.woocommerce.android.viewmodel.ResourceProvider resources) {
        return null;
    }
}