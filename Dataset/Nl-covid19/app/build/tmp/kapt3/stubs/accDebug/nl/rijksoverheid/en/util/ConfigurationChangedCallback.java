package nl.rijksoverheid.en.util;

import java.lang.System;

/**
 * Simplified [ComponentCallbacks] that only triggers a callback on configuration changed
 * @param callback method for onConfigurationChanged
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lnl/rijksoverheid/en/util/ConfigurationChangedCallback;", "Landroid/content/ComponentCallbacks;", "callback", "Lkotlin/Function1;", "Landroid/content/res/Configuration;", "", "(Lkotlin/jvm/functions/Function1;)V", "onConfigurationChanged", "newConfig", "onLowMemory", "app_accDebug"})
public final class ConfigurationChangedCallback implements android.content.ComponentCallbacks {
    private final kotlin.jvm.functions.Function1<android.content.res.Configuration, kotlin.Unit> callback = null;
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    public ConfigurationChangedCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.res.Configuration, kotlin.Unit> callback) {
        super();
    }
}