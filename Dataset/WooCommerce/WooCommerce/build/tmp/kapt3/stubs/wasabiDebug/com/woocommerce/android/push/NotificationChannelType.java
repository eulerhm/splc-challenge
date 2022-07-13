package com.woocommerce.android.push;

import java.lang.System;

/**
 * Note that we have separate notification channels for orders with and without the cha-ching sound - this is
 * necessary because once a channel is created we can't change it, and if we delete the channel and re-create
 * it then it will be re-created with the same settings it previously had (ie: we can't simply have a single
 * channel for orders and add/remove the sound from it)
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/push/NotificationChannelType;", "", "(Ljava/lang/String;I)V", "NEW_ORDER", "REVIEW", "OTHER", "WooCommerce_wasabiDebug"})
public enum NotificationChannelType {
    /*public static final*/ NEW_ORDER /* = new NEW_ORDER() */,
    /*public static final*/ REVIEW /* = new REVIEW() */,
    /*public static final*/ OTHER /* = new OTHER() */;
    
    NotificationChannelType() {
    }
}