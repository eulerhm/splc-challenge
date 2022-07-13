package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\u000fH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\'\u001a\u00020\u000fJ\u001e\u0010(\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010)\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/push/WooNotificationBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildAndDisplayWooGroupNotification", "", "channelId", "", "inboxMessage", "subject", "summaryText", "notification", "Lcom/woocommerce/android/model/Notification;", "shouldDisplaySummaryText", "", "buildAndDisplayWooNotification", "pushId", "", "defaults", "addCustomNotificationSound", "isGroupNotification", "buildAndDisplayZendeskNotification", "cancelAllNotifications", "cancelNotification", "createNotificationChannel", "channelName", "addChaChingSound", "createNotificationChannels", "getChaChingUri", "Landroid/net/Uri;", "getLargeIconBitmap", "Landroid/graphics/Bitmap;", "iconUrl", "shouldCircularizeIcon", "getNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "getResultIntent", "Landroid/content/Intent;", "isNotificationsEnabled", "showNotification", "builder", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class WooNotificationBuilder {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public WooNotificationBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean isNotificationsEnabled() {
        return false;
    }
    
    public final void cancelNotification(int pushId) {
    }
    
    public final void cancelAllNotifications() {
    }
    
    private final androidx.core.app.NotificationCompat.Builder getNotificationBuilder(java.lang.String channelId, com.woocommerce.android.model.Notification notification) {
        return null;
    }
    
    private final android.content.Intent getResultIntent(int pushId, com.woocommerce.android.model.Notification notification) {
        return null;
    }
    
    public final void buildAndDisplayZendeskNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Notification notification) {
    }
    
    public final void buildAndDisplayWooNotification(int pushId, int defaults, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Notification notification, boolean addCustomNotificationSound, boolean isGroupNotification) {
    }
    
    public final void buildAndDisplayWooGroupNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.lang.String inboxMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String summaryText, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Notification notification, boolean shouldDisplaySummaryText) {
    }
    
    public final void showNotification(int pushId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Notification notification, @org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder) {
    }
    
    public final void createNotificationChannels() {
    }
    
    /**
     * Ensures the desired notification channel is created when on API 26+, does nothing otherwise since notification
     * channels weren't added until API 26
     */
    private final void createNotificationChannel(java.lang.String channelId, java.lang.String channelName, boolean addChaChingSound) {
    }
    
    private final android.net.Uri getChaChingUri() {
        return null;
    }
    
    private final android.graphics.Bitmap getLargeIconBitmap(android.content.Context context, java.lang.String iconUrl, boolean shouldCircularizeIcon) {
        return null;
    }
}