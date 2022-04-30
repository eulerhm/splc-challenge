package nl.rijksoverheid.en.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0005\u001a \u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"requestDisableBatteryOptimizationsIntent", "Landroid/content/Intent;", "supportsRequestDisableBatteryOptimisations", "", "context", "Landroid/content/Context;", "isIgnoringBatteryOptimizations", "launchDisableBatteryOptimizationsRequest", "", "Landroidx/activity/result/ActivityResultLauncher;", "onActivityNotFound", "Lkotlin/Function0;", "app_accDebug"})
public final class BatteryOptimizationUtilsKt {
    @android.annotation.SuppressLint(value = {"BatteryLife"})
    private static final android.content.Intent requestDisableBatteryOptimizationsIntent = null;
    
    /**
     * Returns if battery optimizations are ignored.
     * @return true if ignored *or* if there's no activity available to disable the setting
     */
    public static final boolean isIgnoringBatteryOptimizations(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isIgnoringBatteryOptimizations) {
        return false;
    }
    
    private static final boolean supportsRequestDisableBatteryOptimisations(android.content.Context context) {
        return false;
    }
    
    public static final void launchDisableBatteryOptimizationsRequest(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> $this$launchDisableBatteryOptimizationsRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onActivityNotFound) {
    }
}