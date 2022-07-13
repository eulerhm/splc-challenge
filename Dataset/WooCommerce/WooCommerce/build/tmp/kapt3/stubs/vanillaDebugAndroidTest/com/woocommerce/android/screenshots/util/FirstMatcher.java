package com.woocommerce.android.screenshots.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/screenshots/util/FirstMatcher;", "Lorg/hamcrest/TypeSafeMatcher;", "Landroid/view/View;", "()V", "hasMatched", "", "describeTo", "", "description", "Lorg/hamcrest/Description;", "matchesSafely", "item", "WooCommerce_vanillaDebug"})
public final class FirstMatcher extends org.hamcrest.TypeSafeMatcher<android.view.View> {
    private boolean hasMatched = false;
    
    public FirstMatcher() {
        super();
    }
    
    @java.lang.Override()
    protected boolean matchesSafely(@org.jetbrains.annotations.NotNull()
    android.view.View item) {
        return false;
    }
    
    @java.lang.Override()
    public void describeTo(@org.jetbrains.annotations.NotNull()
    org.hamcrest.Description description) {
    }
}