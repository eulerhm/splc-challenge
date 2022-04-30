package com.haroldadmin.moonshot.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0000H\u00c2\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u0005H\u00c2\u0003J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/haroldadmin/moonshot/core/Consumable;", "T", "Ljava/io/Serializable;", "data", "isConsumed", "", "(Ljava/lang/Object;Z)V", "Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "component2", "consume", "copy", "(Ljava/lang/Object;Z)Lcom/haroldadmin/moonshot/core/Consumable;", "equals", "other", "", "hashCode", "", "invoke", "toString", "", "core"})
public final class Consumable<T extends java.lang.Object> implements java.io.Serializable {
    private final T data = null;
    private boolean isConsumed;
    
    @org.jetbrains.annotations.Nullable()
    public final synchronized T consume() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T invoke() {
        return null;
    }
    
    public Consumable(@org.jetbrains.annotations.Nullable()
    T data, boolean isConsumed) {
        super();
    }
    
    private final T component1() {
        return null;
    }
    
    private final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.core.Consumable<T> copy(@org.jetbrains.annotations.Nullable()
    T data, boolean isConsumed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}