package com.woocommerce.android.util;

import java.lang.System;

/**
 * Simplifies using Chrome Custom Tabs
 *
 * - Call connect with an optional URL and optional list of other URLs to preload when the activity starts
 * - Call launchUrl() to actually display the URL
 * - Call disconnect when the activity stops
 *
 * OR
 *
 * - Call launchUrl() by itself to avoid connecting and disconnecting
 *
 * The latter is recommended when it's not necessary to pre-load any URLs (Google recommends
 * preloading only when there's at least a 50% chance users will visit the URL). Note that
 * when passing a list of other likely URLs, they should be ordered in descending priority
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J1\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/util/ChromeCustomTabUtils;", "", "()V", "CUSTOM_TAB_PACKAGE_NAME_STABLE", "", "canUseCustomTabs", "", "Ljava/lang/Boolean;", "connection", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "session", "Landroidx/browser/customtabs/CustomTabsSession;", "context", "Landroid/content/Context;", "connect", "preloadUrl", "otherLikelyUrls", "", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)Z", "createIntent", "Landroidx/browser/customtabs/CustomTabsIntent;", "tabSession", "disconnect", "", "launchUrl", "url", "WooCommerce_wasabiDebug"})
public final class ChromeCustomTabUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.ChromeCustomTabUtils INSTANCE = null;
    private static final java.lang.String CUSTOM_TAB_PACKAGE_NAME_STABLE = "com.android.chrome";
    private static androidx.browser.customtabs.CustomTabsSession session;
    private static androidx.browser.customtabs.CustomTabsServiceConnection connection;
    private static java.lang.Boolean canUseCustomTabs;
    
    private ChromeCustomTabUtils() {
        super();
    }
    
    public final boolean connect(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String preloadUrl, @org.jetbrains.annotations.Nullable
    java.lang.String[] otherLikelyUrls) {
        return false;
    }
    
    public final void disconnect(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void launchUrl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    private final androidx.browser.customtabs.CustomTabsIntent createIntent(android.content.Context context, androidx.browser.customtabs.CustomTabsSession tabSession) {
        return null;
    }
    
    /**
     * Adapted from https://github.com/GoogleChrome/custom-tabs-client/blob/master/shared/src/main/java/org/
     * chromium/customtabsclient/shared/CustomTabsHelper.java
     */
    private final boolean canUseCustomTabs(android.content.Context context) {
        return false;
    }
}