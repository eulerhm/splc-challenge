package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010 J \u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/util/UiHelpers;", "", "()V", "adjustDialogSize", "", "dialog", "Landroid/app/Dialog;", "getPxOfUiDimen", "", "context", "Landroid/content/Context;", "uiDimen", "Lcom/woocommerce/android/model/UiDimen;", "getTextOfUiString", "", "uiString", "Lcom/woocommerce/android/model/UiString;", "setDrawableOrHide", "imageView", "Landroid/widget/ImageView;", "image", "Landroid/graphics/drawable/Drawable;", "setImageOrHideInLandscape", "resId", "setInvisible", "", "(Landroid/widget/ImageView;Ljava/lang/Integer;Z)V", "setTextOrHide", "view", "Landroid/widget/TextView;", "text", "", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "updateVisibility", "Landroid/view/View;", "visible", "WooCommerce_vanillaDebug"})
public final class UiHelpers {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.util.UiHelpers INSTANCE = null;
    
    private UiHelpers() {
        super();
    }
    
    public final int getPxOfUiDimen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiDimen uiDimen) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextOfUiString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.UiString uiString) {
        return null;
    }
    
    public final void updateVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean visible, boolean setInvisible) {
    }
    
    public final void setTextOrHide(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.UiString uiString) {
    }
    
    public final void setTextOrHide(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer resId) {
    }
    
    public final void setTextOrHide(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setImageOrHideInLandscape(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer resId, boolean setInvisible) {
    }
    
    public final void setDrawableOrHide(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable image) {
    }
    
    public final void adjustDialogSize(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
}