package com.woocommerce.android.push;

import java.lang.System;

/**
 * A dummy implementation of the FCMMessageService.
 * This is needed to avoid a race condition between Hilt's test initialization, and the injection
 * done by @AndroidEntryPoint in the service when receiving a new token.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/push/FCMMessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "WooCommerce_vanillaDebug"})
public final class FCMMessageService extends com.google.firebase.messaging.FirebaseMessagingService {
    
    public FCMMessageService() {
        super();
    }
}