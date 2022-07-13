package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom View that mimics a TextInputEditText with a spinner that opens a selector dialog it.
 * This view will display a text box which will open a dialog when clicked.
 * The entire view acts as a single component.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0014J\u0018\u0010\u0010\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0014J\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0017H\u0002J)\u0010\u0018\u001a\u00020\f2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u001aJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0012J\u0010\u0010!\u001a\u00020\f2\b\b\u0001\u0010\"\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0012JI\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0&2\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\f0\u001a2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\u00120\u001a\u00a2\u0006\u0002\u0010)R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedSpinnerView;", "Lcom/google/android/material/textfield/TextInputLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ViewMaterialOutlinedSpinnerBinding;", "dispatchRestoreInstanceState", "", "container", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "dispatchSaveInstanceState", "getText", "", "onRestoreInstanceState", "state", "onSaveInstanceState", "restoreViewState", "Lcom/woocommerce/android/widgets/WCSavedState;", "setClickListener", "onClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "setHtmlText", "selectedText", "setText", "selectedTextRes", "setup", "T", "values", "", "onSelected", "mapper", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "WooCommerce_vanillaDebug"})
public final class WCMaterialOutlinedSpinnerView extends com.google.android.material.textfield.TextInputLayout {
    private final com.woocommerce.android.databinding.ViewMaterialOutlinedSpinnerBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.widgets.WCMaterialOutlinedSpinnerView.Companion Companion = null;
    private static final java.lang.String KEY_SUPER_STATE = "WC-OUTLINED-SPINNER-VIEW-SUPER-STATE";
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedSpinnerView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedSpinnerView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCMaterialOutlinedSpinnerView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, @androidx.annotation.AttrRes()
    int defStyleAttr) {
        super(null);
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onClickListener) {
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedText) {
    }
    
    public final void setText(@androidx.annotation.StringRes()
    int selectedTextRes) {
    }
    
    public final void setHtmlText(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final <T extends java.lang.Object>void setup(@org.jetbrains.annotations.NotNull()
    T[] values, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, java.lang.String> mapper) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/widgets/WCMaterialOutlinedSpinnerView$Companion;", "", "()V", "KEY_SUPER_STATE", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}