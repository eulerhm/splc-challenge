package com.woocommerce.android.ui.base;

import java.lang.System;

/**
 * Centralized snackbar creation and management. An implementing class could then be injected at the
 * Activity scope and reused for the duration of that context lifecycle. The benefit being that the implementing
 * class defines the snackbar root, the ease of injecting it straight into presenters for error handling without
 * having to pass directives over to the view, and ui testability.
 *
 * @see com.woocommerce.android.ui.main.MainUIMessageResolver
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010J;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J5\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0019J5\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0019J-\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016\u00a2\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J5\u0010\u001e\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0019J3\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\b\u001a\u00020\"H\u0016J\u0012\u0010 \u001a\u00020!2\b\b\u0001\u0010#\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/base/UIMessageResolver;", "", "snackbarRoot", "Landroid/view/ViewGroup;", "getSnackbarRoot", "()Landroid/view/ViewGroup;", "getIndefiniteActionSnack", "Lcom/google/android/material/snackbar/Snackbar;", "message", "", "stringArgs", "", "", "actionText", "actionListener", "Landroid/view/View$OnClickListener;", "(I[Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;", "getIndefiniteSnackbarWithAction", "view", "Landroid/view/View;", "msg", "actionString", "getRestartSnack", "stringResId", "(I[Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;", "getRetrySnack", "getSnack", "(I[Ljava/lang/String;)Lcom/google/android/material/snackbar/Snackbar;", "getSnackbarWithAction", "getUndoSnack", "(Ljava/lang/String;[Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;", "showSnack", "", "Lcom/woocommerce/android/model/UiString;", "msgId", "WooCommerce_vanillaDebug"})
public abstract interface UIMessageResolver {
    
    /**
     * Set by the implementing class. This is the root view the snackbar should be attached to. To enable
     * gesture support for the snackbar, this should be a CoordinatorLayout or a child of a CoordinatorLayout.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.ViewGroup getSnackbarRoot();
    
    /**
     * Create and return a snackbar displaying a message to restart the app once the in app update has been
     * successfully installed
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the install button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getRestartSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar displaying the provided message and a generic action button.
     *
     * @param [message] The message string
     * @param [message] The action string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    java.lang.String actionText, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar displaying the provided message and a generic action button.
     *
     * @param [message] The message string
     * @param [message] The action string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@androidx.annotation.StringRes()
    int message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    java.lang.String actionText, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getUndoSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [message] The message string
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the undo button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getUndoSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar displaying the provided message and a RETRY button.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     * @param [actionListener] Listener to handle the retry button click event
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getRetrySnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener actionListener);
    
    /**
     * Create and return a snackbar with the provided message.
     *
     * @param [stringResId] The string resource id of the base message
     * @param [stringArgs] Optional. One or more format argument stringArgs
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.snackbar.Snackbar getSnack(@androidx.annotation.StringRes()
    int stringResId, @org.jetbrains.annotations.NotNull()
    java.lang.String... stringArgs);
    
    /**
     * Display a snackbar with the provided message.
     *
     * @param [msg] The message to display in the snackbar
     */
    public abstract void showSnack(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    /**
     * Display a snackbar with the provided string resource.
     *
     * @param [msgId] The resource ID of the message to display in the snackbar
     */
    public abstract void showSnack(@androidx.annotation.StringRes()
    int msgId);
    
    /**
     * Display a snackbar with the provided [UiString].
     *
     * @param [message] The message to display in the snackbar
     */
    public abstract void showSnack(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiString message);
    
    /**
     * Centralized snackbar creation and management. An implementing class could then be injected at the
     * Activity scope and reused for the duration of that context lifecycle. The benefit being that the implementing
     * class defines the snackbar root, the ease of injecting it straight into presenters for error handling without
     * having to pass directives over to the view, and ui testability.
     *
     * @see com.woocommerce.android.ui.main.MainUIMessageResolver
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Create and return a snackbar displaying a message to restart the app once the in app update has been
         * successfully installed
         *
         * @param [stringResId] The string resource id of the base message
         * @param [stringArgs] Optional. One or more format argument stringArgs
         * @param [actionListener] Listener to handle the install button click event
         */
        @org.jetbrains.annotations.NotNull()
        public static com.google.android.material.snackbar.Snackbar getRestartSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
        int stringResId, @org.jetbrains.annotations.NotNull()
        java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
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
        public static com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
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
        public static com.google.android.material.snackbar.Snackbar getIndefiniteActionSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
        int message, @org.jetbrains.annotations.NotNull()
        java.lang.String[] stringArgs, @org.jetbrains.annotations.NotNull()
        java.lang.String actionText, @org.jetbrains.annotations.NotNull()
        android.view.View.OnClickListener actionListener) {
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
        public static com.google.android.material.snackbar.Snackbar getUndoSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
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
        public static com.google.android.material.snackbar.Snackbar getUndoSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
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
        public static com.google.android.material.snackbar.Snackbar getRetrySnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
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
        public static com.google.android.material.snackbar.Snackbar getSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
        int stringResId, @org.jetbrains.annotations.NotNull()
        java.lang.String... stringArgs) {
            return null;
        }
        
        /**
         * Display a snackbar with the provided message.
         *
         * @param [msg] The message to display in the snackbar
         */
        public static void showSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        /**
         * Display a snackbar with the provided string resource.
         *
         * @param [msgId] The resource ID of the message to display in the snackbar
         */
        public static void showSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @androidx.annotation.StringRes()
        int msgId) {
        }
        
        /**
         * Display a snackbar with the provided [UiString].
         *
         * @param [message] The message to display in the snackbar
         */
        public static void showSnack(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.base.UIMessageResolver $this, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.UiString message) {
        }
        
        private static com.google.android.material.snackbar.Snackbar getIndefiniteSnackbarWithAction(com.woocommerce.android.ui.base.UIMessageResolver $this, android.view.View view, java.lang.String msg, java.lang.String actionString, android.view.View.OnClickListener actionListener) {
            return null;
        }
        
        private static com.google.android.material.snackbar.Snackbar getSnackbarWithAction(com.woocommerce.android.ui.base.UIMessageResolver $this, android.view.View view, java.lang.String msg, java.lang.String actionString, android.view.View.OnClickListener actionListener) {
            return null;
        }
    }
}