package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003\u001a)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\n\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\f\u001a\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003\u001a\u001c\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003\u001aN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00140\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00020\f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u001a)\u0010\u0019\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"addNewItem", "", "T", "Landroidx/lifecycle/MutableLiveData;", "", "item", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "clearList", "containsItem", "", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)Z", "drop", "Landroidx/lifecycle/LiveData;", "number", "", "filterNotNull", "", "getList", "isEmpty", "mapAsync", "R", "mapper", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function2;)Landroidx/lifecycle/LiveData;", "removeItem", "WooCommerce_wasabiDebug"})
public final class LiveDataExtKt {
    
    public static final <T extends java.lang.Object>void addNewItem(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$addNewItem, T item) {
    }
    
    public static final <T extends java.lang.Object>boolean containsItem(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$containsItem, T item) {
        return false;
    }
    
    public static final <T extends java.lang.Object>boolean isEmpty(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$isEmpty) {
        return false;
    }
    
    public static final <T extends java.lang.Object>void removeItem(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$removeItem, T item) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>java.util.List<T> getList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$getList) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void clearList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$clearList) {
    }
    
    /**
     * A helper function to map a LiveData's value to another one, with the ability to use a suspend function for the
     * mapping
     */
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, R extends java.lang.Object>androidx.lifecycle.LiveData<R> mapAsync(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$mapAsync, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> mapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> drop(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$drop, int number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> filterNotNull(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$filterNotNull) {
        return null;
    }
}