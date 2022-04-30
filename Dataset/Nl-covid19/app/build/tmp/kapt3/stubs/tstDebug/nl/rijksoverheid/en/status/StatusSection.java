package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J.\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019J.\u0010\u001b\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u001dR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lnl/rijksoverheid/en/status/StatusSection;", "Lcom/xwray/groupie/Section;", "()V", "headerGroup", "headerState", "Lnl/rijksoverheid/en/status/StatusViewModel$HeaderState;", "value", "Ljava/time/LocalDateTime;", "lastKeysProcessed", "getLastKeysProcessed", "()Ljava/time/LocalDateTime;", "setLastKeysProcessed", "(Ljava/time/LocalDateTime;)V", "notificationGroup", "notificationItems", "", "Lcom/xwray/groupie/Item;", "notificationStates", "", "Lnl/rijksoverheid/en/status/StatusViewModel$NotificationState;", "ensureInitialized", "", "refreshStateContent", "updateHeader", "primaryAction", "Lkotlin/Function0;", "secondaryAction", "updateNotifications", "onAction", "Lkotlin/Function2;", "Lnl/rijksoverheid/en/status/StatusSection$NotificationAction;", "NotificationAction", "app_tstDebug"})
public final class StatusSection extends com.xwray.groupie.Section {
    private nl.rijksoverheid.en.status.StatusViewModel.HeaderState headerState;
    private java.util.List<? extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState> notificationStates;
    private final com.xwray.groupie.Section headerGroup = null;
    private final com.xwray.groupie.Section notificationGroup = null;
    private final java.util.List<com.xwray.groupie.Item<?>> notificationItems = null;
    @org.jetbrains.annotations.Nullable()
    private java.time.LocalDateTime lastKeysProcessed;
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getLastKeysProcessed() {
        return null;
    }
    
    public final void setLastKeysProcessed(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime value) {
    }
    
    public final void refreshStateContent() {
    }
    
    public final void updateNotifications(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends nl.rijksoverheid.en.status.StatusViewModel.NotificationState> notificationStates, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super nl.rijksoverheid.en.status.StatusViewModel.NotificationState, ? super nl.rijksoverheid.en.status.StatusSection.NotificationAction, kotlin.Unit> onAction) {
    }
    
    public final void updateHeader(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusViewModel.HeaderState headerState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> primaryAction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> secondaryAction) {
    }
    
    private final void ensureInitialized() {
    }
    
    public StatusSection() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lnl/rijksoverheid/en/status/StatusSection$NotificationAction;", "", "(Ljava/lang/String;I)V", "Primary", "Secondary", "app_tstDebug"})
    public static enum NotificationAction {
        /*public static final*/ Primary /* = new Primary() */,
        /*public static final*/ Secondary /* = new Secondary() */;
        
        NotificationAction() {
        }
    }
}