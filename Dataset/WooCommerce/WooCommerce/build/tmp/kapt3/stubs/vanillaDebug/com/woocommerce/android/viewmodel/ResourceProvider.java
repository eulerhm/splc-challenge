package com.woocommerce.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006J)\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/viewmodel/ResourceProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getColor", "", "resourceId", "getDimensionPixelSize", "dimen", "getString", "", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "openRawResource", "Ljava/io/InputStream;", "rawId", "WooCommerce_vanillaDebug"})
public final class ResourceProvider {
    private final android.content.Context context = null;
    
    @javax.inject.Inject()
    public ResourceProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int resourceId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@androidx.annotation.StringRes()
    int resourceId, @org.jetbrains.annotations.NotNull()
    java.lang.Object... formatArgs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getStringArray(@androidx.annotation.ArrayRes()
    int resourceId) {
        return null;
    }
    
    public final int getColor(@androidx.annotation.ColorRes()
    int resourceId) {
        return 0;
    }
    
    public final int getDimensionPixelSize(@androidx.annotation.DimenRes()
    int dimen) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.InputStream openRawResource(@androidx.annotation.RawRes()
    int rawId) {
        return null;
    }
}