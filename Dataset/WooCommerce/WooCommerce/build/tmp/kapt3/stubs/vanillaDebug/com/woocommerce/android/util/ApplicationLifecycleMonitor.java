package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/util/ApplicationLifecycleMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/ComponentCallbacks2;", "lifecycleListener", "Lcom/woocommerce/android/util/ApplicationLifecycleMonitor$ApplicationLifecycleListener;", "(Lcom/woocommerce/android/util/ApplicationLifecycleMonitor$ApplicationLifecycleListener;)V", "firstActivityResumed", "", "lastState", "Lcom/woocommerce/android/util/ApplicationLifecycleMonitor$LastApplicationState;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "p1", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "bundle", "onActivityStarted", "onActivityStopped", "onConfigurationChanged", "configuration", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "ApplicationLifecycleListener", "LastApplicationState", "WooCommerce_vanillaDebug"})
public final class ApplicationLifecycleMonitor implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private final com.woocommerce.android.util.ApplicationLifecycleMonitor.ApplicationLifecycleListener lifecycleListener = null;
    private com.woocommerce.android.util.ApplicationLifecycleMonitor.LastApplicationState lastState = com.woocommerce.android.util.ApplicationLifecycleMonitor.LastApplicationState.BACKGROUND;
    private boolean firstActivityResumed = true;
    
    public ApplicationLifecycleMonitor(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.ApplicationLifecycleMonitor.ApplicationLifecycleListener lifecycleListener) {
        super();
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle p1) {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration configuration) {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/util/ApplicationLifecycleMonitor$ApplicationLifecycleListener;", "", "onAppComesFromBackground", "", "onAppGoesToBackground", "onFirstActivityResumed", "WooCommerce_vanillaDebug"})
    public static abstract interface ApplicationLifecycleListener {
        
        public abstract void onAppComesFromBackground();
        
        public abstract void onFirstActivityResumed();
        
        public abstract void onAppGoesToBackground();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/util/ApplicationLifecycleMonitor$LastApplicationState;", "", "(Ljava/lang/String;I)V", "BACKGROUND", "FOREGROUND", "WooCommerce_vanillaDebug"})
    static enum LastApplicationState {
        /*public static final*/ BACKGROUND /* = new BACKGROUND() */,
        /*public static final*/ FOREGROUND /* = new FOREGROUND() */;
        
        LastApplicationState() {
        }
    }
}