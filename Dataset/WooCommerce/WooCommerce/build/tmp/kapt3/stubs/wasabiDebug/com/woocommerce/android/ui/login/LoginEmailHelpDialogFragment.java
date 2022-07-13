package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "analyticsListener", "Lorg/wordpress/android/login/LoginAnalyticsListener;", "getAnalyticsListener", "()Lorg/wordpress/android/login/LoginAnalyticsListener;", "setAnalyticsListener", "(Lorg/wordpress/android/login/LoginAnalyticsListener;)V", "listener", "Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Listener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "", "onResume", "onStart", "Companion", "Listener", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class LoginEmailHelpDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "LoginEmailHelpDialogFragment";
    private com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment.Listener listener;
    @javax.inject.Inject
    public org.wordpress.android.login.LoginAnalyticsListener analyticsListener;
    
    public LoginEmailHelpDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.login.LoginAnalyticsListener getAnalyticsListener() {
        return null;
    }
    
    public final void setAnalyticsListener(@org.jetbrains.annotations.NotNull
    org.wordpress.android.login.LoginAnalyticsListener p0) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onDetach() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Listener;", "", "onEmailNeedMoreHelpClicked", "", "WooCommerce_wasabiDebug"})
    public static abstract interface Listener {
        
        public abstract void onEmailNeedMoreHelpClicked();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment;", "listener", "Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Listener;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment newInstance(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment.Listener listener) {
            return null;
        }
    }
}