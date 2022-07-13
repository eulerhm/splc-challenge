package com.woocommerce.android.viewmodel;

import java.lang.System;

/**
 * An implementation of [Lazy] to retrieve [NavArgs] from the provided [savedStateHandle]
 *
 * The implementation is copied from [androidx.navigation.NavArgsLazy]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "Args", "Landroidx/navigation/NavArgs;", "Lkotlin/Lazy;", "navArgsClass", "Lkotlin/reflect/KClass;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/SavedStateHandle;)V", "cached", "Landroidx/navigation/NavArgs;", "value", "getValue", "()Landroidx/navigation/NavArgs;", "isInitialized", "", "WooCommerce_vanillaDebug"})
public final class NavArgsLazy<Args extends androidx.navigation.NavArgs> implements kotlin.Lazy<Args> {
    private final kotlin.reflect.KClass<Args> navArgsClass = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private Args cached;
    
    public NavArgsLazy(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<Args> navArgsClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public Args getValue() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
}