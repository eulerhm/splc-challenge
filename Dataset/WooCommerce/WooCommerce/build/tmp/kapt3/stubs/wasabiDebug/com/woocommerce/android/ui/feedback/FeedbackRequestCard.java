package com.woocommerce.android.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/feedback/FeedbackRequestCard;", "Lcom/woocommerce/android/widgets/WCElevatedConstraintLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/FeedbackRequestCardBinding;", "initView", "", "negativeButtonAction", "Lkotlin/Function0;", "positiveButtonAction", "WooCommerce_wasabiDebug"})
public final class FeedbackRequestCard extends com.woocommerce.android.widgets.WCElevatedConstraintLayout {
    private final com.woocommerce.android.databinding.FeedbackRequestCardBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public FeedbackRequestCard(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FeedbackRequestCard(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FeedbackRequestCard(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    /**
     * Sets the click listeners for the buttons on this card
     *
     * @param negativeButtonAction The action to perform when the user clicks "Could be better"
     * @param positiveButtonAction The action to perform when the user clicks "I like it"
     */
    public final void initView(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> negativeButtonAction, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveButtonAction) {
    }
}