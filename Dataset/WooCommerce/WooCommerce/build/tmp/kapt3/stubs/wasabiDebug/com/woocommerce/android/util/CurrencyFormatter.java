package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u001e\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\"\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\"\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u000eJ\u0019\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/util/CurrencyFormatter;", "", "wcStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "localeProvider", "Lcom/woocommerce/android/util/locale/LocaleProvider;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "(Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/util/locale/LocaleProvider;Lkotlinx/coroutines/CoroutineScope;Lcom/woocommerce/android/util/CoroutineDispatchers;)V", "defaultCurrencyCode", "", "buildBigDecimalFormatter", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "currencyCode", "buildFormatter", "formatAmountWithCurrency", "amount", "", "formatCurrency", "applyDecimalFormatting", "", "rawValue", "formatCurrencyRounded", "getCurrencyCode", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "(Lorg/wordpress/android/fluxc/model/SiteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class CurrencyFormatter {
    private final org.wordpress.android.fluxc.store.WooCommerceStore wcStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.util.locale.LocaleProvider localeProvider = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.CurrencyFormatter.Companion Companion = null;
    private static final int ONE_THOUSAND = 1000;
    private static final int ONE_MILLION = 1000000;
    private static final long BACKOFF_DELAY = 1000L;
    private static final int BACKOFF_INTENTS = 3;
    private static final kotlin.Lazy currencyFormatter$delegate = null;
    private static final kotlin.Lazy currencyFormatterRounded$delegate = null;
    private java.lang.String defaultCurrencyCode = "";
    
    @javax.inject.Inject
    public CurrencyFormatter(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wcStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.locale.LocaleProvider localeProvider, @org.jetbrains.annotations.NotNull
    @com.woocommerce.android.di.AppCoroutineScope
    kotlinx.coroutines.CoroutineScope appCoroutineScope, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers) {
        super();
    }
    
    private final java.lang.Object getCurrencyCode(org.wordpress.android.fluxc.model.SiteModel site, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    /**
     * Formats a raw amount for display based on the WooCommerce site settings.
     *
     * @param rawValue the value to be formatted
     * @param currencyCode the ISO 4217 currency code to use for formatting
     * @return the formatted value for display
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatCurrency(@org.jetbrains.annotations.NotNull
    java.lang.String rawValue, @org.jetbrains.annotations.NotNull
    java.lang.String currencyCode, boolean applyDecimalFormatting) {
        return null;
    }
    
    /**
     * Formats the amount for display based on the WooCommerce site settings.
     *
     * @param amount the value to be formatted
     * @param currencyCode the ISO 4217 currency code to use for formatting
     * @return the formatted value for display
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatCurrency(@org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull
    java.lang.String currencyCode, boolean applyDecimalFormatting) {
        return null;
    }
    
    /**
     * Formats a raw amount for display based on the WooCommerce site settings, rounding the values to the nearest int.
     *
     * Additionally, if the value is a thousand or more, we return it rounded to the nearest tenth
     * and suffixed with "k" (2500 -> 2.5k).
     *
     * Similarly, we add "m" for values a million or higher.
     *
     * @param rawValue the value to be formatted
     * @param currencyCode the ISO 4217 currency code to use for formatting
     * @return the formatted value for display
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatCurrencyRounded(double rawValue, @org.jetbrains.annotations.NotNull
    java.lang.String currencyCode) {
        return null;
    }
    
    /**
     * Utility function that returns a reduced function for formatting currencies for orders.
     *
     * For order objects, we generally want to show exact values, and the currency used can be set once at a global
     * level - then the same function can be used for all the various currency fields of an order.
     *
     * @param currencyCode the ISO 4217 currency code to use for formatting
     * @return a function which, given a raw amount as a String, returns the String formatted for display as a currency
     */
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> buildFormatter(@org.jetbrains.annotations.NotNull
    java.lang.String currencyCode) {
        return null;
    }
    
    /**
     * Utility function that returns a reduced function for formatting currencies for orders.
     *
     * For order objects, we generally want to show exact values, and the currency used can be set once at a global
     * level - then the same function can be used for all the various currency fields of an order.
     *
     * @param currencyCode the ISO 4217 currency code to use for formatting
     * @return a function which, given an amount as a BigDecimal, returns the String formatted for display as a currency
     */
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> buildBigDecimalFormatter(@org.jetbrains.annotations.NotNull
    java.lang.String currencyCode) {
        return null;
    }
    
    /**
     * Returns formatted amount with currency symbol - eg. $113.5 for EN/USD or 113,5€ for FR/EUR.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatAmountWithCurrency(double amount, @org.jetbrains.annotations.NotNull
    java.lang.String currencyCode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/util/CurrencyFormatter$Companion;", "", "()V", "BACKOFF_DELAY", "", "BACKOFF_INTENTS", "", "ONE_MILLION", "ONE_THOUSAND", "currencyFormatter", "Ljava/text/DecimalFormat;", "getCurrencyFormatter", "()Ljava/text/DecimalFormat;", "currencyFormatter$delegate", "Lkotlin/Lazy;", "currencyFormatterRounded", "getCurrencyFormatterRounded", "currencyFormatterRounded$delegate", "currencyStringRounded", "", "rawValue", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.text.DecimalFormat getCurrencyFormatter() {
            return null;
        }
        
        private final java.text.DecimalFormat getCurrencyFormatterRounded() {
            return null;
        }
        
        private final java.lang.String currencyStringRounded(double rawValue) {
            return null;
        }
    }
}