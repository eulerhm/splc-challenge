package com.woocommerce.android.util;

import java.lang.System;

/**
 * Helper class for working with Android Dark and Light Themes
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/util/AppThemeUtils;", "", "()V", "isDarkThemeActive", "", "activity", "Landroid/app/Activity;", "setAppTheme", "", "newTheme", "Lcom/woocommerce/android/util/ThemeOption;", "WooCommerce_vanillaDebug"})
public final class AppThemeUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.AppThemeUtils INSTANCE = null;
    
    private AppThemeUtils() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    public final void setAppTheme(@org.jetbrains.annotations.Nullable()
    com.woocommerce.android.util.ThemeOption newTheme) {
    }
    
    public final boolean isDarkThemeActive(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
}