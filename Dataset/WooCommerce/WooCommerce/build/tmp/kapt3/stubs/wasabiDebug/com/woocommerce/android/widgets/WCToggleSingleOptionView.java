package com.woocommerce.android.widgets;

import java.lang.System;

/**
 * Custom toggle component that mimics a [android.preference.SwitchPreference]. This view will display
 * a title, a summary, and a switch. The entire view acts as a single component. This is especially useful for
 * TalkBack.
 *
 * This class could eventually be further genericized for even more flexibility.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001bH\u0016J\"\u0010(\u001a\u00020\u001d2\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010*J\b\u0010+\u001a\u00020\u001dH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/widgets/WCToggleSingleOptionView;", "Landroid/widget/LinearLayout;", "Landroid/widget/Checkable;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/ViewToggleSingleOptionBinding;", "checkable", "Landroid/widget/CompoundButton;", "getCheckable", "()Landroid/widget/CompoundButton;", "checkable$delegate", "Lkotlin/Lazy;", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "getAccessibilityClassName", "", "isChecked", "", "onCheckChanged", "", "onInitializeAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "setChecked", "checked", "setEnabled", "enabled", "setOnCheckedChangeListener", "onCheckedChangeListener", "Lkotlin/Function2;", "toggle", "WooCommerce_wasabiDebug"})
public final class WCToggleSingleOptionView extends android.widget.LinearLayout implements android.widget.Checkable {
    private final com.woocommerce.android.databinding.ViewToggleSingleOptionBinding binding = null;
    private final kotlin.Lazy checkable$delegate = null;
    @org.jetbrains.annotations.Nullable
    private android.widget.CompoundButton.OnCheckedChangeListener listener;
    
    @kotlin.jvm.JvmOverloads
    public WCToggleSingleOptionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCToggleSingleOptionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCToggleSingleOptionView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final android.widget.CompoundButton getCheckable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.CompoundButton.OnCheckedChangeListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton.OnCheckedChangeListener p0) {
    }
    
    @java.lang.Override
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override
    public void toggle() {
    }
    
    @java.lang.Override
    public void setChecked(boolean checked) {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    private final void onCheckChanged() {
    }
    
    /**
     * Allows for sending in lambdas in place of a listener object.
     */
    public final void setOnCheckedChangeListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, kotlin.Unit> onCheckedChangeListener) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getAccessibilityClassName() {
        return null;
    }
    
    @java.lang.Override
    public void onInitializeAccessibilityEvent(@org.jetbrains.annotations.Nullable
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override
    public void onInitializeAccessibilityNodeInfo(@org.jetbrains.annotations.Nullable
    android.view.accessibility.AccessibilityNodeInfo info) {
    }
}