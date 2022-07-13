package com.woocommerce.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000b\u001a9\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\r*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\t\u001a\u00020\nH\u0002\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"getNullableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "Landroidx/lifecycle/SavedStateHandle;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "initialValue", "clazz", "Ljava/lang/Class;", "key", "", "(Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Lkotlinx/coroutines/flow/MutableStateFlow;", "getStateFlow", "", "(Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/Object;Ljava/lang/String;)Lkotlinx/coroutines/flow/MutableStateFlow;", "getStateFlowInternal", "WooCommerce_vanillaDebug"})
public final class SavedStateFlowKt {
    
    /**
     * A helper function to create a [MutableStateFlow] that creates an entry in [SavedStateHandle] to persist value
     * through process-death.
     *
     * Based on https://gist.github.com/marcellogalhardo/2a1ec56b7d00ba9af1ec9fd3583d53dc
     *
     * @param scope The scope used to synchronize the [StateFlow] and [SavedStateHandle]
     * @param initialValue If no value exists with the given [key], a new one is created
     * with the given [initialValue].
     * @param key an optional key for the value
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.MutableStateFlow<T> getStateFlow(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle $this$getStateFlow, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    T initialValue, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.MutableStateFlow<T> getNullableStateFlow(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle $this$getNullableStateFlow, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, T initialValue, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends T> clazz, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    private static final <T extends java.lang.Object>kotlinx.coroutines.flow.MutableStateFlow<T> getStateFlowInternal(androidx.lifecycle.SavedStateHandle $this$getStateFlowInternal, kotlinx.coroutines.CoroutineScope scope, T initialValue, java.lang.String key) {
        return null;
    }
}