package com.woocommerce.android.ui.inbox.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cJ\f\u0010\u001f\u001a\u00020 *\u00020!H\u0002J\f\u0010\"\u001a\u00020\u001e*\u00020#H\u0002J\f\u0010$\u001a\u00020%*\u00020&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/inbox/domain/InboxRepository;", "", "inboxStore", "Lorg/wordpress/android/fluxc/store/WCInboxStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/store/WCInboxStore;Lcom/woocommerce/android/tools/SelectedSite;)V", "dismissAllNotesForCurrentSite", "Lkotlin/Result;", "", "dismissAllNotesForCurrentSite-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismissNote", "noteId", "", "dismissNote-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchInboxNotes", "fetchInboxNotes-IoAF18A", "inboxNoteTypeFromString", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote$NoteType;", "typeName", "", "markInboxNoteAsActioned", "noteActionId", "markInboxNoteAsActioned-0E7RQCE", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeInboxNotes", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote;", "toInboxAction", "Lcom/woocommerce/android/ui/inbox/domain/InboxNoteAction;", "Lorg/wordpress/android/fluxc/persistence/entity/InboxNoteActionEntity;", "toInboxNote", "Lorg/wordpress/android/fluxc/persistence/entity/InboxNoteWithActions;", "toInboxNoteStatus", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote$Status;", "Lorg/wordpress/android/fluxc/persistence/entity/InboxNoteEntity$LocalInboxNoteStatus;", "WooCommerce_wasabiDebug"})
public final class InboxRepository {
    private final org.wordpress.android.fluxc.store.WCInboxStore inboxStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    
    @javax.inject.Inject
    public InboxRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCInboxStore inboxStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.woocommerce.android.ui.inbox.domain.InboxNote>> observeInboxNotes() {
        return null;
    }
    
    private final com.woocommerce.android.ui.inbox.domain.InboxNote toInboxNote(org.wordpress.android.fluxc.persistence.entity.InboxNoteWithActions $this$toInboxNote) {
        return null;
    }
    
    private final com.woocommerce.android.ui.inbox.domain.InboxNote.NoteType inboxNoteTypeFromString(java.lang.String typeName) {
        return null;
    }
    
    private final com.woocommerce.android.ui.inbox.domain.InboxNoteAction toInboxAction(org.wordpress.android.fluxc.persistence.entity.InboxNoteActionEntity $this$toInboxAction) {
        return null;
    }
    
    private final com.woocommerce.android.ui.inbox.domain.InboxNote.Status toInboxNoteStatus(org.wordpress.android.fluxc.persistence.entity.InboxNoteEntity.LocalInboxNoteStatus $this$toInboxNoteStatus) {
        return null;
    }
}