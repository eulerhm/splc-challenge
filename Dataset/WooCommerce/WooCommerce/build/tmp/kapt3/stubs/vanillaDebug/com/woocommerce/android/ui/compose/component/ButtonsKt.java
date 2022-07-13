package com.woocommerce.android.ui.compose.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001af\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\b\u0012\u00a2\u0006\u0002\b\u0013H\u0007\u001a~\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00122\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001af\u0010\u0018\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\b\u0012\u00a2\u0006\u0002\b\u0013H\u0007\u001a~\u0010\u0018\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00122\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00122\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001af\u0010\u0019\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010\u00a2\u0006\u0002\b\u0012\u00a2\u0006\u0002\b\u0013H\u0007\u001aZ\u0010\u0019\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u001b"}, d2 = {"ButtonsPreview", "", "WCColoredButton", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/ButtonColors;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "text", "", "leadingIcon", "trailingIcon", "WCOutlinedButton", "WCTextButton", "allCaps", "WooCommerce_vanillaDebug"})
public final class ButtonsKt {
    
    @androidx.compose.runtime.Composable()
    public static final void WCColoredButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.RowScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCColoredButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> leadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingIcon, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCOutlinedButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.RowScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCOutlinedButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> leadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> trailingIcon, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCTextButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.RowScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WCTextButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled, boolean allCaps, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ButtonColors colors) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(name = "Dark mode", uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
    @androidx.compose.ui.tooling.preview.Preview(name = "Light mode")
    private static final void ButtonsPreview() {
    }
}