package com.google.samples.apps.iosched.ui.reservation;

import java.lang.System;

/**
 * Dialog that confirms the user really wants to cancel their reservation
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "viewModel", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationViewModel;", "getViewModel", "()Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "formatRemoveReservationMessage", "", "res", "Landroid/content/res/Resources;", "sessionTitle", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "", "view", "Companion", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RemoveReservationDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIALOG_REMOVE_RESERVATION = "dialog_remove_reservation";
    private static final java.lang.String USER_ID_KEY = "user_id";
    private static final java.lang.String SESSION_ID_KEY = "session_id";
    private static final java.lang.String SESSION_TITLE_KEY = "session_title";
    public static final com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.google.samples.apps.iosched.ui.reservation.RemoveReservationViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.CharSequence formatRemoveReservationMessage(android.content.res.Resources res, java.lang.String sessionTitle) {
        return null;
    }
    
    public RemoveReservationDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogFragment$Companion;", "", "()V", "DIALOG_REMOVE_RESERVATION", "", "SESSION_ID_KEY", "SESSION_TITLE_KEY", "USER_ID_KEY", "newInstance", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogFragment;", "parameters", "Lcom/google/samples/apps/iosched/ui/reservation/RemoveReservationDialogParameters;", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.reservation.RemoveReservationDialogParameters parameters) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}