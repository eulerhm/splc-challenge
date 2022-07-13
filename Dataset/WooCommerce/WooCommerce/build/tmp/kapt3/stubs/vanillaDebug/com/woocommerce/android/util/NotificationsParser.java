package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/util/NotificationsParser;", "", "base64Decoder", "Lcom/woocommerce/android/util/Base64Decoder;", "(Lcom/woocommerce/android/util/Base64Decoder;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "buildNotificationModelFromPayloadMap", "Lorg/wordpress/android/fluxc/model/notification/NotificationModel;", "dataMap", "", "", "getNotificationJsonFromBase64EncodedData", "Lcom/google/gson/JsonObject;", "base64FullNoteData", "Companion", "WooCommerce_vanillaDebug"})
public final class NotificationsParser {
    private final com.woocommerce.android.util.Base64Decoder base64Decoder = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.NotificationsParser.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUSH_ARG_NOTE_FULL_DATA = "note_full_data";
    private static final int MAX_PAYLOAD_SIZE = 4096;
    private final kotlin.Lazy gson$delegate = null;
    
    @javax.inject.Inject()
    public NotificationsParser(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.Base64Decoder base64Decoder) {
        super();
    }
    
    private final com.google.gson.Gson getGson() {
        return null;
    }
    
    /**
     * Builds a [NotificationModel] from a push notification payload.
     */
    @org.jetbrains.annotations.Nullable()
    public final org.wordpress.android.fluxc.model.notification.NotificationModel buildNotificationModelFromPayloadMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> dataMap) {
        return null;
    }
    
    /**
     * Takes a base64 encoded string and attempts to decode and parse out the containing notification object.
     */
    @kotlin.jvm.Synchronized()
    private final synchronized com.google.gson.JsonObject getNotificationJsonFromBase64EncodedData(java.lang.String base64FullNoteData) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/util/NotificationsParser$Companion;", "", "()V", "MAX_PAYLOAD_SIZE", "", "PUSH_ARG_NOTE_FULL_DATA", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}