package com.woocommerce.android.helpers;

import java.lang.System;

/**
 * Custom matcher class to match drawables for ImageView
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/helpers/DrawableMatcher;", "Lorg/hamcrest/TypeSafeMatcher;", "Landroid/view/View;", "resourceId", "", "(I)V", "expectedId", "describeTo", "", "description", "Lorg/hamcrest/Description;", "getBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "matchesSafely", "", "item", "WooCommerce_vanillaDebug"})
public class DrawableMatcher extends org.hamcrest.TypeSafeMatcher<android.view.View> {
    private int expectedId = 0;
    
    public DrawableMatcher(int resourceId) {
        super();
    }
    
    @java.lang.Override()
    public void describeTo(@org.jetbrains.annotations.Nullable()
    org.hamcrest.Description description) {
    }
    
    @java.lang.Override()
    protected boolean matchesSafely(@org.jetbrains.annotations.Nullable()
    android.view.View item) {
        return false;
    }
    
    private final android.graphics.Bitmap getBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
}