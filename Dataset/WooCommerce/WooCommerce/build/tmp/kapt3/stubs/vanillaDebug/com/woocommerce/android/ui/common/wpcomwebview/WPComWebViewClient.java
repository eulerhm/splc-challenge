package com.woocommerce.android.ui.common.wpcomwebview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/common/wpcomwebview/WPComWebViewClient;", "Landroid/webkit/WebViewClient;", "urlInterceptor", "Lcom/woocommerce/android/ui/common/wpcomwebview/UrlInterceptor;", "(Lcom/woocommerce/android/ui/common/wpcomwebview/UrlInterceptor;)V", "onLoadResource", "", "view", "Landroid/webkit/WebView;", "url", "", "WooCommerce_vanillaDebug"})
public final class WPComWebViewClient extends android.webkit.WebViewClient {
    private final com.woocommerce.android.ui.common.wpcomwebview.UrlInterceptor urlInterceptor = null;
    
    public WPComWebViewClient(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.common.wpcomwebview.UrlInterceptor urlInterceptor) {
        super();
    }
    
    @java.lang.Override()
    public void onLoadResource(@org.jetbrains.annotations.Nullable()
    android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
}