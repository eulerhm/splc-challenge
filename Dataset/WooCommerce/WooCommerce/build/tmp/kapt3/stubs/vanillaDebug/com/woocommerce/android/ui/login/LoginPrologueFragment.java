package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginPrologueFragment;", "Landroidx/fragment/app/Fragment;", "()V", "prologueFinishedListener", "Lcom/woocommerce/android/ui/login/LoginPrologueFragment$PrologueFinishedListener;", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "getUnifiedLoginTracker", "()Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "setUnifiedLoginTracker", "(Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;)V", "onAttach", "", "context", "Landroid/content/Context;", "onDetach", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PrologueFinishedListener", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginPrologueFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.login.LoginPrologueFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "login-prologue-fragment";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker;
    private com.woocommerce.android.ui.login.LoginPrologueFragment.PrologueFinishedListener prologueFinishedListener;
    
    public LoginPrologueFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker getUnifiedLoginTracker() {
        return null;
    }
    
    public final void setUnifiedLoginTracker(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.login.UnifiedLoginTracker p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginPrologueFragment$PrologueFinishedListener;", "", "onPrimaryButtonClicked", "", "onSecondaryButtonClicked", "WooCommerce_vanillaDebug"})
    public static abstract interface PrologueFinishedListener {
        
        public abstract void onPrimaryButtonClicked();
        
        public abstract void onSecondaryButtonClicked();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginPrologueFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lcom/woocommerce/android/ui/login/LoginPrologueFragment;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.login.LoginPrologueFragment newInstance() {
            return null;
        }
    }
}