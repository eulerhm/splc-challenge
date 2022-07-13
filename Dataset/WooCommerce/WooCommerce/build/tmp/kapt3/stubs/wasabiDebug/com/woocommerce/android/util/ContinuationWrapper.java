package com.woocommerce.android.util;

import java.lang.System;

/**
 * A wrapper class for a [CancellableContinuation], which handles some of the most common errors when a continuation
 * is used.
 *
 * 1. First, before a continuation is resumed, it's checked if it's active.
 * 2. After a continuation is successfully resumed it's nulled.
 * 3. The whole async call is wrapped in a try-catch block which handles the [CancellationException].
 *
 * There is a required tag parameter because we want to make sure all [CancellationException] are logged.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0011J\u0013\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/util/ContinuationWrapper;", "T", "", "tag", "Lcom/woocommerce/android/util/WooLog$T;", "(Lcom/woocommerce/android/util/WooLog$T;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "isWaiting", "", "()Z", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "callAndWait", "Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult;", "asyncAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "", "(Lkotlin/jvm/functions/Function0;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callAndWaitUntilTimeout", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "continueWith", "value", "(Ljava/lang/Object;)V", "continueWithException", "exception", "", "ContinuationResult", "WooCommerce_wasabiDebug"})
public final class ContinuationWrapper<T extends java.lang.Object> {
    private final com.woocommerce.android.util.WooLog.T tag = null;
    private kotlinx.coroutines.CancellableContinuation<? super T> continuation;
    private final kotlinx.coroutines.sync.Mutex mutex = null;
    
    public ContinuationWrapper(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.WooLog.T tag) {
        super();
    }
    
    public final boolean isWaiting() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object callAndWaitUntilTimeout(long timeout, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> asyncAction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.util.ContinuationWrapper.ContinuationResult<T>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object callAndWait(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> asyncAction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.util.ContinuationWrapper.ContinuationResult<T>> continuation) {
        return null;
    }
    
    private final java.lang.Object callAndWait(kotlin.jvm.functions.Function0<kotlin.Unit> asyncAction, long timeout, kotlin.coroutines.Continuation<? super com.woocommerce.android.util.ContinuationWrapper.ContinuationResult<T>> continuation) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void continueWith(T value) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void continueWithException(@org.jetbrains.annotations.NotNull
    java.lang.Throwable exception) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult;", "T", "", "()V", "Cancellation", "Success", "Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult$Success;", "Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult$Cancellation;", "WooCommerce_wasabiDebug"})
    public static abstract class ContinuationResult<T extends java.lang.Object> {
        
        private ContinuationResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult$Success;", "T", "Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class Success<T extends java.lang.Object> extends com.woocommerce.android.util.ContinuationWrapper.ContinuationResult<T> {
            private final T value = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.util.ContinuationWrapper.ContinuationResult.Success<T> copy(T value) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Success(T value) {
                super();
            }
            
            public final T component1() {
                return null;
            }
            
            public final T getValue() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\t\u001a\u00060\u0004j\u0002`\u0005H\u00c6\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult$Cancellation;", "T", "Lcom/woocommerce/android/util/ContinuationWrapper$ContinuationResult;", "exception", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "getException", "()Ljava/util/concurrent/CancellationException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
        public static final class Cancellation<T extends java.lang.Object> extends com.woocommerce.android.util.ContinuationWrapper.ContinuationResult<T> {
            @org.jetbrains.annotations.NotNull
            private final java.util.concurrent.CancellationException exception = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.util.ContinuationWrapper.ContinuationResult.Cancellation<T> copy(@org.jetbrains.annotations.NotNull
            java.util.concurrent.CancellationException exception) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Cancellation(@org.jetbrains.annotations.NotNull
            java.util.concurrent.CancellationException exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.concurrent.CancellationException component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.concurrent.CancellationException getException() {
                return null;
            }
        }
    }
}