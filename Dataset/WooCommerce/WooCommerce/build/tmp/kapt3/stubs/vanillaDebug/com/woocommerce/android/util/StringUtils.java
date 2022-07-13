package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J=\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u001cJ=\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u001fJ7\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&J&\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0004J \u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0004J\u0010\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0004J\u0010\u0010.\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/util/StringUtils;", "", "()V", "A8C", "", "AUTOMATTIC", "EMPTY", "ONE_MILLION", "", "ONE_THOUSAND", "formatCount", "number", "formatCountDecimal", "", "forInput", "", "fromHtml", "Landroid/text/Spanned;", "htmlStr", "getCountryByCountryCode", "context", "Landroid/content/Context;", "storeCountry", "getQuantityString", "quantity", "default", "zero", "one", "(Landroid/content/Context;IILjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;IILjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "(IILjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "getRawFileUrl", "rawId", "getRawTextFromHtml", "getSiteDomainAndPath", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "getStringArrayByLocale", "", "id", "locale", "getStringByLocale", "isA8cEmail", "email", "isValidEmail", "WooCommerce_vanillaDebug"})
public final class StringUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.StringUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPTY = "";
    private static final int ONE_MILLION = 1000000;
    private static final int ONE_THOUSAND = 1000;
    private static final java.lang.String A8C = "@a8c.com";
    private static final java.lang.String AUTOMATTIC = "@automattic.com";
    
    private StringUtils() {
        super();
    }
    
    /**
     * Borrowed and modified from WordPress-Android :)
     *
     * Formats the string for the given [quantity], using the given params.
     * We need this because our translation platform doesn't support Android plurals.
     *
     * If a string resource is not provided for [zero] or [one] the [default] resource will be used.
     *
     * @param [quantity] The number used to pick the correct string
     * @param [default] The desired string identifier to get when [quantity] is not (0 or 1)
     * @param [zero] Optional. The desired string identifier to use when [quantity] is exactly 0.
     * @param [one] Optional. The desired string identifier to use when the [quantity] is exactly 1
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantityString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int quantity, @androidx.annotation.StringRes()
    int p2_772401952, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer zero, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer one) {
        return null;
    }
    
    /**
     * Borrowed and modified from WordPress-Android :)
     *
     * Formats the string for the given [quantity], using the given params.
     * We need this because our translation platform doesn't support Android plurals.
     *
     * This variant uses a [ResourceProvider]
     *
     * If a string resource is not provided for [zero] or [one] the [default] resource will be used.
     *
     * @param [resourceProvider] The string resources provider
     * @param [quantity] The number used to pick the correct string
     * @param [default] The desired string identifier to get when [quantity] is not (0 or 1)
     * @param [zero] Optional. The desired string identifier to use when [quantity] is exactly 0.
     * @param [one] Optional. The desired string identifier to use when the [quantity] is exactly 1
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantityString(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, int quantity, @androidx.annotation.StringRes()
    int p2_772401952, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer zero, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer one) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public final java.lang.String getQuantityString(int quantity, @androidx.annotation.StringRes()
    int p1_772401952, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer zero, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer one) {
        return null;
    }
    
    /**
     * Similar to UrlUtils.getHost() except that it includes the path (subfolder)
     *
     * Ex:
     *     https://baseurl.com -> baseurl.com
     *     https://baseurl.com/mysite -> baseurl.com/mysite
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSiteDomainAndPath(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site) {
        return null;
    }
    
    /**
     * Returns true if the passed string is a valid email address
     */
    public final boolean isValidEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return false;
    }
    
    /**
     * Returns true if the passed string is an Automattic/A8c email
     */
    public final boolean isA8cEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return false;
    }
    
    /**
     * Returns the passed number formatted as a count
     * ex:
     * formatCount(200) -> 200
     * formatCount(2000) -> 2k
     * formatCount(20000) -> 20k
     * formatCount(2000000) - > 2m
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatCount(int number) {
        return null;
    }
    
    /**
     * If a number's fractional part is zero, remove it and return as string. Otherwise return as string while
     * including the fractional part.
     * If the number is to be displayed as regular text, `formatInt` is used to display commas/dot for thousands
     * separator (depending on locale).
     * If the number is to be displayed in an editable text input, number.toInt() is used so that the input behavior
     * does not show the thousands separator.
     *
     * @param [number] The number to be formatted
     * @param [forInput] Whether the formatting is used in a text input or not.
     *
     * For eg: for a number = 234560 and forInput = false, returns 234560
     * for a number = 234560 forInput = true, returns 2,34,560
     * for a number = 2.3456 return 2.3456
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatCountDecimal(double number, boolean forInput) {
        return null;
    }
    
    /**
     * Returns the name of the country associated with the current store.
     * @param [storeCountry], if available is in the format US:NY.
     * This method will transform `US:NY` into `United States`
     * by getting the corresponding country name from string.xml for this
     * value: "country_mapping_$countryCode"
     *
     * Will return nil if it can not figure out a valid country name
     * There might be some scenario where the store country is not
     * mapped to a valid country name. In order to avoid potential
     * crashes because of this, logging the exception and returning
     * null
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryByCountryCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String storeCountry) {
        return null;
    }
    
    /**
     * Given a raw HTML file, returns the url for the file
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawFileUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int rawId) {
        return null;
    }
    
    /**
     * Strips HTML tags and newline characters from the provided text and returns the raw text.
     * Newline characters are replaced with a space, and then we replace any instances of
     * double spaces with a single space (just in case)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawTextFromHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String htmlStr) {
        return null;
    }
    
    /**
     * Helper method for using the appropriate `Html.fromHtml()` for the build version.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.NotNull()
    java.lang.String htmlStr) {
        return null;
    }
    
    /**
     * Returns a string for the specified locale.
     *
     * @param context The active context
     * @param id The id of the string (ex. R.string.my_string)
     * @param locale The two-character locale to fetch the string for (ex. "en")
     * @return A string matching the [id] for the [locale] requested, or null if none found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStringByLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String locale) {
        return null;
    }
    
    /**
     * Returns a string array for the specified locale.
     *
     * @param context The active context
     * @param id The id of the string (ex. R.string.my_string)
     * @param locale The two-character locale to fetch the string for (ex. "en")
     * @return A list of strings matching the [id] for the [locale] requested, or null if none found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getStringArrayByLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String locale) {
        return null;
    }
}