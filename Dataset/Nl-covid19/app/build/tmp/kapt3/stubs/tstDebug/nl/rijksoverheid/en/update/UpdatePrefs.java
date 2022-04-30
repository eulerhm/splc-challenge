package nl.rijksoverheid.en.update;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lnl/rijksoverheid/en/update/UpdatePrefs;", "", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "value", "", "lastVersionUpdated", "getLastVersionUpdated", "()I", "setLastVersionUpdated", "(I)V", "Companion", "app_tstDebug"})
public final class UpdatePrefs {
    private final android.content.SharedPreferences preferences = null;
    private static final java.lang.String KEY_UPDATED_VERSION = "last_updated_version";
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.update.UpdatePrefs.Companion Companion = null;
    
    public final int getLastVersionUpdated() {
        return 0;
    }
    
    public final void setLastVersionUpdated(int value) {
    }
    
    public UpdatePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lnl/rijksoverheid/en/update/UpdatePrefs$Companion;", "", "()V", "KEY_UPDATED_VERSION", "", "app_tstDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}