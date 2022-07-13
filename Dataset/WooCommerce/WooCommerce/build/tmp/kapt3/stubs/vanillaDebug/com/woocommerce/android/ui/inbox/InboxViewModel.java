package com.woocommerce.android.ui.inbox;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 >2\u00020\u0001:\u0005>?@ABB\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\"H\u0002J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\u0018\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0011\u0010(\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0018H\u0002J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u001eH\u0002J(\u0010-\u001a\u00020\u00182\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180/2\b\b\u0002\u00100\u001a\u00020\u0013H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J \u00102\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u0013H\u0002J\u001a\u00104\u001a\u00020\u0018*\u0002052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001606H\u0002J\f\u00107\u001a\u000208*\u000209H\u0002J\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u000205H\u0002J\u0014\u0010;\u001a\u00020\u0016*\u0002092\u0006\u0010<\u001a\u00020\u001bH\u0002J\f\u0010=\u001a\u00020\'*\u000205H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "inboxRepository", "Lcom/woocommerce/android/ui/inbox/domain/InboxRepository;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/util/DateUtils;Lcom/woocommerce/android/ui/inbox/domain/InboxRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_inboxState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxState;", "inboxState", "Landroidx/lifecycle/LiveData;", "getInboxState", "()Landroidx/lifecycle/LiveData;", "actionsHaveDismiss", "", "noteActionsUi", "", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionUi;", "dismissAllNotes", "", "dismissNote", "actionId", "", "noteId", "formatNoteCreationDate", "", "createdDate", "handleInboxNoteAction", "inboxNotesLocalUpdates", "Lkotlinx/coroutines/flow/Flow;", "markSurveyAsAnswered", "onSwipeToRefresh", "openActionUrl", "clickedNote", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteUi;", "refreshNotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showSyncError", "trackInboxNoteActionClicked", "actionValue", "trackInboxNotesLoaded", "result", "Lkotlin/Result;", "isLoadingMore", "(Ljava/lang/Object;Z)V", "updateDismissingActionState", "isDimissing", "addDismissActionIfMissing", "Lcom/woocommerce/android/ui/inbox/domain/InboxNote;", "", "getActionTextColor", "", "Lcom/woocommerce/android/ui/inbox/domain/InboxNoteAction;", "mapInboxActionsToUi", "toInboxActionUi", "parentNoteId", "toInboxNoteUi", "Companion", "InboxNoteActionEvent", "InboxNoteActionUi", "InboxNoteUi", "InboxState", "WooCommerce_vanillaDebug"})
public final class InboxViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    private final com.woocommerce.android.ui.inbox.domain.InboxRepository inboxRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.inbox.InboxViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_DISMISS_LABEL = "Dismiss";
    private final androidx.lifecycle.MutableLiveData<com.woocommerce.android.ui.inbox.InboxViewModel.InboxState> _inboxState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.woocommerce.android.ui.inbox.InboxViewModel.InboxState> inboxState = null;
    
    @javax.inject.Inject()
    public InboxViewModel(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils dateUtils, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.inbox.domain.InboxRepository inboxRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedState) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.woocommerce.android.ui.inbox.InboxViewModel.InboxState> getInboxState() {
        return null;
    }
    
    private final void trackInboxNotesLoaded(java.lang.Object result, boolean isLoadingMore) {
    }
    
    private final void trackInboxNoteActionClicked(java.lang.String actionValue) {
    }
    
    public final void dismissAllNotes() {
    }
    
    private final void onSwipeToRefresh() {
    }
    
    private final java.lang.Object refreshNotes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.inbox.InboxViewModel.InboxState> inboxNotesLocalUpdates() {
        return null;
    }
    
    private final com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi toInboxNoteUi(com.woocommerce.android.ui.inbox.domain.InboxNote $this$toInboxNoteUi) {
        return null;
    }
    
    private final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> mapInboxActionsToUi(com.woocommerce.android.ui.inbox.domain.InboxNote $this$mapInboxActionsToUi) {
        return null;
    }
    
    private final void addDismissActionIfMissing(com.woocommerce.android.ui.inbox.domain.InboxNote $this$addDismissActionIfMissing, java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> noteActionsUi) {
    }
    
    private final boolean actionsHaveDismiss(java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> noteActionsUi) {
        return false;
    }
    
    private final com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi toInboxActionUi(com.woocommerce.android.ui.inbox.domain.InboxNoteAction $this$toInboxActionUi, long parentNoteId) {
        return null;
    }
    
    private final void handleInboxNoteAction(long actionId, long noteId) {
    }
    
    private final void openActionUrl(com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi clickedNote, long actionId) {
    }
    
    private final void markSurveyAsAnswered(long noteId, long actionId) {
    }
    
    private final void dismissNote(long actionId, long noteId) {
    }
    
    private final void updateDismissingActionState(long noteId, long actionId, boolean isDimissing) {
    }
    
    private final void showSyncError() {
    }
    
    private final int getActionTextColor(com.woocommerce.android.ui.inbox.domain.InboxNoteAction $this$getActionTextColor) {
        return 0;
    }
    
    @java.lang.SuppressWarnings(value = {"MagicNumber", "ReturnCount"})
    private final java.lang.String formatNoteCreationDate(java.lang.String createdDate) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxState;", "", "isLoading", "", "notes", "", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteUi;", "onRefresh", "Lkotlin/Function0;", "", "isRefreshing", "(ZLjava/util/List;Lkotlin/jvm/functions/Function0;Z)V", "()Z", "getNotes", "()Ljava/util/List;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
    public static final class InboxState {
        private final boolean isLoading = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> notes = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh = null;
        private final boolean isRefreshing = false;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.inbox.InboxViewModel.InboxState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> notes, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, boolean isRefreshing) {
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
        
        public InboxState() {
            super();
        }
        
        public InboxState(boolean isLoading, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> notes, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, boolean isRefreshing) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isLoading() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> getNotes() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRefresh() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isRefreshing() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteUi;", "", "id", "", "title", "", "description", "dateCreated", "isSurvey", "", "isActioned", "actions", "", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionUi;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getActions", "()Ljava/util/List;", "getDateCreated", "()Ljava/lang/String;", "getDescription", "getId", "()J", "()Z", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class InboxNoteUi {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String dateCreated = null;
        private final boolean isSurvey = false;
        private final boolean isActioned = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> actions = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi copy(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String dateCreated, boolean isSurvey, boolean isActioned, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> actions) {
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
        
        public InboxNoteUi(long id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String dateCreated, boolean isSurvey, boolean isActioned, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> actions) {
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
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isSurvey() {
            return false;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isActioned() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> getActions() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\u001b\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\bH\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionUi;", "", "id", "", "parentNoteId", "label", "", "textColor", "", "url", "isDismissing", "", "onClick", "Lkotlin/Function2;", "", "(JJLjava/lang/String;ILjava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "getId", "()J", "()Z", "getLabel", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "getParentNoteId", "getTextColor", "()I", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class InboxNoteActionUi {
        private final long id = 0L;
        private final long parentNoteId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String label = null;
        private final int textColor = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        private final boolean isDismissing = false;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> onClick = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi copy(long id, long parentNoteId, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @androidx.annotation.ColorRes()
        int textColor, @org.jetbrains.annotations.NotNull()
        java.lang.String url, boolean isDismissing, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> onClick) {
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
        
        public InboxNoteActionUi(long id, long parentNoteId, @org.jetbrains.annotations.NotNull()
        java.lang.String label, @androidx.annotation.ColorRes()
        int textColor, @org.jetbrains.annotations.NotNull()
        java.lang.String url, boolean isDismissing, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> onClick) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getParentNoteId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getTextColor() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean isDismissing() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> getOnClick() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "OpenUrlEvent", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionEvent$OpenUrlEvent;", "WooCommerce_vanillaDebug"})
    public static abstract class InboxNoteActionEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        
        private InboxNoteActionEvent() {
            super(false);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionEvent$OpenUrlEvent;", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionEvent;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class OpenUrlEvent extends com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionEvent.OpenUrlEvent copy(@org.jetbrains.annotations.NotNull()
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
            
            public OpenUrlEvent(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super();
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
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/inbox/InboxViewModel$Companion;", "", "()V", "DEFAULT_DISMISS_LABEL", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}