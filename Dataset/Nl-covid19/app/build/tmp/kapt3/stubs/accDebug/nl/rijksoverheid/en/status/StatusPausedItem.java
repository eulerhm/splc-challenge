package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lnl/rijksoverheid/en/status/StatusPausedItem;", "Lnl/rijksoverheid/en/items/BaseBindableItem;", "Lnl/rijksoverheid/en/databinding/ItemStatusPausedBinding;", "viewState", "Lnl/rijksoverheid/en/status/StatusPausedItem$ViewState;", "(Lnl/rijksoverheid/en/status/StatusPausedItem$ViewState;)V", "currentViewBinding", "refreshTimer", "Lnl/rijksoverheid/en/util/SimpleCountdownTimer;", "getViewState", "()Lnl/rijksoverheid/en/status/StatusPausedItem$ViewState;", "bind", "", "viewBinding", "position", "", "getLayout", "unbind", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "Companion", "ViewState", "app_accDebug"})
public final class StatusPausedItem extends nl.rijksoverheid.en.items.BaseBindableItem<nl.rijksoverheid.en.databinding.ItemStatusPausedBinding> {
    private nl.rijksoverheid.en.util.SimpleCountdownTimer refreshTimer;
    private nl.rijksoverheid.en.databinding.ItemStatusPausedBinding currentViewBinding;
    @org.jetbrains.annotations.NotNull()
    private final nl.rijksoverheid.en.status.StatusPausedItem.ViewState viewState = null;
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.status.StatusPausedItem.Companion Companion = null;
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.databinding.ItemStatusPausedBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<nl.rijksoverheid.en.databinding.ItemStatusPausedBinding> viewHolder) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final nl.rijksoverheid.en.status.StatusPausedItem.ViewState getViewState() {
        return null;
    }
    
    public StatusPausedItem(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusPausedItem.ViewState viewState) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lnl/rijksoverheid/en/status/StatusPausedItem$ViewState;", "", "pausedUntil", "Ljava/time/LocalDateTime;", "action", "Lkotlin/Function0;", "", "(Ljava/time/LocalDateTime;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getPausedUntil", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_accDebug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDateTime pausedUntil = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime getPausedUntil() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getAction() {
            return null;
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime pausedUntil, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> action) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.status.StatusPausedItem.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime pausedUntil, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> action) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u00a8\u0006\f"}, d2 = {"Lnl/rijksoverheid/en/status/StatusPausedItem$Companion;", "", "()V", "forStatus", "Lnl/rijksoverheid/en/status/StatusPausedItem;", "state", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState$Paused;", "onAction", "Lkotlin/Function2;", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "Lnl/rijksoverheid/en/status/StatusSection$NotificationAction;", "", "app_accDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final nl.rijksoverheid.en.status.StatusPausedItem forStatus(@org.jetbrains.annotations.NotNull()
        nl.rijksoverheid.en.status.StatusViewModel.NotificationState.Paused state, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super nl.rijksoverheid.en.status.StatusViewModel.NotificationState, ? super nl.rijksoverheid.en.status.StatusSection.NotificationAction, kotlin.Unit> onAction) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}