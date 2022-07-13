package com.woocommerce.android.viewmodel;

import java.lang.System;

/**
 * A lifecycle-aware observable that sends only new updates after subscription, used for events like
 * navigation and Snackbar messages.
 *
 *
 * This avoids a common problem with events: on configuration change (like rotation) an update
 * can be emitted if the observer is active. This LiveData only calls the observable if there's an
 * explicit call to setValue() or call().
 *
 *
 * This is a mutation of SingleLiveEvent, which allows multiple observers. Once an observer marks the event as handled,
 * no other observers are notified and no further updates will be sent, similar to SingleLiveEvent.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0017J\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\bJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0017\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent;", "T", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "Landroidx/lifecycle/MutableLiveData;", "()V", "pending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "postValue", "value", "(Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;)V", "reset", "setValue", "t", "Event", "WooCommerce_vanillaDebug"})
public class MultiLiveEvent<T extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event> extends androidx.lifecycle.MutableLiveData<T> {
    private final java.util.concurrent.atomic.AtomicBoolean pending = null;
    
    public MultiLiveEvent() {
        super(null);
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    public final void reset() {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    T t) {
    }
    
    @java.lang.Override()
    public void postValue(@org.jetbrains.annotations.NotNull()
    T value) {
    }
    
    @kotlin.Suppress(names = {"UnnecessaryAbstractClass"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "", "isHandled", "", "(Z)V", "()Z", "setHandled", "Exit", "ExitWithResult", "LaunchUrlInChromeTab", "Logout", "ShowActionSnackbar", "ShowDialog", "ShowSnackbar", "ShowUiStringSnackbar", "ShowUndoSnackbar", "WooCommerce_vanillaDebug"})
    public static abstract class Event {
        private boolean isHandled;
        
        public Event() {
            super();
        }
        
        public Event(boolean isHandled) {
            super();
        }
        
        public final boolean isHandled() {
            return false;
        }
        
        public final void setHandled(boolean p0) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "", "args", "", "", "undoAction", "Lkotlin/Function0;", "", "(I[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getArgs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getMessage", "()I", "getUndoAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "(I[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowSnackbar;", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
        public static final class ShowSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            private final int message = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String[] args = null;
            @org.jetbrains.annotations.Nullable()
            private final kotlin.jvm.functions.Function0<kotlin.Unit> undoAction = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowSnackbar copy(@androidx.annotation.StringRes()
            int message, @org.jetbrains.annotations.NotNull()
            java.lang.String[] args, @org.jetbrains.annotations.Nullable()
            kotlin.jvm.functions.Function0<kotlin.Unit> undoAction) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowSnackbar(@androidx.annotation.StringRes()
            int message, @org.jetbrains.annotations.NotNull()
            java.lang.String[] args, @org.jetbrains.annotations.Nullable()
            kotlin.jvm.functions.Function0<kotlin.Unit> undoAction) {
                super(false);
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getMessage() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String[] component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String[] getArgs() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getUndoAction() {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowUndoSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "", "args", "", "undoAction", "Landroid/view/View$OnClickListener;", "dismissAction", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "(Ljava/lang/String;[Ljava/lang/String;Landroid/view/View$OnClickListener;Lcom/google/android/material/snackbar/Snackbar$Callback;)V", "getArgs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDismissAction", "()Lcom/google/android/material/snackbar/Snackbar$Callback;", "getMessage", "()Ljava/lang/String;", "getUndoAction", "()Landroid/view/View$OnClickListener;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;[Ljava/lang/String;Landroid/view/View$OnClickListener;Lcom/google/android/material/snackbar/Snackbar$Callback;)Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowUndoSnackbar;", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class ShowUndoSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String[] args = null;
            @org.jetbrains.annotations.NotNull()
            private final android.view.View.OnClickListener undoAction = null;
            @org.jetbrains.annotations.NotNull()
            private final com.google.android.material.snackbar.Snackbar.Callback dismissAction = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowUndoSnackbar copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message, @org.jetbrains.annotations.NotNull()
            java.lang.String[] args, @org.jetbrains.annotations.NotNull()
            android.view.View.OnClickListener undoAction, @org.jetbrains.annotations.NotNull()
            com.google.android.material.snackbar.Snackbar.Callback dismissAction) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowUndoSnackbar(@org.jetbrains.annotations.NotNull()
            java.lang.String message, @org.jetbrains.annotations.NotNull()
            java.lang.String[] args, @org.jetbrains.annotations.NotNull()
            android.view.View.OnClickListener undoAction, @org.jetbrains.annotations.NotNull()
            com.google.android.material.snackbar.Snackbar.Callback dismissAction) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String[] component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String[] getArgs() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View.OnClickListener component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View.OnClickListener getUndoAction() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.material.snackbar.Snackbar.Callback component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.material.snackbar.Snackbar.Callback getDismissAction() {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowActionSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "", "action", "Landroid/view/View$OnClickListener;", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "getAction", "()Landroid/view/View$OnClickListener;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class ShowActionSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String message = null;
            @org.jetbrains.annotations.NotNull()
            private final android.view.View.OnClickListener action = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowActionSnackbar copy(@org.jetbrains.annotations.NotNull()
            java.lang.String message, @org.jetbrains.annotations.NotNull()
            android.view.View.OnClickListener action) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowActionSnackbar(@org.jetbrains.annotations.NotNull()
            java.lang.String message, @org.jetbrains.annotations.NotNull()
            android.view.View.OnClickListener action) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMessage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View.OnClickListener component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View.OnClickListener getAction() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowUiStringSnackbar;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "message", "Lcom/woocommerce/android/model/UiString;", "(Lcom/woocommerce/android/model/UiString;)V", "getMessage", "()Lcom/woocommerce/android/model/UiString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class ShowUiStringSnackbar extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.model.UiString message = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowUiStringSnackbar copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.UiString message) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowUiStringSnackbar(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.model.UiString message) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.UiString component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.UiString getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$Logout;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Logout extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.Logout INSTANCE = null;
            
            private Logout() {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$Exit;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Exit extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.Exit INSTANCE = null;
            
            private Exit() {
                super(false);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ExitWithResult;", "T", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "data", "key", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ExitWithResult;", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class ExitWithResult<T extends java.lang.Object> extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            private final T data = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String key = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ExitWithResult<T> copy(T data, @org.jetbrains.annotations.Nullable()
            java.lang.String key) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ExitWithResult(T data, @org.jetbrains.annotations.Nullable()
            java.lang.String key) {
                super(false);
            }
            
            public final T component1() {
                return null;
            }
            
            public final T getData() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getKey() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$LaunchUrlInChromeTab;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class LaunchUrlInChromeTab extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.LaunchUrlInChromeTab copy(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public LaunchUrlInChromeTab(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super(false);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 )2\u00020\u0001:\u0001)Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowDialog;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "titleId", "", "messageId", "positiveButtonId", "negativeButtonId", "neutralButtonId", "positiveBtnAction", "Landroid/content/DialogInterface$OnClickListener;", "negativeBtnAction", "neutralBtnAction", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V", "getMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNegativeBtnAction", "()Landroid/content/DialogInterface$OnClickListener;", "getNegativeButtonId", "getNeutralBtnAction", "getNeutralButtonId", "getPositiveBtnAction", "getPositiveButtonId", "getTitleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowDialog;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "WooCommerce_vanillaDebug"})
        public static final class ShowDialog extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer titleId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer messageId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer positiveButtonId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer negativeButtonId = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Integer neutralButtonId = null;
            @org.jetbrains.annotations.Nullable()
            private final android.content.DialogInterface.OnClickListener positiveBtnAction = null;
            @org.jetbrains.annotations.Nullable()
            private final android.content.DialogInterface.OnClickListener negativeBtnAction = null;
            @org.jetbrains.annotations.Nullable()
            private final android.content.DialogInterface.OnClickListener neutralBtnAction = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowDialog.Companion Companion = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowDialog copy(@org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer titleId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer messageId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer positiveButtonId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer negativeButtonId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer neutralButtonId, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener positiveBtnAction, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener negativeBtnAction, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener neutralBtnAction) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowDialog() {
                super(false);
            }
            
            public ShowDialog(@org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer titleId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer messageId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer positiveButtonId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer negativeButtonId, @org.jetbrains.annotations.Nullable()
            @androidx.annotation.StringRes()
            java.lang.Integer neutralButtonId, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener positiveBtnAction, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener negativeBtnAction, @org.jetbrains.annotations.Nullable()
            android.content.DialogInterface.OnClickListener neutralBtnAction) {
                super(false);
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getTitleId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getMessageId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getPositiveButtonId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getNegativeButtonId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Integer getNeutralButtonId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener getPositiveBtnAction() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener getNegativeBtnAction() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final android.content.DialogInterface.OnClickListener getNeutralBtnAction() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowDialog$Companion;", "", "()V", "buildDiscardDialogEvent", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event$ShowDialog;", "messageId", "", "positiveButtonId", "negativeButtonId", "positiveBtnAction", "Landroid/content/DialogInterface$OnClickListener;", "negativeBtnAction", "WooCommerce_vanillaDebug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.woocommerce.android.viewmodel.MultiLiveEvent.Event.ShowDialog buildDiscardDialogEvent(int messageId, int positiveButtonId, int negativeButtonId, @org.jetbrains.annotations.NotNull()
                android.content.DialogInterface.OnClickListener positiveBtnAction, @org.jetbrains.annotations.Nullable()
                android.content.DialogInterface.OnClickListener negativeBtnAction) {
                    return null;
                }
            }
        }
    }
}