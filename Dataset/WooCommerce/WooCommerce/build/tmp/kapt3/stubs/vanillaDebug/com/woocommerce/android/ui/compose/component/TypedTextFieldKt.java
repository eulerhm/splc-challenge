package com.woocommerce.android.ui.compose.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a\u00f9\u0001\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u00a2\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u00a2\u0006\u0002\b\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010$\u00a8\u0006%"}, d2 = {"PreviewTypedTextFields", "", "WCOutlinedTypedTextField", "T", "value", "onValueChange", "Lkotlin/Function1;", "label", "", "valueMapper", "Lcom/woocommerce/android/ui/compose/component/TextFieldValueMapper;", "modifier", "Landroidx/compose/ui/Modifier;", "helperText", "enabled", "", "readOnly", "leadingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "placeholderText", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/woocommerce/android/ui/compose/component/TextFieldValueMapper;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/TextFieldColors;Ljava/lang/String;)V", "WooCommerce_vanillaDebug"})
public final class TypedTextFieldKt {
    
    /**
     * A generic [OutlinedTextField] that accepts a typed value of type [T], and have a listener that emits values of the
     * same type.
     *
     * @param valueMapper the [TextFieldValueMapper] to use with this field.
     */
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void WCOutlinedTypedTextField(T value, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onValueChange, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.compose.component.TextFieldValueMapper<T> valueMapper, @org.jetbrains.annotations.NotNull()
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
    @androidx.compose.ui.tooling.preview.Preview()
    private static final void PreviewTypedTextFields() {
    }
}