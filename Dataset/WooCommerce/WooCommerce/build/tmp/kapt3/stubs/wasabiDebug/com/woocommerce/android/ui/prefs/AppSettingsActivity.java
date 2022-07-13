package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0012\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020+H\u0014J\u0010\u00104\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000fH\u0016J\b\u00105\u001a\u00020+H\u0016J\b\u00106\u001a\u00020+H\u0014J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u000202H\u0014J\b\u00109\u001a\u00020\u000fH\u0016R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$AppSettingsListener;", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$View;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "binding", "Lcom/woocommerce/android/databinding/ActivityAppSettingsBinding;", "isBetaOptionChanged", "", "notificationMessageHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "getNotificationMessageHandler", "()Lcom/woocommerce/android/push/NotificationMessageHandler;", "setNotificationMessageHandler", "(Lcom/woocommerce/android/push/NotificationMessageHandler;)V", "prefs", "Lcom/woocommerce/android/AppPrefs;", "getPrefs", "()Lcom/woocommerce/android/AppPrefs;", "setPrefs", "(Lcom/woocommerce/android/AppPrefs;)V", "presenter", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;", "getPresenter", "()Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;", "setPresenter", "(Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;)V", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "getSelectedSite", "()Lcom/woocommerce/android/tools/SelectedSite;", "setSelectedSite", "(Lcom/woocommerce/android/tools/SelectedSite;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "close", "", "confirmLogout", "finishLogout", "onCouponsOptionChanged", "enabled", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onProductAddonsOptionChanged", "onRequestLogout", "onResume", "onSaveInstanceState", "outState", "onSupportNavigateUp", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AppSettingsActivity extends androidx.appcompat.app.AppCompatActivity implements com.woocommerce.android.ui.prefs.MainSettingsFragment.AppSettingsListener, com.woocommerce.android.ui.prefs.AppSettingsContract.View {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.prefs.AppSettingsActivity.Companion Companion = null;
    public static final int RESULT_CODE_BETA_OPTIONS_CHANGED = 2;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BETA_OPTION_CHANGED = "key_beta_option_changed";
    @javax.inject.Inject
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector;
    @javax.inject.Inject
    public com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter presenter;
    @javax.inject.Inject
    public com.woocommerce.android.tools.SelectedSite selectedSite;
    @javax.inject.Inject
    public com.woocommerce.android.AppPrefs prefs;
    @javax.inject.Inject
    public com.woocommerce.android.push.NotificationMessageHandler notificationMessageHandler;
    private boolean isBetaOptionChanged = false;
    private com.woocommerce.android.databinding.ActivityAppSettingsBinding binding;
    private androidx.appcompat.widget.Toolbar toolbar;
    
    public AppSettingsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidInjector() {
        return null;
    }
    
    public final void setAndroidInjector(@org.jetbrains.annotations.NotNull
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.SelectedSite getSelectedSite() {
        return null;
    }
    
    public final void setSelectedSite(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.AppPrefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.NotificationMessageHandler getNotificationMessageHandler() {
        return null;
    }
    
    public final void setNotificationMessageHandler(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.NotificationMessageHandler p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    public void onRequestLogout() {
    }
    
    @java.lang.Override
    public void onProductAddonsOptionChanged(boolean enabled) {
    }
    
    @java.lang.Override
    public void onCouponsOptionChanged(boolean enabled) {
    }
    
    @java.lang.Override
    public void finishLogout() {
    }
    
    @java.lang.Override
    public void close() {
    }
    
    @java.lang.Override
    public void confirmLogout() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsActivity$Companion;", "", "()V", "KEY_BETA_OPTION_CHANGED", "", "RESULT_CODE_BETA_OPTIONS_CHANGED", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}