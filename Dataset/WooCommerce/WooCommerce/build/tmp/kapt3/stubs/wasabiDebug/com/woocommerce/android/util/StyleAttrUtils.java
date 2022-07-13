package com.woocommerce.android.util;

import java.lang.System;

/**
 * Helper functions for working with custom view attributes and styles.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J6\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000eJ2\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ2\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ,\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tJ2\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000eJ.\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007J2\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ2\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ6\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\tH\u0007J,\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tJ,\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/util/StyleAttrUtils;", "", "()V", "getBoolean", "", "a", "Landroid/content/res/TypedArray;", "isInEditMode", "appAttr", "", "toolsAttr", "defVal", "getColor", "getDimension", "", "getDimensionPixelOffset", "getDimensionPixelSize", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getFloat", "getFont", "Landroid/graphics/Typeface;", "getInt", "getInteger", "getResourceId", "getString", "", "getText", "", "WooCommerce_wasabiDebug"})
public final class StyleAttrUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.StyleAttrUtils INSTANCE = null;
    
    private StyleAttrUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr) {
        return null;
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, boolean defVal) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getText(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr) {
        return null;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, int defVal) {
        return 0;
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, float defVal) {
        return 0.0F;
    }
    
    @androidx.annotation.ColorInt
    public final int getColor(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, @androidx.annotation.ColorInt
    int defVal) {
        return 0;
    }
    
    public final int getInteger(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, int defVal) {
        return 0;
    }
    
    public final float getDimension(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, float defVal) {
        return 0.0F;
    }
    
    public final int getDimensionPixelOffset(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, int defVal) {
        return 0;
    }
    
    public final int getDimensionPixelSize(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, int defVal) {
        return 0;
    }
    
    @androidx.annotation.AnyRes
    public final int getResourceId(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr, @androidx.annotation.AnyRes
    int defVal) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.RequiresApi(value = 26)
    public final android.graphics.Typeface getFont(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray a, boolean isInEditMode, @androidx.annotation.StyleableRes
    int appAttr, @androidx.annotation.StyleableRes
    int toolsAttr) {
        return null;
    }
}