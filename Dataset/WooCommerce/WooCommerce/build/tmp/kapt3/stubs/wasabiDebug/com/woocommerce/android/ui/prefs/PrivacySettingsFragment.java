package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$View;", "()V", "presenter", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;", "getPresenter", "()Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;", "setPresenter", "(Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;)V", "onDestroyView", "", "onResume", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showCookiePolicy", "showPrivacyPolicy", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class PrivacySettingsFragment extends androidx.fragment.app.Fragment implements com.woocommerce.android.ui.prefs.PrivacySettingsContract.View {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.prefs.PrivacySettingsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "privacy-settings";
    @javax.inject.Inject
    public com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter presenter;
    
    public PrivacySettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void showCookiePolicy() {
    }
    
    @java.lang.Override
    public void showPrivacyPolicy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsFragment$Companion;", "", "()V", "TAG", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}