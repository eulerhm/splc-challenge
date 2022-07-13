package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J+\u0010\u0014\u001a\u00020\u00132#\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00130\u0016J(\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fJ\u0016\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/products/WCProductPropertyEditableView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "badgeTextView", "Lcom/google/android/material/textview/MaterialTextView;", "kotlin.jvm.PlatformType", "editableText", "Landroid/widget/EditText;", "isTextChangeListenerActive", "", "view", "Landroid/view/View;", "hideBadge", "", "setOnTextChangedListener", "cb", "Lkotlin/Function1;", "Landroid/text/Editable;", "Lkotlin/ParameterName;", "name", "text", "show", "hint", "", "detail", "isFocused", "isReadOnly", "showBadge", "badgeTextRes", "badgeColorRes", "WooCommerce_wasabiDebug"})
public final class WCProductPropertyEditableView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.view.View view = null;
    private final android.widget.EditText editableText = null;
    private final com.google.android.material.textview.MaterialTextView badgeTextView = null;
    private boolean isTextChangeListenerActive = false;
    
    @kotlin.jvm.JvmOverloads
    public WCProductPropertyEditableView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCProductPropertyEditableView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCProductPropertyEditableView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    java.lang.String hint, @org.jetbrains.annotations.Nullable
    java.lang.String detail, boolean isFocused, boolean isReadOnly) {
    }
    
    public final void showBadge(int badgeTextRes, int badgeColorRes) {
    }
    
    public final void hideBadge() {
    }
    
    public final void setOnTextChangedListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> cb) {
    }
}