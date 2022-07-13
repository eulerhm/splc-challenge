package com.woocommerce.android.ui.compose.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u00e0\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u00e0\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u00a2\u0006\u0002\b\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007H\u0007\u001a9\u0010!\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00010\u000f\u00a2\u0006\u0002\b\u0010H\u0003\u001a\b\u0010#\u001a\u00020\u0001H\u0003\u001a8\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\u0007H\u0007\u00a8\u0006&"}, d2 = {"WCOutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "label", "", "modifier", "Landroidx/compose/ui/Modifier;", "helperText", "enabled", "", "readOnly", "leadingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "placeholderText", "WCOutlinedTextFieldLayout", "textField", "WCOutlinedTextFieldPreview", "WCSearchView", "hint", "WooCommerce_vanillaDebug"})
public final class TextFieldsKt {
    
    /**
     * An [OutlinedTextField] that displays an optional helper text below the field.
     */
    @androidx.compose.runtime.Composable()
    public static final void WCOutlinedTextField(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    java.lang.String helperText, boolean enabled, boolean readOnly, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> leadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingIcon, boolean isError, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.VisualTransformation visualTransformation, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.text.KeyboardOptions keyboardOptions, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean singleLine, int maxLines, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.TextFieldColors colors, @org.jetbrains.annotations.Nullable()
    java.lang.String placeholderText) {
    }
    
    /**
     * An [OutlinedTextField] that displays an optional helper text below the field.
     */
    @androidx.compose.runtime.Composable()
    public static final void WCOutlinedTextField(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.TextFieldValue value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    java.lang.String helperText, boolean enabled, boolean readOnly, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> leadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingIcon, boolean isError, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.input.VisualTransformation visualTransformation, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.text.KeyboardOptions keyboardOptions, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.text.KeyboardActions keyboardActions, boolean singleLine, int maxLines, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.TextFieldColors colors, @org.jetbrains.annotations.Nullable()
    java.lang.String placeholderText) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void WCOutlinedTextFieldLayout(java.lang.String helperText, boolean isError, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> textField) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCSearchView(@org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String hint) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(name = "Dark mode", uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    @androidx.compose.ui.tooling.preview.Preview(name = "Light mode")
    private static final void WCOutlinedTextFieldPreview() {
    }
}