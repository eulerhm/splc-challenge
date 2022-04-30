package nl.rijksoverheid.en.status;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB%\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem;", "Lnl/rijksoverheid/en/items/ActionItem;", "icon", "", "title", "subtitle", "(III)V", "About", "GenericNotification", "LabTest", "RequestTest", "Settings", "Share", "Lnl/rijksoverheid/en/status/StatusActionItem$About;", "Lnl/rijksoverheid/en/status/StatusActionItem$Settings;", "Lnl/rijksoverheid/en/status/StatusActionItem$Share;", "Lnl/rijksoverheid/en/status/StatusActionItem$GenericNotification;", "Lnl/rijksoverheid/en/status/StatusActionItem$RequestTest;", "Lnl/rijksoverheid/en/status/StatusActionItem$LabTest;", "app_accDebug"})
public abstract class StatusActionItem extends nl.rijksoverheid.en.items.ActionItem {
    
    private StatusActionItem(@androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int subtitle) {
        super(0, 0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$About;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class About extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.About INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private About() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$Settings;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class Settings extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.Settings INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private Settings() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$Share;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class Share extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.Share INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private Share() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$GenericNotification;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class GenericNotification extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.GenericNotification INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private GenericNotification() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$RequestTest;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class RequestTest extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.RequestTest INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private RequestTest() {
            super(0, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/status/StatusActionItem$LabTest;", "Lnl/rijksoverheid/en/status/StatusActionItem;", "()V", "isSameAs", "", "other", "Lcom/xwray/groupie/Item;", "app_accDebug"})
    public static final class LabTest extends nl.rijksoverheid.en.status.StatusActionItem {
        @org.jetbrains.annotations.NotNull()
        public static final nl.rijksoverheid.en.status.StatusActionItem.LabTest INSTANCE = null;
        
        @java.lang.Override()
        public boolean isSameAs(@org.jetbrains.annotations.NotNull()
        com.xwray.groupie.Item<?> other) {
            return false;
        }
        
        private LabTest() {
            super(0, 0, 0);
        }
    }
}