package com.woocommerce.android.viewmodel;

import java.lang.System;

/**
 * A base class for ViewModels that use coroutines. The class provides {@link CoroutineScope} for the coroutine
 * builders and their lifecycle is tied to that of the ViewModel's.
 *
 * When the ViewModel is destroyed, the coroutine job is cancelled and any running coroutine tied to it is stopped.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\bH\u0004J+\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190\u001a2\u0006\u0010\u001b\u001a\u0002H\u0019H\u0004\u00a2\u0006\u0002\u0010\u001cR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_event", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "get_event", "()Landroidx/lifecycle/MutableLiveData;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "getSavedState", "()Landroidx/lifecycle/SavedStateHandle;", "triggerEvent", "", "toStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "WooCommerce_vanillaDebug"})
public abstract class ScopedViewModel extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle savedState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> _event = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> event = null;
    
    public ScopedViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.SavedStateHandle getSavedState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected androidx.lifecycle.MutableLiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> get_event() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<com.woocommerce.android.viewmodel.MultiLiveEvent.Event> getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    protected final void triggerEvent(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.MultiLiveEvent.Event event) {
    }
    
    /**
     * Convert a [Flow] to [StateFlow].
     *
     * This uses a policy of keeping the upstream active for 5 seconds after disappearance of last collector
     * to avoid restarting the Flow during configuration changes.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"MagicNumber"})
    protected final <T extends java.lang.Object>kotlinx.coroutines.flow.StateFlow<T> toStateFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$toStateFlow, T initialValue) {
        return null;
    }
}