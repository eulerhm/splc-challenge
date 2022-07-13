package com.woocommerce.android.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007j\u0002`\bH\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\n\u001a\"\u0010\u000b\u001a\u00020\u0001*\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u001a0\u0010\u0014\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0015\u001a\u00020\r2\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\b*\"\u0010\u0016\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007\u00a8\u0006\u0017"}, d2 = {"addLinkListener", "", "strBuilder", "Landroid/text/SpannableStringBuilder;", "span", "Landroid/text/style/ClickableSpan;", "onLinkClicked", "Lkotlin/Function1;", "Lcom/woocommerce/android/extensions/OnLinkClicked;", "selectAllText", "Landroid/widget/TextView;", "setClickableText", "content", "", "clickableContent", "clickAction", "Lcom/woocommerce/android/widgets/WooClickableSpan;", "setDrawableColor", "colorRes", "", "setHtmlText", "html", "OnLinkClicked", "WooCommerce_wasabiDebug"})
public final class TextViewExtKt {
    
    /**
     * Sets the TextView text from a raw HTML string.
     *
     * Optionally, provide an extra [onLinkClicked] callback to be triggered when any of the links in the HTML are clicked.
     * The callback is triggered in addition to the default link handling behavior, it does not override it.
     */
    public static final void setHtmlText(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setHtmlText, @org.jetbrains.annotations.NotNull
    java.lang.String html, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super android.text.style.ClickableSpan, kotlin.Unit> onLinkClicked) {
    }
    
    private static final void addLinkListener(android.text.SpannableStringBuilder strBuilder, android.text.style.ClickableSpan span, kotlin.jvm.functions.Function1<? super android.text.style.ClickableSpan, kotlin.Unit> onLinkClicked) {
    }
    
    /**
     * Programmatically set the drawable tint (android:drawableTint isn't supported in xml until API 23)
     */
    public static final void setDrawableColor(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setDrawableColor, @androidx.annotation.ColorRes
    int colorRes) {
    }
    
    /**
     * Makes any text range inside a TextView clickable with a special color and a URL redirection
     */
    public static final void setClickableText(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setClickableText, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.NotNull
    java.lang.String clickableContent, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.widgets.WooClickableSpan clickAction) {
    }
    
    public static final void selectAllText(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$selectAllText) {
    }
}