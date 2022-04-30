package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Dialog that tells the user to sign in to continue the operation.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInDialogFragment;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "Lcom/google/samples/apps/iosched/databinding/DialogSignInBinding;", "signInHandler", "Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "getSignInHandler", "()Lcom/google/samples/apps/iosched/util/signin/SignInHandler;", "setSignInHandler", "(Lcom/google/samples/apps/iosched/util/signin/SignInHandler;)V", "signInViewModel", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModel;", "getSignInViewModel", "()Lcom/google/samples/apps/iosched/ui/signin/SignInViewModel;", "signInViewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "mobile_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SignInDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.util.signin.SignInHandler signInHandler;
    private final kotlin.Lazy signInViewModel$delegate = null;
    private com.google.samples.apps.iosched.databinding.DialogSignInBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIALOG_SIGN_IN = "dialog_sign_in";
    public static final int REQUEST_CODE_SIGN_IN = 42;
    public static final com.google.samples.apps.iosched.ui.signin.SignInDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.util.signin.SignInHandler getSignInHandler() {
        return null;
    }
    
    public final void setSignInHandler(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.util.signin.SignInHandler p0) {
    }
    
    private final com.google.samples.apps.iosched.ui.signin.SignInViewModel getSignInViewModel() {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public SignInDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInDialogFragment$Companion;", "", "()V", "DIALOG_SIGN_IN", "", "REQUEST_CODE_SIGN_IN", "", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}