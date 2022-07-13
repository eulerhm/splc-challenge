package com.woocommerce.android.ui.products.variations.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001a@\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a\b\u0010\f\u001a\u00020\u0001H\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0003\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a@\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\u0012"}, d2 = {"EmptyVariationList", "", "VariationList", "state", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$ViewState;", "onClearButtonClick", "Lkotlin/Function0;", "onVariationClick", "Lkotlin/Function1;", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel$VariationListItem;", "onLoadMore", "VariationListEmptyPreview", "VariationListPreview", "VariationListSkeleton", "VariationListSkeletonPreview", "VariationSelectorScreen", "viewModel", "Lcom/woocommerce/android/ui/products/variations/selector/VariationSelectorViewModel;", "WooCommerce_wasabiDebug"})
public final class VariationSelectorScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void VariationSelectorScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void VariationSelectorScreen(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.ViewState state, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearButtonClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem, kotlin.Unit> onVariationClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void EmptyVariationList() {
    }
    
    @androidx.compose.runtime.Composable
    private static final void VariationList(com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.ViewState state, kotlin.jvm.functions.Function0<kotlin.Unit> onClearButtonClick, kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.variations.selector.VariationSelectorViewModel.VariationListItem, kotlin.Unit> onVariationClick, kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    @androidx.compose.runtime.Composable
    private static final void VariationListSkeleton() {
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void VariationListPreview() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void VariationListEmptyPreview() {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void VariationListSkeletonPreview() {
    }
}