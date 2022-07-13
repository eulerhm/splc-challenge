package com.woocommerce.android.ui.common.wpcomwebview;

import java.lang.System;

/**
 * This fragments allows loading specific pages from WordPress.com with the current user logged in.
 * It accepts two parameters:
 * urlToLoad: the initial URL to load
 * urlToTriggerExit: optional URL or part of URL to trigger exit with notice when loaded.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001dH\u0016J\u001a\u0010\'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/common/wpcomwebview/UrlInterceptor;", "()V", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "getAccountStore", "()Lorg/wordpress/android/fluxc/store/AccountStore;", "setAccountStore", "(Lorg/wordpress/android/fluxc/store/AccountStore;)V", "navArgs", "Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "userAgent", "Lorg/wordpress/android/fluxc/network/UserAgent;", "getUserAgent", "()Lorg/wordpress/android/fluxc/network/UserAgent;", "setUserAgent", "(Lorg/wordpress/android/fluxc/network/UserAgent;)V", "webViewClient", "Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewClient;", "getWebViewClient", "()Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewClient;", "webViewClient$delegate", "Lkotlin/Lazy;", "getAuthenticationPostData", "", "urlToLoad", "username", "token", "loadAuthenticatedUrl", "", "webView", "Landroid/webkit/WebView;", "onLoadUrl", "url", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class WPComWebViewFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.common.wpcomwebview.UrlInterceptor {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WEBVIEW_RESULT = "webview-result";
    private final kotlin.Lazy webViewClient$delegate = null;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    @javax.inject.Inject
    public org.wordpress.android.fluxc.store.AccountStore accountStore;
    @javax.inject.Inject
    public org.wordpress.android.fluxc.network.UserAgent userAgent;
    
    public WPComWebViewFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewClient getWebViewClient() {
        return null;
    }
    
    private final com.woocommerce.android.ui.common.wpcomwebview.WPComWebViewFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.store.AccountStore getAccountStore() {
        return null;
    }
    
    public final void setAccountStore(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.network.UserAgent getUserAgent() {
        return null;
    }
    
    public final void setUserAgent(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.network.UserAgent p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadAuthenticatedUrl(android.webkit.WebView webView, java.lang.String urlToLoad) {
    }
    
    @java.lang.Override
    public void onLoadUrl(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthenticationPostData(@org.jetbrains.annotations.NotNull
    java.lang.String urlToLoad, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewFragment$Companion;", "", "()V", "WEBVIEW_RESULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}