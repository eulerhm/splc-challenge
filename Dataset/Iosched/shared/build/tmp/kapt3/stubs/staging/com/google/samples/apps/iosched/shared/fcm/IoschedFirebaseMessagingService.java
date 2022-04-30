package com.google.samples.apps.iosched.shared.fcm;

import java.lang.System;

/**
 * Receives Firebase Cloud Messages and starts a [ConferenceDataService] to download new data.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/fcm/IoschedFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "scheduleFetchEventData", "Companion", "shared_staging"})
public final class IoschedFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final java.lang.String TRIGGER_EVENT_DATA_SYNC = "SYNC_EVENT_DATA";
    private static final java.lang.String TRIGGER_EVENT_DATA_SYNC_key = "action";
    private static final long MINIMUM_LATENCY = 0L;
    private static final long OVERRIDE_DEADLINE = 0L;
    public static final com.google.samples.apps.iosched.shared.fcm.IoschedFirebaseMessagingService.Companion Companion = null;
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void scheduleFetchEventData() {
    }
    
    public IoschedFirebaseMessagingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/fcm/IoschedFirebaseMessagingService$Companion;", "", "()V", "MINIMUM_LATENCY", "", "OVERRIDE_DEADLINE", "TRIGGER_EVENT_DATA_SYNC", "", "TRIGGER_EVENT_DATA_SYNC_key", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}