package com.woocommerce.android.util;

import java.lang.System;

/**
 * "Feature flags" are used to hide in-progress features from release versions
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/util/FeatureFlag;", "", "(Ljava/lang/String;I)V", "isEnabled", "", "context", "Landroid/content/Context;", "DB_DOWNGRADE", "JETPACK_CP", "ANALYTICS_HUB", "IN_PERSON_PAYMENTS_CANADA", "MORE_MENU_INBOX", "COUPONS_M2", "IPP_SELECT_PAYMENT_GATEWAY", "WC_SHIPPING_BANNER", "UNIFIED_ORDER_EDITING", "WooCommerce_vanillaDebug"})
public enum FeatureFlag {
    /*public static final*/ DB_DOWNGRADE /* = new DB_DOWNGRADE() */,
    /*public static final*/ JETPACK_CP /* = new JETPACK_CP() */,
    /*public static final*/ ANALYTICS_HUB /* = new ANALYTICS_HUB() */,
    /*public static final*/ IN_PERSON_PAYMENTS_CANADA /* = new IN_PERSON_PAYMENTS_CANADA() */,
    /*public static final*/ MORE_MENU_INBOX /* = new MORE_MENU_INBOX() */,
    /*public static final*/ COUPONS_M2 /* = new COUPONS_M2() */,
    /*public static final*/ IPP_SELECT_PAYMENT_GATEWAY /* = new IPP_SELECT_PAYMENT_GATEWAY() */,
    /*public static final*/ WC_SHIPPING_BANNER /* = new WC_SHIPPING_BANNER() */,
    /*public static final*/ UNIFIED_ORDER_EDITING /* = new UNIFIED_ORDER_EDITING() */;
    
    FeatureFlag() {
    }
    
    public final boolean isEnabled(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
}