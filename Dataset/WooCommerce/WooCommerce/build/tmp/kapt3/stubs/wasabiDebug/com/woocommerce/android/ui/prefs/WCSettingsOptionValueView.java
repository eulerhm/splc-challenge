package com.woocommerce.android.ui.prefs;

import java.lang.System;

/**
 * A custom clickable view that displays an option title and the active selected value. Used for
 * settings-style options that when clicked the option can be changed by for example a dialog. The new
 * selection will then be displayed in the [optionValue] view.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/prefs/WCSettingsOptionValueView;", "Landroid/widget/LinearLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/woocommerce/android/databinding/ViewOptionWithActiveSettingBinding;", "value", "", "optionTitle", "getOptionTitle", "()Ljava/lang/String;", "setOptionTitle", "(Ljava/lang/String;)V", "optionValue", "getOptionValue", "setOptionValue", "setEnabled", "", "enabled", "", "WooCommerce_wasabiDebug"})
public final class WCSettingsOptionValueView extends android.widget.LinearLayout {
    private final com.woocommerce.android.databinding.ViewOptionWithActiveSettingBinding binding = null;
    
    @kotlin.jvm.JvmOverloads
    public WCSettingsOptionValueView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCSettingsOptionValueView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCSettingsOptionValueView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public WCSettingsOptionValueView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @androidx.annotation.StyleRes
    int defStyleRes) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOptionTitle() {
        return null;
    }
    
    public final void setOptionTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOptionValue() {
        return null;
    }
    
    public final void setOptionValue(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
}