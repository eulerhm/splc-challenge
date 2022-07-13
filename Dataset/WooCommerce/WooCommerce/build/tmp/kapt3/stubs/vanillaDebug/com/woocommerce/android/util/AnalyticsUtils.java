package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/util/AnalyticsUtils;", "", "()V", "getConfirmationResultLabel", "", "isPositive", "", "getToggleStateLabel", "isSelected", "WooCommerce_vanillaDebug"})
public final class AnalyticsUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.AnalyticsUtils INSTANCE = null;
    
    private AnalyticsUtils() {
        super();
    }
    
    /**
     * Returns the proper label for a toggle state property
     * on a track event.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToggleStateLabel(boolean isSelected) {
        return null;
    }
    
    /**
     * Returns the proper label for the confirmation dialog result property on a
     * track event.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConfirmationResultLabel(boolean isPositive) {
        return null;
    }
}