package com.woocommerce.android.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/base/BasePresenter;", "T", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "dropView", "", "takeView", "view", "(Ljava/lang/Object;)V", "WooCommerce_vanillaDebug"})
public abstract interface BasePresenter<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.CoroutineScope getCoroutineScope();
    
    public abstract void takeView(T view);
    
    /**
     * This method would need to be called by the inherited classes if
     * [coroutineScope] is being actively used, in order to cancel the coroutine
     *
     * See [OrderDetailPresenter] for more details
     */
    public abstract void dropView();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>kotlinx.coroutines.CoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.BasePresenter<? super T> $this) {
            return null;
        }
        
        /**
         * This method would need to be called by the inherited classes if
         * [coroutineScope] is being actively used, in order to cancel the coroutine
         *
         * See [OrderDetailPresenter] for more details
         */
        public static <T extends java.lang.Object>void dropView(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.BasePresenter<? super T> $this) {
        }
    }
}