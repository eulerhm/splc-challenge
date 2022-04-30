package com.google.samples.apps.iosched.shared.util;

import java.lang.System;

/**
 * LiveData that runs a transformation [block] every interval and also whenever a source
 * LiveData changes.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014R\u001e\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0088\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/shared/util/IntervalMediatorLiveData;", "P", "T", "Landroidx/lifecycle/MediatorLiveData;", "source", "Landroidx/lifecycle/LiveData;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intervalMs", "", "block", "Lkotlin/Function1;", "(Landroidx/lifecycle/LiveData;Lkotlinx/coroutines/CoroutineDispatcher;JLkotlin/jvm/functions/Function1;)V", "intervalJob", "Lkotlinx/coroutines/Job;", "intervalScope", "Lkotlinx/coroutines/CoroutineScope;", "lastEmitted", "Ljava/lang/Object;", "onActive", "", "onInactive", "shared_staging"})
public final class IntervalMediatorLiveData<P extends java.lang.Object, T extends java.lang.Object> extends androidx.lifecycle.MediatorLiveData<T> {
    private final kotlinx.coroutines.CoroutineScope intervalScope = null;
    private kotlinx.coroutines.Job intervalJob;
    private P lastEmitted;
    private final long intervalMs = 0L;
    private final kotlin.jvm.functions.Function1<P, T> block = null;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    public IntervalMediatorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<P> source, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, long intervalMs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super P, ? extends T> block) {
        super();
    }
}