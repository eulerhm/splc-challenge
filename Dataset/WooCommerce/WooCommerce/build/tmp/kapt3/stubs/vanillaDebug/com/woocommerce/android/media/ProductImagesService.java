package com.woocommerce.android.media;

import java.lang.System;

/**
 * Service which uploads device images to the WP media library to be later assigned to a product
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/media/ProductImagesService;", "Landroid/app/Service;", "()V", "notifHandler", "Lcom/woocommerce/android/media/ProductImagesNotificationHandler;", "getNotifHandler", "()Lcom/woocommerce/android/media/ProductImagesNotificationHandler;", "setNotifHandler", "(Lcom/woocommerce/android/media/ProductImagesNotificationHandler;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onDestroy", "", "onStartCommand", "", "flags", "startId", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductImagesService extends android.app.Service {
    @javax.inject.Inject()
    public com.woocommerce.android.media.ProductImagesNotificationHandler notifHandler;
    
    public ProductImagesService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.media.ProductImagesNotificationHandler getNotifHandler() {
        return null;
    }
    
    public final void setNotifHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.media.ProductImagesNotificationHandler p0) {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
}