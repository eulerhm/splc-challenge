package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Simple ViewGroup which contains two views:
 * 1. emptyLabel - button-styled TextView which appears when the text is empty, used as a call to action
 * 2. notEmptyLabel - WCSelectableTextView which appears when the text is NOT empty
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/widgets/WCActionableEmptyLabel;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/woocommerce/android/databinding/WcActionableEmptyLabelBinding;", "getBinding", "()Lcom/woocommerce/android/databinding/WcActionableEmptyLabelBinding;", "setIsReadOnly", "", "readOnly", "", "setText", "text", "", "emptyTextId", "", "maxLines", "WooCommerce_wasabiDebug"})
public final class WCActionableEmptyLabel extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.databinding.WcActionableEmptyLabelBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public WCActionableEmptyLabel(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCActionableEmptyLabel(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.databinding.WcActionableEmptyLabelBinding getBinding() {
        return null;
    }
    
    /**
     * @param text - the text to appear if it's not empty
     * @param emptyTextId - string id of the text to appear if text is empty
     * @param maxLines - optional max number of lines to display
     */
    public final void setText(@org.jetbrains.annotations.NotNull
    java.lang.String text, @androidx.annotation.StringRes
    int emptyTextId, int maxLines) {
    }
    
    /**
     * When the view is read-only we hide the pencil icon
     */
    public final void setIsReadOnly(boolean readOnly) {
    }
}