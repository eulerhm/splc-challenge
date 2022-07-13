package com.woocommerce.android.viewmodel;

import java.lang.System;

/**
 * A wrapper around [MutableLiveData], that creates an entry in the [SavedStateHandle] to preserve the data.
 * An initial value is required during the initialization.
 *
 * This delegate can then be used as a proxy to access and modify the LiveData, which looks like a simple
 * variable manipulation.
 *
 * The delegate and its LiveData is intended to be used only by a single observer due to the way previous/new data is
 * being updated. If there is more than one, an [IllegalStateException] is thrown.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\"\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00032\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0086\u0002\u00a2\u0006\u0002\u0010\u001dJ*\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 2\u001a\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nJ\"\u0010\"\u001a\u00020\u000b2\u001a\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nJ*\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00032\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010$\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010%R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "T", "Landroid/os/Parcelable;", "", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "initialValue", "savedStateKey", "", "onChange", "Lkotlin/Function2;", "", "(Landroidx/lifecycle/SavedStateHandle;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "_liveData", "Landroidx/lifecycle/MutableLiveData;", "hasInitialValue", "", "getHasInitialValue", "()Z", "Landroid/os/Parcelable;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "previousValue", "getValue", "ref", "p", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroid/os/Parcelable;", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "observeForever", "setValue", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Landroid/os/Parcelable;)V", "WooCommerce_vanillaDebug"})
public final class LiveDataDelegate<T extends android.os.Parcelable> {
    private final T initialValue = null;
    private final kotlin.jvm.functions.Function2<T, T, kotlin.Unit> onChange = null;
    private final androidx.lifecycle.MutableLiveData<T> _liveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<T> liveData = null;
    private T previousValue;
    
    public LiveDataDelegate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull()
    T initialValue, @org.jetbrains.annotations.NotNull()
    java.lang.String savedStateKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> onChange) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<T> getLiveData() {
        return null;
    }
    
    public final boolean getHasInitialValue() {
        return false;
    }
    
    public final void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> observer) {
    }
    
    public final void observeForever(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> observer) {
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object ref, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> p, @org.jetbrains.annotations.NotNull()
    T value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object ref, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> p) {
        return null;
    }
}