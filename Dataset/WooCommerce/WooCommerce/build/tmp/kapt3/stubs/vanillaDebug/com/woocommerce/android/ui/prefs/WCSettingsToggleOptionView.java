package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\b\u0010/\u001a\u00020\u0014H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u0002032\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u000201H\u0016J\"\u0010<\u001a\u0002032\u001a\u0010=\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000203\u0018\u00010>J\b\u0010?\u001a\u000203H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019\u00a8\u0006@"}, d2 = {"Lcom/woocommerce/android/ui/prefs/WCSettingsToggleOptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/woocommerce/android/databinding/ViewSettingsToggleOptionBinding;", "checkable", "Landroid/widget/CompoundButton;", "getCheckable", "()Landroid/widget/CompoundButton;", "checkable$delegate", "Lkotlin/Lazy;", "value", "", "description", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "iconImageResource", "getIconImageResource", "()Ljava/lang/Integer;", "setIconImageResource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "listener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "title", "getTitle", "setTitle", "getAccessibilityClassName", "isChecked", "", "onCheckChanged", "", "onInitializeAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "setChecked", "checked", "setOnCheckedChangeListener", "onCheckedChangeListener", "Lkotlin/Function2;", "toggle", "WooCommerce_vanillaDebug"})
public final class WCSettingsToggleOptionView extends androidx.constraintlayout.widget.ConstraintLayout implements android.widget.Checkable {
    private final com.woocommerce.android.databinding.ViewSettingsToggleOptionBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer iconImageResource;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.drawable.Drawable iconDrawable;
    private final kotlin.Lazy checkable$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.CompoundButton.OnCheckedChangeListener listener;
    
    @kotlin.jvm.JvmOverloads()
    public WCSettingsToggleOptionView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCSettingsToggleOptionView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCSettingsToggleOptionView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public WCSettingsToggleOptionView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, @androidx.annotation.StyleRes()
    int defStyleRes) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIconImageResource() {
        return null;
    }
    
    public final void setIconImageResource(@org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getIconDrawable() {
        return null;
    }
    
    public final void setIconDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable value) {
    }
    
    private final android.widget.CompoundButton getCheckable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CompoundButton.OnCheckedChangeListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener p0) {
    }
    
    @java.lang.Override()
    public boolean isChecked() {
        return false;
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    @java.lang.Override()
    public void setChecked(boolean checked) {
    }
    
    private final void onCheckChanged() {
    }
    
    /**
     * Allows for sending in lambdas in place of a listener object.
     */
    public final void setOnCheckedChangeListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, kotlin.Unit> onCheckedChangeListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAccessibilityClassName() {
        return null;
    }
    
    @java.lang.Override()
    public void onInitializeAccessibilityEvent(@org.jetbrains.annotations.Nullable()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override()
    public void onInitializeAccessibilityNodeInfo(@org.jetbrains.annotations.Nullable()
    android.view.accessibility.AccessibilityNodeInfo info) {
    }
}