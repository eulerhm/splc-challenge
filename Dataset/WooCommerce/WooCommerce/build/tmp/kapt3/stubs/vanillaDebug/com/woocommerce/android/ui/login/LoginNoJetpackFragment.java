package com.woocommerce.android.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010%\u001a\u00020\u0018H\u0002J\b\u0010&\u001a\u00020\u0018H\u0002J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginNoJetpackFragment;", "Landroidx/fragment/app/Fragment;", "()V", "jetpackLoginListener", "Lcom/woocommerce/android/ui/login/LoginNoJetpackListener;", "loginListener", "Lorg/wordpress/android/login/LoginListener;", "mCheckJetpackAvailability", "", "mInputPassword", "", "mInputUsername", "progressDialog", "Landroid/app/ProgressDialog;", "siteAddress", "siteXmlRpcAddress", "userAvatarUrl", "viewModel", "Lcom/woocommerce/android/ui/login/LoginNoJetpackViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/login/LoginNoJetpackViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideProgressDialog", "", "initializeViewModel", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onResume", "onViewCreated", "view", "Landroid/view/View;", "redirectToSiteCredentialsScreen", "setupObservers", "showProgressDialog", "show", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginNoJetpackFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.login.LoginNoJetpackFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "LoginNoJetpackFragment";
    private static final java.lang.String ARG_SITE_ADDRESS = "SITE-ADDRESS";
    private static final java.lang.String ARG_SITE_XMLRPC_ADDRESS = "SITE-XMLRPC-ADDRESS";
    private static final java.lang.String ARG_INPUT_USERNAME = "ARG_INPUT_USERNAME";
    private static final java.lang.String ARG_INPUT_PASSWORD = "ARG_INPUT_PASSWORD";
    private static final java.lang.String ARG_USER_AVATAR_URL = "ARG_USER_AVATAR_URL";
    private static final java.lang.String ARG_CHECK_JETPACK_AVAILABILITY = "ARG_CHECK_JETPACK_AVAILABILITY";
    private org.wordpress.android.login.LoginListener loginListener;
    private com.woocommerce.android.ui.login.LoginNoJetpackListener jetpackLoginListener;
    private java.lang.String siteAddress;
    private java.lang.String siteXmlRpcAddress;
    private java.lang.String mInputUsername;
    private java.lang.String mInputPassword;
    private java.lang.String userAvatarUrl;
    private android.app.ProgressDialog progressDialog;
    
    /**
     * This flag, when set to true calls the CONNECT_SITE_INFO API to verify if Jetpack is
     * installed/activated/connected to the site. This flag will be set to true only when the
     * discovery process results in an error. The assumption being that certain discovery
     * errors can only take place if Jetpack is not connected to the site. On the off chance
     * that Jetpack is connected, but discovery still fails, we need to verify if Jetpack is
     * available in this class, before redirecting to the site credentials screen and
     * initiating the discovery process again.
     */
    private boolean mCheckJetpackAvailability = false;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public LoginNoJetpackFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.login.LoginNoJetpackViewModel getViewModel() {
        return null;
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
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void initializeViewModel() {
    }
    
    private final void setupObservers() {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    private final void redirectToSiteCredentialsScreen() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J<\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/login/LoginNoJetpackFragment$Companion;", "", "()V", "ARG_CHECK_JETPACK_AVAILABILITY", "", "ARG_INPUT_PASSWORD", "ARG_INPUT_USERNAME", "ARG_SITE_ADDRESS", "ARG_SITE_XMLRPC_ADDRESS", "ARG_USER_AVATAR_URL", "TAG", "newInstance", "Lcom/woocommerce/android/ui/login/LoginNoJetpackFragment;", "siteAddress", "endpointAddress", "inputUsername", "inputPassword", "userAvatarUrl", "checkJetpackAvailability", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.login.LoginNoJetpackFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String siteAddress, @org.jetbrains.annotations.Nullable()
        java.lang.String endpointAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String inputUsername, @org.jetbrains.annotations.NotNull()
        java.lang.String inputPassword, @org.jetbrains.annotations.Nullable()
        java.lang.String userAvatarUrl, boolean checkJetpackAvailability) {
            return null;
        }
    }
}