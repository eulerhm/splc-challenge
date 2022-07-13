package com.woocommerce.android.network;

import java.lang.System;

/**
 * Global network connection change receiver - The implementing Application must register this receiver in either it's
 * Application class (if it wants to manage connectivity status globally) or inside the activity that wishes to
 * monitor connectivity.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/network/ConnectionChangeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "ConnectionChangeEvent", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class ConnectionChangeReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.network.ConnectionChangeReceiver.Companion Companion = null;
    private static boolean isFirstReceive = true;
    private static boolean wasConnected = true;
    
    @javax.inject.Inject()
    public ConnectionChangeReceiver() {
        super();
    }
    
    /**
     * Listens for device connection changes.
     *
     * This method is called whenever something about the device connection has changed, not just
     * it's network connectivity. Only dispatch a [ConnectionChangeEvent] event
     * when connection availability has changed.
     */
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/network/ConnectionChangeReceiver$ConnectionChangeEvent;", "", "isConnected", "", "(Z)V", "()Z", "setConnected", "WooCommerce_vanillaDebug"})
    public static final class ConnectionChangeEvent {
        private boolean isConnected;
        
        public ConnectionChangeEvent(boolean isConnected) {
            super();
        }
        
        public final boolean isConnected() {
            return false;
        }
        
        public final void setConnected(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/network/ConnectionChangeReceiver$Companion;", "", "()V", "isFirstReceive", "", "wasConnected", "getEventBus", "Lorg/greenrobot/eventbus/EventBus;", "kotlin.jvm.PlatformType", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final org.greenrobot.eventbus.EventBus getEventBus() {
            return null;
        }
    }
}