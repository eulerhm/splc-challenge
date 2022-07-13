package com.woocommerce.android.ui.orders.creation.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00011B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&J\u0010\u0010(\u001a\u00020$2\b\b\u0001\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,J\u0014\u0010-\u001a\u00020$2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020$0/J\u0012\u00100\u001a\u00020$2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00138F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010 \u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/views/OrderCreationSectionView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderCreationSectionBinding;", "value", "Landroid/view/View;", "content", "getContent", "()Landroid/view/View;", "setContent", "(Landroid/view/View;)V", "hasEditButton", "", "getHasEditButton", "()Z", "setHasEditButton", "(Z)V", "", "header", "getHeader", "()Ljava/lang/CharSequence;", "setHeader", "(Ljava/lang/CharSequence;)V", "isEachAddButtonEnabled", "setEachAddButtonEnabled", "keepAddButtons", "getKeepAddButtons", "setKeepAddButtons", "setAddButtons", "", "buttons", "", "Lcom/woocommerce/android/ui/orders/creation/views/OrderCreationSectionView$AddButton;", "setContentHorizontalPadding", "padding", "setEditButtonContentDescription", "contentDescription", "", "setOnEditButtonClicked", "listener", "Lkotlin/Function0;", "updateContent", "AddButton", "WooCommerce_wasabiDebug"})
public final class OrderCreationSectionView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.OrderCreationSectionBinding binding = null;
    private boolean keepAddButtons = false;
    private boolean hasEditButton = true;
    
    @kotlin.jvm.JvmOverloads
    public OrderCreationSectionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderCreationSectionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public OrderCreationSectionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final boolean isEachAddButtonEnabled() {
        return false;
    }
    
    public final void setEachAddButtonEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.CharSequence getHeader() {
        return null;
    }
    
    public final void setHeader(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getContent() {
        return null;
    }
    
    public final void setContent(@org.jetbrains.annotations.Nullable
    android.view.View value) {
    }
    
    public final boolean getKeepAddButtons() {
        return false;
    }
    
    public final void setKeepAddButtons(boolean p0) {
    }
    
    public final boolean getHasEditButton() {
        return false;
    }
    
    public final void setHasEditButton(boolean p0) {
    }
    
    public final void setAddButtons(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView.AddButton> buttons) {
    }
    
    private final void updateContent(android.view.View content) {
    }
    
    public final void setContentHorizontalPadding(@androidx.annotation.DimenRes
    int padding) {
    }
    
    public final void setOnEditButtonClicked(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    public final void setEditButtonContentDescription(@org.jetbrains.annotations.NotNull
    java.lang.String contentDescription) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/views/OrderCreationSectionView$AddButton;", "", "text", "", "onClickListener", "Lkotlin/Function0;", "", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class AddButton {
        @org.jetbrains.annotations.NotNull
        private final java.lang.CharSequence text = null;
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onClickListener = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView.AddButton copy(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onClickListener) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public AddButton(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence text, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> onClickListener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.CharSequence component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.CharSequence getText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickListener() {
            return null;
        }
    }
}