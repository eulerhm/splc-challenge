package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom View that encapsulates a [TextInputLayout] and [TextInputEditText], and as such has the following
 * capabilities:
 * - Show helper text
 * - Show error text
 * - Enable/set counter and maxLength
 * - Set the text on the child [TextInputEditText]
 * - Set the selected text on the child [TextInputEditText]
 *
 * The entire view acts as a single component. The following attributes have been exposed to this view as
 * custom attributes and are used to interact with the nested [TextInputEditText] component:
 * - [android:inputType]
 * - [android:maxLength]
 * - [android:enabled]
 * - [android:text]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0001:B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0014J\u0018\u0010#\u001a\u00020\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0014J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0014J\n\u0010&\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010\'\u001a\u00020\"2\u0006\u0010%\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0007J)\u0010+\u001a\u00020\u001e2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002000-J+\u00101\u001a\u00020\u001e2#\u0010,\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u000102\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u001e0-J\u0016\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007J\u000e\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u0011J\u0010\u00108\u001a\u00020\u001e2\b\b\u0002\u00109\u001a\u000200R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedEditTextView;", "Lcom/google/android/material/textfield/TextInputLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ViewMaterialOutlinedEdittextBinding;", "value", "imeOptions", "getImeOptions", "()I", "setImeOptions", "(I)V", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Landroid/text/TextWatcher;", "textWatcher", "getTextWatcher", "()Landroid/text/TextWatcher;", "setTextWatcher", "(Landroid/text/TextWatcher;)V", "clearError", "", "dispatchRestoreInstanceState", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchSaveInstanceState", "onRestoreInstanceState", "state", "onSaveInstanceState", "restoreViewState", "Lcom/woocommerce/android/widgets/WCSavedState;", "setMaxLength", "max", "setOnEditorActionListener", "cb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "setOnTextChangedListener", "Landroid/text/Editable;", "setSelection", "start", "stop", "setTextIfDifferent", "newText", "showKeyboard", "selectAll", "Companion", "WooCommerce_vanillaDebug"})
public final class WCMaterialOutlinedEditTextView extends com.google.android.material.textfield.TextInputLayout {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView.Companion Companion = null;
    private static final java.lang.String KEY_SUPER_STATE = "WC-OUTLINED-EDITTEXT-VIEW-SUPER-STATE";
    private final com.woocommerce.android.databinding.ViewMaterialOutlinedEdittextBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private android.text.TextWatcher textWatcher;
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedEditTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedEditTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedEditTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, @androidx.annotation.AttrRes()
    int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher getTextWatcher() {
        return null;
    }
    
    public final void setTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int getImeOptions() {
        return 0;
    }
    
    public final void setImeOptions(int value) {
    }
    
    /**
     * Updates the text only if the current content is different from the supplied one.
     * Helpful when this view is inside a RecyclerView to avoid resetting the cursor position and recursive listener
     * events.
     */
    public final void setTextIfDifferent(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
    
    public final void setSelection(int start, int stop) {
    }
    
    public final void setOnTextChangedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> cb) {
    }
    
    public final void setOnEditorActionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> cb) {
    }
    
    public final void clearError() {
    }
    
    public final void setMaxLength(int max) {
    }
    
    public final void showKeyboard(boolean selectAll) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    private final android.os.Parcelable restoreViewState(com.woocommerce.android.widgets.WCSavedState state) {
        return null;
    }
    
    @java.lang.Override()
    protected void dispatchSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.util.SparseArray<android.os.Parcelable> container) {
    }
    
    @java.lang.Override()
    protected void dispatchRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.util.SparseArray<android.os.Parcelable> container) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedEditTextView$Companion;", "", "()V", "KEY_SUPER_STATE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}