package com.woocommerce.android.util.crashlogging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/EnqueueSendingEncryptedLogs;", "", "eventBusDispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "wooLogFileProvider", "Lcom/woocommerce/android/util/crashlogging/WooLogFileProvider;", "networkStatus", "Lcom/woocommerce/android/tools/NetworkStatus;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/util/crashlogging/WooLogFileProvider;Lcom/woocommerce/android/tools/NetworkStatus;)V", "invoke", "", "uuid", "", "eventLevel", "Lcom/automattic/android/tracks/crashlogging/EventLevel;", "WooCommerce_wasabiDebug"})
public final class EnqueueSendingEncryptedLogs {
    private final org.wordpress.android.fluxc.Dispatcher eventBusDispatcher = null;
    private final com.woocommerce.android.util.crashlogging.WooLogFileProvider wooLogFileProvider = null;
    private final com.woocommerce.android.tools.NetworkStatus networkStatus = null;
    
    @javax.inject.Inject
    public EnqueueSendingEncryptedLogs(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher eventBusDispatcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.crashlogging.WooLogFileProvider wooLogFileProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.NetworkStatus networkStatus) {
        super();
    }
    
    public final void invoke(@org.jetbrains.annotations.NotNull
    java.lang.String uuid, @org.jetbrains.annotations.NotNull
    com.automattic.android.tracks.crashlogging.EventLevel eventLevel) {
    }
}