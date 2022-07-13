package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Used by product detail to show product property name & value, with an optional ratingBar
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J-\u0010\u001a\u001a\u00020\u00142%\b\u0002\u0010\u001b\u001a\u001f\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00142\b\b\u0001\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%JC\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00172\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010-R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/products/WCProductPropertyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "propertyGroupIcon", "Landroid/widget/ImageView;", "propertyGroupImg", "propertyNameText", "Landroid/widget/TextView;", "propertyValueText", "ratingBar", "Landroid/widget/RatingBar;", "view", "Landroid/view/View;", "ensureViewCreated", "", "orientation", "isRating", "", "removeClickListener", "resetColors", "setClickListener", "onClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setForegroundColor", "color", "setMaxLines", "maxLines", "setRating", "rating", "", "show", "caption", "", "detail", "", "showTitle", "propertyIcon", "(ILjava/lang/String;Ljava/lang/CharSequence;ZLjava/lang/Integer;Z)V", "WooCommerce_vanillaDebug"})
public final class WCProductPropertyView extends androidx.constraintlayout.widget.ConstraintLayout {
    private android.view.View view;
    private android.widget.ImageView propertyGroupImg;
    private android.widget.ImageView propertyGroupIcon;
    private android.widget.TextView propertyNameText;
    private android.widget.TextView propertyValueText;
    private android.widget.RatingBar ratingBar;
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void show(int orientation, @org.jetbrains.annotations.NotNull()
    java.lang.String caption, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence detail, boolean showTitle, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer propertyIcon, boolean isRating) {
    }
    
    /**
     * Adds a click listener to the property view
     */
    public final void setClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onClickListener) {
    }
    
    public final void removeClickListener() {
    }
    
    public final void setMaxLines(int maxLines) {
    }
    
    public final void setRating(float rating) {
    }
    
    public final void setForegroundColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void resetColors() {
    }
    
    private final void ensureViewCreated(int orientation, boolean isRating) {
    }
}