package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginDiscoveryErrorFragment;", "Landroidx/fragment/app/Fragment;", "()V", "errorMessage", "", "Ljava/lang/Integer;", "jetpackLoginListener", "Lcom/woocommerce/android/ui/login/LoginNoJetpackListener;", "loginListener", "Lorg/wordpress/android/login/LoginListener;", "mInputPassword", "", "mInputUsername", "siteAddress", "siteXmlRpcAddress", "unifiedLoginTracker", "Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "getUnifiedLoginTracker$WooCommerce_vanillaDebug", "()Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;", "setUnifiedLoginTracker$WooCommerce_vanillaDebug", "(Lcom/woocommerce/android/ui/login/UnifiedLoginTracker;)V", "userAvatarUrl", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDetach", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginDiscoveryErrorFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.login.LoginDiscoveryErrorFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "LoginDiscoveryErrorFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_SITE_ADDRESS = "SITE-ARG_SITE_ADDRESS";
    private static final java.lang.String ARG_SITE_XMLRPC_ADDRESS = "SITE_XMLRPC_ADDRESS";
    private static final java.lang.String ARG_INPUT_USERNAME = "ARG_INPUT_USERNAME";
    private static final java.lang.String ARG_INPUT_PASSWORD = "ARG_INPUT_PASSWORD";
    private static final java.lang.String ARG_USER_AVATAR_URL = "ARG_USER_AVATAR_URL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ERROR_MESSAGE = "ARG_ERROR_MESSAGE";
    private org.wordpress.android.login.LoginListener loginListener;
    private com.woocommerce.android.ui.login.LoginNoJetpackListener jetpackLoginListener;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.login.UnifiedLoginTracker unifiedLoginTracker;
    private java.lang.Integer errorMessage;
    private java.lang.String siteAddress;
    private java.lang.String siteXmlRpcAddress;
    private java.lang.String mInputUsername;
    private java.lang.String mInputPassword;
    private java.lang.String userAvatarUrl;
    
    public LoginDiscoveryErrorFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.login.UnifiedLoginTracker getUnifiedLoginTracker$WooCommerce_vanillaDebug() {
        return null;
    }
    
    public final void setUnifiedLoginTracker$WooCommerce_vanillaDebug(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.login.UnifiedLoginTracker p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginDiscoveryErrorFragment$Companion;", "", "()V", "ARG_ERROR_MESSAGE", "", "ARG_INPUT_PASSWORD", "ARG_INPUT_USERNAME", "ARG_SITE_ADDRESS", "ARG_SITE_XMLRPC_ADDRESS", "ARG_USER_AVATAR_URL", "TAG", "newInstance", "Lcom/woocommerce/android/ui/login/LoginDiscoveryErrorFragment;", "siteAddress", "endpointAddress", "inputUsername", "inputPassword", "userAvatarUrl", "errorMessage", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"LongParameterList"})
        public final com.woocommerce.android.ui.login.LoginDiscoveryErrorFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String siteAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String endpointAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String inputUsername, @org.jetbrains.annotations.NotNull()
        java.lang.String inputPassword, @org.jetbrains.annotations.Nullable()
        java.lang.String userAvatarUrl, int errorMessage) {
            return null;
        }
    }
}