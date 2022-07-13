package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\rJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/util/WooPermissionUtils;", "", "()V", "androidROrLower", "", "hasBluetoothConnectPermission", "context", "Landroid/content/Context;", "hasBluetoothScanPermission", "hasFineLocationPermission", "requestFineLocationPermission", "", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "requestScanAndConnectBluetoothPermission", "launcher", "", "shouldShowFineLocationPermissionRationale", "activity", "Landroid/app/Activity;", "showAppSettings", "openInNewStack", "checkIfPermissionGiven", "permission", "WooCommerce_vanillaDebug"})
public final class WooPermissionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.WooPermissionUtils INSTANCE = null;
    
    private WooPermissionUtils() {
        super();
    }
    
    public final void showAppSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean openInNewStack) {
    }
    
    public final boolean hasFineLocationPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean shouldShowFineLocationPermissionRationale(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
    
    public final boolean hasBluetoothScanPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean hasBluetoothConnectPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void requestFineLocationPermission(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher) {
    }
    
    public final void requestScanAndConnectBluetoothPermission(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<java.lang.String[]> launcher) {
    }
    
    private final boolean checkIfPermissionGiven(android.content.Context $this$checkIfPermissionGiven, java.lang.String permission) {
        return false;
    }
    
    private final boolean androidROrLower() {
        return false;
    }
}