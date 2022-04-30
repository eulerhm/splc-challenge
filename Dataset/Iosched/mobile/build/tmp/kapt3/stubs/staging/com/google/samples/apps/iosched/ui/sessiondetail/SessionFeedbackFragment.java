package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "viewModel", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackViewModel;", "getViewModel", "()Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "Listener", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SessionFeedbackFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String ARG_SESSION_ID = "session_id";
    public static final com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public SessionFeedbackFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment$Listener;", "", "onFeedbackSubmitted", "", "mobile_staging"})
    public static abstract interface Listener {
        
        public abstract void onFeedbackSubmitted();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0004j\u0002`\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment$Companion;", "", "()V", "ARG_SESSION_ID", "", "createInstance", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionFeedbackFragment;", "sessionId", "Lcom/google/samples/apps/iosched/model/SessionId;", "mobile_staging"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.samples.apps.iosched.ui.sessiondetail.SessionFeedbackFragment createInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String sessionId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}