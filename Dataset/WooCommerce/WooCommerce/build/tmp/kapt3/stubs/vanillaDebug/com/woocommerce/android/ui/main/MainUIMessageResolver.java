package com.woocommerce.android.ui.main;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityScoped()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/main/MainUIMessageResolver;", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "activity", "Lcom/woocommerce/android/ui/main/MainActivity;", "(Lcom/woocommerce/android/ui/main/MainActivity;)V", "snackbarRoot", "Landroid/view/ViewGroup;", "getSnackbarRoot", "()Landroid/view/ViewGroup;", "snackbarRoot$delegate", "Lkotlin/Lazy;", "WooCommerce_vanillaDebug"})
public final class MainUIMessageResolver implements com.woocommerce.android.ui.base.UIMessageResolver {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy snackbarRoot$delegate = null;
    
    @javax.inject.Inject()
    public MainUIMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.main.MainActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewGroup getSnackbarRoot() {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying the provided message and a generic action button.
     *
     * @param [message] The message string
     * @param [message] The action string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@androidx.annotation.StringRes()
    int message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    java.lang.String actionText, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying the provided message and a generic action button.
     *
     * @param [message] The message string
     * @param [message] The action string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    java.lang.String actionText, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying a message to restart the app once the in app update has been
     * successfully installed
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the install button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getRestartSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the retry button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getRetrySnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Create and return a snackbar with the provided message.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String... stringArgs) {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getUndoSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [message] The message string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.snackbar.Snackbar getUndoSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener) {
        return null;
    }
    
    /**
     * Display a snackbar with the provided string resource.
     *
     * @param [msgId] The resource ID of the message to display in the snackbar
     */
    public void showSnack(@androidx.annotation.StringRes()
    int msgId) {
    }
    
    /**
     * Display a snackbar with the provided [UiString].
     *
     * @param [message] The message to display in the snackbar
     */
    public void showSnack(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiString message) {
    }
    
    /**
     * Display a snackbar with the provided message.
     *
     * @param [msg] The message to display in the snackbar
     */
    public void showSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}