package com.woocommerce.android.ui.inbox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0003\u001a\b\u0010\b\u001a\u00020\u0001H\u0003\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005H\u0007\u001a,\u0010\u0011\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0007\u001a\u0012\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0003\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\b\u0010\u001d\u001a\u00020\u0001H\u0007\u00a8\u0006\u001e"}, d2 = {"InboxEmptyCase", "", "InboxNoteActionsRow", "actions", "", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteActionUi;", "InboxNoteButtonsSkeleton", "InboxNoteContentRowsSkeleton", "InboxNoteHeaderSkeleton", "InboxNoteItemSkeleton", "InboxNoteRow", "note", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxNoteUi;", "InboxNoteSurveyAction", "inboxAction", "InboxNoteSurveyActionsRow", "InboxNoteTextAction", "InboxNotes", "notes", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "InboxPreview", "state", "Lcom/woocommerce/android/ui/inbox/InboxViewModel$InboxState;", "InboxScreen", "viewModel", "Lcom/woocommerce/android/ui/inbox/InboxViewModel;", "InboxSkeletons", "WooCommerce_wasabiDebug"})
public final class InboxScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void InboxScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.inbox.InboxViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.inbox.InboxViewModel.InboxState state) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxEmptyCase() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxNotes(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi> notes, boolean isRefreshing, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxNoteRow(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteUi note) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void InboxNoteActionsRow(java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> actions) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void InboxNoteSurveyActionsRow(java.util.List<com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi> actions) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxNoteTextAction(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi inboxAction) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxNoteSurveyAction(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.inbox.InboxViewModel.InboxNoteActionUi inboxAction) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxSkeletons() {
    }
    
    @androidx.compose.runtime.Composable
    public static final void InboxNoteItemSkeleton() {
    }
    
    @androidx.compose.runtime.Composable
    private static final void InboxNoteHeaderSkeleton() {
    }
    
    @androidx.compose.runtime.Composable
    private static final void InboxNoteContentRowsSkeleton() {
    }
    
    @androidx.compose.runtime.Composable
    private static final void InboxNoteButtonsSkeleton() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    private static final void InboxPreview(@androidx.compose.ui.tooling.preview.PreviewParameter(provider = com.woocommerce.android.ui.inbox.SampleInboxProvider.class, limit = 1)
    com.woocommerce.android.ui.inbox.InboxViewModel.InboxState state) {
    }
}