package nl.rijksoverheid.en.debug;

import java.lang.System;

/**
 * Show a notification that allows test users to trigger a test exposure notification.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/debug/DebugNotification;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createNotificationChannel", "", "show", "Companion", "app_accDebug"})
public final class DebugNotification {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_TEST_EXPOSURE = "nl.rijksoverheid.en.debug.DebugNotification.ACTION_TEST_EXPOSURE";
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.debug.DebugNotification.Companion Companion = null;
    
    private final void createNotificationChannel() {
    }
    
    public final void show() {
    }
    
    public DebugNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lnl/rijksoverheid/en/debug/DebugNotification$Companion;", "", "()V", "ACTION_TEST_EXPOSURE", "", "app_accDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}