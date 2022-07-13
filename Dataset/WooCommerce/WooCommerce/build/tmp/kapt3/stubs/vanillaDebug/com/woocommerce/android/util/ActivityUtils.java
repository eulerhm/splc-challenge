package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/util/ActivityUtils;", "", "()V", "composeEmail", "", "activity", "Landroid/app/Activity;", "billingEmail", "", "subject", "Lcom/woocommerce/android/model/UiString;", "content", "isEmailClientAvailable", "context", "Landroid/content/Context;", "openEmailClient", "", "openUrlExternal", "url", "previewPDFFile", "file", "Ljava/io/File;", "shareStoreUrl", "WooCommerce_vanillaDebug"})
public final class ActivityUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.ActivityUtils INSTANCE = null;
    
    private ActivityUtils() {
        super();
    }
    
    public final boolean isEmailClientAvailable(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return false;
    }
    
    public final void openEmailClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Use this only when you want to open the external browser - otherwise use
     * [ChromeCustomTabUtils.launchUrl] to provide a better in-app experience
     */
    public final void openUrlExternal(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public final void previewPDFFile(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    public final boolean composeEmail(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String billingEmail, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiString subject, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiString content) {
        return false;
    }
    
    public final void shareStoreUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
}