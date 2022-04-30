package nl.rijksoverheid.en.beagle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u0010X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lnl/rijksoverheid/en/beagle/BeagleHelperImpl;", "Lnl/rijksoverheid/en/beagle/BeagleHelper;", "()V", "getDebugFeatureFlags", "Lkotlin/Function0;", "", "Lnl/rijksoverheid/en/api/model/FeatureFlag;", "getGetDebugFeatureFlags", "()Lkotlin/jvm/functions/Function0;", "setGetDebugFeatureFlags", "(Lkotlin/jvm/functions/Function0;)V", "testExposureDaysAgo", "", "getTestExposureDaysAgo", "()I", "useDebugFeatureFlags", "", "getUseDebugFeatureFlags", "useDefaultGuidance", "getUseDefaultGuidance", "()Z", "initialize", "", "application", "Landroid/app/Application;", "app_accDebug"})
public final class BeagleHelperImpl implements nl.rijksoverheid.en.beagle.BeagleHelper {
    private static final boolean useDefaultGuidance = false;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.jvm.functions.Function0<java.lang.Boolean> useDebugFeatureFlags = null;
    private static final int testExposureDaysAgo = 5;
    @org.jetbrains.annotations.NotNull()
    private static kotlin.jvm.functions.Function0<? extends java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getDebugFeatureFlags;
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.beagle.BeagleHelperImpl INSTANCE = null;
    
    @java.lang.Override()
    public boolean getUseDefaultGuidance() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function0<java.lang.Boolean> getUseDebugFeatureFlags() {
        return null;
    }
    
    @java.lang.Override()
    public int getTestExposureDaysAgo() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function0<java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getGetDebugFeatureFlags() {
        return null;
    }
    
    public void setGetDebugFeatureFlags(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> p0) {
    }
    
    @java.lang.Override()
    public void initialize(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
    }
    
    private BeagleHelperImpl() {
        super();
    }
}