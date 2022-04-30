package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lnl/rijksoverheid/en/status/StatusCache;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getCachedStatus", "Lkotlinx/coroutines/flow/Flow;", "Lnl/rijksoverheid/en/status/StatusCache$CachedStatus;", "getCachedStatusFromPreferences", "updateCachedStatus", "", "cachedStatus", "CachedStatus", "app_tstDebug"})
public class StatusCache {
    private final android.content.SharedPreferences preferences = null;
    
    public final void updateCachedStatus(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusCache.CachedStatus cachedStatus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<nl.rijksoverheid.en.status.StatusCache.CachedStatus> getCachedStatus() {
        return null;
    }
    
    private final nl.rijksoverheid.en.status.StatusCache.CachedStatus getCachedStatusFromPreferences(android.content.SharedPreferences preferences) {
        return null;
    }
    
    public StatusCache(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lnl/rijksoverheid/en/status/StatusCache$CachedStatus;", "", "(Ljava/lang/String;I)V", "ENABLED", "BLUETOOTH_DISABLED", "LOCATION_PRECONDITION_NOT_SATISFIED", "DISABLED", "NONE", "app_tstDebug"})
    public static enum CachedStatus {
        /*public static final*/ ENABLED /* = new ENABLED() */,
        /*public static final*/ BLUETOOTH_DISABLED /* = new BLUETOOTH_DISABLED() */,
        /*public static final*/ LOCATION_PRECONDITION_NOT_SATISFIED /* = new LOCATION_PRECONDITION_NOT_SATISFIED() */,
        /*public static final*/ DISABLED /* = new DISABLED() */,
        /*public static final*/ NONE /* = new NONE() */;
        
        CachedStatus() {
        }
    }
}