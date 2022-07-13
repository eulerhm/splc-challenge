package com.woocommerce.android.ui.products.selector;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0003\u001aN\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u001a\b\u0010\f\u001a\u00020\u0001H\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0003\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001aN\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a8\u0006\u0013"}, d2 = {"EmptyProductList", "", "ProductList", "state", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ViewState;", "onDoneButtonClick", "Lkotlin/Function0;", "onClearButtonClick", "onProductClick", "Lkotlin/Function1;", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel$ProductListItem;", "onLoadMore", "ProductListEmptyPreview", "ProductListPreview", "ProductListSkeleton", "ProductListSkeletonPreview", "ProductSelectorScreen", "viewModel", "Lcom/woocommerce/android/ui/products/selector/ProductSelectorViewModel;", "WooCommerce_vanillaDebug"})
public final class ProductSelectorScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ProductSelectorScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.selector.ProductSelectorViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ProductSelectorScreen(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ViewState state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDoneButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClearButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem, kotlin.Unit> onProductClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EmptyProductList() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void ProductList(com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ViewState state, kotlin.jvm.functions.Function0<kotlin.Unit> onDoneButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onClearButtonClick, kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.selector.ProductSelectorViewModel.ProductListItem, kotlin.Unit> onProductClick, kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMore) {
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    @androidx.compose.runtime.Composable()
    private static final void ProductListSkeleton() {
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void ProductListPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void ProductListEmptyPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void ProductListSkeletonPreview() {
    }
}