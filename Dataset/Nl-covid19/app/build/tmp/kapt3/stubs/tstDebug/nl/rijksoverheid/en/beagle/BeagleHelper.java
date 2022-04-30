package nl.rijksoverheid.en.beagle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0012\u0010\u000f\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lnl/rijksoverheid/en/beagle/BeagleHelper;", "", "getDebugFeatureFlags", "Lkotlin/Function0;", "", "Lnl/rijksoverheid/en/api/model/FeatureFlag;", "getGetDebugFeatureFlags", "()Lkotlin/jvm/functions/Function0;", "testExposureDaysAgo", "", "getTestExposureDaysAgo", "()I", "useDebugFeatureFlags", "", "getUseDebugFeatureFlags", "useDefaultGuidance", "getUseDefaultGuidance", "()Z", "initialize", "", "application", "Landroid/app/Application;", "app_tstDebug"})
public abstract interface BeagleHelper {
    
    public abstract boolean getUseDefaultGuidance();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function0<java.lang.Boolean> getUseDebugFeatureFlags();
    
    public abstract int getTestExposureDaysAgo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function0<java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getGetDebugFeatureFlags();
    
    public abstract void initialize(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
}