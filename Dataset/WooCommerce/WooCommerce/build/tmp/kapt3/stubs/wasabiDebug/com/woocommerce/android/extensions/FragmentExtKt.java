package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\u001a4\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\u001a1\u0010\u000b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0002\u0010\r\u001a=\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u0002H\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u0002H\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b\u00a8\u0006\u001c"}, d2 = {"handleDialogNotice", "", "T", "Landroidx/fragment/app/Fragment;", "key", "", "entryId", "", "handler", "Lkotlin/Function1;", "handleDialogResult", "handleNotice", "Lkotlin/Function0;", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "handleResult", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "navigateBackWithNotice", "destinationId", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Integer;)V", "navigateBackWithResult", "result", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;)V", "navigateToParentWithResult", "childId", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/Object;I)V", "pinFabAboveBottomNavigationBar", "fabButton", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "WooCommerce_wasabiDebug"})
public final class FragmentExtKt {
    
    /**
     * A helper function that sets the submitted key-value pair in the Fragment's SavedStateHandle. The value can be
     * observed as a LiveData using the same key - see the Fragment.handleResult() extension function. This mechanism is
     * used to facilitate the request-result communication between 2 separate fragments.
     *
     * @param [key] A unique string that is the same as the one used in [handleResult]
     * @param [result] A result value to be returned
     * @param [destinationId] an optional destinationId, that can be used to navigate up to a specified destination
     */
    public static final <T extends java.lang.Object>void navigateBackWithResult(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$navigateBackWithResult, @org.jetbrains.annotations.NotNull
    java.lang.String key, T result, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IdRes
    java.lang.Integer destinationId) {
    }
    
    /**
     * A helper function that pops back stack to the [childId] and then invokes [navigateBackWithResult]
     * This is useful for scenarios when the fragment returning result doesn't know who their parent is since
     * they can be added to the navigation graph from various places of the app
     *
     * @param [key] A unique string that is the same as the one used in [handleResult]
     * @param [result] A result value to be returned
     * @param [childId] an destinationId, that used to navigate up from the specified destination
     */
    public static final <T extends java.lang.Object>void navigateToParentWithResult(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$navigateToParentWithResult, @org.jetbrains.annotations.NotNull
    java.lang.String key, T result, @androidx.annotation.IdRes
    int childId) {
    }
    
    /**
     * A helper function that returns a notification in the Fragment's SavedStateHandle. Its purpose is to notify the caller
     * without returning any value. The notice can be observed as a LiveData using the same key - see the
     * Fragment.handleNotice() extension function.
     *
     * @param [key] A unique string that is the same as the one used in [handleNotice]
     * @param [destinationId] an optional destinationId, that can be used to navigating up to a specified destination
     */
    public static final void navigateBackWithNotice(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$navigateBackWithNotice, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IdRes
    java.lang.Integer destinationId) {
    }
    
    /**
     * A helper function that subscribes a supplied handler function to the Fragment's SavedStateHandle LiveData associated
     * with the supplied key.
     *
     * @param [key] A unique string that is the same as the one used in [navigateBackWithResult]
     * @param [entryId] An optional ID to identify the correct back stack entry. It's required when calling [handleResult]
     * from TopLevelFragment or Dialog (otherwise the result will get lost upon configuration change)
     * @param [handler] A result handler
     *
     * Note: The handler is called only if the value wasn't handled before (i.e. the data is fresh). Once the observer is
     * called, the boolean value is updated. This puts a limit on the number of observers for a particular key-result pair
     * to 1.
     */
    public static final <T extends java.lang.Object>void handleResult(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$handleResult, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Integer entryId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
    }
    
    /**
     * A helper function that subscribes a supplied handler function to the dialog Fragment's SavedStateHandle LiveData
     * associated with the supplied key. This method *must* be used for handling results from dialogs because the entry ID
     * is required.
     *
     * @param [key] A unique string that is the same as the one used in [navigateBackWithResult]
     * @param [entryId] A mandatory ID to identify the correct back stack entry. It's required when calling [handleResult]
     * from TopLevelFragment or Dialog (otherwise the result will get lost upon configuration change)
     * @param [handler] A result handler
     *
     * Note: The handler is called only if the value wasn't handled before (i.e. the data is fresh). Once the observer is
     * called, the value is nulled and the handler won't be called. This puts a limit on the number of observers for
     * a particular key-result pair to 1.
     */
    public static final <T extends java.lang.Object>void handleDialogResult(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$handleDialogResult, @org.jetbrains.annotations.NotNull
    java.lang.String key, int entryId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
    }
    
    /**
     * A helper function that subscribes a supplied notice handler function to the dialog Fragment's SavedStateHandle
     * LiveData associated with the supplied key. Its purpose is to handle a notice without any value.
     * This method *must* be used for handling notices from dialogs because the entry ID is required.
     *
     * @param [key] A unique string that is the same as the one used in [navigateBackWithNotice]
     * @param [entryId] A mandatory ID to identify the correct back stack entry. It's required when calling [handleNotice]
     * from TopLevelFragment or Dialog (otherwise the result will get lost upon configuration change)
     * @param [handler] A result handler
     *
     * Note: The handler is called only if the value wasn't handled before (i.e. the data is fresh). Once the observer is
     * called, the value is nulled and the handler won't be called. This puts a limit on the number of observers for
     * a particular key-result pair to 1.
     */
    public static final <T extends java.lang.Object>void handleDialogNotice(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$handleDialogNotice, @org.jetbrains.annotations.NotNull
    java.lang.String key, int entryId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handler) {
    }
    
    /**
     * A helper function that subscribes a supplied handler function to the Fragment's SavedStateHandle LiveData associated
     * with the supplied key. Its purpose is to handle a notice without any value.
     *
     * @param [key] A unique string that is the same as the one used in [navigateBackWithNotice]
     * @param [entryId] A mandatory ID to identify the correct back stack entry. It's required when calling [handleNotice]
     * from TopLevelFragment or Dialog (otherwise the result will get lost upon configuration change)
     * @param [handler] A result handler
     *
     * Note: The handler is called only if the value wasn't handled before (i.e. the data is fresh). Once the observer is
     * called, the value is nulled and the handler won't be called. This puts a limit on the number of observers for
     * a particular key-result pair to 1.
     */
    public static final void handleNotice(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$handleNotice, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Integer entryId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> handler) {
    }
    
    /**
     * A helper function that apply a flow observation to changes of the Fragment view vertical offset,
     * making possible to keep the FAB button pinned into the same position as the view is scrolled
     *
     * @param [fabButton] The FAB button to be pinned in place using the App Bar Layout as reference
     */
    public static final void pinFabAboveBottomNavigationBar(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$pinFabAboveBottomNavigationBar, @org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton fabButton) {
    }
}