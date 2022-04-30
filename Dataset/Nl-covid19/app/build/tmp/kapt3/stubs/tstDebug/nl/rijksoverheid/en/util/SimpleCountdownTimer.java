package nl.rijksoverheid.en.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000e\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0006\u0010\u0012\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/util/SimpleCountdownTimer;", "Landroid/os/CountDownTimer;", "countDownTo", "Ljava/time/LocalDateTime;", "countDownInterval", "", "onTickAndFinish", "Lkotlin/Function0;", "", "(Ljava/time/LocalDateTime;JLkotlin/jvm/functions/Function0;)V", "getCountDownTo", "()Ljava/time/LocalDateTime;", "isRunning", "", "cancelTimer", "onFinish", "onTick", "p0", "startTimer", "app_tstDebug"})
public final class SimpleCountdownTimer extends android.os.CountDownTimer {
    private boolean isRunning = false;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime countDownTo = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onTickAndFinish = null;
    
    public final void startTimer() {
    }
    
    public final void cancelTimer() {
    }
    
    @java.lang.Override()
    public void onTick(long p0) {
    }
    
    @java.lang.Override()
    public void onFinish() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCountDownTo() {
        return null;
    }
    
    public SimpleCountdownTimer(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime countDownTo, long countDownInterval, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onTickAndFinish) {
        super(0L, 0L);
    }
}