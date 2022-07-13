package com.woocommerce.android.ui.inbox.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002*+BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/inbox/domain/InboxNote;", "", "id", "", "title", "", "description", "dateCreated", "status", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote$Status;", "type", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote$NoteType;", "actions", "", "Lcom/woocommerce/android/ui/inbox/domain/InboxNoteAction;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woocommerce/android/ui/inbox/domain/InboxNote$Status;Lcom/woocommerce/android/ui/inbox/domain/InboxNote$NoteType;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getDateCreated", "()Ljava/lang/String;", "getDescription", "getId", "()J", "getStatus", "()Lcom/woocommerce/android/ui/inbox/domain/InboxNote$Status;", "getTitle", "getType", "()Lcom/woocommerce/android/ui/inbox/domain/InboxNote$NoteType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "NoteType", "Status", "WooCommerce_vanillaDebug"})
public final class InboxNote {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateCreated = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.ui.inbox.domain.InboxNote.Status status = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNoteAction> actions = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.inbox.domain.InboxNote copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String dateCreated, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.inbox.domain.InboxNote.Status status, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType type, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNoteAction> actions) {
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
    
    public InboxNote(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String dateCreated, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.inbox.domain.InboxNote.Status status, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType type, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNoteAction> actions) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.inbox.domain.InboxNote.Status component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.inbox.domain.InboxNote.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNoteAction> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNoteAction> getActions() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/inbox/domain/InboxNote$Status;", "", "(Ljava/lang/String;I)V", "UNACTIONED", "ACTIONED", "SNOOZED", "UNKNOWN", "WooCommerce_vanillaDebug"})
    public static enum Status {
        /*public static final*/ UNACTIONED /* = new UNACTIONED() */,
        /*public static final*/ ACTIONED /* = new ACTIONED() */,
        /*public static final*/ SNOOZED /* = new SNOOZED() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/inbox/domain/InboxNote$NoteType;", "", "(Ljava/lang/String;I)V", "INFO", "MARKETING", "SURVEY", "WARNING", "WooCommerce_vanillaDebug"})
    public static enum NoteType {
        /*public static final*/ INFO /* = new INFO() */,
        /*public static final*/ MARKETING /* = new MARKETING() */,
        /*public static final*/ SURVEY /* = new SURVEY() */,
        /*public static final*/ WARNING /* = new WARNING() */;
        
        NoteType() {
        }
    }
}