package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0016\u0010 \u001a\u0004\u0018\u00010\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\"J6\u0010#\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0017\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\'J\u0017\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\'J\u0017\u0010)\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\'J\u0006\u0010+\u001a\u00020\bJ\u0018\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.2\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u000e\u0010/\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/util/CouponUtils;", "", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "formatAffectedArticles", "", "includedProducts", "", "excludedProducts", "includedCategories", "excludedCategories", "formatCategories", "categories", "formatCurrency", "amount", "Ljava/math/BigDecimal;", "currencyCode", "formatDiscount", "couponType", "Lcom/woocommerce/android/model/Coupon$Type;", "formatExpirationDate", "expirationDate", "Ljava/util/Date;", "formatMaximumSpendingInfo", "maximumAmount", "formatMinimumSpendingInfo", "minimumAmount", "formatProducts", "products", "formatRestrictedEmails", "restrictedEmails", "", "formatSharingMessage", "couponCode", "formatUsageLimitPerCoupon", "usageLimit", "(Ljava/lang/Integer;)Ljava/lang/String;", "formatUsageLimitPerItems", "formatUsageLimitPerUser", "usageLimitPerUser", "generateRandomCode", "generateSummary", "coupon", "Lcom/woocommerce/android/model/Coupon;", "localizeType", "WooCommerce_wasabiDebug"})
public final class CouponUtils {
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    
    @javax.inject.Inject
    public CouponUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatCurrency(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String generateSummary(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Coupon coupon, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String localizeType(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Coupon.Type couponType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatMinimumSpendingInfo(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal minimumAmount, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatMaximumSpendingInfo(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal maximumAmount, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatExpirationDate(@org.jetbrains.annotations.NotNull
    java.util.Date expirationDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatUsageLimitPerUser(@org.jetbrains.annotations.Nullable
    java.lang.Integer usageLimitPerUser) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatUsageLimitPerCoupon(@org.jetbrains.annotations.Nullable
    java.lang.Integer usageLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatUsageLimitPerItems(@org.jetbrains.annotations.Nullable
    java.lang.Integer usageLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatRestrictedEmails(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> restrictedEmails) {
        return null;
    }
    
    private final java.lang.String formatAffectedArticles(int includedProducts, int excludedProducts, int includedCategories, int excludedCategories) {
        return null;
    }
    
    private final java.lang.String formatDiscount(java.math.BigDecimal amount, com.woocommerce.android.model.Coupon.Type couponType, java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String formatSharingMessage(@org.jetbrains.annotations.Nullable
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode, @org.jetbrains.annotations.Nullable
    java.lang.String couponCode, int includedProducts, int excludedProducts) {
        return null;
    }
    
    private final java.lang.String formatProducts(int products) {
        return null;
    }
    
    private final java.lang.String formatCategories(int categories) {
        return null;
    }
    
    /**
     * Generate a random coupon code following the same logic as Core
     * https://github.com/woocommerce/woocommerce/blob/2e60d47a019a6e35f066f3ef43a56c0e761fc8e3/includes/admin/class-wc-admin-assets.php#L295
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"MagicNumber"})
    public final java.lang.String generateRandomCode() {
        return null;
    }
}