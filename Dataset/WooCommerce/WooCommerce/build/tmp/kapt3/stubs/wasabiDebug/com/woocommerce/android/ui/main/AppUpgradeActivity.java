package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\"\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000fH\u0014J\b\u0010\u001f\u001a\u00020\u000fH\u0014J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000fH\u0014J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/main/AppUpgradeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/woocommerce/android/ui/main/AppUpgradeActivityView;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "()V", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateVersionCode", "", "Ljava/lang/Integer;", "inAppUpdateType", "updateFailedActionListener", "Landroid/view/View$OnClickListener;", "updateSuccessActionListener", "checkForAppUpdates", "", "checkForAppUpdates$WooCommerce_wasabiDebug", "handleAppUpdateOnResumed", "handleFlexibleUpdateSuccess", "isAppUpdateFlexible", "", "isAppUpdateImmediate", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onStart", "onStateUpdate", "installState", "Lcom/google/android/play/core/install/InstallState;", "onStop", "requestAppUpdate", "appUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "WooCommerce_wasabiDebug"})
public abstract class AppUpgradeActivity extends androidx.appcompat.app.AppCompatActivity implements com.woocommerce.android.ui.main.AppUpgradeActivityView, com.google.android.play.core.install.InstallStateUpdatedListener {
    private com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager;
    
    /**
     * The type of in app update to display:
     * [AppUpdateType.FLEXIBLE] OR [AppUpdateType.IMMEDIATE]
     */
    private final int inAppUpdateType = 0;
    
    /**
     * The latest app version code that is available for download
     */
    private java.lang.Integer appUpdateVersionCode;
    
    /**
     * Listener that is passed to the calling activity, if the update has failed for some reason.
     * If the user clicks on the Retry button, the update process will be tried again.
     */
    private final android.view.View.OnClickListener updateFailedActionListener = null;
    
    /**
     * Listener that is passed to the calling activity, if the update has succeeded.
     * If the user clicks on the Restart button, the install process will begin and the app
     * will be restarted.
     */
    private final android.view.View.OnClickListener updateSuccessActionListener = null;
    
    public AppUpgradeActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onStateUpdate(@org.jetbrains.annotations.NotNull
    com.google.android.play.core.install.InstallState installState) {
    }
    
    /**
     * Method is called from the child activity to check if there are any app updates pending.
     * This will display either [AppUpdateType.FLEXIBLE] or [AppUpdateType.IMMEDIATE] dialog to the user,
     * if there is a new app update.
     *
     * The reason this is called from the child activity and not from this activity, is to provide control
     * to the calling activity when to display the update dialog.
     *
     * If an update is available and supported, and only if the user has not cancelled the update for this current,
     * the update dialog will be displayed
     */
    public final void checkForAppUpdates$WooCommerce_wasabiDebug() {
    }
    
    /**
     * Method is called from the [onResume] of the activity to check if the update process is
     * started and if so, verify that the UI is updated accordingly
     */
    private final void handleAppUpdateOnResumed() {
    }
    
    private final boolean isAppUpdateImmediate() {
        return false;
    }
    
    private final boolean isAppUpdateFlexible() {
        return false;
    }
    
    private final void requestAppUpdate(com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo) {
    }
    
    private final void handleFlexibleUpdateSuccess() {
    }
}