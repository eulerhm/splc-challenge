package nl.rijksoverheid.en.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ1\u0010\u000e\u001a\u00020\f2\u001e\u0010\u000f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/config/AppConfigManager;", "", "cdnService", "Lnl/rijksoverheid/en/api/CdnService;", "useDebugFeatureFlags", "Lkotlin/Function0;", "", "getDebugFeatureFlags", "", "Lnl/rijksoverheid/en/api/model/FeatureFlag;", "(Lnl/rijksoverheid/en/api/CdnService;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getCachedConfigOrDefault", "Lnl/rijksoverheid/en/api/model/AppConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfigOrDefault", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tstDebug"})
public final class AppConfigManager {
    private final nl.rijksoverheid.en.api.CdnService cdnService = null;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> useDebugFeatureFlags = null;
    private final kotlin.jvm.functions.Function0<java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getDebugFeatureFlags = null;
    
    /**
     * Get the config or the default config. This may result in network calls.
     * @return the config or the default config if it couldn't be retrieved
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getConfigOrDefault(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.api.model.AppConfig> p0) {
        return null;
    }
    
    /**
     * Get the config if previously fetched, or the default config.
     * @return the cached config or the default config.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCachedConfigOrDefault(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.api.model.AppConfig> p0) {
        return null;
    }
    
    public AppConfigManager(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.api.CdnService cdnService, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> useDebugFeatureFlags, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.util.List<nl.rijksoverheid.en.api.model.FeatureFlag>> getDebugFeatureFlags) {
        super();
    }
}