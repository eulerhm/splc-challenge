package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/util/PackageUtils;", "", "()V", "PACKAGE_VERSION_CODE_DEFAULT", "", "isTesting", "", "Ljava/lang/Boolean;", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "context", "Landroid/content/Context;", "getVersionCode", "getVersionName", "", "isBetaBuild", "isDebugBuild", "isUITesting", "WooCommerce_wasabiDebug"})
public final class PackageUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.PackageUtils INSTANCE = null;
    public static final int PACKAGE_VERSION_CODE_DEFAULT = -1;
    private static java.lang.Boolean isTesting;
    
    private PackageUtils() {
        super();
    }
    
    /**
     * Return true if Debug build. false otherwise.
     */
    public final boolean isDebugBuild() {
        return false;
    }
    
    public final boolean isTesting() {
        return false;
    }
    
    public final boolean isUITesting() {
        return false;
    }
    
    public final boolean isBetaBuild(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    private final android.content.pm.PackageInfo getPackageInfo(android.content.Context context) {
        return null;
    }
    
    /**
     * Return version code, or -1 if it can't be read
     */
    public final int getVersionCode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Return version name, or the string "0" if it can't be read
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersionName(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}