package com.woocommerce.android.media;

import java.lang.System;

/**
 * Shows the standard uploading arrow animated notification icon to signify that images are being uploaded
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cJ\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0016\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/media/ProductImagesNotificationHandler;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "notificationManager", "Landroid/app/NotificationManager;", "attachToService", "", "service", "Lcom/woocommerce/android/media/ProductImagesService;", "createChannel", "getProductDetailsIntent", "Landroid/app/PendingIntent;", "productId", "", "postUpdateFailureNotification", "product", "Lcom/woocommerce/android/model/Product;", "postUpdateSuccessNotification", "imagesCount", "", "postUploadFailureNotification", "errors", "", "Lcom/woocommerce/android/ui/media/MediaFileUploadHandler$ProductImageUploadData;", "removeForegroundNotification", "removeUploadFailureNotification", "setProgress", "progress", "", "showUpdatingProductNotification", "update", "currentUpload", "totalUploads", "Companion", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class ProductImagesNotificationHandler {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.media.ProductImagesNotificationHandler.Companion Companion = null;
    private static final java.lang.String CHANNEL_ID = "image_upload_channel";
    private static final int FOREGROUND_NOTIFICATION_ID = 1;
    private static final int PRODUCT_UPDATE_NOTIFICATION_ID = 2;
    private static final int UPLOAD_FAILURE_NOTIFICATION_ID = 3;
    private final android.app.NotificationManager notificationManager = null;
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder = null;
    
    @javax.inject.Inject
    public ProductImagesNotificationHandler(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void attachToService(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.media.ProductImagesService service) {
    }
    
    public final void update(int currentUpload, int totalUploads) {
    }
    
    public final void setProgress(float progress) {
    }
    
    public final void showUpdatingProductNotification(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product product) {
    }
    
    public final void postUpdateSuccessNotification(long productId, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Product product, int imagesCount) {
    }
    
    public final void postUpdateFailureNotification(long productId, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product product) {
    }
    
    public final void postUploadFailureNotification(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.media.MediaFileUploadHandler.ProductImageUploadData> errors) {
    }
    
    public final void removeUploadFailureNotification(long productId) {
    }
    
    private final android.app.PendingIntent getProductDetailsIntent(long productId) {
        return null;
    }
    
    /**
     * Ensures the notification channel for image uploads is created - only required for Android O+
     */
    private final void createChannel() {
    }
    
    public final void removeForegroundNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesNotificationHandler$Companion;", "", "()V", "CHANNEL_ID", "", "FOREGROUND_NOTIFICATION_ID", "", "PRODUCT_UPDATE_NOTIFICATION_ID", "UPLOAD_FAILURE_NOTIFICATION_ID", "calculateProductUpdateNotificationId", "productId", "", "calculateUploadFailureNotificationId", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final int calculateProductUpdateNotificationId(long productId) {
            return 0;
        }
        
        private final int calculateUploadFailureNotificationId(long productId) {
            return 0;
        }
    }
}