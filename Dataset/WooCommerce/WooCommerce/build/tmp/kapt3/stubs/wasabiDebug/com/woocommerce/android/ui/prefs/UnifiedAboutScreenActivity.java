package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/prefs/UnifiedAboutScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/automattic/about/model/AboutConfigProvider;", "()V", "configBuilder", "Lcom/woocommerce/android/ui/prefs/AboutConfigBuilder;", "getConfigBuilder", "()Lcom/woocommerce/android/ui/prefs/AboutConfigBuilder;", "setConfigBuilder", "(Lcom/woocommerce/android/ui/prefs/AboutConfigBuilder;)V", "getAboutConfig", "Lcom/automattic/about/model/AboutConfig;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class UnifiedAboutScreenActivity extends androidx.appcompat.app.AppCompatActivity implements com.automattic.about.model.AboutConfigProvider {
    @javax.inject.Inject
    public com.woocommerce.android.ui.prefs.AboutConfigBuilder configBuilder;
    
    public UnifiedAboutScreenActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.prefs.AboutConfigBuilder getConfigBuilder() {
        return null;
    }
    
    public final void setConfigBuilder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.prefs.AboutConfigBuilder p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.automattic.about.model.AboutConfig getAboutConfig() {
        return null;
    }
}