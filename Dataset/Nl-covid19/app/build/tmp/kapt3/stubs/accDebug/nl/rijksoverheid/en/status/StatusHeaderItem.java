package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\u0014\u0010\u0018\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lnl/rijksoverheid/en/status/StatusHeaderItem;", "Lnl/rijksoverheid/en/items/BaseBindableItem;", "Lnl/rijksoverheid/en/databinding/ItemStatusHeaderBinding;", "headerState", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "primaryAction", "Lkotlin/Function0;", "", "secondaryAction", "(Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "currentViewBinding", "refreshTimer", "Lnl/rijksoverheid/en/util/SimpleCountdownTimer;", "viewState", "Lnl/rijksoverheid/en/status/StatusHeaderItem$HeaderViewState;", "bind", "viewBinding", "position", "", "getLayout", "hasSameContentAs", "", "other", "Lcom/xwray/groupie/Item;", "isSameAs", "unbind", "viewHolder", "Lcom/xwray/groupie/viewbinding/GroupieViewHolder;", "HeaderViewState", "app_accDebug"})
public final class StatusHeaderItem extends nl.rijksoverheid.en.items.BaseBindableItem<nl.rijksoverheid.en.databinding.ItemStatusHeaderBinding> {
    private final nl.rijksoverheid.en.status.StatusHeaderItem.HeaderViewState viewState = null;
    private nl.rijksoverheid.en.util.SimpleCountdownTimer refreshTimer;
    private nl.rijksoverheid.en.databinding.ItemStatusHeaderBinding currentViewBinding;
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.databinding.ItemStatusHeaderBinding viewBinding, int position) {
    }
    
    @java.lang.Override()
    public void unbind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.viewbinding.GroupieViewHolder<nl.rijksoverheid.en.databinding.ItemStatusHeaderBinding> viewHolder) {
    }
    
    @java.lang.Override()
    public boolean isSameAs(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Item<?> other) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasSameContentAs(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.Item<?> other) {
        return false;
    }
    
    public StatusHeaderItem(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusViewModel.HeaderState headerState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> primaryAction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> secondaryAction) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H&R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\'\u0010\u001b\u00a8\u0006,"}, d2 = {"Lnl/rijksoverheid/en/status/StatusHeaderItem$HeaderViewState;", "", "background", "", "iconContentDescription", "headline", "animatedIcon", "icon", "showIllustration", "", "enableActionLabel", "whatsNextActionLabel", "resetActionLabel", "enableAction", "Lkotlin/Function0;", "", "whatsNextAction", "resetAction", "refreshDescriptionUntil", "Ljava/time/LocalDateTime;", "(IIIIIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/time/LocalDateTime;)V", "getAnimatedIcon", "()I", "getBackground", "getEnableAction", "()Lkotlin/jvm/functions/Function0;", "getEnableActionLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeadline", "getIcon", "getIconContentDescription", "getRefreshDescriptionUntil", "()Ljava/time/LocalDateTime;", "getResetAction", "getResetActionLabel", "getShowIllustration", "()Z", "getWhatsNextAction", "getWhatsNextActionLabel", "getDescription", "", "context", "Landroid/content/Context;", "app_accDebug"})
    public static abstract class HeaderViewState {
        private final int background = 0;
        private final int iconContentDescription = 0;
        private final int headline = 0;
        private final int animatedIcon = 0;
        private final int icon = 0;
        private final boolean showIllustration = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer enableActionLabel = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer whatsNextActionLabel = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer resetActionLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> enableAction = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> whatsNextAction = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> resetAction = null;
        @org.jetbrains.annotations.Nullable()
        private final java.time.LocalDateTime refreshDescriptionUntil = null;
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.CharSequence getDescription(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        public final int getBackground() {
            return 0;
        }
        
        public final int getIconContentDescription() {
            return 0;
        }
        
        public final int getHeadline() {
            return 0;
        }
        
        public final int getAnimatedIcon() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final boolean getShowIllustration() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getEnableActionLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWhatsNextActionLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getResetActionLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getEnableAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getWhatsNextAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getResetAction() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.time.LocalDateTime getRefreshDescriptionUntil() {
            return null;
        }
        
        public HeaderViewState(@androidx.annotation.DrawableRes()
        int background, @androidx.annotation.StringRes()
        int iconContentDescription, @androidx.annotation.StringRes()
        int headline, @androidx.annotation.RawRes()
        int animatedIcon, @androidx.annotation.DrawableRes()
        int icon, boolean showIllustration, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.StringRes()
        java.lang.Integer enableActionLabel, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.StringRes()
        java.lang.Integer whatsNextActionLabel, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.StringRes()
        java.lang.Integer resetActionLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> enableAction, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> whatsNextAction, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> resetAction, @org.jetbrains.annotations.Nullable()
        java.time.LocalDateTime refreshDescriptionUntil) {
            super();
        }
    }
}