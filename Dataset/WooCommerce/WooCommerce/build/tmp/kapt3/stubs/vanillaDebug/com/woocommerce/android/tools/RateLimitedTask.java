package com.woocommerce.android.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH$J\u0006\u0010\n\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/tools/RateLimitedTask;", "", "minRateInSeconds", "", "(I)V", "lastUpdate", "Ljava/util/Date;", "forceRun", "", "run", "runIfNotLimited", "WooCommerce_vanillaDebug"})
public abstract class RateLimitedTask {
    private final int minRateInSeconds = 0;
    private java.util.Date lastUpdate;
    
    public RateLimitedTask(int minRateInSeconds) {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean forceRun() {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean runIfNotLimited() {
        return false;
    }
    
    protected abstract boolean run();
}