package com.woocommerce.android.ui.moremenu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a2\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u001a,\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0003\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0003\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a,\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0003\u001a\u001e\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u001a(\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0003\u00a8\u0006\u001d"}, d2 = {"MoreMenuBadge", "", "badgeCount", "", "MoreMenuButton", "text", "iconDrawable", "onClick", "Lkotlin/Function0;", "MoreMenuHeader", "onSwitchStore", "state", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel$MoreMenuViewState;", "onSettingsClick", "MoreMenuItems", "MoreMenuPreview", "MoreMenuScreen", "viewModel", "Lcom/woocommerce/android/ui/moremenu/MoreMenuViewModel;", "MoreMenuUserAvatar", "avatarUrl", "", "SettingsButton", "modifier", "Landroidx/compose/ui/Modifier;", "StoreDetailsHeader", "userAvatarUrl", "siteName", "siteUrl", "WooCommerce_vanillaDebug"})
public final class MoreMenuScreenKt {
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void MoreMenuScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.moremenu.MoreMenuViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void MoreMenuScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSwitchStore, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSettingsClick) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    private static final void MoreMenuItems(com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState state) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MoreMenuHeader(kotlin.jvm.functions.Function0<kotlin.Unit> onSwitchStore, com.woocommerce.android.ui.moremenu.MoreMenuViewModel.MoreMenuViewState state, kotlin.jvm.functions.Function0<kotlin.Unit> onSettingsClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SettingsButton(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onSettingsClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void StoreDetailsHeader(androidx.compose.ui.Modifier modifier, java.lang.String userAvatarUrl, java.lang.String siteName, java.lang.String siteUrl) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MoreMenuUserAvatar(java.lang.String avatarUrl) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MoreMenuButton(@androidx.annotation.StringRes()
    int text, @androidx.annotation.DrawableRes()
    int iconDrawable, int badgeCount, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void MoreMenuBadge(int badgeCount) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    private static final void MoreMenuPreview() {
    }
}