package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Used by product detail to show product purchase note. If content is more than a certain number of lines it gets
 * cut off, and a "Read More" button appears below it.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/products/WCProductPropertyReadMoreView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "btnReadMore", "Lcom/google/android/material/button/MaterialButton;", "textCaption", "Lcom/google/android/material/textview/MaterialTextView;", "textContent", "show", "", "caption", "", "content", "maxLines", "showFullContent", "WooCommerce_vanillaDebug"})
public final class WCProductPropertyReadMoreView extends android.widget.LinearLayout {
    private com.google.android.material.textview.MaterialTextView textCaption;
    private com.google.android.material.textview.MaterialTextView textContent;
    private com.google.android.material.button.MaterialButton btnReadMore;
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyReadMoreView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyReadMoreView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCProductPropertyReadMoreView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    java.lang.String caption, @org.jetbrains.annotations.NotNull()
    java.lang.String content, int maxLines) {
    }
    
    private final void showFullContent(java.lang.String caption, java.lang.String content) {
    }
}