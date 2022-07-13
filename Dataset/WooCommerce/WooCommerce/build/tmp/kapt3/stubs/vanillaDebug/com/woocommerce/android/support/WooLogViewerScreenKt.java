package com.woocommerce.android.support;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a:\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0003\u00a8\u0006\u0012"}, d2 = {"LogViewerEntries", "", "entries", "Lcom/woocommerce/android/util/RollingLogEntries;", "LogViewerEntry", "index", "", "entry", "Lcom/woocommerce/android/util/RollingLogEntries$LogEntry;", "WooLogViewerScreen", "onBackPress", "Lkotlin/Function0;", "onCopyButtonClick", "onShareButtonClick", "WooLogViewerScreenPreview", "logLevelColor", "level", "Lcom/woocommerce/android/util/WooLog$LogLevel;", "WooCommerce_vanillaDebug"})
public final class WooLogViewerScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void WooLogViewerScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.RollingLogEntries entries, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCopyButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShareButtonClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LogViewerEntries(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.RollingLogEntries entries) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LogViewerEntry(int index, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.RollingLogEntries.LogEntry entry) {
    }
    
    @androidx.annotation.ColorRes()
    private static final int logLevelColor(com.woocommerce.android.util.WooLog.LogLevel level) {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void WooLogViewerScreenPreview() {
    }
}