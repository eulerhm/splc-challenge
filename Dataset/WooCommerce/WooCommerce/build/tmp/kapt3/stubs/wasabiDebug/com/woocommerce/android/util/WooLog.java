package com.woocommerce.android.util;

import java.lang.System;

/**
 * Simple wrapper for Android log calls, enables registering listeners for log events.
 *
 * Simplified version of [org.wordpress.android.util.AppLog].
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002&\'B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\u001e\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004J \u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001fH\u0002J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\b\u0010#\u001a\u00020\u0006H\u0016J\u0016\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006J\u0016\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/util/WooLog;", "", "()V", "MAX_ENTRIES", "", "TAG", "", "logEntries", "Lcom/woocommerce/android/util/RollingLogEntries;", "getLogEntries", "()Lcom/woocommerce/android/util/RollingLogEntries;", "addDeviceInfoEntry", "", "tag", "Lcom/woocommerce/android/util/WooLog$T;", "level", "Lcom/woocommerce/android/util/WooLog$LogLevel;", "addEntry", "text", "addWPLogEntry", "wpTag", "Lorg/wordpress/android/util/AppLog$T;", "wpLogLevel", "Lorg/wordpress/android/util/AppLog$LogLevel;", "wpMessage", "d", "message", "e", "volleyErrorMsg", "statusCode", "tr", "", "getStringStackTrace", "throwable", "i", "toString", "v", "w", "LogLevel", "T", "WooCommerce_wasabiDebug"})
public final class WooLog {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.WooLog INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "WooCommerce";
    private static final int MAX_ENTRIES = 99;
    @org.jetbrains.annotations.NotNull
    private static final com.woocommerce.android.util.RollingLogEntries logEntries = null;
    
    private WooLog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.RollingLogEntries getLogEntries() {
        return null;
    }
    
    private final void addWPLogEntry(org.wordpress.android.util.AppLog.T wpTag, org.wordpress.android.util.AppLog.LogLevel wpLogLevel, java.lang.String wpMessage) {
    }
    
    /**
     * Sends a VERBOSE log message
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     */
    public final void v(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Sends a DEBUG log message
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     */
    public final void d(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Sends a INFO log message
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     */
    public final void i(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Sends a WARN log message
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     */
    public final void w(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Sends a ERROR log message
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     */
    public final void e(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Send a ERROR log message and log the exception.
     * @param tag Used to identify the source of a log message.
     * It usually identifies the class or activity where the log call occurs.
     * @param message The message you would like logged.
     * @param tr An exception to log
     */
    public final void e(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable tr) {
    }
    
    /**
     * Sends a ERROR log message and the exception with StackTrace
     * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the
     * log call occurs.
     * @param tr An exception to log to get StackTrace
     */
    public final void e(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.Throwable tr) {
    }
    
    /**
     * Sends a ERROR log message
     * @param tag Used to identify the source of a log message. It usually identifies the class or activity where the
     * log call occurs.
     * @param volleyErrorMsg
     * @param statusCode
     */
    public final void e(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    java.lang.String volleyErrorMsg, int statusCode) {
    }
    
    private final void addEntry(com.woocommerce.android.util.WooLog.T tag, com.woocommerce.android.util.WooLog.LogLevel level, java.lang.String text) {
    }
    
    public final void addDeviceInfoEntry(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.LogLevel level) {
    }
    
    private final java.lang.String getStringStackTrace(java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/util/WooLog$T;", "", "(Ljava/lang/String;I)V", "DASHBOARD", "ORDERS", "PRODUCTS", "NOTIFS", "UTILS", "DEVICE", "SUPPORT", "WP", "NOTIFICATIONS", "LOGIN", "REVIEWS", "MEDIA", "CARD_READER", "SITE_PICKER", "COUPONS", "WooCommerce_wasabiDebug"})
    public static enum T {
        /*public static final*/ DASHBOARD /* = new DASHBOARD() */,
        /*public static final*/ ORDERS /* = new ORDERS() */,
        /*public static final*/ PRODUCTS /* = new PRODUCTS() */,
        /*public static final*/ NOTIFS /* = new NOTIFS() */,
        /*public static final*/ UTILS /* = new UTILS() */,
        /*public static final*/ DEVICE /* = new DEVICE() */,
        /*public static final*/ SUPPORT /* = new SUPPORT() */,
        /*public static final*/ WP /* = new WP() */,
        /*public static final*/ NOTIFICATIONS /* = new NOTIFICATIONS() */,
        /*public static final*/ LOGIN /* = new LOGIN() */,
        /*public static final*/ REVIEWS /* = new REVIEWS() */,
        /*public static final*/ MEDIA /* = new MEDIA() */,
        /*public static final*/ CARD_READER /* = new CARD_READER() */,
        /*public static final*/ SITE_PICKER /* = new SITE_PICKER() */,
        /*public static final*/ COUPONS /* = new COUPONS() */;
        
        T() {
        }
    }
    
    @kotlin.Suppress(names = {"EnumEntryName"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/util/WooLog$LogLevel;", "", "(Ljava/lang/String;I)V", "v", "d", "i", "w", "e", "WooCommerce_wasabiDebug"})
    public static enum LogLevel {
        /*public static final*/ v /* = new v() */,
        /*public static final*/ d /* = new d() */,
        /*public static final*/ i /* = new i() */,
        /*public static final*/ w /* = new w() */,
        /*public static final*/ e /* = new e() */;
        
        LogLevel() {
        }
    }
}